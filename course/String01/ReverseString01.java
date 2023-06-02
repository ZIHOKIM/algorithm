package course.String01;

import java.util.ArrayList;

public class ReverseString01 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x :str){
            //StringBuilder : 메모리 공간 확보, 새로운 객체 생성 x
            // String tmp = new StringBuilder(x).reverse().toString();
            // answer.add(tmp);

            //중간을 중심으로 바꿔주기
            char[] s= x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while (lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }
}
