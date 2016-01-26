package com.iop90cwl.trumpmod.init;

import com.iop90cwl.trumpmod.Reference;
import com.iop90cwl.trumpmod.blocks.BlockTrump;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TrumpBlocks {
	
	public static Block trump_loan;
	
	public static void init()
	{
		trump_loan = new BlockTrump(Material.cloth).setUnlocalizedName("trump_loan");
	}
	public static void register()
	{
		GameRegistry.registerBlock(trump_loan, trump_loan.getUnlocalizedName().substring(5));
	}
	public static void registerRenders()
	{
		registerRender(trump_loan);
	}
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
