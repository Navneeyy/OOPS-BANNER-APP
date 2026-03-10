/**
 * OOPSBannerApp – Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap thereby enhancing code organization and modularity.
 *
 * @author Developer
 * @version 8.0
 */

// Extend the User Story 7 to utilize advanced Object-Oriented Programming concepts
// such as the Collections Framework to manage character patterns in a more flexible
// and efficient manner. The application retrieves and displays the "OOPS" banner
// using these mappings.

// Key Requirements:
// 1. Use HashMap to store ASCII art patterns for characters
// 2. Create methods to generate and retrieve character patterns
// 3. Retrieve and display patterns for the message "OOPS"
// 4. Implement modular and reusable character pattern system
// 5. Utilize Collections Framework for pattern management

// Hint:…

// Drawback of this approach is that the character patterns are still hardcoded…

import java.util.HashMap;

public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for 'O' (5 lines)
        charMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        // Pattern for 'P' (5 lines)
        charMap.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        // Pattern for 'S' (5 lines)
        charMap.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });

        // Optionally add space if needed, but not necessary for "OOPS"
        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = charMap.get(message.charAt(0)).length; // assume all same height
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                if (pattern != null) {
                    sb.append(pattern[line]);
                } else {
                    // If character not found, print spaces
                    sb.append("     "); // placeholder width
                }
                sb.append(" "); // space between characters
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}