package mod.moreoresmod.renderer;

import com.moreoresmod.mod.model.ModelCow;

import mod.moreoresmod.common.MoreOresModCore;
import mod.moreoresmod.mod.entity.entityCakeCow;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderCakeCow extends RenderLiving {

	public static final ResourceLocation texture = new ResourceLocation(MoreOresModCore.modid + ":" + "textures/model/CandyCow.png");
	
	protected ModelCow modelEntity;
	
	public RenderCakeCow(ModelBase Par1ModelBase, float par2) {
		super(Par1ModelBase, par2);
		modelEntity = ((ModelCow) mainModel);
	}
	
	public void renderCakeCow(entityCakeCow entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderCakeCow((entityCakeCow) entityLiving, x, y, z, u, v);
	}
	
	public void doRender(Entity entity,  double x, double y, double z, float u, float v){
		renderCakeCow((entityCakeCow)entity, x, y, z, u, v);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}
	
	
}