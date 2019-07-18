package observerPattern;

import java.util.ArrayList;

public class WeatherStation implements IObservable{
	
	private ArrayList<IObserver> myList = new ArrayList<IObserver>(); 
	
	String data = "Data!!";
	public String getData() {
		return data;
		
	}
	
	public void setData(String newData) {
		this.data = newData;
	}
	
	public void Add(IObserver observer) {
		
		myList.add(observer);
		
	}
	
	public void Remove(IObserver observer) {
		
		myList.remove(observer);
		
	}
	
	public void Notify() {
		
		for(IObserver observer:myList) {
			observer.Update();
		}
		
	}
	
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		PhoneDisplay Pdisplay1 = new PhoneDisplay(weatherStation, "Phone 1");
		DesktopDisplay Ddisplay1 = new DesktopDisplay(weatherStation, "Desktop 1"); 
		PhoneDisplay Pdisplay2 = new PhoneDisplay(weatherStation, "Phone 2");
		DesktopDisplay Ddisplay2 = new DesktopDisplay(weatherStation, "Desktop 2"); 
		weatherStation.Add(Pdisplay1);
		weatherStation.Add(Ddisplay1);
		weatherStation.Add(Pdisplay2);
		weatherStation.Add(Ddisplay2);
		weatherStation.Notify();
		weatherStation.Remove(Pdisplay2);
		weatherStation.Notify();
		weatherStation.setData("New Data updated");
		weatherStation.Notify();
	}

}
