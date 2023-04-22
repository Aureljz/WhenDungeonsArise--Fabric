package net.aurelj.dungeons_arise;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DungeonsAriseMain implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "dungeons_arise";

    @Override
    public void onInitialize() {
        WDAStructures.registerStructureFeatures();
    }
}
