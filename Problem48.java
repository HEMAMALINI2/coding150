public class Problem48{
    public static void main(String[] args) {
      int n=5;
      for(int i=n;i>=1;i--){
        int temp=i;
        for(int j=1;j<=i;j++){
         System.out.print(temp);
         temp--;
        }
        System.out.println();
      }  
    }
}