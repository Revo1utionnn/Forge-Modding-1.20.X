package net.revo1ution.revo1utiontest.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.revo1ution.revo1utiontest.Revo1utionTest;
import net.revo1ution.revo1utiontest.block.ModBlocks;
import net.revo1ution.revo1utiontest.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Revo1utionTest.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.TITANITE);
        simpleItem(ModItems.RAW_TITANITE);
        simpleItem(ModItems.TITANITE_SWORD);
        simpleItem(ModItems.TITANITE_PICKAXE);

        simpleItem(ModItems.CHICKEN_PLATTER);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.WISP);

        fenceItem(ModBlocks.TITANITE_FENCE, ModBlocks.TITANITE_BLOCK);
        wallItem(ModBlocks.TITANITE_WALL, ModBlocks.TITANITE_BLOCK);
        buttonItem(ModBlocks.TITANITE_BUTTON, ModBlocks.TITANITE_BLOCK);

        simpleBlockItem(ModBlocks.TITANITE_DOOR);

        fenceItem(ModBlocks.RAW_TITANITE_FENCE, ModBlocks.RAW_TITANITE_BLOCK);
        wallItem(ModBlocks.RAW_TITANITE_WALL, ModBlocks.RAW_TITANITE_BLOCK);
        buttonItem(ModBlocks.RAW_TITANITE_BUTTON, ModBlocks.RAW_TITANITE_BLOCK);

        simpleBlockItem(ModBlocks.RAW_TITANITE_DOOR);

    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(Revo1utionTest.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(Revo1utionTest.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(Revo1utionTest.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Revo1utionTest.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Revo1utionTest.MOD_ID, "item/" + item.getId().getPath()));
    }



}

