class array_2d
{
    public static void main(String...args)
    {
        int arr[][]={{1,2,3},{2,3},{-1}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println(arr[i][j]);
            }
        }

        System.out.println("using foreach loop");
        for (int[] indata : arr) {
            for (int is : indata) {
                System.out.println(is);
            }
        }
    }
    
}