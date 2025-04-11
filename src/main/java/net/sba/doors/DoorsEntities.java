package net.sba.doors;

import net.fabricmc.api.ModInitializer;

import net.sba.doors.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoorsEntities implements ModInitializer {
	public static final String MOD_ID = "doors-entities";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}