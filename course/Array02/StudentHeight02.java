package course.Array02;

public class StudentHeight02 {
    public int solution(int n, int[] arr){
        int answer = 1, max=arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i]>max) {
                answer++;
                max=arr[i];
            }
        }
        return answer;
    }

}
