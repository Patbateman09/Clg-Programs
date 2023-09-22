import java.util.*;
public class Eclient{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[100];
        System.out.println("Enter the elements of the first array in sorted order: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second array in sorted order: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[size1 + size2];
        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < size1) {
            arr3[k++] = arr1[i++];
        }
        while (j < size2) {
            arr3[k++] = arr2[j++];
        }
        System.out.println("Merged sorted array:");
        for(int element:arr3) {
            System.out.println(element + " ");
        }
    }
}
