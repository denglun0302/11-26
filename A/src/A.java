

	public class A {
		A() {
			System.out.println("���췽���У�a = 30");
			a = 30;
		}
		
		{ System.out.println("�������� 1ʱ��a = 0"); a = 0; }
		int a = init();
		{ System.out.println("�������� 2ʱ��a = 20"); a = 20; }
		
		
		int init() {
			System.out.println("����ʱ  a = 10");
			return 10;
		}
		
		static {
			System.out.println("��̬����� 1ʱ��staticA = 100");
			staticA = 100;
		}
		static int staticA = staticInit();
		static {
			System.out.println("��̬����� 2ʱ��staticA = 300");
			staticA = 300;
		}
		
		static int staticInit() {
			System.out.println("��̬����ʱ  staticA = 200");
			return 200;
		}
		
		
		public static void main(String[] args) {
			A p = new A();
			A q = new A();
		}
	}

