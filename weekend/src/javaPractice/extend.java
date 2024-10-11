package javaPractice;

//부모
class Animal{
	String name;
	int age;
	
	void eat() {
		System.out.println(name + " is eating. ");
	}
	
	void sleep(){
		System.out.println(name + " is sleeping. ");
	}
}

//자식
class Dog extends Animal{
	void bark() {
		System.out.println(name + " is barking. ");
	}
}

public class extend {

	public static void main(String[] args) {
		
		//Dog 객체 생성
		Dog dog = new Dog();
		dog.name = "buddy";
		dog.age = 3;
		
		//상속받은 메서드 호출
		dog.eat();
		dog.sleep();
		
		//자식 클래스의 메서드 호출
		dog.bark();
	}

}
