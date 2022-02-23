package com.github.u9g.notsoessential.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMultiplayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(targets = "gg.essential.config.EssentialConfig")
public class EssentialConfigMixin {
    @Inject(method = "Lgg/essential/config/EssentialConfig;getEssentialFull()Z", at = @At("RETURN"), cancellable = true)
    public void getEssentialFull(CallbackInfoReturnable<Boolean> clr) {
        if (!(Minecraft.getMinecraft().currentScreen instanceof GuiMultiplayer)) return;
        clr.setReturnValue(false);
    }

    @Inject(method = "Lgg/essential/config/EssentialConfig;getShowEssentialIndicatorOnTab()Z", at = @At("RETURN"), cancellable = true)
    public void getTabIndicators(CallbackInfoReturnable<Boolean> clr) {
        clr.setReturnValue(false);
    }

    @Inject(method = "Lgg/essential/config/EssentialConfig;getShowEssentialIndicatorOnNametag()Z", at = @At("RETURN"), cancellable = true)
    public void getNameTagIndicators(CallbackInfoReturnable<Boolean> clr) {
        clr.setReturnValue(false);
    }

    @Inject(method = "Lgg/essential/config/EssentialConfig;getStreamerMode()Z", at = @At("RETURN"), cancellable = true)
    public void getStreamerMode(CallbackInfoReturnable<Boolean> clr) {
        clr.setReturnValue(true);
    }

    @Inject(method = "Lgg/essential/config/EssentialConfig;getDisableAllNotifications()Z", at = @At("RETURN"), cancellable = true)
    public void getDisableAllNotifications(CallbackInfoReturnable<Boolean> clr) {
        clr.setReturnValue(true);
    }

    @Inject(method = "Lgg/essential/config/EssentialConfig;getOpenToFriends()Z", at = @At("RETURN"), cancellable = true)
    public void getOpenToFriends(CallbackInfoReturnable<Boolean> clr) {
        clr.setReturnValue(false);
    }

}
