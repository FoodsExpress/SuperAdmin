package com.foodexpress.superadmin.modules.coupon.enums;

public enum DiscountPolicy implements EnumMapperType {
    WON("원", true),
    PERCENT("퍼센트", false);


    private final String discount;
    private final boolean active;

    DiscountPolicy(String discount, boolean active) {
        this.discount = discount;
        this.active = active;
    }

    @Override
    public String getCode() {
        return this.name();
    }

    @Override
    public String getTitle() {
        return this.discount;
    }

    @Override
    public boolean isDefault() {
        return this.active;
    }
}
