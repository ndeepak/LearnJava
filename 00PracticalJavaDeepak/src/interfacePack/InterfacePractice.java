package interfacePack;


// Definition of interface
interface Test{
	void meth1();
	void meth2();
}

// Interface cant be extended.
//class My extends Test{
//	
//}

class My implements Test{
	public void meth1() {
		System.out.println("Meth1 of class My.");
	}
	public void meth2() {
		System.out.println("Meth2 of class My.");
	}
	
	public void meth3() {
		System.out.println("Meth3 of class My.");
	}
}
public class InterfacePractice {

	public static void main(String[] args) {

		
		// References of interface
//		Test = new Test(); // Can't make it.
		
		Test t = new My();
		t.meth1(); // Run-time polymorphism
		t.meth2();
//		t.meth3(); // can't call due to reference
	}

}
