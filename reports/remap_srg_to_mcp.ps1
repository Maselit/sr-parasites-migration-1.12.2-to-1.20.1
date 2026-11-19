# Remaps SRG (func_/field_) names in decompiled Java sources to MCP names.
# Usage: powershell -File remap_srg_to_mcp.ps1
param(
  [string]$SrcRoot = "C:\Users\Kevin Aguilar\Documents\Proyecto predeterminado\srparasites\decompiled\srg",
  [string]$OutRoot = "C:\Users\Kevin Aguilar\Documents\Proyecto predeterminado\srparasites\decompiled\mcp",
  [string]$McpRoot = "C:\Users\Kevin Aguilar\AppData\Local\Temp\opencode\srparasites\mcp_stable-39-1.12"
)

$ErrorActionPreference = "Stop"

function Load-Map([string]$csv) {
  $map = @{}
  Import-Csv $csv | ForEach-Object {
    if ($_.searge -and $_.name) { $map[$_.searge] = $_.name }
  }
  return $map
}

Write-Host "Loading MCP mappings..."
$fieldMap = Load-Map (Join-Path $McpRoot "fields.csv")
$methodMap = Load-Map (Join-Path $McpRoot "methods.csv")
Write-Host ("  fields: {0}  methods: {1}" -f $fieldMap.Count, $methodMap.Count)

$map = @{}
foreach ($k in $fieldMap.Keys)  { $map[$k] = $fieldMap[$k] }
foreach ($k in $methodMap.Keys) { $map[$k] = $methodMap[$k] }

$regex = [System.Text.RegularExpressions.Regex]::new('\b(func_\d+_[A-Za-z0-9_]+|field_\d+_[A-Za-z0-9_]+)\b')
$unmapped = [System.Collections.Generic.HashSet[string]]::new()
$totalReplacements = 0

$evaluator = [System.Text.RegularExpressions.MatchEvaluator]{
  param($m)
  $name = $m.Value
  if ($map.ContainsKey($name)) {
    $script:totalReplacements++
    return $map[$name]
  } else {
    [void]$unmapped.Add($name)
    return $name
  }
}

if (Test-Path $OutRoot) { Remove-Item $OutRoot -Recurse -Force }
New-Item -ItemType Directory -Force -Path $OutRoot | Out-Null

$files = Get-ChildItem $SrcRoot -Recurse -Filter *.java
Write-Host ("Remapping {0} files..." -f $files.Count)
$i = 0
foreach ($f in $files) {
  $rel = $f.FullName.Substring($SrcRoot.Length).TrimStart('\')
  $dest = Join-Path $OutRoot $rel
  New-Item -ItemType Directory -Force -Path (Split-Path $dest) | Out-Null
  $text = [System.IO.File]::ReadAllText($f.FullName)
  $new = $regex.Replace($text, $evaluator)
  [System.IO.File]::WriteAllText($dest, $new)
  $i++
  if ($i % 100 -eq 0) { Write-Host ("  {0}/{1}" -f $i, $files.Count) }
}

Write-Host ("Done. Replacements: {0}" -f $totalReplacements)
Write-Host ("Unmapped SRG names: {0}" -f $unmapped.Count)
$unmapped | Sort-Object | Set-Content (Join-Path $OutRoot "..\unmapped_srg_names.txt")
