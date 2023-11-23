//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      obj.convertMinToMaxHeap(n,a);
      for(int e : a)
      {
          System.out.print(e+" ");
      }
      System.out.println();
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static void swap(int heap[], int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    static void convertMinToMaxHeap(int N, int heap[]) {
        if (N <= 1) {
            return; // Base case: Stop recursion if there's only one element or none
        }

        for (int i = (N / 2) - 1; i >= 0; i--) {
            heapify(heap, N, i);
        }
    }

    static void heapify(int heap[], int N, int index) {
        int largest = index;
        int left_child = 2 * index + 1;
        int right_child = 2 * index + 2;

        if (left_child < N && heap[left_child] > heap[largest]) {
            largest = left_child;
        }

        if (right_child < N && heap[right_child] > heap[largest]) {
            largest = right_child;
        }

        if (largest != index) {
            swap(heap, index, largest);
            heapify(heap, N, largest); // Recursively heapify the affected subtree
        }
    }
}

     