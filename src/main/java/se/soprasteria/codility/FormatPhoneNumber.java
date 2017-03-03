package se.soprasteria.codility;

/**
 * Created by Fredrik on 17-03-03.
 */
public class FormatPhoneNumber {
    /**
     * Created by alessandro on 2017-02-22.
     */

    // you can write to stdout for debugging purposes, e.g.
    // console.log('this is a debug message');
    public String solution(String phone) {

        phone = phone.replaceAll("\\s+", "");
        phone = phone.replaceAll("-", "");

        if ((phone.length() % 3) == 1) {
            String[] phoneParts = phone.substring(0, phone.length() - 2).split("(?<=\\G.{3})");
            phone = String.join("-", phoneParts) + "-" + phone.substring(phone.length() - 2, phone.length());
            //phone = phone.slice(0, (phone.length - 2)).match("/.{1,3}"/g).join('-') + "-" + phone.substr(-2);

        } else {
            String[] phoneParts = phone.split("(?<=\\G.{3})");
            phone = String.join("-", phoneParts);
        }

        return phone;
    }
}
