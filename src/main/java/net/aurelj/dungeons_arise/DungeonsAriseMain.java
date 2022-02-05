/*      MIT License

        Copyright (c) 2022 TelepathicGrunt

        Permission is hereby granted, free of charge, to any person obtaining a copy
        of this software and associated documentation files (the "Software"), to deal
        in the Software without restriction, including without limitation the rights
        to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
        copies of the Software, and to permit persons to whom the Software is
        furnished to do so, subject to the following conditions:

        The above copyright notice and this permission notice shall be included in all
        copies or substantial portions of the Software.

        THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
        IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
        FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
        AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
        LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
        OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
        SOFTWARE. */
package net.aurelj.dungeons_arise;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.aurelj.dungeons_arise.config.WDAConfig;
import net.aurelj.dungeons_arise.util.BiomePredicateUtil;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DungeonsAriseMain implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "dungeons_arise";
    public static WDAConfig CONFIG;

    @Override
    public void onInitialize() {


        AutoConfig.register(WDAConfig.class, JanksonConfigSerializer::new);

        CONFIG = AutoConfig.getConfigHolder(WDAConfig.class).getConfig();

        WDAStructures.setupAndRegisterStructureFeatures();
        WDAConfiguredStructures.registerConfiguredStructures();
        addStructureSpawningToDimensionsAndBiomes();
    }

    public static void addStructureSpawningToDimensionsAndBiomes() {

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.OCEAN).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.illagerCorsairGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_ILLAGER_CORSAIR))
                        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.OCEAN,
                        Biome.Category.RIVER).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.illagerGalleyGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_ILLAGER_GALLEY))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.OCEAN).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.typhonGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_TYPHON))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.OCEAN).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.undeadPirateShipGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_UNDEAD_PIRATE_SHIP))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.MESA).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.banditTowersGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_BANDIT_TOWERS))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.MESA).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.banditVillageGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_BANDIT_VILLAGE))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.PLAINS,
                        Biome.Category.EXTREME_HILLS).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.illagerCampsiteGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_ILLAGER_CAMPSITE))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.PLAINS).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.merchantCampsiteGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_MERCHANT_CAMPSITE))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.DESERT).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.ceryneianHindGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_CERYNEIAN_HIND))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.DESERT).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.shirazPalaceGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_SHIRAZ_PALACE))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.foundInTheEnd().and(BiomePredicateUtil.booleanToPredicate(CONFIG.aviaryGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_AVIARY))
        );

        BiomeModifications.addStructure(
                (BiomeSelectors.foundInTheEnd().or(BiomeSelectors.foundInOverworld())).and(BiomePredicateUtil.booleanToPredicate(CONFIG.heavenlyRiderGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_HEAVENLY_RIDER))
        );

        BiomeModifications.addStructure(
                (BiomeSelectors.foundInTheEnd().or(BiomeSelectors.foundInOverworld())).and(BiomePredicateUtil.booleanToPredicate(CONFIG.heavenlyConquerorGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_HEAVENLY_CONQUEROR))
        );

        BiomeModifications.addStructure(
                (BiomeSelectors.foundInTheEnd().or(BiomeSelectors.foundInOverworld())).and(BiomePredicateUtil.booleanToPredicate(CONFIG.heavenlyChallengerGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_HEAVENLY_CHALLENGER))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.BEACH).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.lighthouseGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_LIGHTHOUSE))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.foundInOverworld().and(BiomePredicateUtil.booleanToPredicate(CONFIG.smallBlimpGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_SMALL_BLIMP))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.TAIGA,
                        Biome.Category.EXTREME_HILLS).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.abandonedTempleGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_ABANDONED_TEMPLE))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.TAIGA,
                        Biome.Category.ICY).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.illagerFortGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_ILLAGER_FORT))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.TAIGA,
                        Biome.Category.EXTREME_HILLS).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.monasteryGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_MONASTERY))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.FOREST).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.thornbornTowersGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_THORNBORN_TOWERS))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.MUSHROOM,
                        Biome.Category.FOREST).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.giantMushroomGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_GIANT_MUSHROOM))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.MUSHROOM,
                        Biome.Category.PLAINS).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.mushroomHouseGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_MUSHROOM_HOUSE))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.MUSHROOM,
                        Biome.Category.FOREST,
                        Biome.Category.SWAMP).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.mushroomMinesGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_MUSHROOM_MINES))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.MUSHROOM,
                        Biome.Category.FOREST,
                        Biome.Category.SWAMP).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.mushroomVillageGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_MUSHROOM_VILLAGE))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.TAIGA).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.infestedTempleGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_INFESTED_TEMPLE))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.TAIGA,
                        Biome.Category.FOREST,
                        Biome.Category.JUNGLE).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.plagueAsylumGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_PLAGUE_ASYLUM))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.JUNGLE).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.jungleTreeHouseGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_JUNGLE_TREE_HOUSE))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.PLAINS).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.coliseumGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_COLISEUM))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.BEACH).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.fishingHutGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_FISHING_HUT))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.PLAINS).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.illagerWindmillGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_ILLAGER_WINDMILL))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.PLAINS).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.smallPrairieHouseGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_SMALL_PRAIRIE_HOUSE))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.PLAINS).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.wishingWellGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_WISHING_WELL))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.EXTREME_HILLS,
                        Biome.Category.PLAINS,
                        Biome.Category.DESERT,
                        Biome.Category.UNDERGROUND).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.foundryGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_FOUNDRY))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.MESA,
                        Biome.Category.EXTREME_HILLS,
                        Biome.Category.PLAINS,
                        Biome.Category.UNDERGROUND).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.miningSystemGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_MINING_SYSTEM))
        );

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.DESERT).and(BiomeSelectors.foundInOverworld()).and(BiomePredicateUtil.booleanToPredicate(CONFIG.scorchedMinesGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(WDAConfiguredStructures.CONFIGURED_SCORCHED_MINES))
        );
    }
}
