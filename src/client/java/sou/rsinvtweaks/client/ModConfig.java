package sou.rsinvtweaks.client;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Category;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;
import sou.rsinvtweaks.client.config.CBlocks;
import sou.rsinvtweaks.client.config.CGimmicks;
import sou.rsinvtweaks.client.config.CShulkers;

@Config(name="rsinvtweaks")
public class ModConfig implements ConfigData, ModMenuApi
{
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory()
    {
        return parent -> AutoConfig.getConfigScreen(ModConfig.class, parent).get();
    }


    public boolean enableMod  = true;



    @Category("blocks") @CollapsibleObject CBlocks.Wools blocks_wools = new CBlocks.Wools();
    @Category("blocks") @CollapsibleObject CBlocks.Concretes blocks_concretes = new CBlocks.Concretes();
    @Category("blocks") @CollapsibleObject CBlocks.Glasses blocks_glasses = new CBlocks.Glasses();
    @Category("blocks")
    public boolean
    blocks_slime_block = true,
    blocks_honey_block = true
        ;



    @Category("gimmicks")
    public boolean gimmicks_enable = true,
    gimmicks_piston = true,
    gimmicks_sticky_piston = true,
    gimmicks_dropper = true,
    gimmicks_dispenser = true,
    gimmicks_observer = true,
    gimmicks_note_block = true
        ;
    @Category("gimmicks") @CollapsibleObject CGimmicks.CopperBulbs gimmicks_copper_bulbs = new CGimmicks.CopperBulbs();
    @Category("gimmicks") @CollapsibleObject CGimmicks.Doors gimmicks_doors = new CGimmicks.Doors();
    @Category("gimmicks")
    public boolean
    gimmicks_crafter = true,
    gimmicks_redstone_lamp = true,
    gimmicks_tnt = true,
    gimmicks_bell = true,
    gimmicks_big_dripleaf = false
        ;



    // 自ら信号を出す物のみ
    @Category("inputs")
    public boolean inputs_enable = true,
    inputs_target = true,
    inputs_lever = true,
    inputs_oak_button = true,
    inputs_stone_button = true,
    inputs_oak_pressure_plate = true,
    inputs_stone_pressure_plate = true,
    inputs_light_weighted_pressure_plate = false,
    inputs_heavy_weighted_pressure_plate = false,
    inputs_trapped_chest = true,
    inputs_tripwire_hook = true,
    inputs_daylight_detector = true,
    inputs_sculk_sensor = true,
    inputs_calibrated_suculk_sensor = true
        ;


    @Category("inventories")
    public boolean inventories_enable = true,
    inventories_chest = true,
    inventories_barrel = true,
    inventories_hopper = true,
    inventories_composter = true,
    inventories_cauldron = true,
    inventories_brewing_stand = true,
    inventories_furnace = true,
    inventories_blast_furnace = true,
    inventories_smoker = true,
    inventories_chiseled_bookshelf = true,
    inventories_lectern = true,
    inventories_beehive = true,
    inventories_bee_nest = false,
    inventories_decorated_pot = false,
    inventories_jukebox = false,
    inventories_respawn_anchor = false,
    inventories_cake = false,
    inventories_end_portal_frame = false
        ;
    @Category("inventories") @CollapsibleObject CShulkers inventories_shulkers = new CShulkers();


    @Category("minecarts")
    public boolean minecarts_enable = true,
    minecarts_rail = true,
    minecarts_powered_rail = true,
    minecarts_detector_rail = true,
    minecarts_activator_rail = true,
    minecarts_minecart = true,
    minecarts_hopper_minecart = true,
    minecarts_chest_minecart = true,
    minecarts_furnace_minecart = true,
    minecarts_tnt_minecart = true
        ;


    @Category("others")
    public boolean
    others_item_frame = true,
    others_armor_stand = true,
    others_lightning_rod = true,
    others_obsidian = true,
    others_bedrock = true
        ;
}
