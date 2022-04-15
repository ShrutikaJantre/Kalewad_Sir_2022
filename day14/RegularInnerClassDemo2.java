class OuterClass{
	int x = 100;
	int a = 300;

			
	class InnerClass{
		class InnerInnerClass{
			int a = 200;
			class InnerInnerInnerClass{
				int a = 200;
				
				void m1(){
					System.out.println(a);
					System.out.println(InnerInnerClass.this.a);
				}
			}
		}
		
	}
	
	class InnerClass2 extends InnerClass{
		
	
	}

}

class RegularInnerClassDemo2{
	public static void main(String[] args){
		OuterClass.InnerClass i = new OuterClass().new InnerClass2();
		OuterClass.InnerClass.InnerInnerClass.InnerInnerInnerClass x = new OuterClass().new InnerClass().new InnerInnerClass().new InnerInnerInnerClass();
		x.m1();
	}
}