package com.iop90cwl.trumpmod;

import com.iop90cwl.trumpmod.init.TrumpItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TrumpTab extends CreativeTabs{

	public TrumpTab(String label) {
		super(label);
		this.setBackgroundImageName("trump.png");
	}
	
	@Override
	public Item getTabIconItem() {
		return TrumpItems.trump_toupee;
	}
	
}
