package Solution;
import java.util.*;
import java.util.stream.IntStream;
public class Mediana 
{
    /*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    The overall run time complexity should be O(log (m+n)). 
    */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        double mediana = 0;
        int[] array = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        Arrays.sort(array);
        if(array.length%2 != 0)
            mediana = (double) (array[array.length/2]);
        else
            mediana = (double) (array[(array.length-1)/2] + array[array.length/2]) * 1/2;
        return mediana;
    }
    public static void main(String[] args)
    {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
