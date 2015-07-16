package com.moreoresmod.biome;

import mod.moreoresmod.common.MoreOresModCore;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenCandy extends BiomeGenBase {

	public BiomeGenCandy(int id) {
		super(id);
		
		this.setBiomeName("Candy");
		this.setTemperatureRainfall(2.0F, 0.9F);
		this.setColor(9);
		this.topBlock = (MoreOresModCore.oreRubyOre);
		
	}

	private void topBlock(Block oreGreenMintOre) {
		
	}

}


