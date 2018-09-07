import java.util.Arrays;

public class BinaryRecursiveSearch implements Practice2Search{

    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        if(arr.length==1&&arr[0]!=target)
            return -1;
        else if(mid<arr.length && arr[mid]==target)
            return mid;
        else if(arr[mid]<target) {
            int[] newArray = Arrays.copyOfRange(arr,mid,high);
            search(newArray, target);
        }
        else if(arr[mid]>target){
            int[] newArray = Arrays.copyOfRange(arr,low,mid);
            search(newArray,target);
        }
        return -1;
    }

    public String searchName(){
        return "binary recursive";
    }
}
