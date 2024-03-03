package net.blyrium.yantr;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YANTR implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("yantr");

	@Override
	public void onInitialize() {
		LOGGER.info("YANTR loaded");
	}
}