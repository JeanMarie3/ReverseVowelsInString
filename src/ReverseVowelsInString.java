//package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseVowelsInString {
    public static void main(String[] args) {
        String str = "apple";
        str = "application";
        char[] arrayChars = str.toCharArray();
        StringBuilder strReverse = new StringBuilder();

        for (int i = arrayChars.length-1; i >= 0; i--) {
//			System.out.println(arrayChars[i]);
            strReverse.append(arrayChars[i]);
        }

        char[] arrayCharsReverse = strReverse.toString().toCharArray();
        for (int i = 0; i < arrayChars.length; i++) {
//			System.out.println(arrayChars[i]);
            switch (arrayChars[i])
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': arrayChars[i] = arrayCharsReverse[i];
            }

        }
        System.out.println(arrayChars);
    }
}
