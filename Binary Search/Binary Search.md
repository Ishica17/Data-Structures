# BINARY SEARCH

arr = [2,3,7,4,7,4,8,4,9,4,8]

_If we apply linear se arch on it max comaprisons will be n in worst case because it will traverse through complete array._

BINARY SEARCH: 
- Only applicable on sorted arrays.
- As compared to linear search it is more complex but relatively fast.
- To search a given element from the array using binary search we require less no. of comparision.

## ALGORITHM
1. Take mid element.
2. If mid < target no chance we will find element in left so set beg/lb = mid+1.
3. If mid> target set ub = mid -1 means search in right.
4 If mid == target we found the ans.
5. beg/start/lower bound becomes > end means element not found.
   
## COMPLEXITIES
**Best case** - first mid == target --O(1)
**Worst Case** -  Everytime we will compare the search space will reduce to n= n*1/2
say we compared k times means divided array k times then it will be n*(1/2^k)=1 because in last comparison we will have only one element.
			  from n*1/2^k
				n= 2^k'
			 Taking log log n= log 2^k

				log n= k log 2
				
				k = log n base 2

So comparison in worst case is log n where n is size of array.
So worst case complexity is O(log n).

## CODE
For implementing the code below create a new file and save that file with BinarySearch.java then copy this code.
import java.util.Arrays;
public class BinarySearch{
    
    public static int binarySearch(int [] arr, int target){
        Arrays.sort(arr);
        System.out.println("As Binary Search works on sorted array so index returned is of sorted array.");
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start +(end-start)/2;
            if(target == arr[mid]){
                // return True; If we want to only check whether element is there or not;
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {98,45,3,5,56,2,35,98,445,3,23};
        int target = 35;
        int eleFound = binarySearch(arr,target);
        if(eleFound ==-1){
            System.out.println("Element not Found.");
        }
        else{
            System.out.println("\n \n                                       Element found at index "+eleFound);
        }
    }

}
