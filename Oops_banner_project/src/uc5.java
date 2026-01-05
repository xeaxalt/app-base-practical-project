import java.util.HashMap;

public class uc5 {

    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });
        charMap.put('P', new String[] {
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        });
        charMap.put('S', new String[] {
                "   ***** ",
                " **      ",
                "**       ",
                " **      ",
                "   ***   ",
                "      ** ",
                "       **",
                "      ** ",
                " *****   "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int height = charMap.get('O').length;

        for (int i = 0; i < height; i++) {
            String[] line = new String[message.length()];
            for (int j = 0; j < message.length(); j++) {
                char ch = message.charAt(j);
                line[j] = charMap.get(ch)[i];
            }
            System.out.println(String.join(" ", line));
        }
    }
    
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}
