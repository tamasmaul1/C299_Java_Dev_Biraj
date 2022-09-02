package demo;

public class Practice {

	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		myPig.tobeFed();
	}

}

interface Animal {
	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)
}

interface FarmAnimal {
	public void tobeFed(); // interface method (does not have a body)

}

class Pig implements Animal, FarmAnimal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}

	public void sleep() {
		System.out.println("Zzz");
	}

	@Override
	public void tobeFed() {
		// TODO Auto-generated method stub

	}

}
