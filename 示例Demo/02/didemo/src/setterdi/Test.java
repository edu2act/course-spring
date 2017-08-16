package setterdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Computer cp=(Computer)ctx.getBean("Computer1");
		ctx.close();
	}

}
