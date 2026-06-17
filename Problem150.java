//sort the array
import java.util.*;
public class Problem150{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}