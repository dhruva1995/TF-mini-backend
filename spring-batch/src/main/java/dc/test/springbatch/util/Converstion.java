package dc.test.springbatch.util;

public class Converstion {
    public static <T> T getAs(Object obj, Class<T> clazz, T defaultValue) {
        return obj == null ? defaultValue : (T) obj;
    }
}
