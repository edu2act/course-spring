package simpletypeconstructdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		MathUtil mu=(MathUtil)ctx.getBean("MathUtil");
		mu.show();
	}

}
