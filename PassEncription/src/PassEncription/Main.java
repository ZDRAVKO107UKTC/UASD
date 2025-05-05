package PassEncription;

import java.io.BufferedReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class Main {
    public static void main(String[] args) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));

        System.out.println("Reg password");
        String password = reader.readLine();
        String salt = PasswordHasher.generateSalt();
        String hashedPassword = PasswordHasher.hashPassword(password, salt);
        System.out.println("Hashed password: " + hashedPassword);
        System.out.println("Salt: " + salt);
        System.out.print("\nEnter password to verify: ");
        String inputPassword = reader.readLine();

        boolean isMatch = PasswordHasher.verifyPassword(inputPassword, hashedPassword, salt);
        System.out.println("Password match: " + isMatch);
    }
}
