public class deep_copy_array {
    public static void main(String...args)
    {
        int arr[]={1,2,5};
        int n=arr.length;
        int a[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            a[i]=arr[i];
        }
        for (int index = 0; index < a.length; index++) {
            System.out.println(a[index]);
        }
    }
}
