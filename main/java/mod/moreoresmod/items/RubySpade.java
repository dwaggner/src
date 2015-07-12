package mod.moreoresmod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.moreoresmod.common.MoreOresModCore;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class RubySpade extends ItemSpade{
	public RubySpade(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(MoreOresModCore.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
