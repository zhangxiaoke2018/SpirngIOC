package org.xk.Mapping;

import org.xk.Interfaces.MyMapping;

@MyMapping
public class LoginMappingImpl implements LoginMapping {
    @Override
    public String login() {
        return "项目启动成功";
    }
}
