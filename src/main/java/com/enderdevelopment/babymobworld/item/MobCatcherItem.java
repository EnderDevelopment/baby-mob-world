package com.enderdevelopment.babymobworld.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class MobCatcherItem extends Item {
    public MobCatcherItem(Tier tier, Properties properties) {
        super(properties.durability(tier.getUses()));
    }

    public static class Wood extends MobCatcherItem {
        public Wood(Properties properties) {
            super(Tiers.WOOD, properties);
        }
    }

    public static class Stone extends MobCatcherItem {
        public Stone(Properties properties) {
            super(Tiers.STONE, properties);
        }
    }

    public static class Iron extends MobCatcherItem {
        public Iron(Properties properties) {
            super(Tiers.IRON, properties);
        }
    }

    public static class Gold extends MobCatcherItem {
        public Gold(Properties properties) {
            super(Tiers.GOLD, properties);
        }
    }

    public static class Diamond extends MobCatcherItem {
        public Diamond(Properties properties) {
            super(Tiers.DIAMOND, properties);
        }
    }

    public static class Netherite extends MobCatcherItem {
        public Netherite(Properties properties) {
            super(Tiers.NETHERITE, properties);
        }
    }
}