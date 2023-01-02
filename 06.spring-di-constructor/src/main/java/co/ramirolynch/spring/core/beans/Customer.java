package co.ramirolynch.spring.core.beans;

public class Customer {
	private String firstName;
	private String lastName;
	private Car car;

	public Customer(String firstName, String lastName, Car car) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.car = car;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Car getCar() {
		return car;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", car=" + car + "]";
	}

}
