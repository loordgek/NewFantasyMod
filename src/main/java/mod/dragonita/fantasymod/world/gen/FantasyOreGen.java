package mod.dragonita.fantasymod.world.gen;

import mod.dragonita.fantasymod.init.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class FantasyOreGen  implements Runnable{
	@Override
	public void run() {
		for(Biome biome : ForgeRegistries.BIOMES) {
			//if(biome == Biomes.PLAINS) {
				ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE
						.configure(new CountRangeConfig(20, 5, 5, 25));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.RAINBOW_ORE.get().getDefaultState(), 10))
						.withPlacement(customConfig));
			//}
		}
	}
}