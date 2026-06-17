public class Problem146{
    public static void main(String[] args) {
     int[] arr = {45, 25, 69, 40};
        int first = arr[0];
        int second = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]<second && second!=first){
                second=arr[i];
            }
        }

        System.out.println(second);   
    }
}