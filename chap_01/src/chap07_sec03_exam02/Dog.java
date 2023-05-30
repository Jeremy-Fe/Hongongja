package chap07_sec03_exam02;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("왈ㄹ!왈!!왈!왈!!!!왈!!!왈뢍왈!!!!");
	}
	
	
}
