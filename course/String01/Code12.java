package course.String01;

public class Code12 {
    public String solution(String code, int num) {
        String answer = "";
        for(int i=1;i<num;i++){
            String tmp = code.substring(0,7).replace('#','1').replace('*','0');
            //이진수로 변환
            int n = Integer.parseInt(tmp,2);
            //숫자->문자형변환하여 String으로 출력
            answer += (char)num;
            code = code.substring(7);
        }
        return answer;
    }
}
