
import java.util.Scanner;

public class IfStringsContains {

    static final Scanner SCANNER = new Scanner(System.in);

    static public void main(String[] args) {

        System.out.println("Please enter a string: ");

        boolean notThere = true;

        String firstString = SCANNER.nextLine();

        String[] arr = firstString.split(" ");

        System.out.println("Please enter a second string: ");

        String secondString = SCANNER.next();

        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(secondString)) {
                System.out.println("true");
                return;

            } if(notThere) {
                notThere = false;

                System.out.println(notThere);
                return;
        }
    }
}
























































