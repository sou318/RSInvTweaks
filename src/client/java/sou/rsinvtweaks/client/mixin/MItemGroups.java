package sou.rsinvtweaks.client.mixin;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sou.rsinvtweaks.client.RsinvtweaksClient;

@Mixin(ItemGroups.class)
abstract class MItemGroups
{
    @Inject(method = "method_51330", at =@At(value="HEAD"), cancellable=true)
    private static void inject(ItemGroup.DisplayContext displayContext, ItemGroup.Entries entries, CallbackInfo ci)
    {
        if (!RsinvtweaksClient.config.enableMod) return;
        ci.cancel();
    }
}
