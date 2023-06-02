package chap10_sec01.exam05;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
		}
	}
	public static void changeCat(Animal animal) {
		if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
		}
	}
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}