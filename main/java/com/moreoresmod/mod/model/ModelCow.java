// Date: 7/16/2015 5:05:51 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.moreoresmod.mod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCow extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer Leg_1;
    ModelRenderer Leg_2;
    ModelRenderer Leg_3;
    ModelRenderer Leg_4;
    ModelRenderer Horn_1;
    ModelRenderer Horn_2;
  
  public ModelCow()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(0F, 0F, 0F, 12, 11, 9);
      Head.setRotationPoint(-6F, -8F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 16, 14, 20);
      Body.setRotationPoint(-8F, 0F, -20F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Leg_1 = new ModelRenderer(this, 0, 0);
      Leg_1.addBox(0F, 0F, 0F, 5, 10, 5);
      Leg_1.setRotationPoint(3F, 14F, -5F);
      Leg_1.setTextureSize(64, 32);
      Leg_1.mirror = true;
      setRotation(Leg_1, 0F, 0F, 0F);
      Leg_2 = new ModelRenderer(this, 0, 0);
      Leg_2.addBox(0F, 0F, 0F, 5, 10, 5);
      Leg_2.setRotationPoint(-8F, 14F, -5F);
      Leg_2.setTextureSize(64, 32);
      Leg_2.mirror = true;
      setRotation(Leg_2, 0F, 0F, 0F);
      Leg_3 = new ModelRenderer(this, 0, 0);
      Leg_3.addBox(0F, 0F, 0F, 4, 10, 5);
      Leg_3.setRotationPoint(-8F, 14F, -20F);
      Leg_3.setTextureSize(64, 32);
      Leg_3.mirror = true;
      setRotation(Leg_3, 0F, 0F, 0F);
      Leg_4 = new ModelRenderer(this, 0, 0);
      Leg_4.addBox(0F, 0F, 0F, 5, 10, 5);
      Leg_4.setRotationPoint(3F, 14F, -20F);
      Leg_4.setTextureSize(64, 32);
      Leg_4.mirror = true;
      setRotation(Leg_4, 0F, 0F, 0F);
      Horn_1 = new ModelRenderer(this, 0, 0);
      Horn_1.addBox(0F, 0F, 0F, 1, 2, 2);
      Horn_1.setRotationPoint(-6F, -10F, 2F);
      Horn_1.setTextureSize(64, 32);
      Horn_1.mirror = true;
      setRotation(Horn_1, 0F, 0F, 0F);
      Horn_2 = new ModelRenderer(this, 0, 0);
      Horn_2.addBox(0F, 0F, 0F, 1, 2, 2);
      Horn_2.setRotationPoint(5F, -10F, 2F);
      Horn_2.setTextureSize(64, 32);
      Horn_2.mirror = true;
      setRotation(Horn_2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Body.render(f5);
    Leg_1.render(f5);
    Leg_2.render(f5);
    Leg_3.render(f5);
    Leg_4.render(f5);
    Horn_1.render(f5);
    Horn_2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float f6 = (180F / (float)Math.PI);
    this.Head.rotateAngleX = f3 / (180F / (float)Math.PI);
    this.Head.rotateAngleY = f4 / (180F / (float)Math.PI);
    this.Body.rotateAngleX = ((float)Math.PI / 2F);
    this.Leg_1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.Leg_2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.Leg_3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.Leg_4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }
//Sincerely,
//Dumb Bitch Jane
}
