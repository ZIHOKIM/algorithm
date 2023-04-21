import java.util.Arrays;

public class QuickSort2 {
    
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }
    
    private static int partition(int[] arr, int left, int right) {
        int pivotValue = arr[left];
        int i = left + 1;
        
        for (int j = i; j <= right; j++) {
            System.out.println("if밖에"+j+"+"+i);
            if (arr[j] < pivotValue) {
                swap(arr, i, j);
                i++;
                System.out.println("for문"+Arrays.toString(arr));  
                System.out.println(j+"+"+i);  
            }
        }
        
        swap(arr, left, i - 1);
        return i - 1;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7, 6, 8, 2, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}