/*

Ques.5 Find common elements between two arrays.

*/

public class Ques5 {

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8, 11, 4, 39};
        int len1 = arr1.length;
        int[] arr2 = {8, 3, 12, 9, 13, 7, 4, 56, 2, 11};
        int len2 = arr2.length;

        System.out.print("Common Elements are : ");
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + "\t");
                }
            }
        }

    }
}
