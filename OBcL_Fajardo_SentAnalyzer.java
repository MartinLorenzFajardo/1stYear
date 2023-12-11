// Martin Lorenz S. Fajardo
// BIT112L OBcL
// November 30, 2023

import java.io.*;

public class OBcL_Fajardo_SentAnalyzer {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("=====COUNTER=====");
		System.out.print("\n");

        try {
            System.out.println("Enter a sentence:");
            String input = reader.readLine();

            int vowel = 0;
            int space = 0;
            int word = 0;
            int character = 0;

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                // vowel
				switch (currentChar) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowel++;
                        break;
                }

                // space
                if (currentChar == ' ') {
                    space++;
                }

                // character
                character++;
            }

            // words
            String[] words = input.split("\\s+");
            word = words.length;

            // output
			System.out.println("-------------------------\n");
            System.out.println("Vowels: " + vowel);
            System.out.println("Spaces: " + space);
            System.out.println("Words: " + word);
            System.out.println("Characters: " + character);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}