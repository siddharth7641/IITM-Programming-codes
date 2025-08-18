/*Write a program that, given a string s as input, prints the string obtained from removing

all duplicate characters from s (that is, retain only the first occurrence of each charac-
ter). The characters should appear in the output in the same order as they appear in s.

Note: str.charAt( arg ) : returns the character present at index arg in the string str
Sample input 1:
eerie
Output:
eri
Sample input 2:
abcd
Output:
abcd

Public test case 1:
Input:
abababa
Output:
ab
Public test case 2:
Input:
aeeffdc
Output:
aefdc
Private test case 1:
Input:
axxyyeedc
Output:
axyedc
*/
import java.util.*;
public class oppe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // Fill the code here
        String newS = s.toLowerCase();
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }

        System.out.println(result.toString());
    }
}

