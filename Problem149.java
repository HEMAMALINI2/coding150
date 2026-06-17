import java.util.Scanner;
public class Problem149{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int n = in.nextInt();
        System.out.println("Enter the Elements of an Array");
        int[] arr = new int[n];
        int squares=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            squares+=arr[i]*arr[i];
        }
       
       System.out.println(squares);

    }
}