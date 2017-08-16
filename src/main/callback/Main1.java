package main.callback;

public class Main1 {
	public static void main(String[] args) {
		People people = new People();
		Callback1 callback1=new Callback1() {
			
			@Override
			public void printFinish(String message) {
				// TODO Auto-generated method stub
				System.out.println(message);
			}
		};
		
	}
}
