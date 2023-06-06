package course.String01;

public class longString03 {
    //문장속 제일 긴 단어 찾기
    public String solution(String str){
        String answer ="";
        int m = Integer.MIN_VALUE, pos;

        //str.indexOf(" ") => " "의 index를 반환 아닐 시 -1 반환
        while((pos = str.indexOf(" "))!=-1){
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            //검토한 단어 제거
            str = str.substring(pos+1);
        }
        //마지막 단어까지 검토
        if(str.length()>m) answer=str;

      /*
       String [] words = str.split(" ");
        for(String word: words){
            int len = word.length();
            if(len>m){
                m=len;
            }
        }
        */
        return answer;
    }
}
