import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by ycao on 9/11/2015.
 */
public class SHA1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("SHA1 value: " + DigestUtils.shaHex(str));
        System.out.println("MD5 value: " + DigestUtils.md5Hex(str));
    }
}
