package org.example.enums;

import org.example.utils.EnumUtils;

public enum AnotherEnum {
    ACTIVE(1, "status.active", "user activated", true),
    TEST_IGNORE_ENUM(4, "status.approve", "user is approved", false),
    PENDING(2, "status.pending", "user is pending", true),
    REJECT(3, "status.reject", "user is rejected", false),
    ;

    private int id;
    private String code;
    private String name;
    private boolean active;

    private AnotherEnum(int id, String code, String name, boolean active){
        this.id=id;
        this.code=code;
        this.name=name;
        this.active=active;
    }

    public static AnotherEnum getByIdOrThrow(int id){
        return EnumUtils.getEnumOrThrow(AnotherEnum.class, "id", id);
    }
}
