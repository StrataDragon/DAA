package timepass;
import java.util.*;
import java.util.Random;

class quicksort {

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // place pivot in correct position
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quick(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            quick(arr, low, pi - 1);   // sort left of pivot
            quick(arr, pi + 1, high);  // sort right of pivot
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rand = new Random();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = rand.nextInt(100);

        long s = System.nanoTime();
        quick(a, 0, n-1);
        long e = System.nanoTime();

        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println("\nTime taken:" + (e-s) + "ns");
    }
}
