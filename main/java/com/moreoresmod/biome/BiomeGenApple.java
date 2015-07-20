package com.moreoresmod.biome;

import mod.moreoresmod.common.MoreOresModCore;
import mod.moreoresmod.mod.entity.EntityCakeCow;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;

public class BiomeGenApple extends BiomeGenBase{

	
	public BiomeGenApple(int id){
		super(id);
		
		
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.bigMushroomsPerChunk = 0;
		
		
		this.topBlock = MoreOresModCore.blockAppleBlock;
		this.fillerBlock = MoreOresModCore.blockAppleBlock;
		
	}
	
}