public class uc4 {
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        String[] o = {
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
        String[] p = {
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        };
        String[] s = {
                "   ***** ",
                " **      ",
                "**       ",
                " **      ",
                "   ***   ",
                "      ** ",
                "       **",
                "      ** ",
                " *****   "
        };
        String[] space = {
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
        };
        return new CharacterPatternMap[] {
                new CharacterPatternMap('O', o),
                new CharacterPatternMap('P', p),
                new CharacterPatternMap('S', s),
                new CharacterPatternMap(' ', space),
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMap) {
        for (CharacterPatternMap m : charMap) {
            if (m.getCharacter() == ch) {
                return m.getPattern();
            }
        }
        return charMap[charMap.length - 1].getPattern();
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 9; i++) {
            String[] line = new String[message.length()];

            for (int j = 0; j < message.length(); j++) {
                line[j] = getCharacterPattern(message.charAt(j), charMaps)[i];
            }

            System.out.println(String.join(" ", line));
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";

        printMessage(message, charMaps);
    }
}
