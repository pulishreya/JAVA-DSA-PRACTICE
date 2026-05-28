public class sorted {
    public static void main (String [] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i+1]) {
                System.out.println("Array is not sorted");
                break;

            }

        }


    }
}