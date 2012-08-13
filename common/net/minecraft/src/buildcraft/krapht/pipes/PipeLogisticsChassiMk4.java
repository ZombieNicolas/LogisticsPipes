package net.minecraft.src.buildcraft.krapht.pipes;

import net.minecraft.src.mod_LogisticsPipes;

public class PipeLogisticsChassiMk4 extends PipeLogisticsChassi{

	public PipeLogisticsChassiMk4(int itemID) {
		super(itemID);
	}

	@Override
	public int getCenterTexture() {
		return mod_LogisticsPipes.LOGISTICSPIPE_CHASSI4_TEXTURE;
	}

	@Override
	public int getChassiSize() {
		return 4;
	}


}
