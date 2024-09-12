package org.example.utils;

import java.lang.reflect.Field;
import java.util.*;

public final class EnumUtils {
    public static <T extends Enum<T>, V> List<T> getEnum(Class<T> enumClazz, String fieldName, V fieldValue, Integer offset) {
        var list=new ArrayList<T>();
        for (T enumConstant : enumClazz.getEnumConstants()) {
            try {
                if (fieldName==null){
                    list.add(enumConstant);
                    continue;
                }
                Field field = enumClazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                Object value = field.get(enumConstant);
                if (Objects.equals(value, fieldValue)) {
                    list.add(enumConstant);
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new IllegalArgumentException("Something went wrong with enum lmao");
            }
            if (offset !=null && list.size()==offset) return list;
        }
        return list;
    }

    public static <T extends Enum<T>, V> T getEnum(Class<T> enumClazz, String fieldName, V fieldValue) {
        var result = getEnum(enumClazz, fieldName, fieldValue, 1);
        return result.isEmpty() ? null : result.getFirst();
    }

    public static <T extends Enum<T>, V> T getEnumOrThrow(Class<T> enumClazz, String fieldName, V fieldValue){
       var result=  getEnum(enumClazz, fieldName, fieldValue);
       if (result==null) throw new
               IllegalArgumentException("Resource with identifier %s = %s not found."
               .formatted(fieldValue, fieldValue));
       return  result;
    }

    public static <T extends Enum<T>, V> List<T> getEnumsOrThrow(Class<T> enumClazz, String fieldName, V fieldValue){
        var result = getEnum(enumClazz, fieldName, fieldValue,null);
        return result;
    }


}
