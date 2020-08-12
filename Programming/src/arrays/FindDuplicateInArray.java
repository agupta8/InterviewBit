package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArray
{

    public static void main(String[] args)
    {
        final int[] arr = {1, 2, 5, 5, 1};
        int duplicateNumber = findDuplicate(arr);
        if (duplicateNumber == -1)
            System.out.println("No duplicate number found in array");
        else
            System.out.println("Duplicate Number : " + duplicateNumber);
        System.out.println();
    }

    public static int findDuplicate(final int[] arr)
    {
        Set<Integer> uniqueNumberSet = new HashSet<>();
        for (int arrayValue : arr) {
            if (uniqueNumberSet.contains(arrayValue))
                return arrayValue;
            uniqueNumberSet.add(arrayValue);
        }
        return -1;
    }

}
