package codenamed.tides;

import codenamed.tides.registry.TidesBlocks;
import codenamed.tides.registry.TidesItemGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tides implements ModInitializer {
	public  static  final  String MOD_ID = "tides";
    public static final Logger LOGGER = LoggerFactory.getLogger("tides");

	@Override
	public void onInitialize() {

		LOGGER.info(MOD_ID);


		TidesBlocks.registerModBlocks();
		TidesItemGroup.registerItemGroups();
	}
}