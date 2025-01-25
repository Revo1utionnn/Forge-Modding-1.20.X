package net.revo1ution.revo1utiontest.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.revo1ution.revo1utiontest.Revo1utionTest;
import net.revo1ution.revo1utiontest.block.ModBlocks;
import net.revo1ution.revo1utiontest.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Revo1utionTest.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.TITANITE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TITANITE_BLOCK.get(),
                        ModBlocks.RAW_TITANITE_BLOCK.get(),
                        ModBlocks.TITANITE_ORE.get(),
                        ModBlocks.DEEPSLATE_TITANITE_ORE.get(),
                        ModBlocks.NETHER_TITANITE_ORE.get(),
                        ModBlocks.END_STONE_TITANITE_ORE.get(),
                        ModBlocks.SOUND_BLOCK.get(),
                        ModBlocks.TITANITE_SLAB.get(),
                        ModBlocks.TITANITE_WALL.get(),
                        ModBlocks.TITANITE_STAIRS.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TITANITE_ORE.get(),
                        ModBlocks.DEEPSLATE_TITANITE_ORE.get(),
                        ModBlocks.NETHER_TITANITE_ORE.get(),
                        ModBlocks.END_STONE_TITANITE_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TITANITE_BLOCK.get(),
                        ModBlocks.RAW_TITANITE_BLOCK.get(),
                        ModBlocks.TITANITE_SLAB.get(),
                        ModBlocks.TITANITE_STAIRS.get(),
                        ModBlocks.TITANITE_WALL.get(),
                        ModBlocks.RAW_TITANITE_SLAB.get(),
                        ModBlocks.RAW_TITANITE_STAIRS.get(),
                        ModBlocks.RAW_TITANITE_WALL.get(),
                        ModBlocks.TITANITE_PRESSURE_PLATE.get(),
                        ModBlocks.TITANITE_BUTTON.get(),
                        ModBlocks.TITANITE_DOOR.get(),
                        ModBlocks.TITANITE_TRAPDOOR.get(),
                        ModBlocks.RAW_TITANITE_PRESSURE_PLATE.get(),
                        ModBlocks.RAW_TITANITE_BUTTON.get(),
                        ModBlocks.RAW_TITANITE_DOOR.get(),
                        ModBlocks.RAW_TITANITE_TRAPDOOR.get());
        this.tag(BlockTags.FENCES)
                .add(ModBlocks.TITANITE_FENCE.get())
                .add(ModBlocks.RAW_TITANITE_FENCE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.TITANITE_WALL.get())
                .add(ModBlocks.RAW_TITANITE_WALL.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.TITANITE_FENCE_GATE.get())
                .add(ModBlocks.RAW_TITANITE_FENCE_GATE.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
