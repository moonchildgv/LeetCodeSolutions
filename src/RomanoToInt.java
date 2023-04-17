package Solution;

public class RomanoToInt
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

    Given a roman numeral, convert it to an integer. */
    public static int romanToInt(String s)
    {
        int x = 0;
        int precedente = 0;
        int corrente = 0;
        for(char c : s.toCharArray())
        {
            switch(c){
                case 'I': corrente = 1;
                    break;
                case 'L' : corrente = 50;
                    break;
                case 'V': corrente = 5;
                    break;
                case 'X': corrente = 10;
                    break;
                case 'C': corrente = 100;
                    break;
                case 'D': corrente = 500;
                    break;
                case 'M': corrente = 1000;
                    break;
            }
            if(precedente == corrente) precedente = 0;
            if(precedente < corrente) x += corrente - precedente - precedente;
            if(precedente > corrente) x += corrente;
            precedente = corrente;
        }
        return x;
    }

    public static void main(String[] args)
    {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}