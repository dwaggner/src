package mod.moreoresmod.common;

import com.moreoresmod.biome.BiomeGenCandy;
import com.moreoresmod.biome.BiomeRegistry;
import com.moreoresmod.biome.WorldTypeMoreOresModBiomes;
import com.moreoresmod.lib.RefStrings;
import com.moreoresmod.mod.handler.EntityHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import mod.moreoresmod.blocks.CheeseOre;
import mod.moreoresmod.blocks.ChocolateCake;
import mod.moreoresmod.blocks.GreenMintOre;
import mod.moreoresmod.blocks.GunpowderOre;
import mod.moreoresmod.blocks.MintOre;
import mod.moreoresmod.blocks.RedMintOre;
import mod.moreoresmod.blocks.RubyBlock;
import mod.moreoresmod.blocks.RubyOre;
import mod.moreoresmod.blocks.SapphireBlock;
import mod.moreoresmod.blocks.SapphireOre;
import mod.moreoresmod.blocks.SurfaceCake;
import mod.moreoresmod.common.armor.RubyArmor;
import mod.moreoresmod.common.armor.SapphireArmor;
import mod.moreoresmod.items.NCItems;
import mod.moreoresmod.items.RubyAxe;
import mod.moreoresmod.items.RubyHoe;
import mod.moreoresmod.items.RubyPickaxe;
import mod.moreoresmod.items.RubySpade;
import mod.moreoresmod.items.RubySword;
import mod.moreoresmod.items.SapphireAxe;
import mod.moreoresmod.items.SapphireHoe;
import mod.moreoresmod.items.SapphirePickaxe;
import mod.moreoresmod.items.SapphireSpade;
import mod.moreoresmod.items.SapphireSword;
import mod.moreoresmod.mod.entity.entityCakeCow;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = MoreOresModCore.modid, version = MoreOresModCore.version)
public class MoreOresModCore {
	
	public static final String modid = "MoreOresMod";
	public static final String version = "Alpha 0.0";
	public static int dimensionId = 8;
	
	@Instance
	public static MoreOresModCore instance;
	
	//Tool Material
	public static ToolMaterial RubyMaterial = EnumHelper.addToolMaterial("RubyMaterial", 2, 750, 6.0F, 2.0F, 10);
	public static ToolMaterial SapphireMaterial = EnumHelper.addToolMaterial("SapphireMaterial", 2, 750, 6.0F, 2.0F, 10);
	//Armor Material
	public static ArmorMaterial RubyArmorMaterial = EnumHelper.addArmorMaterial("RubyArmorMaterial", 25, new int[] {2, 7, 4, 2}, 10); 
	public static ArmorMaterial SapphireArmorMaterial = EnumHelper.addArmorMaterial("SapphireArmorMaterial", 25, new int[] {2, 7, 4, 2}, 10); 

	//public static Items
	public static Item itemRuby;
	public static Item itemSapphire;
	public static Item itemRedMintDust;
	public static Item itemGreenMintDust;
	public static Item itemMintDust;
	
	//public static Blocks
	public static Block oreRubyOre;
	public static Block blockRubyBlock;
	public static Block oreSapphireOre;
	public static Block blockSapphireBlock;
	public static Block oreRedMintOre;
	public static Block oreGreenMintOre;
	public static Block oreMintOre;
	public static Block oreCheeseOre;
	public static Block oreGunpowderOre;
	public static Block blockIceingCake;
	public static Block blockChocolateCake;

	//public static Tools
	public static Item itemRubySword;
	public static Item itemRubyAxe;
	public static Item itemRubyPickaxe;
	public static Item itemRubySpade;
	public static Item itemRubyHoe;
	
	public static Item itemSapphireSword;
	public static Item itemSapphireAxe;
	public static Item itemSapphirePickaxe;
	public static Item itemSapphireSpade;
	public static Item itemSapphireHoe;
	
	//public static Armor
	public static int armorRubyHelmID;
	public static int armorRubyChestID;
	public static int armorRubyLegsID;
	public static int armorRubyBootsID;
	
	public static Item armorRubyHelm;
	public static Item armorRubyChest;
	public static Item armorRubyLegs;
	public static Item armorRubyBoots;
	
	public static int armorSapphireHelmID;
	public static int armorSapphireChestID;
	public static int armorSapphireLegsID;
	public static int armorSapphireBootsID;
	
	public static Item armorSapphireHelm;
	public static Item armorSapphireChest;
	public static Item armorSapphireLegs;
	public static Item armorSapphireBoots;
	
	//public static Food
	public static Item foodRedMint;
	public static Item foodGreenMint;
	public static Item foodMint;
	public static Item foodCheese;
	
	//Biome
	public static BiomeGenBase biomeCandy;
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE , serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent Proevent) {
		proxy.registerRenderInfo();
		
		//MainRegistry
		BiomeRegistry.mainRegsitry();
		
		//Food
		foodRedMint = new ItemFood(2, 0.2F, false).setUnlocalizedName("RedMint").setCreativeTab(CreativeTabs.tabFood).setTextureName(MoreOresModCore.modid + ":RedMint");
		foodGreenMint = new ItemFood(2, 0.2F, false).setUnlocalizedName("GreenMint").setCreativeTab(CreativeTabs.tabFood).setTextureName(MoreOresModCore.modid + ":GreenMint");
		foodMint = new ItemFood(2, 0.2F, false).setUnlocalizedName("Mint").setCreativeTab(CreativeTabs.tabFood).setTextureName(MoreOresModCore.modid + ":Mint");
		foodCheese = new ItemFood(4, 0.6F, false).setUnlocalizedName("Cheese").setCreativeTab(CreativeTabs.tabFood).setTextureName(MoreOresModCore.modid + ":Cheese");

		//Items
		itemRuby = new NCItems().setUnlocalizedName("Ruby");
		itemSapphire = new NCItems().setUnlocalizedName("Sapphire");
		itemRedMintDust = new NCItems().setUnlocalizedName("RedMintDust");
		itemGreenMintDust = new NCItems().setUnlocalizedName("GreenMintDust");
		itemMintDust = new NCItems().setUnlocalizedName("MintDust");

		//Blocks
		oreRubyOre = new RubyOre(Material.rock).setBlockName("RubyOre");
		blockRubyBlock = new RubyBlock(Material.iron).setBlockName("RubyBlock");
		oreSapphireOre = new SapphireOre(Material.rock).setBlockName("SapphireOre");
		blockSapphireBlock = new SapphireBlock(Material.iron).setBlockName("SapphireBlock");
		oreRedMintOre = new RedMintOre(Material.rock).setBlockName("RedMintOre");
		oreGreenMintOre = new GreenMintOre(Material.rock).setBlockName("GreenMintOre");
		oreMintOre = new MintOre(Material.rock).setBlockName("MintOre");
		oreCheeseOre = new CheeseOre(Material.rock).setBlockName("CheeseOre");
		oreGunpowderOre = new GunpowderOre(Material.rock).setBlockName("GunpowderOre");
		blockIceingCake = new SurfaceCake(Material.cake).setBlockName("IceingCake");
		blockChocolateCake = new ChocolateCake(Material.cake).setBlockName("ChocolateCake");

		//Tools
		itemRubySword = new RubySword(RubyMaterial).setUnlocalizedName("RubySword");
		itemRubyAxe = new RubyAxe(RubyMaterial).setUnlocalizedName("RubyAxe");
		itemRubyPickaxe = new RubyPickaxe(RubyMaterial).setUnlocalizedName("RubyPickaxe");
		itemRubySpade = new RubySpade(RubyMaterial).setUnlocalizedName("RubySpade");
		itemRubyHoe = new RubyHoe(RubyMaterial).setUnlocalizedName("RubyHoe");
		
		itemSapphireSword = new SapphireSword(SapphireMaterial).setUnlocalizedName("SapphireSword");
		itemSapphireAxe = new SapphireAxe(SapphireMaterial).setUnlocalizedName("SapphireAxe");
		itemSapphirePickaxe = new SapphirePickaxe(SapphireMaterial).setUnlocalizedName("SapphirePickaxe");
		itemSapphireSpade = new SapphireSpade(SapphireMaterial).setUnlocalizedName("SapphireSpade");
		itemSapphireHoe = new SapphireHoe(SapphireMaterial).setUnlocalizedName("SapphireHoe");
		
		//Armor
		armorRubyHelm = new RubyArmor(RubyArmorMaterial, armorRubyHelmID, 0).setUnlocalizedName("RubyHelm");
		armorRubyChest = new RubyArmor(RubyArmorMaterial, armorRubyHelmID, 1).setUnlocalizedName("RubyChest");
		armorRubyLegs = new RubyArmor(RubyArmorMaterial, armorRubyHelmID, 2).setUnlocalizedName("RubyLegs");
		armorRubyBoots = new RubyArmor(RubyArmorMaterial, armorRubyHelmID, 3).setUnlocalizedName("RubyBoots");

		armorSapphireHelm = new SapphireArmor(SapphireArmorMaterial, armorSapphireHelmID, 0).setUnlocalizedName("SapphireHelm");
		armorSapphireChest = new SapphireArmor(SapphireArmorMaterial, armorSapphireHelmID, 1).setUnlocalizedName("SapphireChest");
		armorSapphireLegs = new SapphireArmor(SapphireArmorMaterial, armorSapphireHelmID, 2).setUnlocalizedName("SapphireLegs");
		armorSapphireBoots = new SapphireArmor(SapphireArmorMaterial, armorSapphireHelmID, 3).setUnlocalizedName("SapphireBoots");		
		
		//Biome
		biomeCandy = new BiomeGenCandy(137).setBiomeName("Cake").setTemperatureRainfall(1.2F, 0.9F);
				
		//Register Item
		GameRegistry.registerItem(itemRuby, "Ruby");
		GameRegistry.registerItem(itemSapphire, "Sapphire");
		GameRegistry.registerItem(itemGreenMintDust,  "GreenMintDust");
		GameRegistry.registerItem(itemRedMintDust,  "RedMintDust");
		GameRegistry.registerItem(itemMintDust,  "MintDust");

		//Register Block
		GameRegistry.registerBlock(oreRubyOre, "RubyOre");
		GameRegistry.registerBlock(blockRubyBlock, "RubyBlock");
		GameRegistry.registerBlock(oreSapphireOre,  "SapphireOre");
		GameRegistry.registerBlock(blockSapphireBlock,  "SapphireBlock");
		GameRegistry.registerBlock(oreGreenMintOre,  "GreenMintOre");
		GameRegistry.registerBlock(oreRedMintOre,  "RedMintOre");
		GameRegistry.registerBlock(oreMintOre,  "MintOre");
		GameRegistry.registerBlock(oreCheeseOre,  "CheeseOre");
		GameRegistry.registerBlock(oreGunpowderOre,  "GunpowderOre");
		GameRegistry.registerBlock(blockIceingCake,  "IceingCake");
		GameRegistry.registerBlock(blockChocolateCake,  "ChocolateCake");

		//Register Tools
		GameRegistry.registerItem(itemRubySword, "RubySword");
		GameRegistry.registerItem(itemRubyAxe, "RubyAxe");
		GameRegistry.registerItem(itemRubyPickaxe, "RubyPickaxe");
		GameRegistry.registerItem(itemRubySpade, "RubySpade");
		GameRegistry.registerItem(itemRubyHoe, "RubyHoe");
		
		GameRegistry.registerItem(itemSapphireSword, "SapphireSword");
		GameRegistry.registerItem(itemSapphireAxe, "SapphireAxe");
		GameRegistry.registerItem(itemSapphirePickaxe, "SapphirePickaxe");
		GameRegistry.registerItem(itemSapphireSpade, "SapphireSpade");
		GameRegistry.registerItem(itemSapphireHoe, "SapphireHoe");

		//Register Armor
		GameRegistry.registerItem(armorRubyHelm, "RubyHelm");
		GameRegistry.registerItem(armorRubyChest, "RubyChest");
		GameRegistry.registerItem(armorRubyLegs, "RubyLegs");
		GameRegistry.registerItem(armorRubyBoots, "RubyBoots");
		
		GameRegistry.registerItem(armorSapphireHelm, "SapphireHelm");
		GameRegistry.registerItem(armorSapphireChest, "SapphireChest");
		GameRegistry.registerItem(armorSapphireLegs, "SapphireLegs");
		GameRegistry.registerItem(armorSapphireBoots, "SapphireBoots");
		
		//Register Food
		GameRegistry.registerItem(foodRedMint, "RedMint");
		GameRegistry.registerItem(foodGreenMint, "GreenMint");
		GameRegistry.registerItem(foodMint, "Mint");
		GameRegistry.registerItem(foodCheese, "Cheese");

		//Biomes
		
		
		//Entity
		EntityHandler.registerAnimals(entityCakeCow.class, "CakeCow");
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		
		GameRegistry.registerWorldGenerator(new BetterWorldGenerator(), 0);
		
		//Item Stacks
		ItemStack RubyStack = new ItemStack(MoreOresModCore.itemRuby); 
		ItemStack RubyBlockStack = new ItemStack(MoreOresModCore.blockRubyBlock);
		ItemStack MultiRubyStack = new ItemStack(MoreOresModCore.itemRuby, 9);
		ItemStack StickStack = new ItemStack(Items.stick);
		ItemStack RubyPickaxeStack = new ItemStack(MoreOresModCore.itemRubyPickaxe);
		ItemStack RubyAxeStack = new ItemStack(MoreOresModCore.itemRubyAxe);
		ItemStack RubySwordStack = new ItemStack(MoreOresModCore.itemRubySword);
		ItemStack RubyHoeStack = new ItemStack(MoreOresModCore.itemRubyHoe);
		ItemStack RubySpadeStack = new ItemStack(MoreOresModCore.itemRubySpade);
		ItemStack RubyHelmStack = new ItemStack(MoreOresModCore.armorRubyHelm);
		ItemStack RubyChestStack = new ItemStack(MoreOresModCore.armorRubyChest);
		ItemStack RubyLegsStack = new ItemStack(MoreOresModCore.armorRubyLegs);
		ItemStack RubyBootsStack = new ItemStack(MoreOresModCore.armorRubyBoots);
		ItemStack SapphireOreStack = new ItemStack(MoreOresModCore.oreSapphireOre);
		ItemStack SapphireStack = new ItemStack(MoreOresModCore.itemSapphire);
		ItemStack SapphireSwordStack = new ItemStack(MoreOresModCore.itemSapphireSword);
		ItemStack SapphirePickaxeStack = new ItemStack(MoreOresModCore.itemSapphirePickaxe);
		ItemStack SapphireAxeStack = new ItemStack(MoreOresModCore.itemSapphireAxe);
		ItemStack SapphireSpadeStack = new ItemStack(MoreOresModCore.itemSapphireSpade);
		ItemStack SapphireHoeStack = new ItemStack(MoreOresModCore.itemSapphireHoe);
		ItemStack SapphireHelmStack = new ItemStack(MoreOresModCore.armorSapphireHelm);
		ItemStack SapphireChestStack = new ItemStack(MoreOresModCore.armorSapphireChest);
		ItemStack SapphireLegsStack = new ItemStack(MoreOresModCore.armorSapphireLegs);
		ItemStack SapphireBootsStack = new ItemStack(MoreOresModCore.armorSapphireBoots);
		ItemStack MintDustStack = new ItemStack(MoreOresModCore.itemMintDust);
		ItemStack GreenMintDustStack = new ItemStack(MoreOresModCore.itemGreenMintDust);
		ItemStack RedMintDustStack = new ItemStack(MoreOresModCore.itemRedMintDust);
		ItemStack RedMintCandy = new ItemStack(MoreOresModCore.foodRedMint);
		ItemStack GreenMintCandy = new ItemStack(MoreOresModCore.foodGreenMint);
		ItemStack MintCandy = new ItemStack(MoreOresModCore.foodMint);

		//Crafting Recipes
		//Ruby -> Ruby Block
		GameRegistry.addRecipe(RubyBlockStack, 
				"xxx", 
				"xxx", 
				"xxx",
				'x', RubyStack);
		//Ruby Block -> Ruby
		GameRegistry.addShapelessRecipe(MultiRubyStack, RubyBlockStack);
		//Ruby Pickaxe
		GameRegistry.addRecipe(RubyPickaxeStack,
				"xxx",
				" s ",
				" s ",
				'x', RubyStack, 's', StickStack);
		//Ruby Axe
		GameRegistry.addRecipe(RubyAxeStack, 
				"xx ",
				"xs ",
				" s ",
				'x', RubyStack, 's', StickStack);
		//RubySword
		GameRegistry.addRecipe(RubySwordStack, 
				" x ",
				" x ",
				" s ",
				'x', RubyStack, 's', StickStack);
		//RubyHoe
		GameRegistry.addRecipe(RubyHoeStack,
				"xx ",
				" s ",
				" s ",
				'x', RubyStack, 's', StickStack);
		GameRegistry.addRecipe(RubyHoeStack,
				" xx",
				" s ",
				" s ",
				'x', RubyStack, 's', StickStack);
		//RubySpade
		GameRegistry.addRecipe(RubySpadeStack, 
				" x ",
				" s ",
				" s ",
				'x', RubyStack, 's', StickStack);
		//RubyHelmet
		GameRegistry.addRecipe(RubyHelmStack,
				"xxx",
				"x x",
				'x', RubyStack);
		//RubyChest
		GameRegistry.addRecipe(RubyChestStack, 
				"x x",
				"xxx",
				"xxx",
				'x', RubyStack);
		//RubyLegs
		GameRegistry.addRecipe(RubyLegsStack, 
				"xxx",
				"x x",
				"x x",
				'x', RubyStack);
		//RubyBoots
		GameRegistry.addRecipe(RubyBootsStack,
				"   ",
				"x x",
				"x x",
				'x', RubyStack);
		//SapphireSword
		GameRegistry.addRecipe(SapphireSwordStack,
				" d ",
				" d ",
				" s ",
				'd', SapphireStack, 's', StickStack);
		//SapphirePickaxe
		GameRegistry.addRecipe(SapphirePickaxeStack, 
				"ddd",
				" s ",
				" s ",
				'd', SapphireStack, 's', StickStack);
		//SapphireAxe
		GameRegistry.addRecipe(SapphireAxeStack,
				"dd ",
				"ds ",
				" s ",
				'd', SapphireStack, 's', StickStack);
		//SapphireHoe
		GameRegistry.addRecipe(SapphireHoeStack, 
				"dd ",
				" s ",
				" s ",
				'd', SapphireStack, 's', StickStack);
		//SapphireSpade
		GameRegistry.addRecipe(SapphireSpadeStack,
				" d ",
				" s ",
				" s ",
				'd', SapphireStack, 's', StickStack);
		//SapphireHelm
		GameRegistry.addRecipe(SapphireHelmStack,
				"ddd",
				"d d",
				'd', SapphireStack);
		//SapphireChest
		GameRegistry.addRecipe(SapphireChestStack,
				"d d",
				"ddd",
				"ddd",
				'd', SapphireStack);
		//SapphireLegs
		GameRegistry.addRecipe(SapphireLegsStack,
				"ddd",
				"d d",
				"d d",
				'd', SapphireStack);
		//SapphireBoots
		GameRegistry.addRecipe(SapphireBootsStack,
				"   ",
				"d d",
				"d d",
				'd', SapphireStack);
		//GreenMintCandy
		GameRegistry.addShapelessRecipe(GreenMintCandy, GreenMintDustStack);
		//RedMintCandy
		GameRegistry.addShapelessRecipe(RedMintCandy, RedMintDustStack);
		//MintCandy
		GameRegistry.addShapelessRecipe(MintCandy, MintDustStack);
		
		//Smelting Recipes
		GameRegistry.addSmelting(MoreOresModCore.oreRubyOre, RubyStack, 5);
		GameRegistry.addSmelting(MoreOresModCore.oreSapphireOre, SapphireStack, 5);
		GameRegistry.addSmelting(MoreOresModCore.oreRedMintOre, RedMintDustStack, 5);
		GameRegistry.addSmelting(MoreOresModCore.oreGreenMintOre, GreenMintDustStack, 5);
		GameRegistry.addSmelting(MoreOresModCore.oreMintOre, MintDustStack, 5);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent Posteven) {	
    	WorldType BIOMES = new WorldTypeMoreOresModBiomes(3, "Biomes");

		
	}
}