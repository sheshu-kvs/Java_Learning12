package RealProbelmsonHashes1;

import java.util.Arrays;
import java.util.HashSet;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String str = "qqwqwwedei";
        String result = partitionIntoPalindromes(str);
        System.out.println(result);
    }
    
    public static String partitionIntoPalindromes(String s) {
        int n = s.length();
        
        //    j=0   j=1   j=2
        //    i=0: F     F     F
        //    i=1: F     F     F  
        //    i=2: F     F     F

    //  For staring from the lastindex
    // String str = "qqwqwwedei";
    // for (int i = n-1; i >= 0; i--) {
    //         for (int j = i; j < n; j++) {
    //             // "qq" | "wqw" | "w" | "ede" | "i"

    // for the first  index
    // String str = "qqwqwwedei";
    //  for (int i = 0; i < n-1; i++) {
    //         for (int j = i; j < n; j++) {
    //             // "qq" | "w" | "q" | "ww" | "e" | "d" | "e" | "i" 
        boolean[][] isPalindrome = new boolean[n][n];
        
        // Fill the table from bottom to top
        for (int i = n-1; i >=0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 2) {
                        // check single char and the both are palin
                        isPalindrome[i][j] = true;
                    } else {
                        // check the first index and the last index is same is also the palin
                        isPalindrome[i][j] = isPalindrome[i + 1][j - 1];
                    }
                }
            }
        }

      HashSet<String> h1=new HashSet<>();

      for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            if(isPalindrome[i][j]){
                String palin=s.substring(i, j+1);
                h1.add(palin);
            }
        }
      }
    //   System.out.println(h1);
    // Arrays.valueOf(h1);
    // for the Sorting we used
    // int lengthHashSet=h1.size();
    // String []s1=new String[lengthHashSet];
    // h1.toArray(s1);
    // Arrays.sort(s1);
    // return "Palindrome Strings"+Arrays.toString(s1);
    System.out.println(" ");
    System.out.println("Entered String: "+s);
    return "Palindrome Strings"+h1;

    }
}




// to collect all the palindromes








// =============Dry Run======================

// Step 1: Building the Palindrome Table
// We create a 3x3 table isPalindrome[i][j] where i is start index and j is end index.

// Initial table (all false):

// text
//    j=0   j=1   j=2
// i=0: F     F     F
// i=1: F     F     F  
// i=2: F     F     F
// Now we fill the table from bottom to top:

// When i = 2 (last row):
// j = 2: i=2, j=2 → single char 'b' → isPalindrome[2][2] = true

// Table after i=2:

// text
//    j=0   j=1   j=2
// i=0: F     F     F
// i=1: F     F     F  
// i=2: F     F     T
// When i = 1:
// j = 1: i=1, j=1 → single char 'a' → isPalindrome[1][1] = true

// j = 2: i=1, j=2 → 'a' vs 'b' → different chars → remains false

// Table after i=1:

// text
//    j=0   j=1   j=2
// i=0: F     F     F
// i=1: F     T     F  
// i=2: F     F     T
// When i = 0:
// j = 0: i=0, j=0 → single char 'a' → isPalindrome[0][0] = true

// j = 1: i=0, j=1 → 'a' vs 'a' → same, and j-i=1 < 2 → isPalindrome[0][1] = true

// j = 2: i=0, j=2 → 'a' vs 'b' → different → remains false

// Final table:

// text
//    j=0   j=1   j=2
// i=0: T     T     F
// i=1: F     T     F  
// i=2: F     F     T
// Step 2: Partitioning into Palindromes
// Now we use the table to split the string:

// First iteration (start = 0):

// Check positions j=0 to j=2:

// j=0: isPalindrome[0][0] = true → end = 0

// j=1: isPalindrome[0][1] = true → end = 1 (longer palindrome)

// j=2: isPalindrome[0][2] = false → skip

// So we take substring(0, 2) = "aa"

// Result so far: "aa"

// New start = 2

// Second iteration (start = 2):

// Check positions j=2 to j=2:

// j=2: isPalindrome[2][2] = true → end = 2

// So we take substring(2, 3) = "b"

// Result: "aa" | "b"

// New start = 3 (exit loop)

// Final Output:



// 1. String palindrome = s.substring(start, end + 1);
// java
// String palindrome = s.substring(start, end + 1);
// What it does: Extracts a substring from the original string

// start: The beginning index of the palindrome we found

// end: The ending index of the palindrome we found

// end + 1: The substring method goes up to but does not include this index

// Example: If start = 0 and end = 1, this extracts characters at positions 0 and 1 → "aa"

// 2. if (result.length() > 0) { result.append(" | "); }
// java
// if (result.length() > 0) {
//     result.append(" | ");
// }
// What it does: Adds a separator " | " between palindromes

// result.length() > 0: Checks if this is NOT the first palindrome being added

// Why: We don't want " | " before the first palindrome

// Example:

// First palindrome: no separator → "aa"

// Second palindrome: adds " | " → "aa" | "b"

// 3. result.append("\"").append(palindrome).append("\"");
// java
// result.append("\"").append(palindrome).append("\"");
// What it does: Adds the palindrome with quotation marks around it

// "\"": This is how we write a double quote " in Java (backslash escapes it)

// Example: For palindrome "aa", this becomes "aa"

// 4. start = end + 1;
// java
// start = end + 1;
// What it does: Moves the starting point to the character AFTER the current palindrome

// Why: So we can process the next part of the string

// Example: If we just processed positions 0-1, we set start = 2 to process from position 2 next

// 5. return result.toString();
// java
// return result.toString();
// What it does: Converts the StringBuilder to a regular String and returns it

// Why: The method signature says it returns a String, not a StringBuilder

// Visual Example with "aab":



/*
   *   //     // Step 2: Now partition the string into palindromic substrings
              StringBuilder result = new StringBuilder();
              int start = 0;
        
        while (start < n) {
            // Find the longest palindrome starting from 'start'
            int end = start;
            for (int j = start; j < n; j++) {
                if (isPalindrome[start][j]) {
                    end = j; // here we updating the valid substring
                }
            }
            
            //adding the values to stringBuilder
            String palindrome = s.substring(start, end + 1);
            if (result.length() > 0) {
                // it should check values always greater than 0
                // like ex: for "aa" it will not add the cut(|) it will add the cut values > 0
                result.append(" | ");
            }
            result.append("\"").append(palindrome).append("\"");
            
            
            start = end + 1;  //move the nextValue
        }
        
        return result.toString();
    }

      StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome[i][j]) {
                    String palindrome = s.substring(i, j + 1);
                    if (result.length() > 0) {
                        result.append("|");
                    }
                    result.append(palindrome);
                }
            }
        }
        System.out.println(" ");
      return result.toString();
   */