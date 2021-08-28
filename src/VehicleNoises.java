import model.Car;
import model.Jeep;
import model.Bus;

public class VehicleNoises {
	// add your vehicle class to the model package
	// only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
		
		Jeep jeep = new Jeep();
		System.out.println(jeep.makeNoise());
		
		Bus bus = new Bus();
		System.out.println(bus.makeNoise());

	}

}
