package timefall.winterprogram.lessons.completed;

import timefall.winterprogram.WinterProgram;

import java.util.ArrayList;
import java.util.Random;

public class LoopsAndSwitch {

    public static void example() {
        /* IF STATEMENTS */
        if (true) {
            //perform action
            WinterProgram.LOGGER.info("The if statement succeeded");
        }
        //Ifs can be inline and nested
        if (true)
            if (false)
                WinterProgram.LOGGER.info("This statement is unreachable");

        /* FOR LOOPS */
        for (int i = 0 ; i <= 5 ; i++) {
            System.out.println(i); //Works the exact same as in C
        }
        //We also have access to enhanced for loops, and they can be inline
        for (int element : new int[]{0, 1, 2, 3, 4, 5})
            System.out.println(element);

        /* WHILE LOOPS */
        int j = 0;
        while (true) { //This never ends unless broken
            System.out.println(j);
            if (j > 5)
                break; //breaks out of the loop, even if the loops condition is true.
            j++;
        }
        //While statements can also be inline

        /* DO WHILE LOOPS */
        do {
            System.out.println(j);
            j--;
            //continue breaks out of the current iteration of the loop and proceeds to the next
            continue;
            //continue is redundant to put at the end of a loop's body
        } while (j >= 0); //repeats until condition is false

        /* SWITCH STATEMENTS */
        Random rand = new Random();
        int randInt = rand.nextInt(5);
        switch (randInt) {
            case 0: { System.out.println(2); break; }
            case 1: { System.out.println(1); }
            case 2: { System.out.println("If you saw a 1, this was overflowed into " + randInt); break; }
            default: { System.out.println("Nothing really happened here"); break; //break is redundant here but good convention
            }
        }
        //Enhanced switch statements remove the need for break statements. Better when each individual case results in a single statement.
        int x = switchInt(randInt);

        //You can also use switch statements as an output.
    }

    public static int switchInt(int input) {
        return switch (input) {
            case 0 -> 3;
            case 1 -> 5;
            default -> 9;
        };
    }

    public static void driver(int input) {
        //Although I only briefly covered ArrayLists, they are essentially just Arrays that you can perform more actions
        // with because they combine the data types of Arrays and Lists. Notably, you can arbitrarily add elements to them
        // without having a predetermined size which makes them ideal for this nature.

        // GET the prime factorization of the input
        ArrayList<Integer> factors = getFactors(input);
        WinterProgram.LOGGER.info("The prime factorization of " + input + " is " + factors);
    }

    //This should have an efficiency to the effect of something like O(n*log(n)). Not the most efficient but reasonable.
    private static ArrayList<Integer> getFactors(int input) {
        //initialize
        ArrayList<Integer> arr = new ArrayList<>();
        //'i' is being used to find the factors
        int i = 2;

        //Why did I use a while loop? I didn't know how many times it would iterate or if it would even iterate at all.
        //If input is 1, or less, it needs to not iterate.
        while (i <= input) {
            //if it factors the input
            if (input % i == 0) {
                input /= i;
                arr.add(i);
                i = 2;
                continue;
            }
            i++;
        }
        //Handles the cases where prime numbers are the input.
        if (arr.isEmpty()) {
            arr.add(input);
            if (input != 1)
                arr.add(1);
        }
        return arr;
    }
}
