package com.theuncannyscrub.minecraftadditions.items.armour;

import com.theuncannyscrub.minecraftadditions.Main;
import com.theuncannyscrub.minecraftadditions.init.ModItems;
import com.theuncannyscrub.minecraftadditions.util.IHasModel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmourBase extends ItemArmor implements IHasModel {

	public ArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
