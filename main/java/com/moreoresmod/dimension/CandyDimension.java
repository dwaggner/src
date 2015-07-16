package com.moreoresmod.dimension;


import net.minecraftforge.common.DimensionManager;

public class CandyDimension {
	
	private static final int CANDY_ID = 15;
	
	public CandyDimension(){
		registerWorldGenerator();
	}

	private void registerWorldGenerator() {
		/**Register WorldProvider for Dimension **/
		DimensionManager.registerProviderType(this.getCandyId(), dimensionRegistry.class, false);
		DimensionManager.registerDimension(this.getCandyId(), this.getCandyId());
	}

	/** getter for Heaven DImension ID so it can not be changed in code
	 * but will be changeable in config when set up.
	 * @return HEAVEN_ID
	 */
	public static int getCandyId() {
		return CANDY_ID;
	}
}