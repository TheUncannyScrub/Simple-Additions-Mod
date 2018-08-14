package com.theuncannyscrub.minecraftadditions.items.items;

import com.theuncannyscrub.minecraftadditions.init.ModItems;
import com.theuncannyscrub.minecraftadditions.items.ItemBase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FloatingBlockItem extends ItemBase {

	public FloatingBlockItem(String name) {
		super(name);
	}

	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		BlockPos playerPos = playerIn.getPosition();
		worldIn.setBlockState(playerPos, ModItems.FLOATING_BLOCK.getDefaultState());
		worldIn.playSound(playerIn, playerPos, SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
		itemstack.setCount(itemstack.getCount() - 1);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}

}
