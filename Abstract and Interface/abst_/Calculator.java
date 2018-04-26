package abst_;

abstract class Calculator {
	
	public abstract int add(int a, int b);
	public abstract int sub(int a, int b);
	public abstract int mul(int a, int b);
	public abstract int div(int a, int b);
	public abstract int rem(int a, int b);
	
	public void sayHi(){
		System.out.println("Hi");
	}

}
class Calculate extends Calculator {
	public int add(int num1, int num2){
		return num1+num2;
	}
	public int sub(int num1, int num2){
		return num1-num2;
	}
	public int mul(int num1, int num2){
		return num1*num2;
	}
	public int div(int num1, int num2){
		return num1/num2;
	}
	public int rem(int num1, int num2){
		return num1%num2;
	}
	
}