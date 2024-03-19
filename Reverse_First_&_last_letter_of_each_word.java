//
public class Main {
    public static void main(String[] args) {
        String input = "Hello World!";
        String reversed = reverseFirstLastLetters(input);
        System.out.println(reversed); // Output: oHell dlorW!
    }

    public static String reverseFirstLastLetters(String input) {
        // Split the string into words
        String[] words = input.split("\\s+");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 1) {
                // Reverse the first and last letters of each word
                char[] chars = word.toCharArray();
                char first = chars[0];
                chars[0] = chars[word.length() - 1];
                chars[word.length() - 1] = first;
                result.append(new String(chars)).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        // Trim any extra space at the end and return the modified string
        return result.toString().trim();
    }
}
