import java.util.Scanner;
public class Main {
    public static void selectionSort(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i =0; i < arr.length-1;i++) {
            int mini = i;
            for ( int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
                int temp = arr[i];
                arr[i] = arr[mini];
                arr[mini] = temp;

            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        selectionSort(arr);

        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

