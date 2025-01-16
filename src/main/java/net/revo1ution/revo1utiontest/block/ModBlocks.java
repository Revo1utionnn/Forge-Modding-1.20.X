package net.revo1ution.revo1utiontest.block;

import net.revo1ution.revo1utiontest.Revo1utionTest;
import net.revo1ution.revo1utiontest.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Revo1utionTest.MOD_ID);

    public static final RegistryObject<Block> TITANITE_BLOCK = registerBlock("titanite_block",
            () -> new Block(BlockBehaviour.Properties.of().lightLevel(state -> 7).mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> RAW_TITANITE_BLOCK = registerBlock("raw_titanite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TITANITE_ORE = registerBlock("titanite_ore",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEEPSLATE_TITANITE_ORE = registerBlock("deepslate_titanite_ore",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> NETHER_TITANITE_ORE = registerBlock("nether_titanite_ore",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> END_STONE_TITANITE_ORE = registerBlock("end_stone_titanite_ore",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
