/**
 * 
 * @author sara
 * Polymorphism
 */

class Car{
	private boolean engine;
	private int cylindres;
	private String name;
	private int wheels;
	
	public Car(int cylindres, String name) {
		this.cylindres = cylindres;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}

	public int getCylindres() {
		return cylindres;
	}

	public String getName() {
		return name;
	}
	 
	public String startEngine() {
		return "Car -> startEngine()"; 
	}
	
	public String accelerate() {
		return "Car => accelerate()";
	}
	
	public String brake() {
		return "Car -> brake()";
	}
}

class Mitsubishi extends Car {
	
	public Mitsubishi(int cylindres, String name) {
		super(cylindres, name);
	}
	@Override
	public String startEngine() {
		return "Mitsubishi -> startEngine()"; 
	}
	@Override
	public String accelerate() {
		return getClass().getSimpleName()+  " => accelerate()";
	}
	@Override
	public String brake() {
		return "Mitsubishi -> brake()";
	}
	
}


class Ford extends Car {
	
	public Ford(int cylindres, String name) {
		super(cylindres, name);
	}
	@Override
	public String startEngine() {
		return "Ford -> startEngine()"; 
	}
	@Override
	public String accelerate() {
		return getClass().getSimpleName()+ "=> accelerate()";
	}
	@Override
	public String brake() {
		return "Ford -> brake()";
	}
	
}


public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4HD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
		
		
	}
}
