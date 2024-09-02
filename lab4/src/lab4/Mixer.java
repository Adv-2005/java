package lab4;

import java.util.Scanner;

class Mixer {
    int arr[];

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // Check for duplicates
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate elements are not allowed. Please enter a different number.");
                    i--;
                    break;
                }
            }
        }
    }

    Mixer mix(Mixer A) {
        int size = this.arr.length + A.arr.length;
        int[] mergedArr = new int[size];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays in ascending order
        while (i < this.arr.length && j < A.arr.length) {
            if (this.arr[i] < A.arr[j]) {
                mergedArr[k++] = this.arr[i++];
            } else {
                mergedArr[k++] = A.arr[j++];
            }
        }

        // Copy remaining elements from this.arr
        while (i < this.arr.length) {
            mergedArr[k++] = this.arr[i++];
        }

        // Copy remaining elements from A.arr
        while (j < A.arr.length) {
            mergedArr[k++] = A.arr[j++];
        }

        Mixer result = new Mixer();
        result.arr = mergedArr;
        return result;
    }

    void display() {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Mixer A = new Mixer();
        A.accept();
        Mixer B = new Mixer();
        B.accept();

        Mixer C = A.mix(B);
        C.display();
    }
}
