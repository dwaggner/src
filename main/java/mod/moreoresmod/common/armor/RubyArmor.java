package mod.moreoresmod.common.armor;

import mod.moreoresmod.common.MoreOresModCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RubyArmor extends ItemArmor{

	public RubyArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(CreativeTabs.tabCombat);
		
		
		if(slot == 0) {
			this.setTextureName(MoreOresModCore.modid + ":RubyHelm");
		}else if (slot == 1) {
			this.setTextureName(MoreOresModCore.modid + ":RubyChest");
		}else if (slot == 2) {
			this.setTextureName(MoreOresModCore.modid + ":RubyLegs");
		}else if (slot == 3) {
			this.setTextureName(MoreOresModCore.modid + ":RubyBoots");
		}
	}
		
		public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
			if (itemstack.getItem() == MoreOresModCore.armorRubyHelm || itemstack.getItem() == MoreOresModCore.armorRubyChest || itemstack.getItem() == MoreOresModCore.armorRubyBoots) { 
				return MoreOresModCore.modid + ":textures/model/armor/Ruby_layer_1.png";
			}	
			else if (itemstack.getItem() == MoreOresModCore.armorRubyLegs) {
				return MoreOresModCore.modid + ":textures/model/armor/Ruby_layer_2.png";
			}else{ 
				return null;
			}
		}
}
	

