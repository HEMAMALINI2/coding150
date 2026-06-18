public class Problem44{
    public static void main(String[] args){
        int n=5;
        int even=0,odd=1;
        for(int i=1;i<=n;i++){
            int ans=0;
            if(i%2==0){
                ans=even;
            }
            else{
                ans=odd;
            }
           for(int j=1;j<=i;j++){
            System.out.print(ans+" ");
           }
           System.out.println();
        }
    }
}