import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {
        File testFile = new File("InheritanceObligatorisk/src/resources/test.csv");
        Scanner sc = new Scanner(testFile);

        int counter = 0;
        while (sc.hasNext()){
            String wordCounter = sc.nextLine();
            counter ++;
        }
        System.out.println("The total amount of words in the file is: " + counter);
    }
}
