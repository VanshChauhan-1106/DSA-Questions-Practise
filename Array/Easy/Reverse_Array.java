package Array.Easy;

public class Reverse_Array {

    public static void reverseArray(int arr[]){
        int reversedArr[] = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }

        System.out.print("The Reversed Array is : ");
        for(int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
        
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        reverseArray(a);
    }
}
