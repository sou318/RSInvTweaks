package sou.rsinvtweaks.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

import java.util.Arrays;

import static com.mojang.logging.LogUtils.getLogger;

public class RsinvtweaksClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        getLogger().info("Start RsInvTweaks");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> Arrays.asList(
            Items.WHITE_WOOL,
            Items.REDSTONE
        ).forEach(entries::add));
    }
}
