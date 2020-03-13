package mod.dragonita.fantasymod.world.dimensions;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.IBiomeProviderSettings;
import net.minecraft.world.storage.WorldInfo;

public class FantasyBiomeProviderSettings implements IBiomeProviderSettings {
	private final long field_226848_a_;
	private final WorldType field_226849_b_;
	private FantasyGenSettings generatorSettings = new FantasyGenSettings();

	public FantasyBiomeProviderSettings(WorldInfo p_i225751_1_) {
		this.field_226848_a_ = p_i225751_1_.getSeed();
		this.field_226849_b_ = p_i225751_1_.getGenerator();
	}

	public FantasyBiomeProviderSettings setGeneratorSettings(FantasyGenSettings p_205441_1_) {
		this.generatorSettings = p_205441_1_;
		return this;
	}

	public long func_226850_a_() {
		return this.field_226848_a_;
	}

	public WorldType func_226851_b_() {
		return this.field_226849_b_;
	}

	public FantasyGenSettings getGeneratorSettings() {
		return this.generatorSettings;
	}
}