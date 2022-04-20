import org.checkerframework.checker.dividebyzero.qual.*;

// Given tests but for long types
class LongFoo {

    public static void f() {
        long one  = 1;
        long zero = 0;
        // :: error: divide.by.zero
        long x    = one / zero;
        long y    = zero / one;
        // :: error: divide.by.zero
        long z    = x / y;
        String s = "hello";
    }

    public static void g(long y) {
        if (y == 0) {
            // :: error: divide.by.zero
            long x = 1 / y;
        } else {
            long x = 1 / y;
        }

        if (y != 0) {
            long x = 1 / y;
        } else {
            // :: error: divide.by.zero
            long x = 1 / y;
        }

        if (!(y == 0)) {
            long x = 1 / y;
        } else {
            // :: error: divide.by.zero
            long x = 1 / y;
        }

        if (!(y != 0)) {
            // :: error: divide.by.zero
            long x = 1 / y;
        } else {
            long x = 1 / y;
        }

        if (y < 0) {
            long x = 1 / y;
        }

        if (y <= 0) {
            // :: error: divide.by.zero
            long x = 1 / y;
        }

        if (y > 0) {
            long x = 1 / y;
        }

        if (y >= 0) {
            // :: error: divide.by.zero
            long x = 1 / y;
        }
    }

    public static void h() {
        long zero_the_hard_way = 0 + 0 - 0 * 0;
        // :: error: divide.by.zero
        long x = 1 / zero_the_hard_way;

        long one_the_hard_way = 0 * 1 + 1;
        long y = 1 / one_the_hard_way;
    }

    public static void l() {
        // :: error: divide.by.zero
        long a = 1 / (1 - 1);
        long y = 1;
        // :: error: divide.by.zero
        long x = 1 / (y - y);
        long z = y-y;
        // :: error: divide.by.zero
        long k = 1/z;
    }
}
