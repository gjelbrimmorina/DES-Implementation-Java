import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class KeyUtil {

    public static void saveKey(SecretKey key, String fileName) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(key.getEncoded());
        }
    }

    public static SecretKey loadKey(String fileName) throws Exception {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] keyBytes = fis.readAllBytes();
            return new SecretKeySpec(keyBytes, "DES");
        }
    }
}