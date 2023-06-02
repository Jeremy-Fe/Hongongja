package chap08_sec01.exam05;

import chap08_sec01.exam01.RemoteControl;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(8);
//		rc.search("");
		rc.turnOff();
		
		Searchable searchable = tv;
//		searchable.setVolume(7);
		searchable.search("www.google.com");
		
		tv.turnOn();
		tv.setVolume(6);
		tv.search("www.naver.com");
		tv.turnOff();
	}
}
