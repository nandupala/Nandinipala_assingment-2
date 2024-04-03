public class PrintOddPositionChars {
    public static void main(String[] args) {
        String text = "type here to search";
        printCharsAtOddPositions(text);
    }

    private static void printCharsAtOddPositions(String str) {
        str = str.replaceAll("\\s", ""); // Remove white spaces
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                char character = str.charAt(i);
                System.out.print(character + " ");
            }
        }
    }
}
