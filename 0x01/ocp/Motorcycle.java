public class Motorcycle extends Vehicle implements IVehicleMotorcycle   {

	public Motorcycle(String color, String year, double engine) {
		super(color, year, engine);
		configureVehicle(color, year, engine);
		
	}

	@Override
	public void configureVehicle(String color, String year, double engine) {
		System.out.println("Criando uma moto: " + year + " com " + engine + " cilindradas");
		startVehicle();
		
	}
	@Override
	public void startVehicle() {
		System.out.println("Ligando os motores");
	}
	}


	


