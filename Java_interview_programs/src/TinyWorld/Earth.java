package TinyWorld;

public class Earth {

	public static void main(String[] args) {
		
		Human tom=new Human("Tom", 65, 5, "blue");
		tom.speak();
		tom.eat();
		tom.work();

		Human Joe=new Human("Joe", 25, 6, "brown");
		Joe.speak();
	}

}
