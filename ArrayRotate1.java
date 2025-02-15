import java.util.Scanner;

public class ArrayRotate1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the steps to rotate the Array : ");
        int steps = sc.nextInt();
        rotate(arr, steps);
        System.out.print("Original Array : ");
        for(int z : arr){
            System.out.print(z+ " ");
        }
        System.out.print("\nModified Array : ");
        for(int k : arr){
            System.out.print(k + " ");
        }

    }
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] arr, int steps){
        int len = arr.length;
        steps = steps % len;
        reverse(arr, 0, len-1);
        reverse(arr, 0, steps-1);
        reverse(arr, steps, len-1);
    }
}
