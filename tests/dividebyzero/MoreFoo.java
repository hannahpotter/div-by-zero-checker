import org.checkerframework.checker.dividebyzero.qual.*;

// Some added test cases - trying to target operators and areas in the transfer functions not targetted
// by the other tests
class MoreFoo {

    /* Some tests to check other division/mod operators */

    public static void f() {
        int one  = 1;
        int zero = 0;
        int x = 1;
        // :: error: divide.by.zero
        x /= zero;
        int y = 0;
        y /= one;
        // :: error: divide.by.zero
        x /= y;
        String s = "hello";
    }

    public static void f1() {
        int one  = 1;
        int zero = 0;
        // :: error: divide.by.zero
        int x    = one % zero;
        int y    = zero % one;
        // :: error: divide.by.zero
        int z    = x % y;
        String s = "hello";
    }

    public static void f2() {
        int one  = 1;
        int zero = 0;
        int x = 1;
        // :: error: divide.by.zero
        x %= zero;
        int y = 0;
        y %= one;
        // :: error: divide.by.zero
        x %= y;
        String s = "hello";
    }

    /* Some tests to check other refinements */

    public static void pos(int y) {
        if (y == 1) {
            int x = 1 / y;
        } else {
            // :: error: divide.by.zero
            int x = 1 / y;
        }

        if (y != 1) {
            // :: error: divide.by.zero
            int x = 1 / y;
        } else {
            int x = 1 / y;
        }

        if (!(y == 1)) {
            // :: error: divide.by.zero
            int x = 1 / y;
        } else {
            int x = 1 / y;
        }

        if (!(y != 1)) {
            int x = 1 / y;
        } else {
            // :: error: divide.by.zero
            int x = 1 / y;
        }

        if (y < 1) {
            // :: error: divide.by.zero
            int x = 1 / y;
        }

        if (y <= 1) {
            // :: error: divide.by.zero
            int x = 1 / y;
        }

        if (y > 1) {
            int x = 1 / y;
        }

        if (y >= 1) {
            int x = 1 / y;
        }
    }

    public static void neg(int y) {
        if (y == -1) {
            int x = 1 / y;
        } else {
            // :: error: divide.by.zero
            int x = 1 / y;
        }

        if (y != -1) {
            // :: error: divide.by.zero
            int x = 1 / y;
        } else {
            int x = 1 / y;
        }

        if (!(y == -1)) {
            // :: error: divide.by.zero
            int x = 1 / y;
        } else {
            int x = 1 / y;
        }

        if (!(y != -1)) {
            int x = 1 / y;
        } else {
            // :: error: divide.by.zero
            int x = 1 / y;
        }

        if (y < -1) {
            int x = 1 / y;
        }

        if (y <= -1) {
            int x = 1 / y;
        }

        if (y > -1) {
            // :: error: divide.by.zero
            int x = 1 / y;
        }

        if (y >= -1) {
            // :: error: divide.by.zero
            int x = 1 / y;
        }
    }

    public static void nonZero(int y, int z) {
        if (z != 0) {
            if (y == z) {
                int x = 1 / y;
            } else {
                // :: error: divide.by.zero
                int x = 1 / y;
            }

            if (y != z) {
                // :: error: divide.by.zero
                int x = 1 / y;
            } else {
                int x = 1 / y;
            }

            if (!(y == z)) {
                // :: error: divide.by.zero
                int x = 1 / y;
            } else {
                int x = 1 / y;
            }

            if (!(y != z)) {
                int x = 1 / y;
            } else {
                // :: error: divide.by.zero
                int x = 1 / y;
            }

            if (y < z) {
                // :: error: divide.by.zero
                int x = 1 / y;
            }

            if (y <= z) {
                // :: error: divide.by.zero
                int x = 1 / y;
            }

            if (y > z) {
                // :: error: divide.by.zero
                int x = 1 / y;
            }

            if (y >= z) {
                // :: error: divide.by.zero
                int x = 1 / y;
            }
        }
    }
}
