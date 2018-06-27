package com.shinoow.acheads.common.blocks;

import com.shinoow.acheads.AbyssalCraftHeads;
import com.shinoow.acheads.common.blocks.tile.TileEntityHead;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.*;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Optional.Interface;
import thaumcraft.api.crafting.IInfusionStabiliser;

@Interface(modid = "thaumcraft", iface = "thaumcraft.api.crafting.IInfusionStabiliser", striprefs = true)
public class BlockHead extends Block implements IInfusionStabiliser {

	public static final PropertyInteger TYPE = PropertyInteger.create("type", 0, 51);

	public BlockHead() {
		super(Material.CLOTH);
		setDefaultState(blockState.getBaseState().withProperty(TYPE, 0));
		setSoundType(SoundType.CLOTH);
		setHardness(1.0F);
		setResistance(6.0F);
		setCreativeTab(AbyssalCraftHeads.tabACHeads);
		setUnlocalizedName("head");
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess par1World, BlockPos pos)
	{
		TileEntity tile = par1World.getTileEntity(pos);
		if(tile instanceof TileEntityHead)
			switch(((TileEntityHead)tile).getType()) {
			case 0:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 1:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 2:
				return new AxisAlignedBB(0.03F, 0.0F, 0.03F, 0.97F, 0.95F, 0.97F);
			case 3:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 4:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 5:
				return new AxisAlignedBB(0.07F, 0.0F, 0.07F, 0.92F, 0.8F, 0.92F);
			case 6:
				return new AxisAlignedBB(0.2F, 0.0F, 0.2F, 0.8F, 0.6F, 0.8F);
			case 7:
				return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			case 8:
				return new AxisAlignedBB(0.34F, 0.0F, 0.34F, 0.66F, 0.32F, 0.66F);
			case 9:
				return new AxisAlignedBB(0.27F, 0.0F, 0.27F, 0.73F, 0.45F, 0.73F);
			case 10:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 11:
				return new AxisAlignedBB(0.34F, 0.0F, 0.34F, 0.66F, 0.32F, 0.66F);
			case 12:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 13:
				return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			case 14:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.55F, 0.75F);
			case 15:
				return new AxisAlignedBB(0.1F, 0.0F, 0.1F, 0.8F, 0.7F, 0.8F);
			case 16:
				return new AxisAlignedBB(0.2F, 0.0F, 0.2F, 0.8F, 0.9F, 0.8F);
			case 17:
				return new AxisAlignedBB(0.07F, 0.0F, 0.07F, 0.93F, 1.0F, 0.93F);
			case 18:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.55F, 0.75F);
			case 19:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 20:
				return new AxisAlignedBB(0.31F, 0.0F, 0.31F, 0.69F, 0.38F, 0.69F);
			case 21:
				return new AxisAlignedBB(0.37F, 0.0F, 0.37F, 0.63F, 0.4F, 0.63F);
			case 22:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 23:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 24:
				return new AxisAlignedBB(0.1F, 0.0F, 0.1F, 0.8F, 0.7F, 0.8F);
			case 25:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 26:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 27:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 28:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 29:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 30:
				return new AxisAlignedBB(0.1F, 0.0F, 0.1F, 0.8F, 0.9F, 0.8F);
			case 31:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 32:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 33:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 34:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 35:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 36:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 37:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 38:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 39:
				return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			case 40:
				return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			case 41:
				return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			case 42:
				return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			case 43:
				return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			case 44:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 45:
				return new AxisAlignedBB(0.37F, 0.0F, 0.37F, 0.63F, 0.4F, 0.63F);
			case 46:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 47:
				return new AxisAlignedBB(0.37F, 0.0F, 0.37F, 0.63F, 0.4F, 0.63F);
			case 48:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 49:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			case 50:
				return new AxisAlignedBB(0.12F, 0.0F, 0.12F, 0.88F, 1.0F, 0.88F);
			case 51:
				return new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.55F, 0.75F);
			}
		return new AxisAlignedBB(0.1F, 0.0F, 0.1F, 0.8F, 0.7F, 0.8F);
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return 0;
	}

	@Override
	public boolean hasTileEntity(IBlockState state)
	{
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state)
	{
		return new TileEntityHead();
	}

	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		return getDefaultState().withProperty(TYPE, meta);
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return state.getValue(TYPE);
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		int type = 0;

		TileEntity tile = world.getTileEntity(pos);
		if(tile instanceof TileEntityHead)
			type = ((TileEntityHead) tile).getType();
		return new ItemStack(Item.getItemFromBlock(this), 1, type);
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	{
		int type = 0;

		TileEntity tile = worldIn.getTileEntity(pos);
		if(tile instanceof TileEntityHead)
			type = ((TileEntityHead) tile).getType();

		return state.withProperty(TYPE, type);
	}

	@Override
	public void onBlockPlacedBy(World par1World, BlockPos pos, IBlockState state, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
		if (par5EntityLivingBase == null)
			return;

		TileEntityHead tile = (TileEntityHead) par1World.getTileEntity(pos);
		tile.setDirection(MathHelper.floor(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F + 0.5D) & 3);
		tile.setType(state.getValue(TYPE));
	}

	@Override
	public BlockStateContainer createBlockState()
	{
		return new BlockStateContainer.Builder(this).add(TYPE).build();
	}

	@Override
	public boolean canStabaliseInfusion(World world, BlockPos pos) {
	
		return true;
	}
}
