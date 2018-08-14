package com.theuncannyscrub.minecraftadditions.blocks;

import com.theuncannyscrub.minecraftadditions.Main;
import com.theuncannyscrub.minecraftadditions.init.ModItems;
import com.theuncannyscrub.minecraftadditions.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	
		public BlockBase(String name, Material material, SoundType sound, Float hardness, Float lightlevel, Float resistance, String toolClass, int level) {
			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.MATAB);
			
			this.setSoundType(sound);
			this.setHardness(hardness);
			this.setLightLevel(lightlevel);
			this.setResistance(resistance);
			this.setHarvestLevel(toolClass, level);
			
			ModItems.BLOCKS.add(this);
			ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		}

		@Override
		public void registerModels() {
			Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		}
}
