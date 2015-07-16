package com.moreoresmod.dimension;

import mod.moreoresmod.common.MoreOresModCore;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class dimensionRegistry extends WorldProvider
{
       public void registerWorldChunkManager()
       {
              this.worldChunkMgr = new WorldChunkManagerHell(MoreOresModCore.biomeCandy, 0.8F);
              this.dimensionId = MoreOresModCore.dimensionId;
       }
      
       public IChunkProvider createChunkGenerator()
       {
              return new ChunkProvider(worldObj, worldObj.getSeed(), true);
       }
      
       @Override
       public String getDimensionName()
       {
              return "Candy";
       }
}