package main.callback;

public class Main {// �����࣬ͬ���ص�
	public static void main(String[] args) {
		People people = new People();
		Callback callback = new Callback() {
			@Override
			public void printFinished(String msg) {
				System.out.println("��ӡ�������ҵ���Ϣ�� ---> " + msg);
			}
		};
		System.out.println("��Ҫ��ӡ�������� ---> " + "��ӡһ�ݼ���");
		people.goToPrintSyn(callback, "��ӡһ�ݼ���");
		System.out.println("���ڵȴ� ��ӡ�� ���ҷ���");
	}
}