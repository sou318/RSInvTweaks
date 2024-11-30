package sou.rsinvtweaks.client.mixin;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import sou.rsinvtweaks.client.RsinvtweaksClient;

@Mixin(ItemGroups.class)
abstract class MItemGroups
{
    @Redirect(method = "method_51330", at = @At(value="INVOKE", target="Lnet/minecraft/item/ItemGroup$Entries;add(Lnet/minecraft/item/ItemConvertible;)V"))
    private static void inject(ItemGroup.Entries instance, ItemConvertible item)
    {
        instance.add(
            item,
            RsinvtweaksClient.config.enableMod
                ? ItemGroup.StackVisibility.SEARCH_TAB_ONLY
                : ItemGroup.StackVisibility.PARENT_AND_SEARCH_TABS
        );
    }
}
