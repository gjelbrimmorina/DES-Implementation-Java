import javax.crypto.SecretKey;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SecretKey key = DESUtil.generateKey();

        while (true) {
            System.out.println("\n--- DES MENU ---");
            System.out.println("1. Encrypt Text");
            System.out.println("2. Decrypt Text");
            System.out.println("3. Encrypt File");
            System.out.println("4. Decrypt File");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String text = scanner.nextLine();
                    String encrypted = DESUtil.encrypt(text, key);
                    System.out.println("Encrypted: " + encrypted);
                    break;

                case 2:
                    System.out.print("Enter encrypted text: ");
                    String encText = scanner.nextLine();
                    String decrypted = DESUtil.decrypt(encText, key);
                    System.out.println("Decrypted: " + decrypted);
                    break;

                case 3:
                    System.out.print("Input file path: ");
                    String inFile = scanner.nextLine();
                    System.out.print("Output file path: ");
                    String outFile = scanner.nextLine();
                    FileUtil.encryptFile(inFile, outFile, key);
                    System.out.println("File encrypted.");
                    break;

                case 4:
                    System.out.print("Encrypted file path: ");
                    String encFile = scanner.nextLine();
                    System.out.print("Output file path: ");
                    String decFile = scanner.nextLine();
                    FileUtil.decryptFile(encFile, decFile, key);
                    System.out.println("File decrypted.");
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}