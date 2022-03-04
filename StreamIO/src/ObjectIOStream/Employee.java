package ObjectIOStream;

import java.io.Serializable;

public class Employee implements Serializable {

	    private String fullName;
	    private float salary;

	    public Employee(String fullName, float salary) {
	        this.fullName = fullName;
	        this.salary = salary;
	    }

	    public String getFullName() {
	        return fullName;
	    }

	    public void setFullName(String firstName) {
	        this.fullName = firstName;
	    }

	    public float getSalary() {
	        return salary;
	    }

	    public void setSalary(float lastName) {
	        this.salary = lastName;
	    }
}
