package Array.Easy;

public class MaxSum_SubArray {
    
    public static void maxSumSubArr(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Maximum sum of the subarray = " + maxSum);

        
    }
    
    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSumSubArr(a);
    }
}
