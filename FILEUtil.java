import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {

    public static void encryptFile(String inputFile, String outputFile, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        byte[] buffer = new byte[64];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            byte[] output = cipher.update(buffer, 0, bytesRead);
            if (output != null) fos.write(output);
        }

        byte[] finalBytes = cipher.doFinal();
        if (finalBytes != null) fos.write(finalBytes);

        fis.close();
        fos.close();
    }

    public static void decryptFile(String inputFile, String outputFile, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, key);

        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        byte[] buffer = new byte[64];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            byte[] output = cipher.update(buffer, 0, bytesRead);
            if (output != null) fos.write(output);
        }

        byte[] finalBytes = cipher.doFinal();
        if (finalBytes != null) fos.write(finalBytes);

        fis.close();
        fos.close();
    }
}