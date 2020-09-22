package org.xk;

import org.xk.Controller.LoginController;
import org.xk.common.MyApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception {
        //从容器中获取对象（自动首字母小写）
        MyApplicationContext applicationContext = new MyApplicationContext();
        LoginController loginController = (LoginController) applicationContext.getIocBean("LoginController");
        String login = loginController.login();
        System.out.println(login);
    }
}
