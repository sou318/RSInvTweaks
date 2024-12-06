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

                if (config.blocks_wools.enable)
                {
                    add(config.blocks_wools.white, Items.WHITE_WOOL);
                    add(config.blocks_wools.orange, Items.ORANGE_WOOL);
                    add(config.blocks_wools.magenta, Items.MAGENTA_WOOL);
                    add(config.blocks_wools.lightBlue, Items.LIGHT_BLUE_WOOL);
                    add(config.blocks_wools.yellow, Items.YELLOW_WOOL);
                    add(config.blocks_wools.lime, Items.LIME_WOOL);
                    add(config.blocks_wools.pink, Items.PINK_WOOL);
                    add(config.blocks_wools.gray, Items.GRAY_WOOL);
                    add(config.blocks_wools.lightGray, Items.LIGHT_GRAY_WOOL);
                    add(config.blocks_wools.cyan, Items.CYAN_WOOL);
                    add(config.blocks_wools.purple, Items.PURPLE_WOOL);
                    add(config.blocks_wools.blue, Items.BLUE_WOOL);
                    add(config.blocks_wools.brown, Items.BROWN_WOOL);
                    add(config.blocks_wools.green, Items.GREEN_WOOL);
                    add(config.blocks_wools.red, Items.RED_WOOL);
                    add(config.blocks_wools.black, Items.BLACK_WOOL);
                }

                if (config.blocks_concretes.enable)
                {
                    add(config.blocks_concretes.white, Items.WHITE_CONCRETE);
                    add(config.blocks_concretes.orange, Items.ORANGE_CONCRETE);
                    add(config.blocks_concretes.magenta, Items.MAGENTA_CONCRETE);
                    add(config.blocks_concretes.lightBlue, Items.LIGHT_BLUE_CONCRETE);
                    add(config.blocks_concretes.yellow, Items.YELLOW_CONCRETE);
                    add(config.blocks_concretes.lime, Items.LIME_CONCRETE);
                    add(config.blocks_concretes.pink, Items.PINK_CONCRETE);
                    add(config.blocks_concretes.gray, Items.GRAY_CONCRETE);
                    add(config.blocks_concretes.lightGray, Items.LIGHT_GRAY_CONCRETE);
                    add(config.blocks_concretes.cyan, Items.CYAN_CONCRETE);
                    add(config.blocks_concretes.purple, Items.PURPLE_CONCRETE);
                    add(config.blocks_concretes.blue, Items.BLUE_CONCRETE);
                    add(config.blocks_concretes.brown, Items.BROWN_CONCRETE);
                    add(config.blocks_concretes.green, Items.GREEN_CONCRETE);
                    add(config.blocks_concretes.red, Items.RED_CONCRETE);
                    add(config.blocks_concretes.black, Items.BLACK_CONCRETE);
                }

                if (config.blocks_glasses.enable)
                {
                    add(config.blocks_glasses.transparent, Items.GLASS);
                    add(config.blocks_glasses.white, Items.WHITE_STAINED_GLASS);
                    add(config.blocks_glasses.orange, Items.ORANGE_STAINED_GLASS);
                    add(config.blocks_glasses.magenta, Items.MAGENTA_STAINED_GLASS);
                    add(config.blocks_glasses.lightBlue, Items.LIGHT_BLUE_STAINED_GLASS);
                    add(config.blocks_glasses.yellow, Items.YELLOW_STAINED_GLASS);
                    add(config.blocks_glasses.lime, Items.LIME_STAINED_GLASS);
                    add(config.blocks_glasses.pink, Items.PINK_STAINED_GLASS);
                    add(config.blocks_glasses.gray, Items.GRAY_STAINED_GLASS);
                    add(config.blocks_glasses.lightGray, Items.LIGHT_GRAY_STAINED_GLASS);
                    add(config.blocks_glasses.cyan, Items.CYAN_STAINED_GLASS);
                    add(config.blocks_glasses.purple, Items.PURPLE_STAINED_GLASS);
                    add(config.blocks_glasses.blue, Items.BLUE_STAINED_GLASS);
                    add(config.blocks_glasses.brown, Items.BROWN_STAINED_GLASS);
                    add(config.blocks_glasses.green, Items.GREEN_STAINED_GLASS);
                    add(config.blocks_glasses.red, Items.RED_STAINED_GLASS);
                    add(config.blocks_glasses.black, Items.BLACK_STAINED_GLASS);
                }

                add(config.blocks_slime_block, Items.SLIME_BLOCK);
                add(config.blocks_honey_block, Items.HONEY_BLOCK);

                if (config.gimmicks_enable)
                {
                    add(config.gimmicks_piston, Items.PISTON);
                    add(config.gimmicks_sticky_piston, Items.STICKY_PISTON);
                    add(config.gimmicks_dropper, Items.DROPPER);
                    add(config.gimmicks_dispenser, Items.DISPENSER);
                    add(config.gimmicks_observer, Items.OBSERVER);
                    add(config.gimmicks_note_block, Items.NOTE_BLOCK);

                    add(config.gimmicks_copper_bulbs.none, Items.WAXED_COPPER_BULB);
                    add(config.gimmicks_copper_bulbs.exposed, Items.WAXED_EXPOSED_COPPER_BULB);
                    add(config.gimmicks_copper_bulbs.weathered, Items.WAXED_WEATHERED_COPPER_BULB);
                    add(config.gimmicks_copper_bulbs.oxidized, Items.WAXED_OXIDIZED_COPPER_BULB);

                    add(config.gimmicks_doors.oak_door, Items.OAK_DOOR);
                    add(config.gimmicks_doors.iron_door, Items.IRON_DOOR);
                    add(config.gimmicks_doors.oak_fence_gate, Items.OAK_FENCE_GATE);
                    add(config.gimmicks_doors.oak_trapdoor, Items.OAK_TRAPDOOR);
                    add(config.gimmicks_doors.iron_trapdoor, Items.IRON_TRAPDOOR);

                    add(config.gimmicks_crafter, Items.CRAFTER);
                    add(config.gimmicks_redstone_lamp, Items.REDSTONE_LAMP);
                    add(config.gimmicks_tnt, Items.TNT);
                    add(config.gimmicks_bell, Items.BELL);
                    add(config.gimmicks_big_dripleaf, Items.BIG_DRIPLEAF);
                }

                if (config.inputs_enable)
                {
                    add(config.inputs_target, Items.TARGET);
                    add(config.inputs_lever, Items.LEVER);
                    add(config.inputs_oak_button, Items.OAK_BUTTON);
                    add(config.inputs_stone_button, Items.STONE_BUTTON);
                    add(config.inputs_oak_pressure_plate, Items.OAK_PRESSURE_PLATE);
                    add(config.inputs_stone_pressure_plate, Items.STONE_PRESSURE_PLATE);
                    add(config.inputs_light_weighted_pressure_plate, Items.LIGHT_WEIGHTED_PRESSURE_PLATE);
                    add(config.inputs_heavy_weighted_pressure_plate, Items.HEAVY_WEIGHTED_PRESSURE_PLATE);
                    add(config.inputs_trapped_chest, Items.TRAPPED_CHEST);
                    add(config.inputs_tripwire_hook, Items.TRIPWIRE_HOOK);
                    add(config.inputs_tripwire_hook, Items.STRING);
                    add(config.inputs_daylight_detector, Items.DAYLIGHT_DETECTOR);
                    add(config.inputs_sculk_sensor, Items.SCULK_SENSOR);
                    add(config.inputs_calibrated_suculk_sensor, Items.CALIBRATED_SCULK_SENSOR);
                }

                if (config.inventories_enable)
                {
                    add(config.inventories_chest, Items.CHEST);
                    add(config.inventories_barrel, Items.BARREL);
                    add(config.inventories_hopper, Items.HOPPER);
                    add(config.inventories_composter, Items.COMPOSTER);
                    add(config.inventories_cauldron, Items.CAULDRON);
                    add(config.inventories_brewing_stand, Items.BREWING_STAND);
                    add(config.inventories_furnace, Items.FURNACE);
                    add(config.inventories_blast_furnace, Items.BLAST_FURNACE);
                    add(config.inventories_smoker, Items.SMOKER);
                    add(config.inventories_chiseled_bookshelf, Items.FURNACE);
                    add(config.inventories_lectern, Items.LECTERN);
                    add(config.inventories_beehive, Items.BEEHIVE);
                    add(config.inventories_bee_nest, Items.BEE_NEST);
                    add(config.inventories_decorated_pot, Items.DECORATED_POT);
                    add(config.inventories_jukebox, Items.JUKEBOX);
                    add(config.inventories_respawn_anchor, Items.RESPAWN_ANCHOR);
                    add(config.inventories_cake, Items.CAKE);
                    add(config.inventories_end_portal_frame, Items.END_PORTAL_FRAME);

                    if (config.inventories_shulkers.enable)
                    {
                        add(config.inventories_shulkers.none, Items.SHULKER_BOX);
                        add(config.inventories_shulkers.white, Items.WHITE_SHULKER_BOX);
                        add(config.inventories_shulkers.orange, Items.ORANGE_SHULKER_BOX);
                        add(config.inventories_shulkers.magenta, Items.MAGENTA_SHULKER_BOX);
                        add(config.inventories_shulkers.lightBlue, Items.LIGHT_BLUE_SHULKER_BOX);
                        add(config.inventories_shulkers.yellow, Items.YELLOW_SHULKER_BOX);
                        add(config.inventories_shulkers.lime, Items.LIME_SHULKER_BOX);
                        add(config.inventories_shulkers.pink, Items.PINK_SHULKER_BOX);
                        add(config.inventories_shulkers.gray, Items.GRAY_SHULKER_BOX);
                        add(config.inventories_shulkers.lightGray, Items.LIGHT_GRAY_SHULKER_BOX);
                        add(config.inventories_shulkers.cyan, Items.CYAN_SHULKER_BOX);
                        add(config.inventories_shulkers.purple, Items.PURPLE_SHULKER_BOX);
                        add(config.inventories_shulkers.blue, Items.BLUE_SHULKER_BOX);
                        add(config.inventories_shulkers.brown, Items.BROWN_SHULKER_BOX);
                        add(config.inventories_shulkers.green, Items.GREEN_SHULKER_BOX);
                        add(config.inventories_shulkers.red, Items.RED_SHULKER_BOX);
                        add(config.inventories_shulkers.black, Items.BLACK_SHULKER_BOX);
                    }
                }

                if (config.minecarts_enable)
                {
                    add(config.minecarts_rail, Items.RAIL);
                    add(config.minecarts_powered_rail, Items.POWERED_RAIL);
                    add(config.minecarts_detector_rail, Items.DETECTOR_RAIL);
                    add(config.minecarts_activator_rail, Items.ACTIVATOR_RAIL);
                    add(config.minecarts_minecart, Items.MINECART);
                    add(config.minecarts_hopper_minecart, Items.HOPPER_MINECART);
                    add(config.minecarts_chest_minecart, Items.CHEST_MINECART);
                    add(config.minecarts_furnace_minecart, Items.FURNACE_MINECART);
                    add(config.minecarts_tnt_minecart, Items.TNT_MINECART);
                }

                add(config.others_item_frame, Items.ITEM_FRAME);
                add(config.others_armor_stand, Items.ARMOR_STAND);
                add(config.others_lightning_rod, Items.LIGHTNING_ROD);
                add(config.others_obsidian, Items.OBSIDIAN);
                add(config.others_bedrock, Items.BEDROCK);
            }}.register(entries);
        });
    }
}
