package Solution;

import java.util.Arrays;

public class Caramelle
{
    public static int distributeCandies(int[] candyType)
    {
        int[] x  = new int[candyType.length];
        for(int i = 0; i < candyType.length; i++)
        {
            if(!contiene(x, candyType[i]))
                x[i] = candyType[i];
        }

        for(int i = 0; i < x.length; i++)
        {
            if(x[i] == 0)
                x = removeElement(x, x[i]);
        }
        return x.length;
    }

    public static boolean contiene(int[] arr, int key) {
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==key) {
                found=true;
            }
        }
        return found;
    }

    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
            .filter(i -> i != item)
            .toArray();
    }

    public static void main(String[] args)
    {
        int[] candyType = {1,1,2,3};

        System.out.println(distributeCandies(candyType));
        System.out.println(Arrays.toString(candyType));
    }
}
