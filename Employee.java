package com.test.basic;

public  class Employee extends  SuperEmployee    implements Comparable {
	
	private  int rollno;
	private String empName;
	
	public Employee() {
	System.out.println("hello");
	}
	{
	System.out.println("hello init");	
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + rollno;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}


	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
	
	
	
	
	
	
}
