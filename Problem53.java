public class Problem53{
    public static void main(String[] args) {
     int n=5;
     int space=0;
     for(int i=n*2-1;i>=1;i--){
        int temp=0;
        if(i<n){
           temp=n-i+1;
           space=space;
           space--;
        }
        else{
            temp=i-n+1;
            space=n-n-1;
            space++;
        }
        int count=0;
        for(int j=1;j<=temp;j++){
            if(space>=count){
                System.out.print(" ");
                count++;
            }
            
                 System.out.print(" *");
            
       
        }
        
        System.out.println();
     }   
    }
}
