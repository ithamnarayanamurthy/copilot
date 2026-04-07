public class First_repeated_character_in_a_string {
    public static void main(String[] args) {
        String str = "programming";
        char repeatedChar = findFirstRepeatedCharacter(str);
        
        if (repeatedChar != '\0') {
            System.out.println("First repeated character: " + repeatedChar);
        } else {
            System.out.println("No repeated characters found.");
        }
    }
    
    public static char findFirstRepeatedCharacter(String str) {
        java.util.HashSet<Character> seenChars = new java.util.HashSet<>();
        
        for (char c : str.toCharArray()) {
            if (seenChars.contains(c)) {
                return c; // Return the first repeated character
            }
            seenChars.add(c);
        }
        
        return '\0'; // Return null character if no repeated character is found
    }
}
