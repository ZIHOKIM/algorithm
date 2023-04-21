public class StringReverse{
    public static void main(String[] args){
        String str = "apple";
        String reverse = "";
        for(int i = str.length()-1;i>=0;i--){
            System.out.println(i);
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}