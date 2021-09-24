package Assignment1;

public class Question2 {
    public static void main(String[] args) {
        int[] test1 = new int[]{-4,-1,0,3,10};
        System.out.println("test1");
        for (int i: sortedSquares(test1)){
            System.out.print(i + " ");
        }
        int[] test2 = new int[]{-7,-3,2,3,11};
        System.out.println("");
        System.out.println("test2");
        for (int i: sortedSquares(test2)){
            System.out.print(i + " ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, high);
    }
    private static void merge(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, index = 0;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[index] = arr[i];
                i++;
            } else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        // either i or j ran out of bounds
        while (i <= mid) {
            temp[index] = arr[i];
            i++;
            index++;
        }
        while (j <= high) {
            temp[index] = arr[j];
            j++;
            index++;
        }
        i = low;
        for (int k = 0; k < temp.length; k++) {
            arr[i] = temp[k];
            i++;
        }
    }
}
