package main.callback;

public class Printer1 {
	public void print(Callback callback,String text) {
		System.out.println("���ڴ�ӡ....");
		callback.printFinished("kkkkk");
	}
}
