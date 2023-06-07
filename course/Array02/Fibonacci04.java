package course.Array02;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci04 {
    public static void main(String[] args) {
        int n = 10;
        int[] answer = new int[n];
        answer[0]=1;
        answer[1]=1;

        //배열 사용 안했을 시
        //int a=1,b=1,c;
        //System.out.println(a+" "+b+" ");
        for(int i = 2; i<n; i++){
            answer[i] = answer[i-2]+answer[i-1];
            //c=a+b
            //System.out.println(c+" ");
            //a=b;
            //b=c;
        }

        System.out.println(Arrays.toString(answer));
    }
}
