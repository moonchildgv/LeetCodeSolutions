package Solution;

import java.util.Arrays;

public class DividTwoInt 
{
    /*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits. */
    public static int[] plusOne(int[] digits) 
    {
        if(digits[digits.length-1] != 9) digits[digits.length-1] += 1;
        else{
            digits[digits.length-1] = 0;
            digits[digits.length-2] += 1;
        }
        return digits;
    }

    public static void main(String[] args)
    {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(DividTwoInt.plusOne((array))));
    }

}
