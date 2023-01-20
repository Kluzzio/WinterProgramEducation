package timefall.winterprogram.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import timefall.winterprogram.item.WinterBowItem;

@Mixin(AbstractClientPlayerEntity.class)
public class AbstractClientPlayerEntityMixin {

    @Inject(method = "getFovMultiplier", at = @At(value = "TAIL"), locals = LocalCapture.CAPTURE_FAILSOFT, cancellable = true)
    public void winterprogram$customFOVZoom(CallbackInfoReturnable<Float> cir, float f) {
        AbstractClientPlayerEntity abstractPlayer = MinecraftClient.getInstance().player;

        if (abstractPlayer == null) return;
        if (abstractPlayer.getActiveItem() == null) return;
        ItemStack itemStack = abstractPlayer.getActiveItem();
        if (abstractPlayer.isUsingItem()) {
            if (itemStack.getItem() instanceof WinterBowItem) {
                int i = abstractPlayer.getItemUseTime();
                float g = (float)i / 20.0f;
                g = g > 1.0f ? 1.0f : (g *= g);
                f *= 1.0f - g * 0.15f;

                cir.setReturnValue(MathHelper.lerp(MinecraftClient.getInstance().options.getFovEffectScale().getValue().floatValue(), 1.0F, f));
            }
        }
    }
}
