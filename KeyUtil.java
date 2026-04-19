import javax.crypto.SecretKey;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class KeyUtil {

    public static void saveKey(SecretKey key, String fileName) throws Exception {
        FileOutputStream fos = new FileOutputStream(fileName);
        byte[] keyBytes = key.getEncoded();
        fos.write(keyBytes);
        fos.close();
    }

    public static SecretKey loadKey(String fileName) throws Exception {
        FileInputStream fis = new FileInputStream(fileName);
        byte[] keyBytes = fis.readAllBytes();
        fis.close();

        return new javax.crypto.spec.SecretKeySpec(keyBytes, "DES");
    }
}