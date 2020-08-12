package arrays;

import java.util.Arrays;

public class WaveArray
{

    public static void main(String[] args)
    {
        int[] arr = {10, 90, 49, 2, 1, 5, 23};
        int[] waveArray = wave(arr);
        for (int arrayValue : waveArray)
            System.out.print(arrayValue + ", ");
    }

    public static int[] wave(int[] arr)
    {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2)
            swap(arr, i, i + 1);
        return arr;
    }

    public static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
