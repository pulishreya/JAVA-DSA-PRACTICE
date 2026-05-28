import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        if (list.isEmpty()) {
            System.out.println("No elements were entered.");
        } else {
            System.out.println("The largest element in the array is: " + Collections.max(list));
        }

        sc.close();
    }
}