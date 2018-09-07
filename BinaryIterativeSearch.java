public class BinaryIterativeSearch implements Practice2Search{

    public int search(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int mid = (high+low)/2;

        for(int i=0;i<(int)(Math.log(arr.length)/Math.log(2));i++){
            if(arr[mid]==target)
                return mid;
            else if(target>mid){
                low = mid;
                mid = (low+high)/2;
            }
            else{
                high = mid;
                mid = (low+high)/2;
            }
        }

        return -1;
    }

    public String searchName(){
        return "binary iterative";
    }
}
