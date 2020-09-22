package org.xk.Service;

import org.xk.Interfaces.MyService;

@MyService
public class TestLoginServiceImpl implements LoginService {
    @Override
    public String login() {
        return "测试多态情况下依赖注入";
    }
}
