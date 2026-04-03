import java.util.*;

class Solution {
    // Function to reverse the array in-place
    public void reverse(int[] arr, int n) {
        // Initialize pointer to the beginning of the array
        int p1 = 0;

        // Initialize pointer to the end of the array
        int p2 = n- 1;

        // Loop until the two pointers meet in the middle
        while (p1 < p2) {
            // Swap the elements at p1 and p2
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            // Move the left pointer one step to the right
            p1++;

            // Move the right pointer one step to the left
            p2--;
        }
    }
}
