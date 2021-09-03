import model.Car;	
import model.Jeep;
import model.Bus;
import model.Train;
import model.Truck;
import model.ElectricCar;
import model.ElectricTruck;
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
		
		Train train = new Train();
		System.out.println(train.makeNoise());

		Truck truck = new Truck();
		System.out.println(truck.makeNoise());
		
		ElectricCar EC = new ElectricCar();
		System.out.println(EC.makeNoise());
		
		ElectricTruck ET= new ElectricTruck();
		System.out.println(ET.makeNoise());

	}

}
