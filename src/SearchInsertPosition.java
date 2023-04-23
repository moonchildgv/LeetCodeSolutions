package Solution;

public class SearchInsertPosition
{
    /* Given a sorted array of distinct integers and a target value, return the index if the target is found. 
    If not, return the index where it would be if it were inserted in order. 
    */
    public static int searchInsert(int[] nums, int target) 
    {
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == target) return i;
        int[] newArray = insertTarget(nums, target);
        for(int i = 0; i < newArray.length; i++)
            if(newArray[i] == target) return i;
        return nums.length;
    }

    private static int[] insertTarget(int[] array, int target) {
        int[] newArray = new int[array.length + 1];
        int position = 0;
        for(int i = 0; i < array.length; i++) 
        {
            if (target < array[i]) 
            {
                position = i;
                break;
            }
            position = i + 1;
        }
        for(int i = 0; i < position; i++) 
            newArray[i] = array[i];
        newArray[position] = target; 
        for(int i = position + 1; i < newArray.length; i++) 
            newArray[i] = array[i - 1];
        return newArray;
    }

    public static void main(String args[])
    {
        int[] array = {1,3,5,6};
        System.out.print(searchInsert(array, 2));
    }

    
}