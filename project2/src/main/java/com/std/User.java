package com.std;

import com.util.UserAuthentication;

/**
 * Class that represents an user.
 */
public class User {
    private String id;
    private String pw;
    private String name;
    private int privilege;
    private Rank rank;

    public void signUp() {
        /*implement*/
    }

    public void login() {
        /*implement*/
    }

    public void logout() {
        /*implement*/
    }

    /**
     * Sets id of user.
     * @param id id of user
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets password of user.
     * @param pw password of user
     */
    public void setPw(String pw) {
        this.pw = pw;
    }

    /**
     * Sets name of user.
     * @param name name of user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets privilege of user.
     * @param privilege privilege of user
     */
    public void setPrivilege(int privilege) {
        this.privilege = privilege;
    }

    /**
     * Sets rank of user.
     * @param rank rank of user
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
