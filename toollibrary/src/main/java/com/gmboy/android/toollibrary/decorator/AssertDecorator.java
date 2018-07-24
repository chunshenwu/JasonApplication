package com.gmboy.android.toollibrary.decorator;


import junit.framework.Assert;

public class AssertDecorator {

    private static String TAG = "AssertDecorator";
    private static final boolean IN_DEVELOP = false;

    public static void assertTrue(String message, boolean condition) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertTrue(message, condition);
        } catch (Error error) {
            handle();
            throw error;
        }
    }

    public static void assertTrue(boolean condition) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertTrue(condition);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertFalse(String message, boolean condition) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertFalse(message, condition);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertFalse(boolean condition) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertFalse(condition);
        } catch (Error error) {
            handle();
            throw error;
        }
    }

    public static void fail(String message) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.fail(message);
        } catch (Error error) {
            handle();
            throw error;
        }
    }

    public static void fail() {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.fail();
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(String message, String expected, String actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(String expected, String actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(String message, double expected, double actual, double delta) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(message, expected, actual, delta);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(double expected, double actual, double delta) {
        if (IN_DEVELOP) {
            return;
        }


        try {
            Assert.assertEquals(expected, actual, delta);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(String message, float expected, float actual, float delta) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(message, expected, actual, delta);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(float expected, float actual, float delta) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(expected, actual, delta);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(String message, long expected, long actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(long expected, long actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(String message, boolean expected, boolean actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(boolean expected, boolean actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(String message, byte expected, byte actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(byte expected, byte actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(String message, char expected, char actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(char expected, char actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(String message, short expected, short actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(short expected, short actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(String message, int expected, int actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertEquals(int expected, int actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertEquals(expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertNotNull(Object object) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertNotNull(object);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertNotNull(String message, Object object) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertNotNull(message, object);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertNull(Object object) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertNull(object);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertNull(String message, Object object) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertNull(message, object);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertSame(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertSame(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertSame(Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertSame(expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertNotSame(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertNotSame(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void assertNotSame(Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.assertNotSame(expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void failSame(String message) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.failSame(message);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void failNotSame(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.failNotSame(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static void failNotEquals(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return;
        }

        try {
            Assert.failNotEquals(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    public static String format(String message, Object expected, Object actual) {
        if (IN_DEVELOP) {
            return "";
        }

        try {
            return Assert.format(message, expected, actual);
        } catch (Error error) {
            handle();
            throw error;
        }

    }

    private static void handle() {
        //TODO:
//        ScreenUtils.screenshot();
    }
}
