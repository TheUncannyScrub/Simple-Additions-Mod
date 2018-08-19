package com.theuncannyscrub.minecraftadditions.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		
		//GameRegistry.addShapelessRecipe();
		GameRegistry.addSmelting(Items.BREAD, new ItemStack(ModItems.TOAST, 1) , 1.0F);
		GameRegistry.addSmelting(Items.EGG, new ItemStack(ModItems.COOKED_EGG, 1), 1.0F);
		
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.OBSIDIAN_CHUNK,1), 2.0f);
	}

}
