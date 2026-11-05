package daily_assignments;

public class Assignment_14Oct2026_ArrayDebugging1 {
    public static void main(String[] args) {
        int[] arr = {10, 10, 8, 5};

        int largest = arr[0];
        int secondLargest = arr[0];
        
        boolean flag=false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                flag=true;
            } else if (arr[i] != largest
                    && ( !flag || arr[i] > secondLargest)) {
                secondLargest = arr[i];
                flag=true;
            }
        }
        if (flag) {
        	System.out.println("Second Largest value exists");
        	System.out.println("Second Largest: " + secondLargest);
        } else {
            System.out.println("Second largest distinct element does not exist.");
        }
        System.out.println("Largest: " + largest);
        
    }
}