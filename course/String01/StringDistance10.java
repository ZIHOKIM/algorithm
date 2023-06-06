package course.String01;

public class StringDistance10 {
    public  int[] solution(String s, char t) {
        int p = 1000;
        int[] answer = new int[s.length()];
        for(int i = 0 ; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i] = p;
            }else {
                p++;
                answer[i] = p;
            }
        }
        p=1000;
        //역방향으로 for문
        for(int i =s.length()-1;i>=0;i--){
            if(s.charAt(i)==t) p=0;
            else {
                p++;
                //기존 배열값과 비교했을때 더작은 숫자로 바꿔줌
                answer[i] = Math.min(answer[i],p);
            }
        }

    return answer;


    }
}
