public class arraycopy_method {
    public static void main(String...args)
    {
        int n1[]={1,2,3,4};
        int m=n1.length;
        int n2[]=new int[m];
        System.arraycopy(n1, 0, n2, 0, m);

        for (int index = 0; index < n2.length; index++) {
            System.out.println(n2[index]);
        }
    }
}
