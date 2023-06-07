package course.Array02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxNum01 {
    public ArrayList<Integer> solution(int n, int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(nums[0]);

        for(int i = 1; i<n;i++){
            if(nums[i]>nums[i-1]) answer.add(nums[i]);
        }
        return answer;

    }
}
