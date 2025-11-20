class Animal // parent
{
	void breed(){
		System.out.println("this is parent class");
	}
}

class Dog extends Animal // child
{
	void bark() {
		System.out.println("this is child class");
	}
}

class Cat extends Animal //  child
{
	void meow() {
		System.out.println("this is Cat class");
	}
}




class Main
{
	public static void main(String[] args){
		Dog d = new Dog(); // default constructor
		
		d.bark();// this is child class
		d.breed();// this is parent class
		d.eat(); // CTE
		d.meow();// CTE
		
		Cat c = new Cat();
		
		c.breed(); // this is parent class
		c.bark(); // CTE
		c.meow();// this is Cat class
		
		
		
	}
	
}


