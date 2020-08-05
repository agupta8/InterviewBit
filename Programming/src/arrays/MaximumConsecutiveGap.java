package arrays;

import java.util.Arrays;

public class MaximumConsecutiveGap
{

    public static void main(String[] args)
    {
        int[] arr = {1, 10, 5};
        System.out.println(maximumGap(arr));
    }

    public static int maximumGap(final int[] arr)
    {
        if (arr.length < 2)
            return 0;
        int gap, maxGap = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            gap = arr[i] - arr[i - 1];
            if (gap > maxGap)
                maxGap = gap;
        }
        return maxGap;
    }

}
