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
	
	
	
	
	//FOOD
	public static final Item TOAST = new ItemCustomFood("toast", 8, false);
	public static final Item CHEESE = new ItemCustomFood("cheese", 4, false);
	public static final Item COOKED_EGG = new ItemCustomFood("cooked_egg", 4, false);
	
	public static final Item BUTTER = new ItemBase("butter");
	
	//OBSIDIAN
	public static final Item OBSIDIAN_CHUNK = new ItemBase("obsidian_chunk");
	public static final Item REFINED_OBSIDIAN = new ItemBase("refined_obsidian");
	public static final Block REFINED_OBSIDIAN_BLOCK = new BlockBase("refined_obsidian_block", Material.GROUND, SoundType.METAL, 70.0F, 0.0F, 10000.0F, "pickaxe", 4);
	
	//COMPOSITE
	public static final Item COMPOSITE_INGOT = new ItemBase("composite_ingot");
	public static final Block COMPOSITE_BLOCK = new BlockBase("composite_block",Material.GROUND, SoundType.METAL, 6.0F, 0.0F, 30.0F, "pickaxe", 2);
	
	//COPPER
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, SoundType.METAL, 5.0F, 0.0F, 30.0F,"pickaxe", 1);
	
	//OTHER ITEMS
	public static final Item MYCELIUM_SEEDS = new MyceliumSeeds("mycelium_seeds");
	public static final Item FLOATING_BLOCK_ITEM = new FloatingBlockItem("floating_block_item");
	public static final Block FLOATING_BLOCK = new FloatingBlock("floating_block");

	
	//OTHER BLOCKS name , material , sound , hardness , light level , resistance , tool class, tool class harvest level   
	public static final Block REINFORCED_SAND = new BlockBase("reinforced_sand", Material.CLAY, SoundType.SAND, 0.5F, 0.0F, 2.5F, "spade", 1);
	public static final Block REINFORCED_RED_SAND = new BlockBase("reinforced_red_sand", Material.CLAY, SoundType.SAND, 0.5F, 0.0F, 2.5F, "spade", 1);
	public static final Block REINFORCED_GRAVEL = new BlockBase("reinforced_gravel", Material.GROUND, SoundType.GROUND, 0.5F, 0.0F, 2.5F, "spade", 1);
	public static final Block FLOODLIGHT = new BlockBase("floodlight", Material.REDSTONE_LIGHT, SoundType.METAL, 2.0F, 50.0F, 15.0F, "pickaxe", 2); 
	

	
	//////////////////////////////////////
	//									//
	//			TOOLS AND ARMOUR		//
	//									//
	//////////////////////////////////////
	
	//Tool / Armour Materials
	public static final ToolMaterial REFINED_OBSIDIAN_TOOL = EnumHelper.addToolMaterial("refined_obsidian_tool", 5, 2200, 10.0F, 4.0F, 10);
	public static final ArmorMaterial REFINED_OBSIDIAN_ARMOUR = EnumHelper.addArmorMaterial("refined_obsidian_armour", Reference.MOD_ID+":refined_obsidian", 50, new int[] {5,8,10,5}, 10,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
	
	public static final ToolMaterial COMPOSITE_INGOT_TOOL = EnumHelper.addToolMaterial("composite_ingot_tool", 2, 400, 7.0F, 2.5F, 10);
	public static final ArmorMaterial COMPOSITE_INGOT_ARMOUR = EnumHelper.addArmorMaterial("composite_ingot_armour", Reference.MOD_ID+":composite_ingot", 22, new int[] {3,5,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ToolMaterial EMERALD_TOOL = EnumHelper.addToolMaterial("emerald_tool", 4, 1800, 10.0F, 3.0F, 10);
	public static final ArmorMaterial EMERALD_ARMOUR = EnumHelper.addArmorMaterial("emerald_armour", Reference.MOD_ID+":emerald", 35, new int[] {4,7,8,4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
	
	public static final ArmorMaterial WOOD_ARMOUR = EnumHelper.addArmorMaterial("wood_armour", Reference.MOD_ID+":wood_armour", 5, new int[] {1,2,2,1}, 0,SoundEvents.BLOCK_WOOD_PLACE, 0.0F);
	
	public static final ArmorMaterial COPPER_ARMOUR = EnumHelper.addArmorMaterial("copper_armour", Reference.MOD_ID+":copper", 15, new int[] {2,5,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ToolMaterial COPPER_TOOL = EnumHelper.addToolMaterial("copper_tool", 2, 200, 5.0F, 2.0F, 10);
	
	//Copper Tool Set
	public static final Item COPPER_AXE = new ToolAxe("copper_axe", COPPER_TOOL);
	public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", COPPER_TOOL);
	public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel", COPPER_TOOL);
	public static final Item COPPER_SWORD = new ToolSword("copper_sword", COPPER_TOOL);
	public static final Item COPPER_HOE = new ToolHoe("copper_hoe", COPPER_TOOL);
	
	//Copper Armour Set
	public static final Item COPPER_HELMET = new ArmourBase("copper_helmet", COPPER_ARMOUR, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmourBase("copper_chestplate", COPPER_ARMOUR, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmourBase("copper_leggings", COPPER_ARMOUR, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmourBase("copper_boots", COPPER_ARMOUR, 1, EntityEquipmentSlot.FEET);
	
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
	
	//Composite Ingot Tool Set
	public static final Item COMPOSITE_INGOT_AXE = new ToolAxe("composite_ingot_axe", COMPOSITE_INGOT_TOOL);
	public static final Item COMPOSITE_INGOT_PICKAXE = new ToolPickaxe("composite_ingot_pickaxe", COMPOSITE_INGOT_TOOL);
	public static final Item COMPOSITE_INGOT_SHOVEL = new ToolShovel("composite_ingot_shovel", COMPOSITE_INGOT_TOOL);
	public static final Item COMPOSITE_INGOT_SWORD = new ToolSword("composite_ingot_sword", COMPOSITE_INGOT_TOOL);
	public static final Item COMPOSITE_INGOT_HOE = new ToolHoe("composite_ingot_hoe", COMPOSITE_INGOT_TOOL);
	
	//Composite Ingot Armour Set
	public static final Item COMPOSITE_INGOT_HELMET = new ArmourBase("composite_ingot_helmet", COMPOSITE_INGOT_ARMOUR,1,EntityEquipmentSlot.HEAD);
	public static final Item COMPOSITE_INGOT_CHESTPLATE = new ArmourBase("composite_ingot_chestplate", COMPOSITE_INGOT_ARMOUR,1,EntityEquipmentSlot.CHEST);
	public static final Item COMPOSITE_INGOT_LEGGINGS = new ArmourBase("composite_ingot_leggings", COMPOSITE_INGOT_ARMOUR,2,EntityEquipmentSlot.LEGS);
	public static final Item COMPOSITE_INGOT_BOOTS = new ArmourBase("composite_ingot_boots", COMPOSITE_INGOT_ARMOUR,1,EntityEquipmentSlot.FEET);
	
	//Emerald Armour Set
	public static final Item EMERALD_HELMET = new ArmourBase("emerald_helmet", EMERALD_ARMOUR, 1,EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE = new ArmourBase("emerald_chestplate", EMERALD_ARMOUR, 1,EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS = new ArmourBase("emerald_leggings", EMERALD_ARMOUR, 2,EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS = new ArmourBase("emerald_boots", EMERALD_ARMOUR, 1,EntityEquipmentSlot.FEET);
	
	//Emerald Tool Set
	public static final Item EMERALD_AXE = new ToolAxe("emerald_axe", EMERALD_TOOL);
	public static final Item EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", EMERALD_TOOL);
	public static final Item EMERALD_SHOVEL = new ToolShovel("emerald_shovel", EMERALD_TOOL);
	public static final Item EMERALD_SWORD = new ToolSword("emerald_sword", EMERALD_TOOL);
	public static final Item EMERALD_HOE = new ToolHoe("emerald_hoe", EMERALD_TOOL);
	
	//Wood Armour Set
	public static final Item WOOD_HELMET = new ArmourBase("wood_helmet", WOOD_ARMOUR, 1, EntityEquipmentSlot.HEAD);
	public static final Item WOOD_CHESTPLATE = new ArmourBase("wood_chestplate", WOOD_ARMOUR, 1, EntityEquipmentSlot.CHEST);
	public static final Item WOOD_LEGGINGS = new ArmourBase("wood_leggings", WOOD_ARMOUR, 2, EntityEquipmentSlot.LEGS);
	public static final Item WOOD_BOOTS = new ArmourBase("wood_boots", WOOD_ARMOUR, 1, EntityEquipmentSlot.FEET);
	
	
	//Testing
	
	/*TODO
	 * 
	 * Sponge Plant
	 * 
	 * Fancy Glass*
	 * No Light glass
	 * 
	 * Custom Pants Helmet
	 * 
	 * 3x3 Miner / Pickaxe
	 * 
	 * Auto block breaker / placer On redstone pulse
	 * 
	 * 
	 * */

}
