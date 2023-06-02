import java.util.ArrayList;

public class ReverseParticularStr01 {
    public String solution(String str){
        String answer = "";

        char[] chs = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(chs[lt])) lt++;
            else if (!Character.isAlphabetic(chs[rt])) rt--;
            else {
                char tmp = chs[lt];
                chs[lt] = chs[rt];
                chs[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(chs);

        return answer;
    }
}
