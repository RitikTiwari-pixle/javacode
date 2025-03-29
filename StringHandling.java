public class StringHandling { 
    public static void main(String[] args) { 
        // Initialize strings 
        String str1 = "Hello"; 
        String str2 = "RITIK"; 
         
        // Concatenation 
        String concatenated = str1 + " " + str2; 
        System.out.println("Concatenated String: " + concatenated); 
         
        // String length 
        int length = concatenated.length(); 
        System.out.println("Length of concatenated string: " + length); 
         
        // Character extraction 
        char charAt5 = concatenated.charAt(5); 
        System.out.println("Character at index 5: " + charAt5); 
         
        // Substring extraction 
        String substring = concatenated.substring(6, 11); 
        System.out.println("Substring from index 6 to 10: " + substring); 
         
        // String comparison 
        boolean isEqual = str1.equals(str2); 
        System.out.println("Are str1 and str2 equal? " + isEqual); 
         
        // String comparison ignoring case 
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("HELLO"); 
        System.out.println("Is str1 equal to 'HELLO' ignoring case? " + 
isEqualIgnoreCase); 
         
        // Converting to uppercase 
        String upperCaseStr1 = str1.toUpperCase(); 
        System.out.println("str1 in uppercase: " + upperCaseStr1); 
         
        // Converting to lowercase 
        String lowerCaseStr2 = str2.toLowerCase(); 
        System.out.println("str2 in lowercase: " + lowerCaseStr2); 
         
        // Trimming whitespace 
        String str3 = "   Java Programming   "; 
        String trimmedStr3 = str3.trim(); 
        System.out.println("Trimmed str3: '" + trimmedStr3 + "'"); 
         
        // Replacing characters 
        String replacedStr = concatenated.replace('o', 'a'); 
        System.out.println("String after replacing 'o' with 'a': " + 
replacedStr); 
    } 
}