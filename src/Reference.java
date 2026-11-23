public class Reference {
    public static void changeValue(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] arge){
        int[] arr= {1, 2, 3, 4, 5};
        System.out.println("Original array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        changeValue(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
