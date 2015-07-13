package mod.moreoresmod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.moreoresmod.common.MoreOresModCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class MintOre extends Block {
	public MintOre(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockTextureName("MoreOresMod:MintOre");
		this.setHarvestLevel("pickaxe", 2);
	}
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister) {
		this.blockIcon = iconregister.registerIcon(MoreOresModCore.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}