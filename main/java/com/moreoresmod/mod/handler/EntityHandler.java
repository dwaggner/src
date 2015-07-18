package com.moreoresmod.mod.handler;

import java.util.Random;

import cpw.mods.fml.common.registry.EntityRegistry;
import mod.moreoresmod.common.MoreOresModCore;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;

public class EntityHandler {

	public static void registerAnimals(Class entityClass, String name){
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);
		int mainColor = random.nextInt() * 16777215;
		int subColor = random.nextInt() * 16777215;

		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.addSpawn(entityClass, 50, 4, 8 , EnumCreatureType.ambient, MoreOresModCore.biomeCandy);
		EntityRegistry.registerModEntity(entityClass, name, entityID, MoreOresModCore.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, mainColor, subColor));
		
	}
}
