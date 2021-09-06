package me.doomfly.DoomsSyro.core.events;

import me.doomfly.DoomsSyro.Reference;
import me.doomfly.DoomsSyro.core.init.ItemInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HorseDeath {


    @SubscribeEvent
    public static void onHorseDeath(final LivingDeathEvent event) {
        LivingEntity e = event.getEntityLiving();
        if (!(e.getType().equals(EntityType.HORSE))) return;
        World world = e.level;
        Random r = new Random();
        int low = 1;
        int high = 3;
        int result = r.nextInt(high-low) + low;
        world.addFreshEntity(new ItemEntity(world, e.getX(), e.getY(), e.getZ(), new ItemStack(ItemInit.GLUE_ITEM.get(), result)));
    }
}
