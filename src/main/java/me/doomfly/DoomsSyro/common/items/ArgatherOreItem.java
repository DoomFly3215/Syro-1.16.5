package me.doomfly.DoomsSyro.common.items;

import me.doomfly.DoomsSyro.core.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

public class ArgatherOreItem extends BlockItem {

    public ArgatherOreItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        if (entity.isInWater()) {
            entity.setItem(new ItemStack(ItemInit.ARGATHER_DUST.get(), stack.getCount() * 2));
            World world = entity.level;
            Random r = new Random();
            int low = 0;
            int high = 100;
            int result = r.nextInt(high-low) + low;
            if (result <= 30) {
                world.addFreshEntity(new ItemEntity(world, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.SAND, stack.getCount())));
            }
            if (result <= 50) {
                world.addFreshEntity(new ItemEntity(world, entity.getX(), entity.getY(), entity.getZ(), new ItemStack(Items.GRAVEL, stack.getCount())));
            }
        }
        return super.onEntityItemUpdate(stack, entity);
    }
}
