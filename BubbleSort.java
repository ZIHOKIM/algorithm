public class BubbleSort {
    public static void bubble(int[] arr) {
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=1; i<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    System.out.println("test");
                }
            }
        }
            
        
    }
}
