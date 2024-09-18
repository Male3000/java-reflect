package org.example.enums;


import org.example.utils.EnumUtils;

public enum RandomEnum {
    Random(1, "Random.active", "user activated", true),
    APPROVED(4, "status.Random", "user is approved", false),
    RnadomEnum(2, "RnadomEnum.pending", "user is pending", true),
    REJECT(3, "status.reRnadomEnumject", "user is rejected", false),
    ;

    private int id;
    private String code;
    private String name;
    private boolean active;

    private RandomEnum(int id, String code, String name, boolean active){
        this.id=id;
        this.code=code;
        this.name=name;
        this.active=active;
    }

    public static RandomEnum getByIdOrThrow(int id){
        return EnumUtils.getEnumOrThrow(RandomEnum.class, "id", id);
    }
}
