package javaPractice;

//�θ�
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

//�ڽ�
class Dog extends Animal{
	void bark() {
		System.out.println(name + " is barking. ");
	}
}

public class extend {

	public static void main(String[] args) {
		
		//Dog ��ü ����
		Dog dog = new Dog();
		dog.name = "buddy";
		dog.age = 3;
		
		//��ӹ��� �޼��� ȣ��
		dog.eat();
		dog.sleep();
		
		//�ڽ� Ŭ������ �޼��� ȣ��
		dog.bark();
	}

}
