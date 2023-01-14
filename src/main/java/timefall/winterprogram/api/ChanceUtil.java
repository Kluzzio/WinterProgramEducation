package timefall.winterprogram.api;

import java.util.Random;

public class ChanceUtil {

    public static boolean percentChance(int chance) {
        // bound determines magnitude of potential output set. This works :)
        return new Random().nextInt(100) < chance;
    }
}
