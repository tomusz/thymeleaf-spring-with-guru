package com.thymeleafspring.thymeleafspringwithguru.comnds;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginCommand {

    @NotEmpty
    @Size(min = 4,max = 16)
    private String loginName;

    @NotEmpty
    @Size(min = 5,max = 16)
    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
