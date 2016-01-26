package com.iop90cwl.trumpmod;

import com.iop90cwl.trumpmod.init.TrumpBlocks;
import com.iop90cwl.trumpmod.init.TrumpItems;
import com.iop90cwl.trumpmod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TrumpMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		TrumpBlocks.init();
		TrumpBlocks.register();
		TrumpItems.init();
		TrumpItems.register();
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRender();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
