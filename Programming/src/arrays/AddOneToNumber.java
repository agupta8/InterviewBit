package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber
{

    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 1, 2, 9));
        System.out.println(addOne(A));
    }

    public static ArrayList<Integer> addOne(ArrayList<Integer> A)
    {
        int carry = 0;
        int sum = 0;
        if (A.get(0) == 0)
            A.remove(0);
        for (int i = A.size() - 1; i >= 0; i--) {
            int n = A.get(i);
            sum = n + carry;
            if (i == A.size() - 1) {
                sum = sum + 1;
            }
            carry = sum / 10;
            sum = sum % 10;
            A.set(i, sum);
        }
        if (carry != 0)
            A.add(0, 1);
        return A;
    }
}
