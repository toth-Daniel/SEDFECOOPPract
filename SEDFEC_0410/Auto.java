public class Auto
{
	private String licensePlate;
	private int performance;
	private boolean automaticTransmission;

	private static int instanceCounter = 0;

	public Auto(String licensePlate, int performance, boolean automaticTransmission)
	{

		this.licensePlate = licensePlate;
		this.performance = performance;
		this.automaticTransmission = automaticTransmission;
		instanceCounter++;

	}

}
