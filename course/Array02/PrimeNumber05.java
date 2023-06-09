package course.Array02;

public class PrimeNumber05 {
    //소수 개수 구하기
    public static void main(String[] args) {
        int num = 10;
        int[] ch = new int[num+1];
        int answer = 0;
        for(int i =2 ;i<=num;i++) {
                if(ch[i]==0){
                    answer++;
                    for(int j=i; j<=num; j=j+i) ch[j]=1;
            }
        }
        System.out.println(answer);
    }
}
