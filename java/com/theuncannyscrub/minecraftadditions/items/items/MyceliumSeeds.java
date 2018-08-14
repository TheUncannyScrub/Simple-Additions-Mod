package com.theuncannyscrub.minecraftadditions.items.items;

import com.theuncannyscrub.minecraftadditions.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import scala.Console;

public class MyceliumSeeds extends ItemBase 
{

	public MyceliumSeeds(String name) 
	{
		super(name);

	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		IBlockState iblockstate = worldIn.getBlockState(pos);
		Block block = iblockstate.getBlock();
		ItemStack itemstack = player.getHeldItem(hand);
		
		if(block.equals(Blocks.DIRT) || block.equals(Blocks.GRASS)) 
		{
			itemstack.setCount(itemstack.getCount() - 1);
            this.setBlock(itemstack, player, worldIn, pos, Blocks.MYCELIUM.getDefaultState());
            return EnumActionResult.SUCCESS;
		}
		
		

		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
	
	
    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
    {
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!worldIn.isRemote)
        {
           worldIn.setBlockState(pos, state);
        }
    }

	

}
