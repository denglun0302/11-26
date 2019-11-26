

	public class A {
		A() {
			System.out.println("构造方法中，a = 30");
			a = 30;
		}
		
		{ System.out.println("构造代码块 1时，a = 0"); a = 0; }
		int a = init();
		{ System.out.println("构造代码块 2时，a = 20"); a = 20; }
		
		
		int init() {
			System.out.println("定义时  a = 10");
			return 10;
		}
		
		static {
			System.out.println("静态代码块 1时，staticA = 100");
			staticA = 100;
		}
		static int staticA = staticInit();
		static {
			System.out.println("静态代码块 2时，staticA = 300");
			staticA = 300;
		}
		
		static int staticInit() {
			System.out.println("静态定义时  staticA = 200");
			return 200;
		}
		
		
		public static void main(String[] args) {
			A p = new A();
			A q = new A();
		}
	}

