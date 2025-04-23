public class RandomCodeGenerator {
    private static final int NUMBERS = 10;
    private static final int WORDS = 5;

    public static void main(String[] args) {
        // Generate random numbers between 0 and 99
        System.out.println("Random Numbers: " + generateNumbers());

        // Generate random words with a specified length
        String word = generateWords(3);
        System.out.println("Generated Word: " + word);
    }

    private static String generateNumbers() {
        Random random = new Random();
        return Integer.toString(random.nextInt(100));
    }

    private static String generateWords(int length) {
        StringBuilder builder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            builder.append(char(random.nextInt(26 + 3)));
        }
        return builder.toString();
    }
}
