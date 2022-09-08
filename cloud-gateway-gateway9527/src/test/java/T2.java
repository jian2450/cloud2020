import java.time.ZonedDateTime;

/**
 * @author jian
 * @describe
 * @create 2022-08-26 17:38
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
        //2022-08-26T17:39:46.689+08:00[Asia/Shanghai]
    }
}
