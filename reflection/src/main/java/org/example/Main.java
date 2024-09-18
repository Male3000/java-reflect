package org.example;

import org.example.enums.AnotherEnum;
import org.example.enums.UserStatusEnum;
import org.example.utils.EnumUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        var enumms = EnumUtils.getEnum(UserStatusEnum.class, null, null, null);
        enumms.forEach(e->{
            Method method= null;
            try {
                method = e.getClass().getMethod("getId");
                System.out.println(
                        method.invoke(e)
                );
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
                ex.printStackTrace();
            }
        });
    }
}