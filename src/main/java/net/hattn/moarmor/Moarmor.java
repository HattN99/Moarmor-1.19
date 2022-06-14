package net.hattn.moarmor;

import net.fabricmc.api.ModInitializer;
import net.hattn.moarmor.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Moarmor implements ModInitializer {

	public static final String MOD_ID = "moarmor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
