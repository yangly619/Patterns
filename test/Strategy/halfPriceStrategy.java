package Strategy;

public class halfPriceStrategy implements IStrategy {
	@Override
	public void getPrice(double standardP) {
		// TODO Auto-generated method stub
		System.out.println("半价");
		
		System.out.println(standardP*0.8);
	}
}
