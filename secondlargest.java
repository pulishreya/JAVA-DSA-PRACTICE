public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];

            if (value > largest) {
                secondlargest = largest;
                largest = value;
            } else if (value > secondlargest && value != largest) {
                secondlargest = value;
            }

            if (value < smallest) {
                secondsmallest = smallest;
                smallest = value;
            } else if (value < secondsmallest && value != smallest) {
                secondsmallest = value;
            }
        }

        System.out.println("Second largest: " + secondlargest);
        System.out.println("Second smallest: " + secondsmallest);
    }
}
