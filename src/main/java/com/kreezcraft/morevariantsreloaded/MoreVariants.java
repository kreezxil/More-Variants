package com.kreezcraft.morevariantsreloaded;

import com.kreezcraft.morevariantsreloaded.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MoreVariants.modId, name = MoreVariants.name, version = MoreVariants.version, acceptedMinecraftVersions = "[1.12.2]")

public class MoreVariants {

	@SidedProxy(serverSide = "com.kreezcraft.morevariantsreloaded.proxy.CommonProxy", clientSide = "com.kreezcraft.morevariantsreloaded.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "morevariantsreloaded";
	public static final String name = "More Variants";
	public static final String version = "@VERSION@";
	public static final MoreVariantsTab creativeTab = new MoreVariantsTab("More Variants");

	
	@Mod.Instance(modId)
	public static MoreVariants instance;
	
	public static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}


}
