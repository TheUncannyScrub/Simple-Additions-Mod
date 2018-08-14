package com.theuncannyscrub.minecraftadditions;

import com.theuncannyscrub.minecraftadditions.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MinecraftAdditionsTab extends CreativeTabs{
	
	public MinecraftAdditionsTab(String label) {super("MinecraftAdditions");}
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.FLOODLIGHT);}
	

}
