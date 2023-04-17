package Solution;
public class TwoSum 
{
    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    */
    public static int[] twoSum(int[] nums, int target)
    {
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 1; j < nums.length && j != i; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] array = {2,7,11,15};
        System.out.println(java.util.Arrays.toString(twoSum(array, 9)));

        int[] array1 = {3,2,4};
        System.out.println(java.util.Arrays.toString(twoSum(array1, 6)));
    }
}
