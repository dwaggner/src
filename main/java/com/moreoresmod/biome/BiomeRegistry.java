package com.moreoresmod.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	
	public static void mainRegsitry(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeCandy;
	
	
	public static void initializeBiome(){
		
		biomeCandy = new BiomeGenCandy(137).setBiomeName("Cake").setTemperatureRainfall(2.0F, 0.5F).setColor(5470985);
		
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomeCandy, Type.FOREST);
		BiomeManager.addSpawnBiome(biomeCandy);
	}

}