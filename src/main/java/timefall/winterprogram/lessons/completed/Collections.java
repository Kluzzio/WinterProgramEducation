package timefall.winterprogram.lessons.completed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Collections {

    public static void driver() {

        // Arrays are ordered and can have repetition but are a primitive data type
        int[] intArray = {1, 34, 4, 4, 8};

        if (intArray[3] == intArray[2]) {

        }

        // Sets are generally ordered although order shouldn't matter and there is no repetition
        Set<Integer> intSet = Set.of(1, 3, 3); //Notice a warning is given for duplicate entries

        int sum = 0;
        for (int integer : intSet) {
            sum += integer;
        }

        if (intSet.contains(1)) {

        }

        // A list is ordered, may contain duplicates and allows more detailed operations than an array
        List<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 3, 5));

        intList.remove(3);
        intList.remove(5);


        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("yep", 5);
    }
}
