package se.soprasteria.codility;

/**
 * Created by Fredrik on 17-03-03.
 */
public class MaxMaxDifference {
    public int solution(int[] a) {

        for (int i = 0; i < a.length; i++) {
            a[i] = validateTooBig(a[i]);
        }

        int first = a[0];
        int last = a[a.length - 1];
        int firstMax = first;
        int lastMax = last;

        int maxPos = 0;


        for (int index = 0; index < a.length - 1; index++) {
            int tempMax = Math.max(firstMax, a[index]);
            if (tempMax > firstMax) {
                firstMax = tempMax;
                maxPos = index;
            }
        }

        for(int index = maxPos + 1; index < a.length; index++) {
            lastMax = Math.max(lastMax, a[index]);
        }

        int diff = Math.max(Math.abs(first - last), Math.abs(first - firstMax));
        diff = Math.max(diff, Math.abs(firstMax - lastMax));
        diff = Math.max(diff, Math.abs(firstMax - last));

        return diff;
    }

    private int validateTooBig(int num) {
        if (Math.abs(num) > 1000000) {
            return 0;
        }
        return num;
    }
}
