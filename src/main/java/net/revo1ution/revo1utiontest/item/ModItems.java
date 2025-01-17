package net.revo1ution.revo1utiontest.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.revo1ution.revo1utiontest.Revo1utionTest;
import net.revo1ution.revo1utiontest.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Revo1utionTest.MOD_ID);

    public static final RegistryObject<Item> TITANITE = ITEMS.register("titanite",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> RAW_TITANITE = ITEMS.register("raw_titanite",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TITANITE_SWORD = ITEMS.register("titanite_sword",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> TITANITE_PICKAXE = ITEMS.register("titanite_pickaxe",
            () -> new Item(new Item.Properties().fireResistant()));

        public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(512)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
