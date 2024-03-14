package arrays;

public class equilibriumnumber {
    public static void main(String[] args) {
        int[] arr = {1,-1,4};
        System.out.println(optimal(arr));
    }
    //bruteforce
    public static int equilibrium(int[] arr){
        int left = 0 ;
        int right = 0;
        for(int i = 0 ; i < arr.length;i++){
            if( i == 0){
                left = 0 ;
                right = sum(arr,0,arr.length-1);
            }
            else if(i == arr.length -1 ){
                left = sum(arr,0,arr.length-2);
                right = 0;
            }
            else{
                left = sum(arr,0,i-1);
                right = sum(arr,i+1,arr.length-1);
            }
            if(left == right){
                return i;
            }
        }
        return -1;
    }
    public static int sum(int[] arr , int start , int end){
        int sum = 0;
        for(int i = start ; i <= end;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    //optimal
    public static int optimal(int[] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length;i++){
            sum = sum + arr[i];
        }
        int currentsum = 0;
        int leftsum = 0;
        int rightsum = 0;
        for(int i = 0; i < arr.length;i++){
            if(i == 0){
                leftsum = 0;
                rightsum = sum-arr[i];
            }
            else if(i == arr.length-1){
                leftsum = sum - arr[i];
                rightsum = 0;
            }
            else{
                leftsum = currentsum;
                rightsum = sum - currentsum - arr[i];
            }
            if(leftsum == rightsum){
                return i;
            }
            currentsum = currentsum + arr[i];
        }
        return -1;
    }
}
