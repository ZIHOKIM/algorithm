public class Factorial {
    public static void main(String[] args) {
        int num = 3;
        int result = 1;
        for(int i = num; i>0; i--){
            result *= i;
        }
        System.out.println(result);
    }
}
