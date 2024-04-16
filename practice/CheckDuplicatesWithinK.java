package practice;

import java.util.HashMap;
import java.util.Map;;

public class CheckDuplicatesWithinK {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
        int n = arr.length;
        if (checkDuplicatesWithinK(arr, n, 3)) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean checkDuplicatesWithinK(int arr[], int n, int k) {
        // Creates an empty unordered map
        Map<Integer, Integer> umap = new HashMap<>();

        for (int i = 0; i < n; i++)// start traversing the array from left to right
        {
            if (!umap.containsKey(arr[i]))// if the element is not present in map then insert it
            {
                umap.put(new Integer(arr[i]), new Integer(i));
            }

            else // if it is already present then check the condition
            {
                if (i - umap.get(arr[i]) <= k) {
                    return true;// if duplicate present within a distance k
                }
                umap.put(new Integer(arr[i]), new Integer(i));
            }
        }

        return false;// if the duplicate is not present
    }
}
