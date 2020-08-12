package arrays;

public class TripletsWithSumInRange
{

    public static void main(String[] args)
    {
        String[] arr = {"0.6", "0.7", "0.8", "1.2", "0.4"};
        System.out.println(tripletsWithSum(arr));
    }

    public static int tripletsWithSum(String[] arr)
    {
        double a = Double.valueOf(arr[0]);
        double b = Double.valueOf(arr[1]);
        double c = Double.valueOf(arr[2]);
        for (int i = 3; i < arr.length; i++) {
            if (a + b + c > 1 && a + b + c < 2)
                return 1;
            else if (a + b + c > 2) {
                if (a > b && a > c)
                    a = Double.valueOf(arr[i]);
                else if (b > a && b > c)
                    b = Double.valueOf(arr[i]);
                else if (c > a && c > b)
                    c = Double.valueOf(arr[i]);
            } else {
                if (a < b && a < c)
                    a = Double.valueOf(arr[i]);
                else if (b < a && b < c)
                    b = Double.valueOf(arr[i]);
                else if (c < a && c < b)
                    c = Double.valueOf(arr[i]);
            }
        }

        if (a + b + c > 1 && a + b + c < 2)
            return 1;
        else
            return 0;
    }
}
