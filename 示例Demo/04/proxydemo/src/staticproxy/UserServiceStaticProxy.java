package staticproxy;

import java.util.Date;

public class UserServiceStaticProxy implements UserService {

	private UserService userService;

	public UserServiceStaticProxy(UserService userService) {
		this.userService = userService;
	}

	@Override
	public boolean login(String name, String password) {
		boolean isLogin = userService.login(name, password);
		System.out.println("日志：" + name + "于" + new Date().toLocaleString() + "登录");
		return isLogin;
	}

}
