package main.callback;

public class Printer {
	  public void print(Callback callback, String text) {
	    System.out.println("���ڴ�ӡ . . . ");
	    try {
	      Thread.currentThread();
	      Thread.sleep(3000);// ����
	    } catch (Exception e) {
	    }
	    callback.printFinished("��ӡ���");
	  }
	}