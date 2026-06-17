public class Problem148{
    public static void main(String[] args){
        int[] arr = { 20, -10, 15, 00, -85};
        int positive = 0, negative = 0 , zero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
            negative++;
            }
            else{
                if(arr[i]==0){
                 zero++;
                }
                else{
                    positive++;
                }
            }
        }

        System.out.println("Positive : "+positive +" Negative : "+negative+" Zero : "+zero);
    }
}