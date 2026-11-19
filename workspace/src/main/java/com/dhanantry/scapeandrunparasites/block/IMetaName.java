package com.dhanantry.scapeandrunparasites.block;

/**
 * Migracion de IMetaName (1.12.2) a 1.20.1.
 *
 * En 1.12.2 la interfaz exponia getItemBlock() porque cada variante del bloque
 * necesitaba su propio ItemBlock (ItemBlockVariant). En 1.20.1 solo existe un
 * BlockItem por bloque y las variantes se anaden al creative tab mediante
 * BuildCreativeModeTabContentsEvent, por lo que getItemBlock() desaparece y
 * solo se conserva la lista de variantes.
 */
public interface IMetaName
{
    Enum<?>[] getVariants();
}
