import java.util.Scanner;

public class Array_str_inp {
    public static void main(String...args)
    {
        String arr[]={"Ram","om","Priya","pritz"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } 

        System.out.println("Take input from the user");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        String arra[]=new String[n];
        System.out.println("Entering element in an array ");
        for (int i = 0; i < arra.length; i++) {
            arra[i]=s.nextLine();
        }
        System.out.println("Printing all the elements");
        for (int index = 0; index < arra.length; index++) {
            System.out.println(arra[index]);
        }
    }
}
