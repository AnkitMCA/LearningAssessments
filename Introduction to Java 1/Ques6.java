/*

Ques.6 There is an array with every element repeated twice except one. Find that element.

*/

public class Ques6 {

    public static void main(String[] args) {

        int arr[] = {3, 1, 2, 3, 4, 4, 5, 6, 1, 6, 1, 5};
        int i, j, flag;

        System.out.print("Single Element From Array : ");
        for (i = 0; i < arr.length; i++) {
            flag = 0;
            for (j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag++;
                }
            }

            if (flag == 1) {
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
