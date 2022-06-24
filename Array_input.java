import java.util.Scanner;

public class Array_input {
    public static void main(String...args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int index = 0; index < arr.length; index++) {
            arr[index]=s.nextInt();
        }
        System.out.println("Printing all the elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
