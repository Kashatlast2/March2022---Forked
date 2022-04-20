public class ConvertibleCar extends Car implements ICar {

	public ConvertibleCar(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
		
		
		
		
	}

	public boolean getIsLoweredTop() {
		
		return false;
	}

	public boolean getIsRaisedTop() {
		
		return false;
	}
}
