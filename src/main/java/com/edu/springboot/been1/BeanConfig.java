package com.edu.springboot.been1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
Spring Legacy에서 XML설정파일로 만들었던 것을 Boot에서는 XML을 사용하지
않으므로 아래와 같이 Java파일로 만든다. 이때 설정파일의 역할을 부여하기 위해
@Configuration 어노테이션을 부착한다.
 */
@Configuration
public class BeanConfig {

	/*
	@Bean 어노테이션을 통해 자바빈을 생성한다. 이때 참조변수명은 별도의 설정이
	없으므로 메서드명인 person1로 생성된다.
	 */
	@Bean
	public Person person1() {
		//객체생성 후 setter를 통해 초기화한다.
		Person person = new Person();
		person.setName("김도형");
		person.setAge(28);
		person.setNotebook(new Notebook("레노버"));
		
		return person;
	}
	/*
	위와 동일하게 자바빈을 생성하되 name속성을 부여했으므로 해당명인 person2로
	생성된다.
	 */
	@Bean(name="person2")
	public Person ptemp() {
		//생성자를 통해 초기화한다.
		Person person = new Person("알파고", 20, new Notebook("인텔"));
		return person;
	}
}
