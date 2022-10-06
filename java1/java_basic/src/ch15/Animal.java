package ch15;

public abstract class Animal {
	
	String name; 
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public abstract void hunt();
	

}// end of Animal class