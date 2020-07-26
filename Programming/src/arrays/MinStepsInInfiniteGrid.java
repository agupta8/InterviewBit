package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MinStepsInInfiniteGrid
{

    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(0, 1, 1));
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(0, 1, 2));
        System.out.println(minSteps(A, B));
    }

    public static int minSteps(ArrayList<Integer> A, ArrayList<Integer> B)
    {
        int ans = 0;
        for (int i = 1; i < A.size(); i++) {
            int x = Math.abs(A.get(i) - A.get(i - 1));
            int y = Math.abs(B.get(i) - B.get(i - 1));
            ans += x > y ? x : y;
        }
        return ans;
    }

}
