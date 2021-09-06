package me.doomfly.DoomsSyro.common.items;

import me.doomfly.DoomsSyro.DoomsSyro;
import me.doomfly.DoomsSyro.core.init.ItemInit;
import net.minecraft.item.Item;

public class ItemBase {

    private Item item;

    public ItemBase(String itemName) {
        ItemInit.ITEMS.register(itemName, () -> item);
    }

    public Item getItem() {
        return this.item;
    }

    public ItemBase setItem(Item.Properties ItemP) {
        this.item = new Item(ItemP.tab(DoomsSyro.SyroGroup).stacksTo(64));
        return this;
    }

    public ItemBase setItem() {
        this.item = new Item(new Item.Properties().tab(DoomsSyro.SyroGroup).stacksTo(64));
        return this;
    }
}
