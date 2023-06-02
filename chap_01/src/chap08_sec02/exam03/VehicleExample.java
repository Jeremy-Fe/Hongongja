package chap08_sec02.exam03;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); => X (Vehicle 인터페이스에는 checkFare() 가 없음)
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
	}
}
