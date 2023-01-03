package timefall.winterprogram.lessons;

public class WorkingSpace {
    //This is called from the main of the project and is virtually an extension of it.
    public static void driver() {
        char letter = 'a';
        //Convert to capital letter. This is the ASCII
        letter -= 32;

        System.out.println("Hello Fabric World! - system. The character is " + letter);
    }
}
