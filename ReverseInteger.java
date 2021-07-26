package acepta.el.reto;

/**
 *
 * @author Alfred
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        int rever = 0;
        while (x < 10) {
            int rest = x % 10;
            rever = rever * 10 + rest;
            x /= 10;
        }
        return rever;
    }
}
