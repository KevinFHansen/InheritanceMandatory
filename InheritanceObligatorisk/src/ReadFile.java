import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {
        File testfile = new File("src/resources/test.csv");
        Scanner sc = new Scanner(testfile);

        int counter = 0;
        while (sc.hasNext()){
            String wordCounter = sc.nextLine();
            counter ++;
        }
        System.out.println("The total amount of words in the file is: " + counter);
    }
}
