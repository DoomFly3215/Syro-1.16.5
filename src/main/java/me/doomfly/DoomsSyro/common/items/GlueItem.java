package me.doomfly.DoomsSyro.common.items;

import me.doomfly.DoomsSyro.DoomsSyro;
import me.doomfly.DoomsSyro.core.init.ItemInit;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;

public class GlueItem extends Item {

    public GlueItem() {
        super(new Item.Properties()
        .stacksTo(16)
        .tab(DoomsSyro.SyroGroup)
        .food(new Food.Builder().nutrition(2).alwaysEat().fast().build()));
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        if (entity.isInWater()) {
            entity.setItem(new ItemStack(Items.CLAY));
        }
        return super.onEntityItemUpdate(stack, entity);
    }
}
