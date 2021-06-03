import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class CountToHundred {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<Integer>(100);

        for (int i = 1; i <= 100; i++){
            intList.add(i);
            System.out.println(intList.get(i-1));
        }

        System.out.println("Enter one Integer (1-100)");
        int choiceOfNumber = sc.nextInt();

        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();

            if (number % choiceOfNumber == 0){
                iterator.remove();
            }
        }
        intList.add(choiceOfNumber-1, choiceOfNumber);

        System.out.println("ArrayList without the removed elements: " + intList);
    }

}
