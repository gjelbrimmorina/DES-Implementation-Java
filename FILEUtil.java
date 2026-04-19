import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {

    public static void encryptFile(String inputFile, String outputFile, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        CipherOutputStream cos = new CipherOutputStream(fos, cipher);

byte[] buffer = new byte[4096];
int bytesRead;

while ((bytesRead = fis.read(buffer)) != -1) {
    cos.write(buffer, 0, bytesRead);
}

cos.close();

        fis.close();
        fos.close();
    }

    public static void decryptFile(String inputFile, String outputFile, SecretKey key) throws Exception {
Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key);

        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        CipherOutputStream cos = new CipherOutputStream(fos, cipher);

byte[] buffer = new byte[4096];
int bytesRead;

while ((bytesRead = fis.read(buffer)) != -1) {
    cos.write(buffer, 0, bytesRead);
}

cos.close();
        fis.close();
        fos.close();
    }
}