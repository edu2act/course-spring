package dynamicproxy;

public class Test {

	public static void main(String[] args) {
		LoggerHandler lh = new LoggerHandler();
		UserService us = (UserService) lh.bind(new UserServiceImpl());
		us.login("adi", "123");
	}

}
