package Solution;

public class RemoveDuplicates
{
    /*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
    The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
    Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
    -Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
    The remaining elements of nums are not important as well as the size of nums.
    -Return k.
    */
    public static int removeDuplicates(int[] nums)
    {
        int newIndex = 1;
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] < nums[i+1]) 
            { 
                nums[newIndex] = nums[i+1];
                newIndex++;
            }
        }
        return newIndex;
    }

    public static void main(String args[])
    {
        int[] array = {1,1,2,2,3};
        System.out.println(removeDuplicates(array));
    }
}
