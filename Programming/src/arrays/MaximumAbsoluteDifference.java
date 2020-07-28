package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAbsoluteDifference
{

    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 3, -1));
        System.out.println(maxAbsoluteDiff(A));
    }

    public static int maxAbsoluteDiff(ArrayList<Integer> A)
    {
        int maxDiff = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                maxDiff = Math.max(maxDiff, Math.abs(A.get(i) - A.get(j)) + Math.abs(i - j));
            }
        }
        return maxDiff;
    }
}
