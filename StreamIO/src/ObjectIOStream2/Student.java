package ObjectIOStream2;

import java.io.Serializable;

public class Student implements Serializable {
	String name;
	int age;
	
	Student(String n, int a){
		name = n;
		age = a;
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
	
	
}
