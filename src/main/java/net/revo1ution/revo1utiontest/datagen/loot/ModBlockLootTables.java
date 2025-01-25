package net.revo1ution.revo1utiontest.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.revo1ution.revo1utiontest.block.ModBlocks;
import net.revo1ution.revo1utiontest.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.TITANITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TITANITE_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());

        this.add(ModBlocks.TITANITE_ORE.get(),
                block -> createOreDrop(ModBlocks.TITANITE_ORE.get(), ModItems.RAW_TITANITE.get()));
        this.add(ModBlocks.DEEPSLATE_TITANITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_TITANITE_ORE.get(), ModItems.RAW_TITANITE.get()));
        this.add(ModBlocks.NETHER_TITANITE_ORE.get(),
                block -> createOreDrop(ModBlocks.NETHER_TITANITE_ORE.get(), ModItems.RAW_TITANITE.get()));
        this.add(ModBlocks.END_STONE_TITANITE_ORE.get(),
                block -> createOreDrop(ModBlocks.END_STONE_TITANITE_ORE.get(), ModItems.RAW_TITANITE.get()));

        this.dropSelf(ModBlocks.TITANITE_STAIRS.get());
        this.dropSelf(ModBlocks.TITANITE_WALL.get());
        this.dropSelf(ModBlocks.TITANITE_FENCE.get());
        this.dropSelf(ModBlocks.TITANITE_FENCE_GATE.get());
        this.add(ModBlocks.TITANITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TITANITE_SLAB.get()));
        this.dropSelf(ModBlocks.TITANITE_BUTTON.get());
        this.dropSelf(ModBlocks.TITANITE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.TITANITE_TRAPDOOR.get());
        this.add(ModBlocks.TITANITE_DOOR.get(),
                block -> createDoorTable(ModBlocks.TITANITE_DOOR.get()));

        this.dropSelf(ModBlocks.RAW_TITANITE_STAIRS.get());
        this.dropSelf(ModBlocks.RAW_TITANITE_WALL.get());
        this.dropSelf(ModBlocks.RAW_TITANITE_FENCE.get());
        this.dropSelf(ModBlocks.RAW_TITANITE_FENCE_GATE.get());
        this.add(ModBlocks.RAW_TITANITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RAW_TITANITE_SLAB.get()));
        this.dropSelf(ModBlocks.RAW_TITANITE_BUTTON.get());
        this.dropSelf(ModBlocks.RAW_TITANITE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.RAW_TITANITE_TRAPDOOR.get());
        this.add(ModBlocks.RAW_TITANITE_DOOR.get(),
                block -> createDoorTable(ModBlocks.RAW_TITANITE_DOOR.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
