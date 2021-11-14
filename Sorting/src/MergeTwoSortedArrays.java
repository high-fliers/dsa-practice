import java.util.Scanner;

public class MergeTwoSortedArrays {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        //write your code here
        int ptr1 = 0;
        int ptr2 = 0;
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < c.length; i++) {

            if(ptr1 >= a.length){
                c[i] = b[ptr2];
                ptr2++;
            }
            else if(ptr2 >= b.length){
                c[i] =a[ptr1];
                ptr1++;
            }
            else{
                if (a[ptr1] < b[ptr2]) {
                    c[i] = a[ptr1];
                    ptr1++;
                } else {
                    c[i] = b[ptr2];
                    ptr2++;
                }
            }
        }
        return c;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a, b);
        print(mergedArray);
    }

}