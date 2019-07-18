package strategyPattern;

public class Duck {
	String name;
	IQuackBehaviour quacker;
	IFlyBehaviour flyer;
	

	public Duck(String name, IQuackBehaviour quacker, IFlyBehaviour flyer) {
		this.name = name;
		this.quacker = quacker;
		this.flyer = flyer;
	}
	
	public String getName() {
		return name;
	}

	public IFlyBehaviour getFlyer() {
		return flyer;
	}

	public void setFlyer(IFlyBehaviour flyer) {
		this.flyer = flyer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IQuackBehaviour getQuacker() {
		return quacker;
	}

	public void setQuacker(IQuackBehaviour quacker) {
		this.quacker = quacker;
	}
	
	
	public static void main(String[] args) {
		Duck wild_Duck = new Duck("Wild Duck", new Loud_Quack(), new Low_Range_Fly());
		System.out.println("Duck name: "+wild_Duck.getName()+".");
		System.out.print("Duck Quacking Ability:");wild_Duck.quacker.quack();
		System.out.print("Duck Flying Ability:");wild_Duck.flyer.fly();
		
		Duck city_Duck = new Duck("City Duck", new Quiet_Quack(), new Long_Range_Fly());
		System.out.println("Duck name: "+city_Duck.getName()+".");
		System.out.print("Duck Quacking Ability:");city_Duck.quacker.quack();
		System.out.print("Duck Flying Ability:");city_Duck.flyer.fly();
		
		wild_Duck.setFlyer(new Long_Range_Fly());
		System.out.print(wild_Duck.getName() + " new Flying Ability:");wild_Duck.flyer.fly();
		
		
		
	}
}
