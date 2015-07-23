package mod.moreoresmod.common;

import com.moreoresmod.mod.model.ModelCakeCow;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import mod.moreoresmod.mod.entity.EntityCakeCow;
import mod.moreoresmod.mod.renderer.ItemRenderOakTable;
import mod.moreoresmod.mod.renderer.RenderCakeCow;
import mod.moreoresmod.mod.renderer.RenderOakTable;
import mod.moreoresmod.tileentity.TileEntityOakTable;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends ServerProxy {
	public void registerRenderInfo() {
		
		//Oak Table
		TileEntitySpecialRenderer render = new RenderOakTable();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOakTable.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MoreOresModCore.blockOakTable), new ItemRenderOakTable(render, new TileEntityOakTable()));
		
		//Entities
		
		//Cake Cow
		RenderingRegistry.registerEntityRenderingHandler(EntityCakeCow.class, new RenderCakeCow(new ModelCakeCow(), 0.3F));
	}

	public void registerTileEntitySpecialRenderer(){
		
	}
	
}