package io.lambda;

public class TypeInferenceExample {

	public static void main(String[] args) {
		getStringLengthByLambda(s -> s.length());
	}
	
	public static void  getStringLengthByLambda(StringLengthLambda ss) {
		System.out.println(ss.getLength("Hello Lambda"));
	}

}

interface StringLengthLambda {
	int getLength(String s);
}
