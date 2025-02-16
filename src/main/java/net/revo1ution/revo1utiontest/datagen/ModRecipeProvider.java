package net.revo1ution.revo1utiontest.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.revo1ution.revo1utiontest.Revo1utionTest;
import net.revo1ution.revo1utiontest.block.ModBlocks;
import net.revo1ution.revo1utiontest.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private List<ItemLike> TITANITE_SMELTABLES = List.of(ModItems.RAW_TITANITE.get(),
            ModBlocks.TITANITE_ORE.get(), ModBlocks.DEEPSLATE_TITANITE_ORE.get(), ModBlocks.NETHER_TITANITE_ORE.get(),
            ModBlocks.END_STONE_TITANITE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TITANITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TITANITE.get())
                .unlockedBy("has_titanite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.TITANITE.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANITE_PICKAXE.get())
                .pattern("AAA")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', ModItems.TITANITE.get())
                .define('B', Items.STICK)
                .unlockedBy("has_titanite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.TITANITE.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANITE_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" B ")
                .define('A', ModItems.TITANITE.get())
                .define('B', Items.STICK)
                .unlockedBy("has_titanite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.TITANITE.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANITE.get(), 9)
                .requires(ModBlocks.TITANITE_BLOCK.get())
                .unlockedBy("has_titanite_block", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.TITANITE_BLOCK.get()).build()))
                .save(pWriter);
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_TITANITE.get(), RecipeCategory.MISC, ModBlocks.RAW_TITANITE_BLOCK.get(),
                "revo1utiontest:raw_titanite", "titanite", "revo1utiontest:raw_titanite_block", null);
        oreSmelting(pWriter, TITANITE_SMELTABLES, RecipeCategory.MISC, ModItems.TITANITE.get(), 0.25f, 200, "titanite");
        oreBlasting(pWriter, TITANITE_SMELTABLES, RecipeCategory.MISC, ModItems.TITANITE.get(), 0.25f, 200, "titanite");

        stairBuilder(ModBlocks.TITANITE_STAIRS.get(), Ingredient.of(ModItems.TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.TITANITE.get()), has(ModItems.TITANITE.get())).save(pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANITE_SLAB.get(), ModItems.TITANITE.get());
        buttonBuilder(ModBlocks.TITANITE_BUTTON.get(), Ingredient.of(ModItems.TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.TITANITE.get()), has(ModItems.TITANITE.get())).save(pWriter);
        pressurePlate(pWriter, ModBlocks.TITANITE_PRESSURE_PLATE.get(), ModItems.TITANITE.get());
        fenceBuilder(ModBlocks.TITANITE_FENCE.get(), Ingredient.of(ModItems.TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.TITANITE.get()), has(ModItems.TITANITE.get())).save(pWriter);
        fenceGateBuilder(ModBlocks.TITANITE_FENCE_GATE.get(), Ingredient.of(ModItems.TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.TITANITE.get()), has(ModItems.TITANITE.get())).save(pWriter);
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANITE_WALL.get(), ModItems.TITANITE.get());
        doorBuilder(ModBlocks.TITANITE_DOOR.get(), Ingredient.of(ModItems.TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.TITANITE.get()), has(ModItems.TITANITE.get())).save(pWriter);
        trapdoorBuilder(ModBlocks.TITANITE_TRAPDOOR.get(), Ingredient.of(ModItems.TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.TITANITE.get()), has(ModItems.TITANITE.get())).save(pWriter);

        stairBuilder(ModBlocks.RAW_TITANITE_STAIRS.get(), Ingredient.of(ModItems.RAW_TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.RAW_TITANITE.get()), has(ModItems.RAW_TITANITE.get())).save(pWriter);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TITANITE_SLAB.get(), ModItems.RAW_TITANITE.get());
        buttonBuilder(ModBlocks.RAW_TITANITE_BUTTON.get(), Ingredient.of(ModItems.RAW_TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.RAW_TITANITE.get()), has(ModItems.RAW_TITANITE.get())).save(pWriter);
        pressurePlate(pWriter, ModBlocks.RAW_TITANITE_PRESSURE_PLATE.get(), ModItems.RAW_TITANITE.get());
        fenceBuilder(ModBlocks.RAW_TITANITE_FENCE.get(), Ingredient.of(ModItems.RAW_TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.RAW_TITANITE.get()), has(ModItems.RAW_TITANITE.get())).save(pWriter);
        fenceGateBuilder(ModBlocks.RAW_TITANITE_FENCE_GATE.get(), Ingredient.of(ModItems.RAW_TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.RAW_TITANITE.get()), has(ModItems.RAW_TITANITE.get())).save(pWriter);
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_TITANITE_WALL.get(), ModItems.RAW_TITANITE.get());
        doorBuilder(ModBlocks.RAW_TITANITE_DOOR.get(), Ingredient.of(ModItems.RAW_TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.RAW_TITANITE.get()), has(ModItems.RAW_TITANITE.get())).save(pWriter);
        trapdoorBuilder(ModBlocks.RAW_TITANITE_TRAPDOOR.get(), Ingredient.of(ModItems.RAW_TITANITE.get())).group("titanite")
                .unlockedBy(getHasName(ModItems.RAW_TITANITE.get()), has(ModItems.RAW_TITANITE.get())).save(pWriter);

    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime,
                                     String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                    pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, Revo1utionTest.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}
