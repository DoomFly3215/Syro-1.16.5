package me.doomfly.DoomsSyro.core.init;

import me.doomfly.DoomsSyro.DoomsSyro;
import me.doomfly.DoomsSyro.Reference;
import me.doomfly.DoomsSyro.common.items.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> GLUE_ITEM = ITEMS.register("glue_item", GlueItem::new);
    public static final RegistryObject<Item> ARGATHER_DUST = ITEMS.register("argather_dust", ArgatherDust::new);
    public static final ItemBase ARGATHER_INGOT = new ItemBase("argather_ingot").setItem(new Item.Properties().fireResistant());
    public static final ItemBase ORANGE_CRYSTAL = new ItemBase("orange_crystal").setItem();
    //
    // Block Items
    //
    public static final RegistryObject<BlockItem> METAL_WOOD_PLANKS = ITEMS.register("metal_wood_planks", () ->
            new BlockItem(BlockInit.METAL_WOOD_PLANKS.get(), new Item.Properties().tab(DoomsSyro.SyroGroup)));
    public static final RegistryObject<BlockItem> ARGATHER_ORE = ITEMS.register("argather_ore", () ->
            new ArgatherOreItem(BlockInit.ARGATHER_ORE.get(), new Item.Properties().tab(DoomsSyro.SyroGroup)));
    public static final RegistryObject<BlockItem> CHARRED_PEBBLE_BLOCK = ITEMS.register("charred_pebble_block", () ->
            new BlockItem(BlockInit.CHARRED_PEBBLE_BLOCK.get(), new Item.Properties().tab(DoomsSyro.SyroGroup)));
    public static final RegistryObject<BlockItem> CHARRED_PEBBLE_BRICKS_BLOCK = ITEMS.register("charred_pebble_bricks_block", () ->
            new BlockItem(BlockInit.CHARRED_PEBBLE_BRICKS_BLOCK.get(), new Item.Properties().tab(DoomsSyro.SyroGroup)));
    public static final RegistryObject<BlockItem> PEBBLE_BLOCK = ITEMS.register("pebble_block", () ->
            new BlockItem(BlockInit.PEBBLE_BLOCK.get(), new Item.Properties().tab(DoomsSyro.SyroGroup)));
    public static final RegistryObject<BlockItem> PEBBLE_BRICKS_BLOCK = ITEMS.register("pebble_bricks_block", () ->
            new BlockItem(BlockInit.PEBBLE_BRICKS_BLOCK.get(), new Item.Properties().tab(DoomsSyro.SyroGroup)));
    public static final RegistryObject<BlockItem> SCALES_BLOCK = ITEMS.register("scales_block", () ->
            new BlockItem(BlockInit.SCALES_BLOCK.get(), new Item.Properties().tab(DoomsSyro.SyroGroup)));
}
