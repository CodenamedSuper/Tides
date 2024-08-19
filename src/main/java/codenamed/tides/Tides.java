package codenamed.tides;

import codenamed.tides.registry.TidesBlocks;
import codenamed.tides.registry.TidesFeature;
import codenamed.tides.registry.TidesItemGroup;
import codenamed.tides.registry.TidesPlacedFeatures;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tides implements ModInitializer {
	public  static  final  String MOD_ID = "tides";
    public static final Logger LOGGER = LoggerFactory.getLogger("tides");

	public static final RegistryKey<PlacedFeature> PATCH_URCHIN = registerKey("patch_urchin");


	public static RegistryKey<PlacedFeature> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Tides.MOD_ID, name));
	}


	@Override
	public void onInitialize() {

		LOGGER.info(MOD_ID);


		TidesBlocks.registerModBlocks();
		TidesItemGroup.registerItemGroups();
		TidesFeature.registerFeatures();
		TidesPlacedFeatures.registerPlacedFeatured();

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUKEWARM_OCEAN),
				GenerationStep.Feature.VEGETAL_DECORATION, TidesPlacedFeatures.COLONY_URCHIN);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN),
				GenerationStep.Feature.VEGETAL_DECORATION, TidesPlacedFeatures.COLONY_URCHIN);

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUKEWARM_OCEAN),
				GenerationStep.Feature.VEGETAL_DECORATION, TidesPlacedFeatures.COLONY_ANEMONE);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN),
				GenerationStep.Feature.VEGETAL_DECORATION, TidesPlacedFeatures.COLONY_ANEMONE);

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUKEWARM_OCEAN),
				GenerationStep.Feature.VEGETAL_DECORATION, TidesPlacedFeatures.ANEMONE);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN),
				GenerationStep.Feature.VEGETAL_DECORATION, TidesPlacedFeatures.ANEMONE);

		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUKEWARM_OCEAN),
				GenerationStep.Feature.VEGETAL_DECORATION, TidesPlacedFeatures.URCHIN);
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN),
				GenerationStep.Feature.VEGETAL_DECORATION, TidesPlacedFeatures.URCHIN);



	}
}