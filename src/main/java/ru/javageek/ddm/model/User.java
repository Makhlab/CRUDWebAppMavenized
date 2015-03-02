package ru.javageek.ddm.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Created by max on 15/02/15.
 */
public class User extends org.springframework.security.core.userdetails.User {

    private String lastname;

    public User(String username, String password, Collection<? extends GrantedAuthority> authorities, String lastname) {
        super(username, password, authorities);
        this.lastname = lastname;
    }

    public User(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public String getLastname() {
        return lastname;
    }
}
