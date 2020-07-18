import java.util.List;

class Result {



    public static int countPairs(int[] nums) {
        // Write your code here

        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++){
                if (nums[i] == nums[j] && i < j ){count++;}
            }
        }

        return count;
    }

}




public class Solution {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,1,1,3);
        int[] nums = {1,2,3,1,1,3};


        int result = Result.countPairs(nums);
        System.out.println(String.valueOf(result));


    }



}
