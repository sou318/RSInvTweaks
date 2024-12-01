package sou.rsinvtweaks.client;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name="rsinvtweaks")
public class ModConfig implements ConfigData, ModMenuApi
{
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory()
    {
        return parent -> AutoConfig.getConfigScreen(ModConfig.class, parent).get();
    }


    public boolean enableMod  = true;

    @ConfigEntry.Category("wool") boolean wool_enable = true,
    wool_white      = true,
    wool_orange     = true,
    wool_magenta    = true,
    wool_lightBlue  = true,
    wool_yellow     = true,
    wool_lime       = true,
    wool_pink       = true,
    wool_gray       = true,
    wool_lightGray  = true,
    wool_cyan       = true,
    wool_purple     = true,
    wool_blue       = true,
    wool_brown      = true,
    wool_green      = true,
    wool_red        = true,
    wool_black      = true
        ;

    // 自ら信号を出す物のみ
    @ConfigEntry.Category("input") boolean
    input_target = true,
    input_lever = true,
    input_oak_button = true,
    input_stone_button = true,
    input_oak_pressure_plate = true,
    input_stone_pressure_plate = true,
    input_light_weighted_pressure_plate = true,
    input_heavy_weighted_pressure_plate = true,
    input_trapped_chest = true,
    input_tripwire_hook = true,
    input_daylight_detector = true,
    input_sculk_sensor = true,
    input_calibrated_suculk_sensor = true
        ;

    @ConfigEntry.Category("minecart") boolean minecart_enable = true,
    minecart_minecart = true,
    minecart_hopper_minecart = true,
    minecart_chest_minecart = true,
    minecart_furnace_minecart = true,
    minecart_tnt_minecart = true,
    minecart_rail = true,
    minecart_powered_rail = true,
    minecart_detector_rail = true,
    minecart_activator_rail = true
        ;

    @ConfigEntry.Category("inventory") boolean inventory_enable = true,
    inventory_chest = true,
    inventory_barrel = true,
    inventory_hopper = true,
    inventory_dropper = true,
    inventory_dispenser = true,
    inventory_crafter = true,
    inventory_composter = true,
    inventory_cauldron = true,
    inventory_furnace = true,
    inventory_chiseled_bookshelf = true,
    inventory_decorated_pot = true,
    inventory_jukebox = true
        ;
}
