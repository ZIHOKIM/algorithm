package course.String01;

public class CompressedString11 {
    public String solution(String s) {
        //outOfIndex 방지
        s = s+" ";
        int cnt=1;
        String answer = "";
        //              빈문자 전까지만 돌려줌
        for(int i = 0; i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                answer += s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }

        return answer;

    }
}
