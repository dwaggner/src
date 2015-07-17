package mod.moreoresmod.common;

import cpw.mods.fml.client.registry.RenderingRegistry;
import mod.moreoresmod.mod.entity.entityCakeCow;
import mod.moreoresmod.renderer.RenderCakeCow;
import net.minecraft.client.model.ModelCow;

public class ClientProxy extends ServerProxy {
	public void registerRenderInfo() {
		
		//Entities
		RenderingRegistry.registerEntityRenderingHandler(entityCakeCow.class, new RenderCakeCow(new ModelCow(), 0.3F));
	}
}
