/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import sun.security.provider.SHA;

/**
 *
 * @author araceliteruel
 */
public class User {
    protected String name;
    protected String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
