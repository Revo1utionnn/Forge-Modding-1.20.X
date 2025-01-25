package net.revo1ution.revo1utiontest.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.revo1ution.revo1utiontest.Revo1utionTest;
import net.revo1ution.revo1utiontest.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Revo1utionTest.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("testing_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANITE.get()))
                    .title(Component.translatable("creativetab.testing_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.TITANITE.get());
                        output.accept(ModItems.RAW_TITANITE.get());
                        output.accept(ModItems.TITANITE_SWORD.get());
                        output.accept(ModItems.TITANITE_PICKAXE.get());
                        output.accept(ModItems.METAL_DETECTOR.get());
                        output.accept(ModItems.CHICKEN_PLATTER.get());
                        output.accept(ModItems.WISP.get());

                        output.accept(ModBlocks.TITANITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TITANITE_ORE.get());
                        output.accept(ModBlocks.NETHER_TITANITE_ORE.get());
                        output.accept(ModBlocks.END_STONE_TITANITE_ORE.get());
                        output.accept(ModBlocks.RAW_TITANITE_BLOCK.get());
                        output.accept(ModBlocks.TITANITE_BLOCK.get());
                        output.accept(ModBlocks.SOUND_BLOCK.get());
                        output.accept(ModBlocks.TITANITE_STAIRS.get());
                        output.accept(ModBlocks.TITANITE_SLAB.get());
                        output.accept(ModBlocks.TITANITE_WALL.get());
                        output.accept(ModBlocks.TITANITE_BUTTON.get());
                        output.accept(ModBlocks.TITANITE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.TITANITE_FENCE.get());
                        output.accept(ModBlocks.TITANITE_FENCE_GATE.get());
                        output.accept(ModBlocks.TITANITE_DOOR.get());
                        output.accept(ModBlocks.TITANITE_TRAPDOOR.get());

                        output.accept(ModBlocks.RAW_TITANITE_STAIRS.get());
                        output.accept(ModBlocks.RAW_TITANITE_SLAB.get());
                        output.accept(ModBlocks.RAW_TITANITE_WALL.get());
                        output.accept(ModBlocks.RAW_TITANITE_BUTTON.get());
                        output.accept(ModBlocks.RAW_TITANITE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.RAW_TITANITE_FENCE.get());
                        output.accept(ModBlocks.RAW_TITANITE_FENCE_GATE.get());
                        output.accept(ModBlocks.RAW_TITANITE_DOOR.get());
                        output.accept(ModBlocks.RAW_TITANITE_TRAPDOOR.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
