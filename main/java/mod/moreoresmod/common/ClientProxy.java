package mod.moreoresmod.common;

import com.moreoresmod.mod.model.ModelCakeCow;

import cpw.mods.fml.client.registry.RenderingRegistry;
import mod.moreoresmod.mod.entity.EntityCakeCow;
import mod.moreoresmod.mod.renderer.RenderCakeCow;

public class ClientProxy extends ServerProxy {
	public void registerRenderInfo() {
		
		//Entities
		
		//Cake Cow
		RenderingRegistry.registerEntityRenderingHandler(EntityCakeCow.class, new RenderCakeCow(new ModelCakeCow(), 0.3F));
	}

}