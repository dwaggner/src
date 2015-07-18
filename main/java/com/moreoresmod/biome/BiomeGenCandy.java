package com.moreoresmod.biome;


import mod.moreoresmod.common.MoreOresModCore;
import mod.moreoresmod.mod.entity.EntityCakeCow;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenCandy extends BiomeGenBase{
	

	public BiomeGenCandy(int id){
		super(id);
		
		
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.bigMushroomsPerChunk = 0;
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCakeCow.class, 10, 8, 8));
		
		this.topBlock = MoreOresModCore.blockIceingCake;
		this.fillerBlock = MoreOresModCore.blockChocolateCake;
		
	}
	
}