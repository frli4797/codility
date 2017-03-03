package se.soprasteria.codility;

/**
 * Created by Fredrik on 17-03-03.
 */
public class DecimalReprZip {

    public int solution(int a, int b) {
        char[] ping = (Integer.toString(a)).toCharArray();
        char[] pong = (Integer.toString(b)).toCharArray();
        String zippy = "";

        for (int i = 0; i < Math.max(ping.length, pong.length); i++) {
            if (ping.length > i)
                zippy += ping[i];
            if (pong.length > i)
                zippy += pong[i];
        }

        if (Long.parseLong(zippy) > 100000000) {
            return -1;
        }

        int output = Integer.parseInt(zippy);

        return output;
    }
}
