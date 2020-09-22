package org.xk.Service;

import org.xk.Interfaces.MyAutowired;
import org.xk.Interfaces.MyService;
import org.xk.Mapping.LoginMapping;

@MyService(value="test")
public class LoginServiceImpl implements LoginService {

    @MyAutowired
    private LoginMapping loginMapping;

    @Override
    public String login() {
        return loginMapping.login();
    }
}
