package course.String01;

public class OnlyNumber09 {
    public int solution(String s){
        int answer =0;
        //ASKII NUMBER 문자형 숫자의 경우 '0'~'9' -> 48~57
        //answer * 10 +(x-48)
        int askiiZero = 48;
        int askiiNine = 57;
        for(char c:s.toCharArray()){
            if(c>=askiiZero && c<=askiiNine) answer = answer*10+(c-48);
            //answer을 String으로 받을 경우
            //if(Character.isDigit(x)) answer +=c;
            //Integer.parseInt(answer);
        }

        return answer;
    }
}
