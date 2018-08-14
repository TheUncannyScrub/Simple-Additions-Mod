package com.theuncannyscrub.minecraftadditions.util.compat;

import com.theuncannyscrub.minecraftadditions.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres() 
	{
		OreDictionary.registerOre("ingotObsidian", ModItems.OBSIDIAN_CHUNK);
	}

}
