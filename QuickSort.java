import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int mid = (left + right) / 2; // 중간값 인덱스
        int pivotValue = arr[mid]; // 중간값을 피벗으로 선택
        int i = left;
        int j = right;

        while (i <= j) {
            while (arr[i] < pivotValue) { // 피벗보다 큰 값 찾기
                i++;
            }
            while (arr[j] > pivotValue) { // 피벗보다 작은 값 찾기
                j--;
            }
            if (i <= j) { // i와 j가 교차하지 않았으면 swap
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        //for문 사용시
        // swap(arr, mid, end); // 중간값을 마지막 요소와 교환
        // int i = start;
        // for (int j = start; j < end; j++) {
        //     if (arr[j] < pivotValue) {
        //         swap(arr, i, j);
        //         i++;
        //     }
        // }
        // swap(arr, i, end); // pivot 위치를 올바른 위치로 이동

        return i; // 피벗 인덱스 반환
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 54, 9, 3, 11, 6, 8, 92, 4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}