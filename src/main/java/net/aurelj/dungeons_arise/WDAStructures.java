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

import net.aurelj.dungeons_arise.structures.aquatic.IllagerCorsairStructure;
import net.aurelj.dungeons_arise.structures.aquatic.IllagerGalleyStructure;
import net.aurelj.dungeons_arise.structures.aquatic.TyphonStructure;
import net.aurelj.dungeons_arise.structures.aquatic.UndeadPirateShipStructure;
import net.aurelj.dungeons_arise.structures.bandit.BanditTowersStructure;
import net.aurelj.dungeons_arise.structures.bandit.BanditVillageStructure;
import net.aurelj.dungeons_arise.structures.campsites.IllagerCampsiteStructure;
import net.aurelj.dungeons_arise.structures.campsites.MerchantCampsiteStructure;
import net.aurelj.dungeons_arise.structures.desertic.CeryneianHindStructure;
import net.aurelj.dungeons_arise.structures.desertic.ShirazPalaceStructure;
import net.aurelj.dungeons_arise.structures.eerie.AviaryStructure;
import net.aurelj.dungeons_arise.structures.eerie.HeavenlyChallengerStructure;
import net.aurelj.dungeons_arise.structures.eerie.HeavenlyConquerorStructure;
import net.aurelj.dungeons_arise.structures.eerie.HeavenlyRiderStructure;
import net.aurelj.dungeons_arise.structures.enigmatic.LighthouseStructure;
import net.aurelj.dungeons_arise.structures.enigmatic.SmallBlimpStructure;
import net.aurelj.dungeons_arise.structures.fortified.AbandonedTempleStructure;
import net.aurelj.dungeons_arise.structures.fortified.IllagerFortStructure;
import net.aurelj.dungeons_arise.structures.fortified.MonasteryStructure;
import net.aurelj.dungeons_arise.structures.fortified.ThornbornTowersStructure;
import net.aurelj.dungeons_arise.structures.fungi.GiantMushroomStructure;
import net.aurelj.dungeons_arise.structures.fungi.MushroomHouseStructure;
import net.aurelj.dungeons_arise.structures.fungi.MushroomMinesStructure;
import net.aurelj.dungeons_arise.structures.fungi.MushroomVillageStructure;
import net.aurelj.dungeons_arise.structures.haunted.InfestedTempleStructure;
import net.aurelj.dungeons_arise.structures.haunted.PlagueAsylumStructure;
import net.aurelj.dungeons_arise.structures.jungle.JungleTreeHouseStructure;
import net.aurelj.dungeons_arise.structures.prairie.*;
import net.aurelj.dungeons_arise.structures.underworld.FoundryStructure;
import net.aurelj.dungeons_arise.structures.underworld.MiningSystemStructure;
import net.aurelj.dungeons_arise.structures.underworld.ScorchedMinesStructure;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.chunk.StructureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

public class WDAStructures {

    public static StructureFeature<StructurePoolFeatureConfig> BANDIT_TOWERS = new BanditTowersStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> ILLAGER_CORSAIR = new IllagerCorsairStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> ILLAGER_GALLEY = new IllagerGalleyStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> TYPHON = new TyphonStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> UNDEAD_PIRATE_SHIP = new UndeadPirateShipStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> BANDIT_VILLAGE = new BanditVillageStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> ILLAGER_CAMPSITE = new IllagerCampsiteStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> MERCHANT_CAMPSITE = new MerchantCampsiteStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> CERYNEIAN_HIND = new CeryneianHindStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> SHIRAZ_PALACE = new ShirazPalaceStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> HEAVENLY_CHALLENGER = new HeavenlyChallengerStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> HEAVENLY_CONQUEROR = new HeavenlyConquerorStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> HEAVENLY_RIDER = new HeavenlyRiderStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> AVIARY = new AviaryStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> LIGHTHOUSE = new LighthouseStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> SMALL_BLIMP = new SmallBlimpStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> ABANDONED_TEMPLE = new AbandonedTempleStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> ILLAGER_FORT = new IllagerFortStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> MONASTERY = new MonasteryStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> THORNBORN_TOWERS = new ThornbornTowersStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> GIANT_MUSHROOM = new GiantMushroomStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> MUSHROOM_HOUSE = new MushroomHouseStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> MUSHROOM_MINES = new MushroomMinesStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> MUSHROOM_VILLAGE = new MushroomVillageStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> INFESTED_TEMPLE = new InfestedTempleStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> PLAGUE_ASYLUM = new PlagueAsylumStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> JUNGLE_TREE_HOUSE = new JungleTreeHouseStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> COLISEUM = new ColiseumStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> FISHING_HUT = new FishingHutStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> SMALL_PRAIRIE_HOUSE = new SmallPrairieHouseStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> ILLAGER_WINDMILL = new IllagerWindmillStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> WISHING_WELL = new WishingWellStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> FOUNDRY = new FoundryStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> MINING_SYSTEM = new MiningSystemStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> SCORCHED_MINES = new ScorchedMinesStructure(StructurePoolFeatureConfig.CODEC);

    public static void setupAndRegisterStructureFeatures() {

        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "bandit_towers"), BANDIT_TOWERS)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.banditTowersSpacing,
                        DungeonsAriseMain.CONFIG.banditTowersSeparation,
                        1282716133))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "bandit_village"), BANDIT_VILLAGE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.banditVillageSpacing,
                        DungeonsAriseMain.CONFIG.banditVillageSeparation,
                        473625251))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "illager_corsair"), ILLAGER_CORSAIR)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.illagerCorsairSpacing,
                        DungeonsAriseMain.CONFIG.illagerCorsairSeparation,
                        656287199))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "illager_galley"), ILLAGER_GALLEY)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.illagerGalleySpacing,
                        DungeonsAriseMain.CONFIG.illagerGalleySeparation,
                        55625321))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "typhon"), TYPHON)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.typhonSpacing,
                        DungeonsAriseMain.CONFIG.typhonSeparation,
                        388646261))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "undead_pirate_ship"), UNDEAD_PIRATE_SHIP)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.undeadPirateShipSpacing,
                        DungeonsAriseMain.CONFIG.undeadPirateShipSeparation,
                        1182151112))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "illager_campsite"), ILLAGER_CAMPSITE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.illagerCampsiteSpacing,
                        DungeonsAriseMain.CONFIG.illagerCampsiteSeparation,
                        99483721))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "merchant_campsite"), MERCHANT_CAMPSITE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.merchantCampsiteSpacing,
                        DungeonsAriseMain.CONFIG.merchantCampsiteSeparation,
                        765424233))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "ceryneian_hind"), CERYNEIAN_HIND)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.ceryneianHindSpacing,
                        DungeonsAriseMain.CONFIG.ceryneianHindSeparation,
                        183637261))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "shiraz_palace"), SHIRAZ_PALACE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.shirazPalaceSpacing,
                        DungeonsAriseMain.CONFIG.shirazPalaceSeparation,
                        298263615))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "heavenly_challenger"), HEAVENLY_CHALLENGER)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.heavenlyChallengerSpacing,
                        DungeonsAriseMain.CONFIG.heavenlyChallengerSeparation,
                        992717316))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "heavenly_conqueror"), HEAVENLY_CONQUEROR)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.heavenlyConquerorSpacing,
                        DungeonsAriseMain.CONFIG.heavenlyConquerorSeparation,
                        362419325))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "heavenly_rider"), HEAVENLY_RIDER)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.heavenlyRiderSpacing,
                        DungeonsAriseMain.CONFIG.heavenlyRiderSeparation,
                        283732822))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "aviary"), AVIARY)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.aviarySpacing,
                        DungeonsAriseMain.CONFIG.aviarySeparation,
                        612826991))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "lighthouse"), LIGHTHOUSE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.lighthouseSpacing,
                        DungeonsAriseMain.CONFIG.lighthouseSeparation,
                        827216166))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "small_blimp"), SMALL_BLIMP)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.smallBlimpSpacing,
                        DungeonsAriseMain.CONFIG.smallBlimpSeparation,
                        866352772))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "abandoned_temple"), ABANDONED_TEMPLE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.abandonedTempleSpacing,
                        DungeonsAriseMain.CONFIG.abandonedTempleSeparation,
                        987627362))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "illager_fort"), ILLAGER_FORT)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.illagerFortSpacing,
                        DungeonsAriseMain.CONFIG.illagerFortSeparation,
                        396251417))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "monastery"), MONASTERY)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.monasterySpacing,
                        DungeonsAriseMain.CONFIG.monasterySeparation,
                        936251466))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "thornborn_towers"), THORNBORN_TOWERS)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.thornbornTowersSpacing,
                        DungeonsAriseMain.CONFIG.thornbornTowersSeparation,
                        376251651))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "giant_mushroom"), GIANT_MUSHROOM)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.giantMushroomSpacing,
                        DungeonsAriseMain.CONFIG.giantMushroomSeparation,
                        999944423))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "mushroom_house"), MUSHROOM_HOUSE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.mushroomHouseSpacing,
                        DungeonsAriseMain.CONFIG.mushroomHouseSeparation,
                        926235162))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "mushroom_mines"), MUSHROOM_MINES)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.mushroomMinesSpacing,
                        DungeonsAriseMain.CONFIG.mushroomMinesSeparation,
                        447262511))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "mushroom_village"), MUSHROOM_VILLAGE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.mushroomVillageSpacing,
                        DungeonsAriseMain.CONFIG.mushroomVillageSeparation,
                        338287667))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "infested_temple"), INFESTED_TEMPLE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.infestedTempleSpacing,
                        DungeonsAriseMain.CONFIG.infestedTempleSeparation,
                        837212661))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "plague_asylum"), PLAGUE_ASYLUM)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.plagueAsylumSpacing,
                        DungeonsAriseMain.CONFIG.plagueAsylumSeparation,
                        488826251))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "jungle_tree_house"), JUNGLE_TREE_HOUSE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.jungleTreeHouseSpacing,
                        DungeonsAriseMain.CONFIG.jungleTreeHouseSeparation,
                        378181772))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "coliseum"), COLISEUM)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.coliseumSpacing,
                        DungeonsAriseMain.CONFIG.coliseumSeparation,
                        1111126331))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "fishing_hut"), FISHING_HUT)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.fishingHutSpacing,
                        DungeonsAriseMain.CONFIG.fishingHutSeparation,
                        777663321))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "small_prairie_house"), SMALL_PRAIRIE_HOUSE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.smallPrairieHouseSpacing,
                        DungeonsAriseMain.CONFIG.smallPrairieHouseSeparation,
                        1123532825))
                .adjustsSurface()
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "illager_windmill"), ILLAGER_WINDMILL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.illagerWindmillSpacing,
                        DungeonsAriseMain.CONFIG.illagerWindmillSeparation,
                        736283243))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "wishing_well"), WISHING_WELL)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.wishingWellSpacing,
                        DungeonsAriseMain.CONFIG.wishingWellSeparation,
                        988372625))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "foundry"), FOUNDRY)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.foundrySpacing,
                        DungeonsAriseMain.CONFIG.foundrySeparation,
                        788372155))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "mining_system"), MINING_SYSTEM)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.miningSystemSpacing,
                        DungeonsAriseMain.CONFIG.miningSystemSeparation,
                        986541356))
                .register();
        FabricStructureBuilder.create(new Identifier(DungeonsAriseMain.MODID, "scorched_mines"), SCORCHED_MINES)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        DungeonsAriseMain.CONFIG.scorchedMinesSpacing,
                        DungeonsAriseMain.CONFIG.scorchedMinesSeparation,
                        827263662))
                .register();

        // Add more structures here and so on
    }
}
