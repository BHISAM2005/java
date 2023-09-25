// program to find third max  elements of array
import java.util.*;
public class third_max {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Value");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
            int largest = 0, secondLargest = 0, thirdLargest = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest) {
                    thirdLargest = secondLargest;
                    secondLargest = arr[i];
                } else if (arr[i] > thirdLargest) {
                    thirdLargest = arr[i];
                }
            }
            System.out.println("maximum = " + largest);
            System.out.println("Second Largest = " + secondLargest);
            System.out.println("Third Largest = " + thirdLargest);
        }
    }