package Solution;

public class ClimbingStairs
{
    /* You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 
    */
    /*FIBONACCI*/
    public static int climbStairs(int n)
    {
        if (n == 1) return n;
        int n1 = 1;
        int n2 = 2;
        for (int i = 3; i <= n; i++) 
        {
            int next = n1;
            n1 = n2;
            n2 = next + n2;
        }
        return n2;   
    }

    public static void main(String[] args)
    {
        System.out.println(climbStairs(5));
    }
}
