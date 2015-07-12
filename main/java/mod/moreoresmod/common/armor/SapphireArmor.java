package mod.moreoresmod.common.armor;

import mod.moreoresmod.common.MoreOresModCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class SapphireArmor extends ItemArmor{
	public SapphireArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(CreativeTabs.tabCombat);
		
		
		if(slot == 0) {
			this.setTextureName(MoreOresModCore.modid + ":SapphireHelm");
		}else if (slot == 1) {
			this.setTextureName(MoreOresModCore.modid + ":SapphireChest");
		}else if (slot == 2) {
			this.setTextureName(MoreOresModCore.modid + ":SapphireLegs");
		}else if (slot == 3) {
			this.setTextureName(MoreOresModCore.modid + ":SapphireBoots");
		}
	}
		
		public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
			if (itemstack.getItem() == MoreOresModCore.armorSapphireHelm || itemstack.getItem() == MoreOresModCore.armorSapphireChest || itemstack.getItem() == MoreOresModCore.armorSapphireBoots) { 
				return MoreOresModCore.modid + ":textures/model/armor/Sapphire_layer_1.png";
			}	
			else if (itemstack.getItem() == MoreOresModCore.armorSapphireLegs) {
				return MoreOresModCore.modid + ":textures/model/armor/Sapphire_layer_2.png";
			}else{ 
				return null;
			}
		}
}
