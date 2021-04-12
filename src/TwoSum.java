import java.util.Arrays;
import java.util.HashMap;

public class TwoSum
{
    public static void main(String[] args)
    {
        int[] nums = {1, 3, 4, 6, 7, 9};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        if(nums.length < 1)
            {
            return new int[]{0,0};
            }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
            {
            if(map.containsKey(nums[i]))
                {
                return new int[]{map.get(nums[i]),i};
                }
            else
                {
                map.put(target - nums[i], i);
                }
            }
        return new int[]{0,0};
    }
}
