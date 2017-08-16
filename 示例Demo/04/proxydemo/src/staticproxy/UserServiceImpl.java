package staticproxy;

public class UserServiceImpl implements UserService {
	
	public boolean login(String name, String password){
		if(name.equals("adi") && password.equals("123")){
			System.out.println("业务逻辑：用户adi登录成功");
			return true;
		}else{
			System.out.println("业务逻辑：用户adi登录失败");
			return false;
		}
	}
}
