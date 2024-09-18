package org.example.enums;

import org.example.utils.EnumUtils;

public enum UserStatusEnum {
    ACTIVE(1, "status.active", "user activated", true),
    APPROVED(4, "status.approve", "user is approved", false),
    PENDING(2, "status.pending", "user is pending", true),
    REJECT(3, "status.reject", "user is rejected", false),
    ;

    private int id;
    private String code;
    private String name;
    private boolean active;

    private UserStatusEnum(int id, String code, String name, boolean active){
        this.id=id;
        this.code=code;
        this.name=name;
        this.active=active;
    }
    public static UserStatusEnum getByIdOrThrow(int id){
        return EnumUtils.getEnumOrThrow(UserStatusEnum.class, "id", id);
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }
}
