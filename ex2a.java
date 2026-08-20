import java.util.*; 

public class ex2a { 

    static String encrypt(String text, int columns) { 

        text = text.replace(" ", ""); 

        String cipher = ""; 

        for (int col = 0; col < columns; col++) { 

            for (int i = col; i < text.length(); i = i + columns) { 

                cipher = cipher + text.charAt(i); 

            } 

        } 

        return cipher; 

    } 

    public static void main(String[] args) { 

        String text = "DELIVER GOODS AT NOON"; 

        String result = encrypt(text, 5); 

        System.out.println("Cipher: " + result); 

    } 

} 
