public class Problem42{
    public static void main(String[] args) {
     int n=5;
     for(int i=n;i>=1;i--){
        int temp=n-i;
        int count=1;
        for(int j=1;j<=n;j++){
            if(j>temp){
             System.out.print(count);
            }
            else{
                System.out.print(" ");
            }
          count++;
        }
        System.out.println();
     }  

    }
}