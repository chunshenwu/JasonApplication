package com.gmboy.android.toollibrary;

import junit.framework.Assert;

public class AssertUtil {

    private static String TAG = "AssertUtil";
    private static final boolean IN_DEVELOP = false;

    public static void assertTrue(String message, boolean condition) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertTrue(message, condition);
    }

    public static void assertTrue(boolean condition) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertTrue(condition);
    }

    public static void assertFalse(String message, boolean condition) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertFalse(message, condition);
    }

    public static void assertFalse(boolean condition) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertFalse(condition);
    }

    public static void fail(String message) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.fail(message);
    }

    public static void fail() {
        if (IN_DEVELOP) {
            return;
        }

        Assert.fail();
    }

    public static void assertEquals(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(message, expected, actual);
    }

    public static void assertEquals(Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(expected, actual);
    }

    public static void assertEquals(String message, String expected, String actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(message, expected, actual);
    }

    public static void assertEquals(String expected, String actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(expected, actual);
    }

    public static void assertEquals(String message, double expected, double actual, double delta) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(message, expected, actual, delta);
    }

    public static void assertEquals(double expected, double actual, double delta) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(expected, actual, delta);
    }

    public static void assertEquals(String message, float expected, float actual, float delta) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(message, expected, actual, delta);
    }

    public static void assertEquals(float expected, float actual, float delta) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(expected, actual, delta);
    }

    public static void assertEquals(String message, long expected, long actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(message, expected, actual);
    }

    public static void assertEquals(long expected, long actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(expected, actual);
    }

    public static void assertEquals(String message, boolean expected, boolean actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(message, expected, actual);
    }

    public static void assertEquals(boolean expected, boolean actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(expected, actual);
    }

    public static void assertEquals(String message, byte expected, byte actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(message, expected, actual);
    }

    public static void assertEquals(byte expected, byte actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(expected, actual);
    }

    public static void assertEquals(String message, char expected, char actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(message, expected, actual);
    }

    public static void assertEquals(char expected, char actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(expected, actual);
    }

    public static void assertEquals(String message, short expected, short actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(message, expected, actual);
    }

    public static void assertEquals(short expected, short actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(expected, actual);
    }

    public static void assertEquals(String message, int expected, int actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(message, expected, actual);
    }

    public static void assertEquals(int expected, int actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertEquals(expected, actual);
    }

    public static void assertNotNull(Object object) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertNotNull(object);
    }

    public static void assertNotNull(String message, Object object) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertNotNull(message, object);
    }

    public static void assertNull(Object object) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertNull(object);
    }

    public static void assertNull(String message, Object object) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertNull(message, object);
    }

    public static void assertSame(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertSame(message, expected, actual);
    }

    public static void assertSame(Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertSame(expected, actual);
    }

    public static void assertNotSame(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertNotSame(message, expected, actual);
    }

    public static void assertNotSame(Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.assertNotSame(expected, actual);
    }

    public static void failSame(String message) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.failSame(message);
    }

    public static void failNotSame(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.failNotSame(message, expected, actual);
    }

    public static void failNotEquals(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        Assert.failNotEquals(message, expected, actual);
    }

    public static String format(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return "";
        }

        return Assert.format(message, expected, actual);
    }
}
