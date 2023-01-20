package timefall.winterprogram.item;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import timefall.winterprogram.WinterProgram;

public class ItemsInit {

    public static final Item WINTER_BOW = new WinterBowItem(new Item.Settings(), 20);

    public static void init() {
        Registry.register(Registry.ITEM, WinterProgram.ID("winter_bow"), WINTER_BOW);
    }
}
