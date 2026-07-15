import java.util.ArrayList;

public class StringOperations {

    public static ArrayList<String> performStringOperations(String s1, String s2) {
        ArrayList<String> resultList = new ArrayList<>();

        // ---------------------------------------------------------------------
        // Operation 1: Character in each alternate index of S1 replaced with S2
        // ---------------------------------------------------------------------
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                op1.append(s2);
            } else {
                op1.append(s1.charAt(i));
            }
        }
        resultList.add(op1.toString());

        // ---------------------------------------------------------------------
        // Helper count for Operations 2 & 3: Find occurrences of S2 in S1
        // ---------------------------------------------------------------------
        int firstIdx = s1.indexOf(s2);
        int lastIdx = s1.lastIndexOf(s2);
        boolean appearsMoreThanOnce = (firstIdx != -1 && firstIdx != lastIdx);

        // ---------------------------------------------------------------------
        // Operation 2: Replace last occurrence with reversed S2, else S1 + S2
        // ---------------------------------------------------------------------
        if (appearsMoreThanOnce) {
            String reversedS2 = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, lastIdx) + reversedS2 + s1.substring(lastIdx + s2.length());
            resultList.add(op2);
        } else {
            resultList.add(s1 + s2);
        }

        // ---------------------------------------------------------------------
        // Operation 3: Delete first occurrence of S2 in S1, else return S1
        // ---------------------------------------------------------------------
        if (appearsMoreThanOnce) {
            String op3 = s1.substring(0, firstIdx) + s1.substring(firstIdx + s2.length());
            resultList.add(op3);
        } else {
            resultList.add(s1);
        }

        // ---------------------------------------------------------------------
        // Operation 4: Divide S2 into two halves and append to front and back
        // ---------------------------------------------------------------------
        int n = s2.length();
        int midPoint;
        if (n % 2 == 0) {
            midPoint = n / 2;
        } else {
            midPoint = (n / 2) + 1; // Handle odd length constraint: (n/2)+1
        }
        String firstHalf = s2.substring(0, midPoint);
        String secondHalf = s2.substring(midPoint);
        String op4 = firstHalf + s1 + secondHalf;
        resultList.add(op4);

        // ---------------------------------------------------------------------
        // Operation 5: Replace characters in S1 present in S2 with '*'
        // ---------------------------------------------------------------------
        StringBuilder op5 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            // Check if character exists anywhere inside S2 string
            if (s2.indexOf(ch) != -1) {
                op5.append('*');
            } else {
                op5.append(ch);
            }
        }
        resultList.add(op5.toString());

        return resultList;
    }

    public static void main(String[] args) {
        String s1 = "JAVAJAVA";
        String s2 = "VA";

        System.out.println("S1 = \"" + s1 + "\"");
        System.out.println("S2 = \"" + s2 + "\"");

        ArrayList<String> output = performStringOperations(s1, s2);
        
        System.out.println("\nOutput: " + output);
    }
}
