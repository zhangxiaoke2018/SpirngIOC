package org.xk.Controller;

import org.xk.Interfaces.MyAutowired;
import org.xk.Interfaces.MyController;
import org.xk.Interfaces.Value;
import org.xk.Service.LoginService;
import org.xk.Service.LoginServiceImpl;

@MyController
public class LoginController {
    @Value(value="ioc.scan.pathTest")
    private String test;

    @MyAutowired
    private LoginServiceImpl  loginServiceImpl;

    public String login(){
        return loginServiceImpl.login();
    }
}
