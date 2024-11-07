package com.zikkado.common;

import com.zikkado.ZStone;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class BlocksMod {



    public static final Block PURPLE_ORE = register("purple_ore", Block::new, AbstractBlock.Settings.create().strength(4.0f));


    public static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings ) {

        Identifier id = Identifier.of(ZStone.MOD_ID, path);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);

        Block block = Blocks.register(key, factory, settings);

        Items.register(block);

        return block;
    }

    public static void initialize() {

        ZStone.LOGGER.info("Registrando Blocos...");
    }
}
