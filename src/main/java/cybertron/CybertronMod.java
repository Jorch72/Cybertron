package cybertron;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cybertron.blocks.CybertronBlock;
import cybertron.blocks.CybertronPortal;
import cybertron.dimension.CybertronBiome;
import cybertron.dimension.CybertronWorldProvider;

@Mod(modid = "cybertron", name = "Cybertron", version = "1.0")
public class CybertronMod {
	public static CybertronPortal cybertron_portal;
	public static Block cybertron_block;
	
	public static BiomeGenBase cybertron_biome;
	public static int CYBERTRON_DIMENSION_ID = 10;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		cybertron_portal = new CybertronPortal();
		GameRegistry.registerBlock(cybertron_portal, "cybertron_portal");
		
		cybertron_block = new CybertronBlock();
		GameRegistry.registerBlock(cybertron_block, "cybertron_block");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		cybertron_biome = new CybertronBiome();
		DimensionManager.registerProviderType(CYBERTRON_DIMENSION_ID, CybertronWorldProvider.class, false);
		DimensionManager.registerDimension(CYBERTRON_DIMENSION_ID, CYBERTRON_DIMENSION_ID);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
