package course.String01;

public class Palindrome07 {
    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!= str.charAt(len-1-i)) return "NO";
        }
        return answer;

    }
//StringBuilder사용
    public String solution2(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) return "YES";
        return answer;
    }



}
