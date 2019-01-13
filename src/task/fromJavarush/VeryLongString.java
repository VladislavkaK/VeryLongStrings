package task.fromJavarush;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class VeryLongString {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(br.readLine());
        }
        String max = strings.get(0);
        int lenMax = max.length();
        for (int i = 0; i < strings.size(); i++) {

            String str = strings.get(i);
            int lenStr = str.length();

            if (lenStr > lenMax) {
                lenMax = lenStr;
            }

        }

        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            int lenStr = str.length();

            if (lenStr == lenMax) {
                System.out.println(strings.get(i));
            }
        }
    }
}
