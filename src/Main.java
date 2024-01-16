public class Main {

    ////A
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().toUpperCase();
    }

    /////B
    public static int contarVocales(String string) {
        int count = 0;
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    ///C

    public static String getLongestWord(String string) {
        String[] words = string.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    ///D
    public static int countOccurrences(String string1, String string2) {
        int count = 0;
        int index = 0;
        while (index != -1) {
            index = string1.indexOf(string2, index);
            if (index != -1) {
                count++;
                index += string2.length();
            }
        }
        return count;
    }

    ////E

    public static int countWords(String string) {
        int count = 0;
        String[] words = string.split(" ");
        for (String word : words) {
            count++;
        }
        return count;

    }

///F

    public static String formatPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll("[^0-9]", "");

        if (phoneNumber.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number.");
        }

        phoneNumber = "+" + phoneNumber;

        phoneNumber = phoneNumber.substring(0, 3) + "-" +
                phoneNumber.substring(3, 6) + "-" +
                phoneNumber.substring(6, 10);

        return phoneNumber;
    }


    ///G
    public static void mostrarHistogramaVocales(String cadena) {
        cadena = cadena.toLowerCase();

        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            switch (c) {
                case 'a':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
            }
        }

        System.out.println("Histograma de frecuencias de las vocales:");
        System.out.println("a " + countA + " " + "*".repeat(countA));
        System.out.println("e " + countE + " " + "*".repeat(countE));
        System.out.println("i " + countI + " " + "*".repeat(countI));
        System.out.println("o " + countO + " " + "*".repeat(countO));
        System.out.println("u " + countU + " " + "*".repeat(countU));
    }





}