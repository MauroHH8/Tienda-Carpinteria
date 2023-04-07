package com.tienda.web.tiendacarpinteria.db.entity;

public enum UserRoleEnum {
	ROLE_USER(1),
	ROLE_ADMIN(99);
	
	private int level;

	private UserRoleEnum(int theLevel) {
        this.level = theLevel;
    }

    public int getLevel() {
        return level;
    }

}

