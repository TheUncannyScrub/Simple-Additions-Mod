package com.theuncannyscrub.minecraftadditions.init;

import java.util.ArrayList;
import java.util.List;

import com.theuncannyscrub.minecraftadditions.blocks.BlockBase;
import com.theuncannyscrub.minecraftadditions.blocks.FloatingBlock;
import com.theuncannyscrub.minecraftadditions.items.ItemBase;
import com.theuncannyscrub.minecraftadditions.items.armour.ArmourBase;
import com.theuncannyscrub.minecraftadditions.items.food.ItemCustomFood;
import com.theuncannyscrub.minecraftadditions.items.items.FloatingBlockItem;
import com.theuncannyscrub.minecraftadditions.items.items.MyceliumSeeds;
import com.theuncannyscrub.minecraftadditions.items.tools.ToolAxe;
import com.theuncannyscrub.minecraftadditions.items.tools.ToolHoe;
import com.theuncannyscrub.minecraftadditions.items.tools.ToolPickaxe;
import com.theuncannyscrub.minecraftadditions.items.tools.ToolShovel;
import com.theuncannyscrub.minecraftadditions.items.tools.ToolSword;
import com.theuncannyscrub.minecraftadditions.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Items
	public static final Item MYCELIUM_SEEDS = new MyceliumSeeds("mycelium_seeds");
	public static final Item FLOATING_BLOCK_ITEM = new FloatingBlockItem("floating_block_item");
	public static final Block FLOATING_BLOCK = new FloatingBlock("floating_block");
	
	
	//Ingot / Gems / Metals
	public static final Item OBSIDIAN_CHUNK = new ItemBase("obsidian_chunk");
	public static final Item REFINED_OBSIDIAN = new ItemBase("refined_obsidian");
	public static final Item COMPOSITE_INGOT = new ItemBase("composite_ingot");
	
	//Food
	public static final Item TOAST = new ItemCustomFood("toast", 8, false);
	public static final Item CHEESE = new ItemCustomFood("cheese", 4, false);
	public static final Item COOKED_EGG = new ItemCustomFood("cooked_egg", 4, false);
	
	public static final Item BUTTER = new ItemBase("butter");
	
	//Blocks 
	//name , material , sound , hardness , light level , resistance , tool class, tool class harvest level   
	public static final Block REINFORCED_SAND = new BlockBase("reinforced_sand", Material.CLAY, SoundType.SAND, 0.5F, 0.0F, 2.5F, "spade", 1);
	public static final Block REINFORCED_RED_SAND = new BlockBase("reinforced_red_sand", Material.CLAY, SoundType.SAND, 0.5F, 0.0F, 2.5F, "spade", 1);
	public static final Block REINFORCED_GRAVEL = new BlockBase("reinforced_gravel", Material.GROUND, SoundType.GROUND, 0.5F, 0.0F, 2.5F, "spade", 1);
	
	public static final Block FLOODLIGHT = new BlockBase("floodlight", Material.REDSTONE_LIGHT, SoundType.METAL, 2.0F, 50.0F, 15.0F, "pickaxe", 2); 
	
	//Tool / Armour Materials
	public static final ToolMaterial REFINED_OBSIDIAN_TOOL = EnumHelper.addToolMaterial("refined_obsidian_tool", 5, 2200, 10.0F, 4.0F, 10);
	public static final ArmorMaterial REFINED_OBSIDIAN_ARMOUR = EnumHelper.addArmorMaterial("refined_obsidian_armour", Reference.MOD_ID + ":refined_obsidian", 50, new int[] {5,8,10,5}, 10,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);

	
	//Refined Obsidian Tool Set
	public static final Item REFINED_OBSIDIAN_AXE = new ToolAxe("refined_obsidian_axe", REFINED_OBSIDIAN_TOOL);
	public static final Item REFINED_OBSIDIAN_PICKAXE = new ToolPickaxe("refined_obsidian_pickaxe", REFINED_OBSIDIAN_TOOL);
	public static final Item REFINED_OBSIDIAN_SHOVEL = new ToolShovel("refined_obsidian_shovel", REFINED_OBSIDIAN_TOOL);
	public static final Item REFINED_OBSIDIAN_SWORD = new ToolSword("refined_obsidian_sword", REFINED_OBSIDIAN_TOOL);
	public static final Item REFINED_OBSIDIAN_HOE = new ToolHoe("refined_obsidian_hoe", REFINED_OBSIDIAN_TOOL);
	
	//Refined Obsidian Armour Set
	public static final Item REFINED_OBSIDIAN_HELMET = new ArmourBase("refined_obsidian_helmet", REFINED_OBSIDIAN_ARMOUR, 1, EntityEquipmentSlot.HEAD);
	public static final Item REFINED_OBSIDIAN_CHESTPLATE = new ArmourBase("refined_obsidian_chestplate", REFINED_OBSIDIAN_ARMOUR, 1, EntityEquipmentSlot.CHEST);
	public static final Item REFINED_OBSIDIAN_LEGGINGS = new ArmourBase("refined_obsidian_leggings", REFINED_OBSIDIAN_ARMOUR, 2, EntityEquipmentSlot.LEGS);
	public static final Item REFINED_OBSIDIAN_BOOTS = new ArmourBase("refined_obsidian_boots", REFINED_OBSIDIAN_ARMOUR, 1, EntityEquipmentSlot.FEET);
	
	
	/*TODO
	 * Composite Tools*
	 * 
	 * Mycellium Seeds Crafting recipe
	 * Floating Block item recipe
	 * Sponge Plant
	 * 
	 * Fancy Glass*
	 * No Light glass
	 * 
	 * Horse Armour Crafting
	 * Saddle Crafting
	 * 
	 * Composite Armour
	 * Emerald Armour
	 * Wood Armour
	 * */

}
