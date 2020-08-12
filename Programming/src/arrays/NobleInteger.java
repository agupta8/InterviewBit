package arrays;

import java.util.Arrays;

public class NobleInteger
{

    public static void main(String[] args)
    {
        int[] arr = {3, 1, 2, 3};
        System.out.println(noble(arr));
    }

    public static int noble(int[] arr)
    {
        Arrays.sort(arr);
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i + 1])
                continue;
            if (arr[i] == n - i)
                return arr[i];
        }
        if (arr[n] == 0)
            return arr[n];

        return -1;
    }
}
