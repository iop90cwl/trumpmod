package com.iop90cwl.trumpmod.init;

import com.iop90cwl.trumpmod.Reference;
import com.iop90cwl.trumpmod.TrumpMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TrumpItems {
	
	public static Item trump_toupee;
	
	
	public static void init() {
		trump_toupee = new Item().setUnlocalizedName("trump_toupee").setCreativeTab(TrumpMod.tabTrump);
		
	}
	
	public static void register()
	{
		GameRegistry.registerItem(trump_toupee, trump_toupee.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRenders()
	{
		registerRender(trump_toupee);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
