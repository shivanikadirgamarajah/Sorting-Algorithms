public class QuickSort{
    //this is the public method   
    public static void QuickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }
    //this is the recursive quicksort function
    private static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            //sort the elements before and after the parition which we calculated
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);

        }
    }
    //partition the array using the last element as pivot
    private static int parition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1; //index of smaller element
        for(int j = low; j < high; j++){
            //if current element is smaller than or equal to pivot
            if(arr[j] <= pivot){
                i++;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; //pivot index
    }
}