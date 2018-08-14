package com.theuncannyscrub.minecraftadditions.blocks;

import com.theuncannyscrub.minecraftadditions.Main;
import com.theuncannyscrub.minecraftadditions.init.ModItems;
import com.theuncannyscrub.minecraftadditions.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class FloatingBlock extends Block implements IHasModel{

	public FloatingBlock(String name) {
		super(Material.ANVIL);
		setUnlocalizedName(name);
		setRegistryName(name);
		// Material.ANVIL, SoundType.ANVIL, 3.0F, 5.0F, 30.0F, "pickaxe", 2

		this.setSoundType(SoundType.ANVIL);
		this.setHardness(3.0F);
		this.setLightLevel(5.0F);
		this.setResistance(30.0F);
		this.setHarvestLevel("pickaxe", 2);
		
		ModItems.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}