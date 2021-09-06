package me.doomfly.DoomsSyro.core.init;

import me.doomfly.DoomsSyro.Reference;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    // Metal wood planks
    public static final RegistryObject<Block> METAL_WOOD_PLANKS = BLOCKS.register("metal_wood_planks", () ->
            new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
                    .harvestTool(ToolType.AXE)
                    .harvestLevel(2)
                    .strength(2)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    // Argather Ore
    public static final RegistryObject<Block> ARGATHER_ORE = BLOCKS.register("argather_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .strength(3)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    // Charred Pebbele Block
    public static final RegistryObject<Block> CHARRED_PEBBLE_BLOCK = BLOCKS.register("charred_pebble_block", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(1)
                    .strength(2)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    // Charred Pebbele Block
    public static final RegistryObject<Block> CHARRED_PEBBLE_BRICKS_BLOCK = BLOCKS.register("charred_pebble_bricks_block", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(1)
                    .strength(2)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    // Pebbele Block
    public static final RegistryObject<Block> PEBBLE_BLOCK = BLOCKS.register("pebble_block", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(1)
                    .strength(2)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    // Pebbele Bricks Block
    public static final RegistryObject<Block> PEBBLE_BRICKS_BLOCK = BLOCKS.register("pebble_bricks_block", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(1)
                    .strength(2)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));
    // Scales Block
    public static final RegistryObject<Block> SCALES_BLOCK = BLOCKS.register("scales_block", () ->
            new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(3)
                    .strength(10)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));
}
