
/*
Q2. First Non-Repeating Character – Moderate

Problem:
Given a string, print the first character that occurs exactly once,
preserving case.

If every character repeats, print None.

Ignore spaces when counting, but return the original character.

Input:
One line of text.

Expected Output:
First non-repeating character, or None.

Test Case 1:
Input:
swiss

Output:
w

Test Case 2:
Input:
aabbcc

Output:
None
*/

import java.util.*;
class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character, Integer> frequency = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            }
        }
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && frequency.get(ch) == 1) {
                System.out.println(ch);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("None");
        }
        sc.close();
    }
}
