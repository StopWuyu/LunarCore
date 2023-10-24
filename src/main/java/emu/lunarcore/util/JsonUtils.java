package emu.lunarcore.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

public class JsonUtils {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final Gson gsonCompact = new GsonBuilder().create();

    public static Gson getGsonFactory() {
        return gson;
    }

    /**
     * Encode an object to a JSON string
     */
    public static String encode(Object object) {
        return gson.toJson(object);
    }

    /**
     * Encode an object to a JSON string
     * @param object
     * @param compact
     * @return
     */
    public static String encode(Object object, boolean compact) {
        return compact ? gsonCompact.toJson(object) : gson.toJson(object);
    }

    public static JsonElement encodeToElement(Object object) {
        return gson.toJsonTree(object);
    }

    /**
     * Safely JSON decodes a given string.
     * @param jsonData The JSON-encoded data.
     * @return JSON decoded data, or null if an exception occurred.
     */
    public static <T> T decode(String jsonData, Class<T> classType) {
        try {
            return gson.fromJson(jsonData, classType);
        } catch (Exception ignored) {
            return null;
        }
    }

    public static <T> List<T> decodeList(String jsonData, Class<T> classType) {
        if (jsonData == null) return null;
        try {
            return gson.fromJson(jsonData, TypeToken.getParameterized(List.class, classType).getType());
        } catch (Exception ignored) {
            return null;
        }
    }

    public static <T> Set<T> decodeSet(String jsonData, Class<T> classType) {
        if (jsonData == null) return null;
        try {
            return gson.fromJson(jsonData, TypeToken.getParameterized(Set.class, classType).getType());
        } catch (Exception ignored) {
            return null;
        }
    }

    public static <T> T loadToClass(InputStreamReader fileReader, Class<T> classType) throws IOException {
        return gson.fromJson(fileReader, classType);
    }

    public static <T> T loadToClass(File file, Class<T> classType) throws IOException {
        try (InputStreamReader fileReader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) {
            return loadToClass(fileReader, classType);
        }
    }

    public static <T> List<T> loadToList(InputStreamReader fileReader, Class<T> classType) throws IOException {
        return gson.fromJson(fileReader, TypeToken.getParameterized(List.class, classType).getType());
    }

    public static <T> List<T> loadToList(String filename, Class<T> classType) throws IOException {
        try (InputStreamReader fileReader = new InputStreamReader(new FileInputStream(Utils.toFilePath(filename)), StandardCharsets.UTF_8)) {
            return loadToList(fileReader, classType);
        }
    }

    public static <T1, T2> Map<T1, T2> loadToMap(InputStreamReader fileReader, Class<T1> keyType, Class<T2> valueType) throws IOException {
        return gson.fromJson(fileReader, TypeToken.getParameterized(Map.class, keyType, valueType).getType());
    }

    public static <T1, T2> Map<T1, T2> loadToMap(String filename, Class<T1> keyType, Class<T2> valueType) throws IOException {
        try (InputStreamReader fileReader = new InputStreamReader(new FileInputStream(Utils.toFilePath(filename)), StandardCharsets.UTF_8)) {
            return loadToMap(fileReader, keyType, valueType);
        }
    }
}
