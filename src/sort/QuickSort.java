package sort;

public class QuickSort {
    // pivot을 랜덤하게 고르는 것이 중요! -> 역정렬, 정렬된 배열의 경우를 고려
    // stable한 퀵소트? -> pivot을 항상 맨 위에 것으로 사용
    // 그러나 시간 복잡도를 고려하여 일반적으로 random 피벗을 사용하므로, quick sort는 unstable한 형태로 사용하게 된다.

    public static void main(String[] args) {
        int[] arr = { 3, 5, 11, 7, 2, 8, 4 };
        sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int p = partition(arr, l, r);

            // divide
            sort(arr, l, p - 1);
            sort(arr, p + 1, r);
        }
    }

    // conquer
    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = (l - 1);

        for (int j = 0; j < r-1; j++) {
            if(arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, r);
        return (i+1);
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
