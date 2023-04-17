package Solution;

public class IntToRomano 
{
    /*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    For example, 2 is written as II in Roman numeral, just two one's added together. 
    12 is written as XII, which is simply X + II. 
    The number 27 is written as XXVII, which is XX + V + II.
    Roman numerals are usually written largest to smallest from left to right. 
    However, the numeral for four is not IIII. Instead, the number four is written as IV. 
    Because the one is before the five we subtract it making four. 
    The same principle applies to the number nine, which is written as IX. 
    There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

    Given an integer, convert it to a roman numeral. */
    public static String intToRoman(int num) 
    {
        if(num <= 1 || num >= 3999)
            return "I numeri romani possono arrivare fino a 3999 e non oltre!!";
        String risultato = "";
        int[] valori = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romani = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < valori.length; i++) 
        {
            while(num >= valori[i])
            {
                num-=valori[i];
                risultato += romani[i];
            }
        }
        return risultato.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(intToRoman(4000));
    }
}
