//package Amazon questions;
import java.util.*;
public class pair_defference {
    static boolean findPair(int arr[],int n){
        int size = arr.length;
        Arrays.sort(arr);
        n = Math.abs(n);
        int l=0;
        int r=size-1;
        while(r>l){
            int diff = arr[r]-arr[l];
            if(diff==n)
                return true;
            else if(diff>n)
                l++;
            else
                r--;
        }
        return false;
    }
    public static void main (String[] args)
{
    int arr[] = { 1, 8, 30, 40, 100 };
    int size = arr.length;
    int n = -60;
    
    System.out.println(findPair(arr, n));
    n = 20;
    findPair(arr, n);
}
}
