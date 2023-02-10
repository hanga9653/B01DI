package com.edu.springboot.been1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Di1Controller {

	@RequestMapping("/di1")
	@ResponseBody
	public String home() {
		//Java설정파일을 기반으로 스프링 컨테이너를 생성한다.
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanConfig.class);
		//주입을 먼저 받은 후 형변환한다.
		Person person1 = (Person)context.getBean("person1");
		//객체의 정보를 toString()을 통해 출력한다.
		System.out.println(person1);
		
		//두번째 인수를 통해 타입을 명시하면 별도의 형변환이 필요없다.
		Person person2 = context.getBean("person2", Person.class);
		System.out.println(person2);
		
		/*
		해당 메서드의 반환타입이 String이므로 @ResponseBody 어노테이션이
		없다면 뷰의 경로를 반환하게 되지만, 현재는 단순한 문자열을 반환하여
		컨트롤러에서 즉시 출력한다.
		 */
		return "Dependency Injection1 (의존주입1)";
	}
}
