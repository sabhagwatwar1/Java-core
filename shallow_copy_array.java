class shallow_copy_array
{
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int newarray[]=arr;
        newarray[1]=5;
        System.out.println(arr[1]);
    }
}