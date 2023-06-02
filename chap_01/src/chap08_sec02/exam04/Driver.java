package chap08_sec02.exam04;

import chap08_sec02.exam02.Bus;
import chap08_sec02.exam02.Vehicle;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { // vehicle 매개변수가 ㅊ마조하는 객체가 Bus인지 조사
			Bus bus = (Bus) vehicle; // Bus 객체일 경우 안전하게 강제타입 변환
			bus.checkFare(); // Bus 타입으로 강제타입 변환을 하는 이유 
		}
		vehicle.run(); 
	}
}
