package com.chanty.house.cleaning.common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public enum RoleEnum {
    ADMIN,
    ACCOUNT,
    COMPANY,
    USER,
    SUPER_ADMIN,
}
