package com.edu.springboot.been2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
자동으로 빈을 생성한다. Legacy와 같이 별도의 설정은 필요없고 어노테이션만 부착하면 된다.
별도의 이름을 지정하지 않으면 첫글자를 소문자로 바꾼 이름을 사용한다.(student)
 */
@Component
public class Student {

	//빈 생성시 초기값으로 사용되는 값을 명시한다. 이때 setter를 통해 설정된다.
	@Value("이순신")
	private String name;
	
	@Value("30")
	private int age;
	
	/*
	객체타입의 멤버변수는 자동주입받는다. 이때 @Qualifier 어노테이션이 있으면
	이름까지 지정해서 주입받게 된다. 만약 없으면 타입으로만 빈을 찾아 주입받는다.
	 */
	@Autowired
	@Qualifier("macBook")
	private Computer notebook;

	public Student() {}
	
	public Student(String name, int age, Computer notebook) {
		super();
		this.name = name;
		this.age = age;
		this.notebook = notebook;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", notebook=" + notebook + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Computer getNotebook() {
		return notebook;
	}

	public void setNotebook(Computer notebook) {
		this.notebook = notebook;
	}
	
	
}
