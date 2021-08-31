import java.util.Base64;

public class Base64ImgDecode {

    public static void main(String[] args) {
        String imageData = "";
        byte[] decoded = Base64.getDecoder().decode(imageData);
        StringBuilder result = new StringBuilder();
        for (byte aByte : decoded) {
            result.append(String.format("%02x", aByte));
        }
        System.out.println(result.toString());
    }
};
