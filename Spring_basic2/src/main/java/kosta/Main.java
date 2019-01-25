package kosta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Resource resource =
				new ClassPathResource("applicationContext.xml"); //xml 객체 생성
		
	/*	BeanFactory factory = 
				new GenericXmlApplicationContext(resource);*/	//명시적 (스프링컨테이너)
		
	/*	ApplicationContext factory = 
				new GenericXmlApplicationContext(resource);*/ //자동적 (스프링컨테이너)
		
	/*	ApplicationContext factory = 
				new AnnotationConfigApplicationContext(Factory.class);*/ //설정파일이 Factory.java (스프링컨테이너)
		
		String[] config = {
				"applicationContext.xml",
				"commonConcern.xml"
		};
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext(config); //하나의 스프링컨테이너에서 두개의 xml이 동작
		
		/*Service service = (Service)factory.getBean("service"); //xml에서 service객체 호출. 메소드명이 id명어야 한다. 
		service.insert(); //스프링 컨테이너에서 DI가 수행 ***, DAO가 수행*/
		
		Kosta kosta = (Kosta)factory.getBean("kosta");
		kosta.insert();
		 
}
}
