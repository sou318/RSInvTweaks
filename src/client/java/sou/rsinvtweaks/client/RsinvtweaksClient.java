package sou.rsinvtweaks.client;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

import static com.mojang.logging.LogUtils.getLogger;

public class RsinvtweaksClient implements ClientModInitializer
{
    public static ModConfig config;


    @Override
    public void onInitializeClient()
    {
        getLogger().info("Start RsInvTweaks");
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        RsinvtweaksClient.config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            if (!config.enableMod) return;

            new ItemConfigRegister(){{
                add(true, Items.REDSTONE);
                add(true, Items.REDSTONE_TORCH);
                add(true, Items.REPEATER);
                add(true, Items.COMPARATOR);

                if (config.enableWool) {
                    add(config.wool_white       , Items.WHITE_WOOL      );
                    add(config.wool_orange      , Items.ORANGE_WOOL     );
                    add(config.wool_magenta     , Items.MAGENTA_WOOL    );
                    add(config.wool_lightBlue   , Items.LIGHT_BLUE_WOOL );
                    add(config.wool_yellow      , Items.YELLOW_WOOL     );
                    add(config.wool_lime        , Items.LIME_WOOL       );
                    add(config.wool_pink        , Items.PINK_WOOL       );
                    add(config.wool_gray        , Items.GRAY_WOOL       );
                    add(config.wool_lightGray   , Items.LIGHT_GRAY_WOOL );
                    add(config.wool_cyan        , Items.CYAN_WOOL       );
                    add(config.wool_purple      , Items.PURPLE_WOOL     );
                    add(config.wool_blue        , Items.BLUE_WOOL       );
                    add(config.wool_brown       , Items.BROWN_WOOL      );
                    add(config.wool_green       , Items.GREEN_WOOL      );
                    add(config.wool_red         , Items.RED_WOOL        );
                    add(config.wool_black       , Items.BLACK_WOOL      );
                }
            }}.register(entries);
        });
    }
}
