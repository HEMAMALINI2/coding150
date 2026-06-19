public class Problem47{
    public static void main(String[] args) {
    int n=5;
    int k=1;
    for(int i=n;i>=1;i--){
        int temp=k;
        for(int j=1;j<=i;j++){
            System.out.print(temp);
            temp++;
        }
        System.out.println();
        k++;
    }
}
}