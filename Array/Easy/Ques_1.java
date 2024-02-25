package Array.Easy;

class Ques_1 {

    public static void minMaxElements(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min element in arr is : " + min);
        System.out.println("Max element in arr is : " + max);
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 6, 9, 0, 2, 7, 1};
        minMaxElements(arr);
    }
}