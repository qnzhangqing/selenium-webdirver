package main.callback;

public class People1 {
	  Printer printer = new Printer();
	  /*
	   * ͬ���ص�
	   */
	  public void goToPrintSyn(Callback callback, String text) {
	    printer.print(callback, text);
	  }
	  
	  /*
	   * �첽�ص�
	   */
	  public void goToPrintASyn(Callback callback, String text) {
	    new Thread(new Runnable() {
	      public void run() {
	        printer.print(callback, text);
	      }
	    }).start();
	  }
}
