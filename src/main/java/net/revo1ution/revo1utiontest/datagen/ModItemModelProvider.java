package net.revo1ution.revo1utiontest.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.revo1ution.revo1utiontest.Revo1utionTest;
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
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Revo1utionTest.MOD_ID, "item/" + item.getId().getPath()));
    }



}

