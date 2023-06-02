package course.String01;

public class DupliStrRemove01 {
    public String solution(String str){
        String answer = "";
        //charAt을 이용해 indexOf로 비교
        //kseks
        //str.charAt(i) : i : str.indexOf(str.charAt(i))
        //k : 0 : 0
        //s : 1 : 1
        //e : 2 : 2
        //k : 3 : 0
        //s : 5 : 1
        //같은 문자가 나올 경우 indexOf값과 i가 달라짐
        for(int i =0; i<str.length();i++){
            if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
        }
        return answer;
    }
}
