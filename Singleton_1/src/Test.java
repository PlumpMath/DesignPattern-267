
public class Test {
	public static void main(String[] args) {
		ChocolateFactory chocolateFactory=ChocolateFactory.getChocolateFactory();
		ChocolateFactory chocolateFactory2=ChocolateFactory.getChocolateFactory();
		if(chocolateFactory.equals(chocolateFactory2)){
			System.out.println("They are the same instance!");
		}
		else{
			System.out.println("They are not the same instance!");
		}
	}
	
}
