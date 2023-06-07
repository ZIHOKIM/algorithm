package course.String01;

public class ConvertString02 {
    //대소문자변환
    public String solution(String str){
        char[] charArr = str.toCharArray();
        String answer ="";

        for(char ch : charArr) {

            //if (Character.isLowerCase(ch)) answer += Character.toUpperCase(ch);
            //else answer += Character.toLowerCase(ch);

            //ASKII CODE 사용
            //대65~90 소 97~122 대문자 - 소문자 =32
            //소문자일 경우 -> 대문자로 변환
            if (ch >= 97 && ch <=122) answer += (char)(ch - 32);
            //대문자일 경우 -> 소문자로 변환
            else answer += (char)(ch + 32);
        }
        return answer;
    }

}
