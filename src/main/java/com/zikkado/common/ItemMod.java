package com.zikkado.common;

import com.zikkado.ZStone;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ItemMod {

    public static final Item PURPLE_STONE = register("purple_stone");

    public static Item register(String name) {

        Identifier id = Identifier.of(ZStone.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = new Item.Settings().registryKey(key);
        return Registry.register(Registries.ITEM, key, new Item(settings));
    }

    public static void initialize() {

        ZStone.LOGGER.info("Registrando Itens...");
    }
}
