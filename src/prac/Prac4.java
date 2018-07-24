package prac;

public class Prac4 {

	public static void main (String[] args) {
		Prac4 obj = new Prac4 (); // when we create object then we can call the methods
		obj.add(21, 32);
		obj.add(22, 2, 12);
		obj.add(2.4, 100); // compiletime , methodoverloading 
	
	} // why do we have closing here ?

		public void add(int a,int b,int c) {
			int d = a+b+c;
			System.out.println("sum of a,b,c is  " + d);
			}
		public void add(int a,int b) { // we can not have same methods with same arguements
			int k = a+b;
			System.out.println("sum of a,b,c is  " + k);
		}
		public void add(double a,int b) {// no of argue is same but type is diff
			double s = a+b;
			System.out.println("sum of a,b, is  " + s);
		}
}
