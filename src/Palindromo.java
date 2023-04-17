package Solution;

public class Palindromo {
    public static boolean isPalindrome(int x) 
    {
        int[] array = new int[String.valueOf(x).length()];
        for(int i = 0; i <array.length/2; i++)
        {
            if(array[i] != array[array.length])
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(121));
    }
}
