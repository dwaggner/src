package mod.moreoresmod.mod.renderer;

import com.moreoresmod.mod.model.ModelCakeCow;

import mod.moreoresmod.common.MoreOresModCore;
import mod.moreoresmod.mod.entity.EntityCakeCow;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderCakeCow extends RenderLiving {

	public static final ResourceLocation texture = new ResourceLocation(MoreOresModCore.modid + ":" + "textures/model/CakeCow.png");
	
	protected ModelCakeCow modelEntity;
	
	public RenderCakeCow(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
		modelEntity = ((ModelCakeCow) mainModel);
	}
	
	public void renderCakeCow(EntityCakeCow entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
	}
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderCakeCow((EntityCakeCow) entityLiving, x, y, z, u, v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderCakeCow((EntityCakeCow)entity, x, y, z, u, v);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}
}
