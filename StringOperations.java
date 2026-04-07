public class StringOperations {
    public static void main(String[] args) {
    String str = "Hello World";
    
    // Length
    System.out.println("Length: " + str.length());
    
    // charAt
    System.out.println("Character at index 0: " + str.charAt(0));
    
    // substring
    System.out.println("Substring(0,5): " + str.substring(0, 5));
    
    // indexOf
    System.out.println("Index of 'o': " + str.indexOf('o'));
    
    // toUpperCase & toLowerCase
    System.out.println("Upper: " + str.toUpperCase());
    System.out.println("Lower: " + str.toLowerCase());
    
    // contains
    System.out.println("Contains 'World': " + str.contains("World"));
    
    // startsWith & endsWith
    System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
    System.out.println("Ends with 'World': " + str.endsWith("World"));
    
    // replace
    System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
    
    // split
    String[] words = str.split(" ");
    String[] str4 = "narayana".split("");
    
    //System.out.println("Comma separated: " + String.join(",", str4.split("")));

    System.out.println("Split: " + java.util.Arrays.toString(words));
    
    // trim
    String str2 = "  Hello  ";
    System.out.println("Trim: '" + str2.trim() + "'");
    
    // equals & equalsIgnoreCase
    System.out.println("Equals 'Hello World': " + str.equals("Hello World"));
    System.out.println("EqualsIgnoreCase: " + str.equalsIgnoreCase("hello world"));
    
    // concat
    System.out.println("Concat: " + str.concat("!"));
   }
}
