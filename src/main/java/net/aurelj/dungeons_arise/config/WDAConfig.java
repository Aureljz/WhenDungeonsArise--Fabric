package net.aurelj.dungeons_arise.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.aurelj.dungeons_arise.DungeonsAriseMain;

@Config(name = DungeonsAriseMain.MODID)
public class WDAConfig implements ConfigData {


    @Comment("""
            
          
            [Bandit Towers Spawning Settings]
            Basic configuration options for this structure""")
    public boolean banditTowersGenerates = true;
    @Comment("Base distance between Bandit Towers (in chunks). Must be higher than separation.")
    public int banditTowersSpacing = 45;
    @Comment("Base distance between Bandit Towers (in chunks)")
    public int banditTowersSeparation = 35;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int banditTowersSize = 50;

    @Comment("""
            
            
            [Bandit Villages Spawning Settings]
            Basic configuration options for this structure""")
    public boolean banditVillageGenerates = true;
    @Comment("Base distance between Bandit Villages (in chunks). Must be higher than separation.")
    public int banditVillageSpacing = 45;
    @Comment("Base distance between Bandit Villages (in chunks)")
    public int banditVillageSeparation = 35;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int banditVillageSize = 13;

    @Comment("""
            
            
            [Illager Corsair Spawning Settings]
            Basic configuration options for this structure""")
    public boolean illagerCorsairGenerates = true;
    @Comment("Base distance between Illager Corsair (in chunks). Must be higher than separation.")
    public int illagerCorsairSpacing = 64;
    @Comment("Base distance between Illager Corsair (in chunks)")
    public int illagerCorsairSeparation = 48;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int illagerCorsairSize = 10;

    @Comment("""
            
            
            [Illager Galley Spawning Settings]
            Basic configuration options for this structure""")
    public boolean illagerGalleyGenerates = true;
    @Comment("Base distance between Illager Galley (in chunks). Must be higher than separation.")
    public int illagerGalleySpacing = 50;
    @Comment("Base distance between Illager Galley (in chunks)")
    public int illagerGalleySeparation = 30;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int illagerGalleySize = 10;

    @Comment("""
            
            
            [Typhon Spawning Settings]
            Basic configuration options for this structure""")
    public boolean typhonGenerates = true;
    @Comment("Base distance between Typhon (in chunks). Must be higher than separation.")
    public int typhonSpacing = 60;
    @Comment("Base distance between Typhon (in chunks)")
    public int typhonSeparation = 50;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int typhonSize = 10;

    @Comment("""
            
            
            [Undead Pirate Ships Spawning Settings]
            Basic configuration options for this structure""")
    public boolean undeadPirateShipGenerates = true;
    @Comment("Base distance between Undead Pirate Ships (in chunks). Must be higher than separation.")
    public int undeadPirateShipSpacing = 60;
    @Comment("Base distance between Undead Pirate Ships (in chunks)")
    public int undeadPirateShipSeparation = 40;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int undeadPirateShipSize = 10;

    @Comment("""
            
            
            [Illager Campsite Spawning Settings]
            Basic configuration options for this structure""")
    public boolean illagerCampsiteGenerates = true;
    @Comment("Base distance between Illager Campsite (in chunks). Must be higher than separation.")
    public int illagerCampsiteSpacing = 60;
    @Comment("Base distance between Illager Campsite (in chunks)")
    public int illagerCampsiteSeparation = 30;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int illagerCampsiteSize = 10;

    @Comment("""
            
            
            [Merchant Campsite Spawning Settings]
            Basic configuration options for this structure""")
    public boolean merchantCampsiteGenerates = true;
    @Comment("Base distance between Merchant Campsite (in chunks). Must be higher than separation.")
    public int merchantCampsiteSpacing = 60;
    @Comment("Base distance between Merchant Campsite (in chunks)")
    public int merchantCampsiteSeparation = 40;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int merchantCampsiteSize = 10;

    @Comment("""
            
            
            [Ceryneian Hinds Spawning Settings]
            Basic configuration options for this structure""")
    public boolean ceryneianHindGenerates = true;
    @Comment("Base distance between Ceryneian Hinds (in chunks). Must be higher than separation.")
    public int ceryneianHindSpacing = 80;
    @Comment("Base distance between Ceryneian Hinds (in chunks)")
    public int ceryneianHindSeparation = 70;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int ceryneianHindSize = 10;

    @Comment("""
            
            
            [Shiraz Palaces Spawning Settings]
            Basic configuration options for this structure""")
    public boolean shirazPalaceGenerates = true;
    @Comment("Base distance between Shiraz Palaces (in chunks). Must be higher than separation.")
    public int shirazPalaceSpacing = 160;
    @Comment("Base distance between Shiraz Palaces (in chunks)")
    public int shirazPalaceSeparation = 140;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int shirazPalaceSize = 50;

    @Comment("""
            
            
            [Heavenly Challenger Spawning Settings]
            Basic configuration options for this structure""")
    public boolean heavenlyChallengerGenerates = true;
    @Comment("Base distance between Heavenly Challenger (in chunks). Must be higher than separation.")
    public int heavenlyChallengerSpacing = 340;
    @Comment("Base distance between Heavenly Challenger (in chunks)")
    public int heavenlyChallengerSeparation = 290;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int heavenlyChallengerSize = 20;

    @Comment("""
            
            
            [Heavenly Conqueror Spawning Settings]
            Basic configuration options for this structure""")
    public boolean heavenlyConquerorGenerates = true;
    @Comment("Base distance between Heavenly Conqueror (in chunks). Must be higher than separation.")
    public int heavenlyConquerorSpacing = 230;
    @Comment("Base distance between Heavenly Conqueror (in chunks)")
    public int heavenlyConquerorSeparation = 190;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int heavenlyConquerorSize = 20;

    @Comment("""
            
            
            [Heavenly Rider Spawning Settings]
            Basic configuration options for this structure""")
    public boolean heavenlyRiderGenerates = true;
    @Comment("Base distance between Heavenly Rider (in chunks). Must be higher than separation.")
    public int heavenlyRiderSpacing = 180;
    @Comment("Base distance between Heavenly Rider (in chunks)")
    public int heavenlyRiderSeparation = 160;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int heavenlyRiderSize = 20;

    @Comment("""
            
            
            [Aviary Spawning Settings]
            Basic configuration options for this structure""")
    public boolean aviaryGenerates = true;
    @Comment("Base distance between Aviary (in chunks). Must be higher than separation.")
    public int aviarySpacing = 200;
    @Comment("Base distance between Aviary (in chunks)")
    public int aviarySeparation = 160;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int aviarySize = 20;

    @Comment("""
            
            
            [Lighthouses Spawning Settings]
            Basic configuration options for this structure""")
    public boolean lighthouseGenerates = true;
    @Comment("Base distance between Lighthouses (in chunks). Must be higher than separation.")
    public int lighthouseSpacing = 100;
    @Comment("Base distance between Lighthouses (in chunks)")
    public int lighthouseSeparation = 90;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int lighthouseSize = 10;

    @Comment("""
            
            
            [Small Blimps Spawning Settings]
            Basic configuration options for this structure""")
    public boolean smallBlimpGenerates = true;
    @Comment("Base distance between Small Blimps (in chunks). Must be higher than separation.")
    public int smallBlimpSpacing = 80;
    @Comment("Base distance between Small Blimps (in chunks)")
    public int smallBlimpSeparation = 60;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int smallBlimpSize = 40;

    @Comment("""
            
            
            [Abandoned Temples Spawning Settings]
            Basic configuration options for this structure""")
    public boolean abandonedTempleGenerates = true;
    @Comment("Base distance between Abandoned Temples (in chunks). Must be higher than separation.")
    public int abandonedTempleSpacing = 30;
    @Comment("Base distance between Abandoned Temples (in chunks)")
    public int abandonedTempleSeparation = 20;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int abandonedTempleSize = 30;

    @Comment("""
            
            
            [Illager Forts Spawning Settings]
            Basic configuration options for this structure""")
    public boolean illagerFortGenerates = true;
    @Comment("Base distance between Illager Forts (in chunks). Must be higher than separation.")
    public int illagerFortSpacing = 160;
    @Comment("Base distance between Illager Forts (in chunks)")
    public int illagerFortSeparation = 60;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int illagerFortSize = 10;

    @Comment("""
            
            
            [Monasteries Spawning Settings]
            Basic configuration options for this structure""")
    public boolean monasteryGenerates = true;
    @Comment("Base distance between Monasteries (in chunks). Must be higher than separation.")
    public int monasterySpacing = 150;
    @Comment("Base distance between Monasteries (in chunks)")
    public int monasterySeparation = 90;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int monasterySize = 8;

    @Comment("""
            
            
            [Thornborn Towers Spawning Settings]
            Basic configuration options for this structure""")
    public boolean thornbornTowersGenerates = true;
    @Comment("Base distance between Thornborn Towers (in chunks). Must be higher than separation.")
    public int thornbornTowersSpacing = 80;
    @Comment("Base distance between Thornborn Towers (in chunks)")
    public int thornbornTowersSeparation = 70;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int thornbornTowersSize = 80;

    @Comment("""
            
            
            [Giant Mushrooms Spawning Settings]
            Basic configuration options for this structure""")
    public boolean giantMushroomGenerates = true;
    @Comment("Base distance between Giant Mushrooms (in chunks). Must be higher than separation.")
    public int giantMushroomSpacing = 80;
    @Comment("Base distance between Giant Mushrooms (in chunks)")
    public int giantMushroomSeparation = 40;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int giantMushroomSize = 10;

    @Comment("""
            
            
            [Mushroom Houses Spawning Settings]
            Basic configuration options for this structure""")
    public boolean mushroomHouseGenerates = true;
    @Comment("Base distance between Mushroom Houses (in chunks). Must be higher than separation.")
    public int mushroomHouseSpacing = 80;
    @Comment("Base distance between Mushroom Houses (in chunks)")
    public int mushroomHouseSeparation = 40;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int mushroomHouseSize = 10;

    @Comment("""
            
            
            [Mushroom Mines Spawning Settings]
            Basic configuration options for this structure""")
    public boolean mushroomMinesGenerates = true;
    @Comment("Base distance between Mushroom Mines (in chunks). Must be higher than separation.")
    public int mushroomMinesSpacing = 80;
    @Comment("Base distance between Mushroom Mines (in chunks)")
    public int mushroomMinesSeparation = 40;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int mushroomMinesSize = 40;

    @Comment("""
            
            
            [Mushroom Villages Spawning Settings]
            Basic configuration options for this structure""")
    public boolean mushroomVillageGenerates = true;
    @Comment("Base distance between Mushroom Villages (in chunks). Must be higher than separation.")
    public int mushroomVillageSpacing = 60;
    @Comment("Base distance between Mushroom Villages (in chunks)")
    public int mushroomVillageSeparation = 20;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int mushroomVillageSize = 6;

    @Comment("""
            
            
            [Infested Temples Spawning Settings]
            Basic configuration options for this structure""")
    public boolean infestedTempleGenerates = true;
    @Comment("Base distance between Infested Temples (in chunks). Must be higher than separation.")
    public int infestedTempleSpacing = 140;
    @Comment("Base distance between Infested Temples (in chunks)")
    public int infestedTempleSeparation = 100;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int infestedTempleSize = 100;

    @Comment("""
            
            
            [Plague Asylum Spawning Settings]
            Basic configuration options for this structure""")
    public boolean plagueAsylumGenerates = true;
    @Comment("Base distance between Plague Asylum (in chunks). Must be higher than separation.")
    public int plagueAsylumSpacing = 240;
    @Comment("Base distance between Plague Asylum (in chunks)")
    public int plagueAsylumSeparation = 200;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int plagueAsylumSize = 35;

    @Comment("""
            
            
            [Jungle Tree Houses Spawning Settings]
            Basic configuration options for this structure""")
    public boolean jungleTreeHouseGenerates = true;
    @Comment("Base distance between Jungle Tree Houses (in chunks). Must be higher than separation.")
    public int jungleTreeHouseSpacing = 60;
    @Comment("Base distance between Jungle Tree Houses (in chunks)")
    public int jungleTreeHouseSeparation = 40;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int jungleTreeHouseSize = 10;

    @Comment("""
            
            
            [Coliseum Spawning Settings]
            Basic configuration options for this structure""")
    public boolean coliseumGenerates = true;
    @Comment("Base distance between Coliseums (in chunks). Must be higher than separation.")
    public int coliseumSpacing = 240;
    @Comment("Base distance between Coliseums (in chunks)")
    public int coliseumSeparation = 200;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int coliseumSize = 10;

    @Comment("""
            
            
            [Fishing Huts Spawning Settings]
            Basic configuration options for this structure""")
    public boolean fishingHutGenerates = true;
    @Comment("Base distance between Fishing Huts (in chunks). Must be higher than separation.")
    public int fishingHutSpacing = 20;
    @Comment("Base distance between Fishing Huts (in chunks)")
    public int fishingHutSeparation = 5;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int fishingHutSize = 10;

    @Comment("""
            
            
            [Small Prairie Houses Spawning Settings]
            Basic configuration options for this structure""")
    public boolean smallPrairieHouseGenerates = true;
    @Comment("Base distance between Small Prairie Houses (in chunks). Must be higher than separation.")
    public int smallPrairieHouseSpacing = 25;
    @Comment("Base distance between Small Prairie Houses (in chunks)")
    public int smallPrairieHouseSeparation = 10;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int smallPrairieHouseSize = 10;

    @Comment("""
            
            
            [Wishing Wells Spawning Settings]
            Basic configuration options for this structure""")
    public boolean wishingWellGenerates = true;
    @Comment("Base distance between Wishing Wells (in chunks). Must be higher than separation.")
    public int wishingWellSpacing = 40;
    @Comment("Base distance between Wishing Wells (in chunks)")
    public int wishingWellSeparation = 30;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int wishingWellSize = 10;

    @Comment("""
            
            
            [Illager Windmills Spawning Settings]
            Basic configuration options for this structure""")
    public boolean illagerWindmillGenerates = true;
    @Comment("Base distance between Illager Windmills (in chunks). Must be higher than separation.")
    public int illagerWindmillSpacing = 40;
    @Comment("Base distance between Illager Windmills (in chunks)")
    public int illagerWindmillSeparation = 30;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int illagerWindmillSize = 5;

    @Comment("""
            
            
            [Foundries Spawning Settings]
            Basic configuration options for this structure""")
    public boolean foundryGenerates = true;
    @Comment("Base distance between Foundries (in chunks). Must be higher than separation.")
    public int foundrySpacing = 120;
    @Comment("Base distance between Foundries (in chunks)")
    public int foundrySeparation = 60;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int foundrySize = 20;

    @Comment("""
            
            
            [Mining Systems Spawning Settings]
            Basic configuration options for this structure""")
    public boolean miningSystemGenerates = true;
    @Comment("Base distance between Mining Systems (in chunks). Must be higher than separation.")
    public int miningSystemSpacing = 60;
    @Comment("Base distance between Mining Systems (in chunks)")
    public int miningSystemSeparation = 20;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int miningSystemSize = 20;

    @Comment("""
            
            
            [Scorched Mines Spawning Settings]
            Basic configuration options for this structure""")
    public boolean scorchedMinesGenerates = true;
    @Comment("Base distance between Scorched Mines (in chunks). Must be higher than separation.")
    public int scorchedMinesSpacing = 120;
    @Comment("Base distance between Scorched Mines (in chunks)")
    public int scorchedMinesSeparation = 60;
    @Comment("Number of Jigsaw iterations when generating a structure")
    public int scorchedMinesSize = 12;

}