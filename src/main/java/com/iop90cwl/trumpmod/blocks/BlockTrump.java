package com.iop90cwl.trumpmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTrump extends Block{

		public BlockTrump(Material materialIn) {
			
			super(materialIn);
			this.setHardness(0.6F);
			this.setLightLevel(0.5F);
			this.setStepSound(soundTypeCloth);
		}
}
