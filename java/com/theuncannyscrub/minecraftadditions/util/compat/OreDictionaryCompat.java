package com.theuncannyscrub.minecraftadditions.util.compat;

import com.theuncannyscrub.minecraftadditions.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres() 
	{
		OreDictionary.registerOre("ingotObsidian", ModItems.OBSIDIAN_CHUNK);
		
		OreDictionary.registerOre("blockCopper", ModItems.COPPER_BLOCK);
		OreDictionary.registerOre("ingotCopper", ModItems.COPPER_INGOT);
		
		OreDictionary.registerOre("foodToast", ModItems.TOAST);
	}

}
