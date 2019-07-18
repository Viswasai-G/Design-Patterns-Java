package observerPattern;

public class PhoneDisplay implements IObserver{

	WeatherStation station;
	String deviceName;
	
	public PhoneDisplay(WeatherStation station, String deviceName) {
		this.station = station;
		this.deviceName = deviceName;
	}
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println("This is "+deviceName+ " data: " +station.getData());
	}

}
