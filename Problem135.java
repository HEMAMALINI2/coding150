import java.util.Arrays;
import java.util.Scanner;
public class Problem135{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Size of an Array: ");
    int n = in.nextInt();
    int[] arr= new int[n]; 
    System.out.println("Enter the "+n+" elements ");
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }
   Arrays.sort(arr);
   int count=1;
   for(int i=0;i<n-1;i++){
    if(arr[i]==arr[i+1]){
     count++;
    }
    else{
        System.out.println(arr[i]+" occurs "+count+" times");
        count=1;
    }
        if(i==n-2 && arr[i]!=arr[i+1]){
         System.out.println(arr[i+1]+" occurs 1 times");
    }
   }


    }
}