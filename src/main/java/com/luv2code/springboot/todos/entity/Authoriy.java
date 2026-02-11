package com.luv2code.springboot.todos.entity;


import jakarta.persistence.Embeddable;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;


@Embeddable
public class Authoriy implements GrantedAuthority {

    private String authority;


    public Authoriy() {}

    public Authoriy(String authority) {
        this.authority = authority;
    }

    @Override
    public @Nullable String getAuthority() {
        return "";
    }
}
