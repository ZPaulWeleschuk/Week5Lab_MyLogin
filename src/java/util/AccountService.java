/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author 843876
 */
public class AccountService {

    public User login(String username, String password) {
        if (username.equals("abe") || username.equals("barb")) {
            if (password.equals("password")) {
                User user = new User("default", "null");
                return user;
            }
        }
        return null;

    }
}
