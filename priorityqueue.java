import java.util.PriorityQueue;

public class Minheap {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 2, 6, 9 };

        // Create a Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert all array elements into the Min Heap
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        // Remove and print the smallest element
        System.out.println("Smallest Element is: " + pq.poll());
    }
}