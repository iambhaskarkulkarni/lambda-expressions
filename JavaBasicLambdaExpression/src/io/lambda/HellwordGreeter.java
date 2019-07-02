package io.lambda;

public class HellwordGreeter implements Greeter {

	@Override
	public void perform() {
		System.out.println("Helloworld Greeter");
	}

}
