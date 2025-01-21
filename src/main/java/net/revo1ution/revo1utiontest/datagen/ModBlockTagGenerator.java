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
                        ModBlocks.TITANITE_WALL.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
