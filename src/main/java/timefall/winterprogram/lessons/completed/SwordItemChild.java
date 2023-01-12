package timefall.winterprogram.lessons.completed;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Locale;

public class SwordItemChild extends SwordItem {

    public SwordItemChild(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed,
                new Settings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC));
    }

    /*
     * The postHit method allows for logic to run when the item successfully lands a hit on an entity.
     * Here’s an example of a postHit override that has a 25% chance to apply 4s (80ticks) of  the Wither status effect to the target.
     */

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int chance = 25;
        int duration = 80;

        if (attacker.getRandom().nextInt(100) <= chance)
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, duration, 0));

        //call super to retain behavior from swordItems
        return super.postHit(stack, target, attacker);
    }

    /*
     * The use method allows for logic to run when the item is used (right mouse button pressed while item is in hand).
     * Here’s an example of a use override that converts the wielders haste effect into a strength effect with the same duration & amplifier.
     */

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.hasStatusEffect(StatusEffects.HASTE)) {
            int amplifier = (user.getStatusEffect(StatusEffects.HASTE).getAmplifier());
            int duration = (user.getStatusEffect(StatusEffects.HASTE).getDuration());
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, duration, amplifier), user);
            user.removeStatusEffect(StatusEffects.HASTE);
        }
        return super.use(world,user,hand);
    }

    /*
     * The inventoryTick method allows for logic to run when the item exists in the inventory.
     * Here’s an example of an inventoryTick override that applies the speed status effect to the wielder at an interval.
     */

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && (entity instanceof PlayerEntity player)) {
            if (player.getEquippedStack(EquipmentSlot.MAINHAND) == stack || player.getEquippedStack(EquipmentSlot.OFFHAND) == stack) {
                // 20 is an arbitrary choice but is a good general area to keep frequency of tick effects
                if (player.age % 20 == 0) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20));
                }
            }
        }
    }

    /*
     * The appendTooltip method allows for the modifying of the item in-game tooltip.
     */

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        int i = 1;
        //There is nothing actually in our lang file so all of this is arbitrary and for demonstration
        String str = stack.getItem().getTranslationKey().toLowerCase(Locale.ROOT).substring(25);
        String translationKey = String.format("tooltip_info_item.winterprogram.%s_", str);
        while (I18n.hasTranslation(translationKey + i)) {
            tooltip.add(Text.translatable(translationKey + i).formatted(Formatting.ITALIC));
            i++;
        }
    }
}
