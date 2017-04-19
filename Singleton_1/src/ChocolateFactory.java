
public class ChocolateFactory {
	private volatile static ChocolateFactory chocolateFactory=null;
	private ChocolateFactory() {}
	public  static ChocolateFactory getChocolateFactory() {
		if(chocolateFactory==null){
			synchronized (ChocolateFactory.class) {
				if(chocolateFactory==null){
					chocolateFactory=new ChocolateFactory();
				}
			}
			
		}
		return chocolateFactory;
	}
	@Override
	public String toString() {
		return "I am a single instance!";
	}
	
}
