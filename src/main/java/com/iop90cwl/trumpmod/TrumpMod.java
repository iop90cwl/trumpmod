package com.iop90cwl.trumpmod;

import com.iop90cwl.trumpmod.init.TrumpBlocks;
import com.iop90cwl.trumpmod.init.TrumpItems;
import com.iop90cwl.trumpmod.proxy.CommonProxy;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TrumpMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final TrumpTab tabTrump = new TrumpTab("tabTrump");
	
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
		GameRegistry.addRecipe(new ItemStack(TrumpBlocks.trump_loan), new Object[]{"GGG", "GGG","GGG", 'G', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(TrumpItems.trump_toupee), new Object[]{"SSS","SES","SSS", 'S', Items.string, 'E', Items.egg});
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
