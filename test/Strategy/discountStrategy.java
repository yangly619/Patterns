package Strategy;

public class discountStrategy implements IStrategy{

	@Override
	public void  getPrice(double standardP) {
		// TODO Auto-generated method stub
		System.out.println("打八折 :" +standardP*0.8);
		
	}

}
