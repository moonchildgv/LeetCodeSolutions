package Solution;

public class ReverseInteger {

    /*Given a signed 32-bit integer x, return x with its digits reversed. 
    If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    Assume the environment does not allow you to store 64-bit integers (signed or unsigned). */
    public static int reverse(int x) 
    {
        String s = ""+x;
        String a = contrario(s);
        
        return Integer.parseInt(a);
    }

    public static String contrario(String s)
    {
        String nstr = "";
        String ciao = "";
        char ch;
        int j=0;
        if(s.charAt(j) == '-' || s.charAt(j) == '+'){
            ciao = ciao+ s.charAt(j);
            j++;
        }
        for (; j<s.length(); j++)
        {
            ch= s.charAt(j); 
            nstr = ch + nstr;
        }
        return ciao + nstr;
    }

    public static int reverse2(int x) 
    {
        boolean minoreZero = x<0;
        if(x<0) x = (-1)*x;
        String s = ""+x;
        char[] originale = s.toCharArray();
        char[] out;
        int scansione = 0;
        if(minoreZero){ out = new char[originale.length +1]; scansione ++; out[0] = '-';}else out = new char[originale.length];

        for (int i = originale.length-1; i >= 0; i--) {
            out[scansione] = originale[i];
            scansione++;
        }
    
        return Integer.parseInt(new String(out));
    }



    public static void main(String[] args)
    {
        System.out.println(reverse2(-321));
    }
}
