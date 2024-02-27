package Array.Easy;

public class ContainsDuplicate_Array {
    
    public static boolean containsDuplicate(int[] arr) {
        // boolean isContain = true;
        for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            } 
        }
        return false;

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 1};
        if(containsDuplicate(a)) {
            System.out.println("Yes, It contains duplicate elements!");
        } else {
            System.out.println("No, It does not contains duplicate elements!");
        }
    }
}
