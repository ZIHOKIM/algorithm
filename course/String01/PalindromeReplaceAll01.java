package course.String01;

public class PalindromeReplaceAll01 {
    public String solution(String s){
        String answer = "NO";
        s= s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";

        return answer;

    }
}
