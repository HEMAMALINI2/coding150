public class Problem50{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=n;i>=1;i--){
            int temp=65+(n-1);
            int space=n-i;
            for(int j=1;j<=n;j++){
            if(j>space){
             System.out.print((char)temp);
            }
            else{
                System.out.print(" ");
            }
            temp--;
            }
            System.out.println("");
        }
        
    }
}