package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumContiguousSubarray
{

    public static void main(String[] args)
    {
        final List<Integer> A = new ArrayList<>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));
        System.out.println(maxSum(A));
    }

    public static int maxSum(final List<Integer> A)
    {
        int n = A.size();
        int maxSum = A.get(0);
        int maxEnd = A.get(0);

        for (int i = 1; i < n; i++) {
            if (maxEnd + A.get(i) < A.get(i)) {
                maxEnd = A.get(i);
            } else {
                maxEnd = maxEnd + A.get(i);
            }
            if (maxEnd > maxSum) {
                maxSum = maxEnd;
            }
        }
        return maxSum;
    }
}
