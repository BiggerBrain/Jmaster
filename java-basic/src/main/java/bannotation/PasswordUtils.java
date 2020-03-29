/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package bannotation;


/**
 * @author lishixiong
 * @version $Id: PasswordUtils.java, v 0.1 2019年09月08日 10:05 PM lishixiong Exp $
 */
public class PasswordUtils {
    @User(id = "1", description = "tom", characteristics = { "sunny", "soft" })
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @User(id = "2", description = "bob", characteristics = "sunny")
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
}