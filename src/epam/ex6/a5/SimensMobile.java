package epam.ex6.a5;

public abstract class SimensMobile implements Mobile {

	protected String  label = "Simens";



	@Override
	public void on() {
		System.out.println("on");
		
	}

	@Override
	public void call(int number) {
		System.out.println("calling.... " + number);
		
	}

	@Override
	public void answerCall(int innumber) {
		System.out.println("answer " + innumber);
		
	}

	@Override
	public void sMs(String text, int number) {
		System.out.println(text + " sent to " + number);
		
	}
}
