import java.util.Scanner;

public class FindString01 {
    //문자열에서 같은문자찾기
    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        //일반 for문
        //for(int i = 0; i<str.length();i++){
        //      if(str.charAt(i)==c){
        //          answer++;
        //      }
        //}

        //향상된 for문
        for(char x :str.toCharArray()){
            if(x==c){
                answer++;
            }
        }
        return answer;
    }
}
