package com.moreoresmod.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {

	public static void mainRegistry(){
		initializeBiome();
		registerBiome();
	}
	public static BiomeGenBase biomeCandy;
	
	public static void initializeBiome(){
		biomeCandy = new BiomeGenCandy(137).setBiomeName("Candy").setTemperatureRainfall(2.0F, 0.9F);
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomeCandy, Type.FOREST);
		BiomeManager.addSpawnBiome(biomeCandy);
	}
}
