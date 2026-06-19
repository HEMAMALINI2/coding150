import java.util.Scanner;
public class Problem141{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the Input : ");
       int n = in.nextInt();
       int ans=0;
       while(n>0){
        ans+=n%10;
        n/=10;
        if(n==0 && ans>9){
            n=ans;
            ans=0;
        }
       } 

       System.out.println(ans);
    }
}