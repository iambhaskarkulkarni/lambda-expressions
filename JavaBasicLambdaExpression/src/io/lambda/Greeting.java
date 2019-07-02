package io.lambda;

public class Greeting {
	
	public void greet(Greeter greeter) {
//		System.out.println("Greeting");
		greeter.perform();
	}

	public static void main(String[] args) {
		Greeting greeting = new Greeting();
//		greeting.greet();
		greeting.greet(new HellwordGreeter());
		
		Greeter myLambdaFunction = () -> System.out.println("Hello Lambda");
		Greeter innerClassGreetre = new Greeter() {
			
			@Override
			public void perform() {
				System.out.println("Hellowrd inner class exxample");
			}
		};
		greeting.greet(myLambdaFunction);
		greeting.greet(innerClassGreetre);
		
	}

}

