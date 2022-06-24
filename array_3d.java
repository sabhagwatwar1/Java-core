public class array_3d {
    public static void main(String[] args) {
        int arr[][][]={
            {
                {1,2,3},
                {4,5,6}
            },{
                {5,3,2},
                {8,7,6}
            }
        };
        System.out.println("Using foreach loop");
        for (int[][] is : arr) {
            for (int[] is2 : is) {
                for (int is3 : is2) {
                    System.out.println(is3);
                }
            }
        }
        System.out.println("Using normal for loop");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int j2 = 0; j2 < arr[j].length; j2++) {
                    System.out.println(arr[i][j][j2]);
                }
            }
        }
    }
}
