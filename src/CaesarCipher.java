import java.util.Scanner;

public class CaesarCipher {

    private static final int ALPHABET_SIZE = 26;

    public static String encrypt(String message) {
        message = message.toUpperCase();

        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);

            if (Character.isLetter(character)) {
                int position = character - 'A';

                position += 3;

                if (position >= ALPHABET_SIZE) {
                    position -= ALPHABET_SIZE;
                }

                ciphertext.append((char) ('A' + position));
            } else {
                ciphertext.append(character);
            }
        }

        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext) {
        ciphertext = ciphertext.toUpperCase();

        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i++) {
            char character = ciphertext.charAt(i);

            if (Character.isLetter(character)) {
                int position = character - 'A';

                position -= 3;

                if (position < 0) {
                    position += ALPHABET_SIZE;
                }

                plaintext.append((char) ('A' + position));
            } else {
                plaintext.append(character);
            }
        }

        return plaintext.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el mensaje:");
        String message = scanner.nextLine();

        String ciphertext = encrypt(message);

        String plaintext = decrypt(ciphertext);

        System.out.println("Mensaje cifrado: " + ciphertext);
        System.out.println("Mensaje descifrado: " + plaintext);
    }
}
