## Order agnostic binary search is applied when array is in descending order.

public class OrderAgnosticBinarySearch{
    public static void main(String [] args){
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        int target = 5;
        int eleFound = OABS(arr, target);
        if(eleFound == -1){
            System.out.println("Element not Found");
        }
        else{
            System.out.println("Element found at index " + eleFound);
        }
    }
    public static int OABS(int [] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end - start)/2;
        if (target == arr[mid]){
            return mid;
        }
        else if(target<arr[mid]){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
        }
        return -1;
    }
}
