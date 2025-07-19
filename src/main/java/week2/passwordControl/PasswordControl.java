package week2.passwordControl;

import java.util.Scanner;

public class PasswordControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan Parola alınır
        System.out.println("Parola giriniz: ");
        String userInput = scanner.nextLine();

        // Parola isValidPassword() metodu aracılığıyla doğrulanır
        System.out.println(isValidPassword(userInput) ? "Geçerli Parola" : "Geçersiz Parola");

        scanner.close();
    }

    /***
     * Parolanın kurallara uygun olup olmadığını kontrol eder.
     *
     * @param password Kullanıcıdan alınan parola
     * @return Parola kurallara uyuyorsa true,değilse false
     */
    public static boolean isValidPassword(String password) {
        return password.length() >= 8 &&
                !password.contains(" ") &&
                Character.isUpperCase(password.charAt(0)) &&
                password.charAt(password.length() - 1) == '?';
    }
}
