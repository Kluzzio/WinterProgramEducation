package timefall.winterprogram;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import timefall.winterprogram.item.ItemsInit;

@Environment(EnvType.CLIENT)
public class WinterProgramClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerBowPredicates(ItemsInit.WINTER_BOW);
    }

    private static void registerBowPredicates(Item winterBow) {
        ModelPredicateProviderRegistry.register(winterBow, new Identifier("pull"), ((stack, world, entity, seed) -> {
            if (entity == null) {
                return 0f;
            } else {
                return entity.getActiveItem() != stack ? 0f : (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20f;
            }
        }));
        ModelPredicateProviderRegistry.register(winterBow, new Identifier("pulling"), ((stack, world, entity, seed) ->
                entity != null && entity.isUsingItem() && entity.getActiveItem().isOf(stack.getItem()) ? 1f : 0f));
    }
}
