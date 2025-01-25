package net.revo1ution.revo1utiontest.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
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
        buttonBlock((ButtonBlock) ModBlocks.TITANITE_BUTTON.get(), blockTexture(ModBlocks.TITANITE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.TITANITE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.TITANITE_BLOCK.get()));
        fenceBlock((FenceBlock) ModBlocks.TITANITE_FENCE.get(), blockTexture(ModBlocks.TITANITE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.TITANITE_FENCE_GATE.get(), blockTexture(ModBlocks.TITANITE_BLOCK.get()));

        stairsBlock((StairBlock) ModBlocks.RAW_TITANITE_STAIRS.get(), blockTexture(ModBlocks.RAW_TITANITE_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.RAW_TITANITE_SLAB.get(), blockTexture(ModBlocks.RAW_TITANITE_BLOCK.get()), blockTexture(ModBlocks.RAW_TITANITE_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.RAW_TITANITE_WALL.get(), blockTexture(ModBlocks.RAW_TITANITE_BLOCK.get()));
        buttonBlock((ButtonBlock) ModBlocks.RAW_TITANITE_BUTTON.get(), blockTexture(ModBlocks.RAW_TITANITE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.RAW_TITANITE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RAW_TITANITE_BLOCK.get()));
        fenceBlock((FenceBlock) ModBlocks.RAW_TITANITE_FENCE.get(), blockTexture(ModBlocks.RAW_TITANITE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.RAW_TITANITE_FENCE_GATE.get(), blockTexture(ModBlocks.RAW_TITANITE_BLOCK.get()));

        doorBlockWithRenderType((DoorBlock)ModBlocks.TITANITE_DOOR.get(), modLoc("block/titanite_door_bottom"), modLoc("block/titanite_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.TITANITE_TRAPDOOR.get(), modLoc("block/titanite_trapdoor"), true, "cutout");

        doorBlockWithRenderType((DoorBlock)ModBlocks.RAW_TITANITE_DOOR.get(), modLoc("block/raw_titanite_door_bottom"), modLoc("block/raw_titanite_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.RAW_TITANITE_TRAPDOOR.get(), modLoc("block/raw_titanite_trapdoor"), true, "cutout");

        blockItem(ModBlocks.TITANITE_STAIRS);
        blockItem(ModBlocks.TITANITE_SLAB);
        blockItem(ModBlocks.TITANITE_FENCE_GATE);
        blockItem(ModBlocks.TITANITE_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.TITANITE_PRESSURE_PLATE);

        blockItem(ModBlocks.RAW_TITANITE_STAIRS);
        blockItem(ModBlocks.RAW_TITANITE_SLAB);
        blockItem(ModBlocks.RAW_TITANITE_FENCE_GATE);
        blockItem(ModBlocks.RAW_TITANITE_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.RAW_TITANITE_PRESSURE_PLATE);

    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("revo1utiontest:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("revo1utiontest:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
