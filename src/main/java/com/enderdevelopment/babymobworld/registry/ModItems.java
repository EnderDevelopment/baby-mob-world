package com.enderdevelopment.babymobworld.registry;

import com.enderdevelopment.babymobworld.BabyMobWorld;
import com.enderdevelopment.babymobworld.item.MobCatcherItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, BabyMobWorld.MOD_ID);

    public static final RegistryObject<Item> WOOD_MOB_CATCHER = ITEMS.register("wood_mob_catcher",
            () -> new MobCatcherItem.Wood(new Item.Properties()));
    public static final RegistryObject<Item> STONE_MOB_CATCHER = ITEMS.register("stone_mob_catcher",
            () -> new MobCatcherItem.Stone(new Item.Properties()));
    public static final RegistryObject<Item> IRON_MOB_CATCHER = ITEMS.register("iron_mob_catcher",
            () -> new MobCatcherItem.Iron(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_MOB_CATCHER = ITEMS.register("gold_mob_catcher",
            () -> new MobCatcherItem.Gold(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_MOB_CATCHER = ITEMS.register("diamond_mob_catcher",
            () -> new MobCatcherItem.Diamond(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_MOB_CATCHER = ITEMS.register("netherite_mob_catcher",
            () -> new MobCatcherItem.Netherite(new Item.Properties()));

    public static final RegistryObject<CreativeModeTab> CREATIVE_MODE_TAB = ITEMS.register("creative_mode_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.baby_mob_world"))
                    .icon(() -> new ItemStack(WOOD_MOB_CATCHER.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(WOOD_MOB_CATCHER.get());
                        output.accept(STONE_MOB_CATCHER.get());
                        output.accept(IRON_MOB_CATCHER.get());
                        output.accept(GOLD_MOB_CATCHER.get());
                        output.accept(DIAMOND_MOB_CATCHER.get());
                        output.accept(NETHERITE_MOB_CATCHER.get());
                    })
                    .build());
}