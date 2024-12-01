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
                add(true, Items.REDSTONE_BLOCK);

                if (config.wool_enable)
                {
                    add(config.wool_white, Items.WHITE_WOOL);
                    add(config.wool_orange, Items.ORANGE_WOOL);
                    add(config.wool_magenta, Items.MAGENTA_WOOL);
                    add(config.wool_lightBlue, Items.LIGHT_BLUE_WOOL);
                    add(config.wool_yellow, Items.YELLOW_WOOL);
                    add(config.wool_lime, Items.LIME_WOOL);
                    add(config.wool_pink, Items.PINK_WOOL);
                    add(config.wool_gray, Items.GRAY_WOOL);
                    add(config.wool_lightGray, Items.LIGHT_GRAY_WOOL);
                    add(config.wool_cyan, Items.CYAN_WOOL);
                    add(config.wool_purple, Items.PURPLE_WOOL);
                    add(config.wool_blue, Items.BLUE_WOOL);
                    add(config.wool_brown, Items.BROWN_WOOL);
                    add(config.wool_green, Items.GREEN_WOOL);
                    add(config.wool_red, Items.RED_WOOL);
                    add(config.wool_black, Items.BLACK_WOOL);
                }

                add(config.input_target, Items.TARGET);
                add(config.input_lever, Items.LEVER);
                add(config.input_oak_button, Items.OAK_BUTTON);
                add(config.input_stone_button, Items.STONE_BUTTON);
                add(config.input_oak_pressure_plate, Items.OAK_PRESSURE_PLATE);
                add(config.input_stone_pressure_plate, Items.STONE_PRESSURE_PLATE);
                add(config.input_light_weighted_pressure_plate, Items.LIGHT_WEIGHTED_PRESSURE_PLATE);
                add(config.input_heavy_weighted_pressure_plate, Items.HEAVY_WEIGHTED_PRESSURE_PLATE);
                add(config.input_trapped_chest, Items.TRAPPED_CHEST);
                add(config.input_tripwire_hook, Items.TRIPWIRE_HOOK);
                add(config.input_tripwire_hook, Items.STRING);
                add(config.input_daylight_detector, Items.DAYLIGHT_DETECTOR);
                add(config.input_sculk_sensor, Items.SCULK_SENSOR);
                add(config.input_calibrated_suculk_sensor, Items.CALIBRATED_SCULK_SENSOR);

                if (config.minecart_enable)
                {
                    add(config.minecart_minecart, Items.MINECART);
                    add(config.minecart_hopper_minecart, Items.HOPPER_MINECART);
                    add(config.minecart_chest_minecart, Items.CHEST_MINECART);
                    add(config.minecart_furnace_minecart, Items.FURNACE_MINECART);
                    add(config.minecart_tnt_minecart, Items.TNT_MINECART);
                    add(config.minecart_rail, Items.RAIL);
                    add(config.minecart_powered_rail, Items.POWERED_RAIL);
                    add(config.minecart_detector_rail, Items.DETECTOR_RAIL);
                    add(config.minecart_activator_rail, Items.ACTIVATOR_RAIL);
                }
            }}.register(entries);
        });
    }
}
