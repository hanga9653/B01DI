package com.edu.springboot.been2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//이와같이 이름을 지정하여 빈을 생성할수도 있다. 즉 Computer타입의 macBook
//빈이 생성된다. 
@Component("macBook")
public class Computer {

	@Value("M1")
	private String cpu;

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Notebook [cpu=" + cpu + "]";
	}
	
	
}
