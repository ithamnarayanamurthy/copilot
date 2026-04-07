public class StringReverse {
    public static String stringRever(String str){
        String rev = "";
        char[] arr = str.toCharArray();
        for(int i = arr.length-1; i>=0; i--){
            rev += arr[i];
        }
        return rev;
    }
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original string: "+str);
        System.out.println("Reverse string: "+stringRever(str));
    }
}
