package mod.dragonita.fantasymod.world.dimensions;

import net.minecraft.world.gen.GenerationSettings;

public class FantasyGenSettings extends GenerationSettings {
	@SuppressWarnings("unused")
	private final int field_202212_j = 4;
	@SuppressWarnings("unused")
	private final int field_202213_k = 4;
	@SuppressWarnings("unused")
	private final int field_202214_l = -1;
	@SuppressWarnings("unused")
	private final int field_202215_m = 65;
	
	public int getBiomeSize() {
		return 4;
	}
		
	public int getRiverSize() {
		return 4;
	}
	
	public int getBiomeId() {
		return -1;
	}
	
	public int getBedrockFloorHeight() {
		return 0;
	}
}