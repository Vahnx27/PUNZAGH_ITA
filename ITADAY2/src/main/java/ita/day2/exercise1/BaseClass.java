package ita.day2.exercise1;

public class BaseClass {

	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		BaseClass baseClass = (BaseClass) subClass;
		baseClass.first();
	}
	public void first() {
		second();
	}
	public void second() {
		System.out.println("second method is called");
	}
}
