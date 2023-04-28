import java.util.Arrays;

class BubbleSort{
    public static void main(String[] args) {
        int[] arr= {3,2,5,1,6,8,2,4,7};
        int temp = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]= temp;
                }
            }
        }

        System.out.println("답:"+Arrays.toString(arr));
    }
}