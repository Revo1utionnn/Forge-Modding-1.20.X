package net.revo1ution.revo1utiontest.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.revo1ution.revo1utiontest.Revo1utionTest;
import net.revo1ution.revo1utiontest.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Revo1utionTest.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TITANITE_BLOCK);
        blockWithItem(ModBlocks.RAW_TITANITE_BLOCK);

        blockWithItem(ModBlocks.TITANITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TITANITE_ORE);
        blockWithItem(ModBlocks.NETHER_TITANITE_ORE);
        blockWithItem(ModBlocks.END_STONE_TITANITE_ORE);

        blockWithItem(ModBlocks.SOUND_BLOCK);

        stairsBlock((StairBlock) ModBlocks.TITANITE_STAIRS.get(), blockTexture(ModBlocks.TITANITE_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.TITANITE_SLAB.get(), blockTexture(ModBlocks.TITANITE_BLOCK.get()), blockTexture(ModBlocks.TITANITE_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.TITANITE_WALL.get(), blockTexture(ModBlocks.TITANITE_BLOCK.get()));

        blockItem(ModBlocks.TITANITE_STAIRS);
        blockItem(ModBlocks.TITANITE_SLAB);
        blockItem(ModBlocks.TITANITE_WALL);

    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("revo1utiontest:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
