package bronze.Lv1;

import java.io.*;

public class P10798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] lines = new String[5];

        for (int i = 0; i < 5; i++) {
            lines[i] = br.readLine();
        }

        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            if (lines[i].length() > maxLength) {
                maxLength = lines[i].length();
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int col = 0; col < maxLength; col++) {
            for (int row = 0; row < 5; row++) {
                if (col < lines[row].length()) {
                    result.append(lines[row].charAt(col));
                }
            }
        }
        
        System.out.println(result.toString());
        br.close();
    }
}