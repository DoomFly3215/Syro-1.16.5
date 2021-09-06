package me.doomfly.DoomsSyro.common.items;

import me.doomfly.DoomsSyro.DoomsSyro;
import me.doomfly.DoomsSyro.core.init.ItemInit;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArgatherDust extends Item {

    public ArgatherDust() {
        super(new Item.Properties().
                tab(DoomsSyro.SyroGroup)
                .fireResistant()
                .stacksTo(64));
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        if (entity.isInLava()) {
            entity.setItem(new ItemStack(ItemInit.ARGATHER_INGOT.getItem(), stack.getCount()));
        }
        return super.onEntityItemUpdate(stack, entity);
    }
}
