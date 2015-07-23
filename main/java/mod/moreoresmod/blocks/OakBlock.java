package mod.moreoresmod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.moreoresmod.common.MoreOresModCore;
import mod.moreoresmod.tileentity.TileEntityOakTable;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class OakBlock extends BlockContainer{

	public OakBlock(Material material) {
		super(material);
		this.setHardness(2.0F);
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.875F, 1F);
		this.setResistance(5.0F);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}

	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l){
		return false;
	}
	
	public int getRenderType(){
		return 8;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityOakTable();
	}

@SideOnly(Side.CLIENT)
public void registerBlockIcons(IIconRegister iconregister) {
	this.blockIcon = iconregister.registerIcon(MoreOresModCore.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
