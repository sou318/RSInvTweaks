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

    // WOOLS
    @ConfigEntry.Category("wool") boolean
    enableWool      = true,
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
}
