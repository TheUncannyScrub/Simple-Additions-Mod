package com.theuncannyscrub.minecraftadditions.items.tools;

import com.theuncannyscrub.minecraftadditions.Main;
import com.theuncannyscrub.minecraftadditions.init.ModItems;
import com.theuncannyscrub.minecraftadditions.util.IHasModel;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {
	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MATAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
