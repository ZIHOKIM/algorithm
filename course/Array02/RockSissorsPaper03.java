package course.Array02;

public class RockSissorsPaper03 {
    public String solution(int n, int[] a, int[] b) {
        String answer = "";
        for(int i = 0; i<n; i++){
            if(a[i]==b[i]) answer +="D";
            else if (a[i]==1&&b[i]==3) answer +="A";
            else if (a[i]==2&&b[i]==1) answer="A";
            else if (a[i]==3&&b[i]==2) answer="A";
            else answer+="B";
        }
        return answer;
    }
}
