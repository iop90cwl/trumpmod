package com.iop90cwl.trumpmod.proxy;

import com.iop90cwl.trumpmod.init.TrumpBlocks;
import com.iop90cwl.trumpmod.init.TrumpItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRender(){
		TrumpItems.registerRenders();
		TrumpBlocks.registerRenders();
	}
}
