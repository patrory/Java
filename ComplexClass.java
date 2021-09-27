package Collage_pict;
import java.util.Scanner;



class complex{
	 int real,imag;
	 complex(int real,int imag){
		 this.imag=imag;
		 this.real=real;
	 }
	 complex(){
		 
	 }
	 public void display() {
		 System.out.println("THE ANSWER IS ");
		 System.out.println(real + " + i"+ imag);
	 }
	 public complex add(complex p,complex q) {
		 complex temp = new complex();
		 temp.real= p.real + q.real;
		 temp.imag = p.imag + q.imag;
		 return temp;
	 }
	 public complex sub(complex p,complex q) {
		 complex temp = new complex();
		 temp.real= p.real - q.real;
		 temp.imag = p.imag - q.imag;
		 return temp;
	 }
	 public complex multi(complex p,complex q) {
		 complex temp = new complex();
		 temp.real =p.real*q.real - p.imag*q.imag;
		 temp.imag =p.real *q.imag + q.real *p.imag;
		 return temp;
	 }
	 public complex divi(complex p,complex q) {
		 complex temp = new complex();		 
		 complex c10 = new complex();
		 c10.real = q.real; 
		 c10.imag= -1*q.imag;
		 temp =  multi(p, c10);
		 return temp;
	 }
	 public int deno(complex q) {
		 int ans = q.real*q.real + q.imag*q.imag;
		 return ans;
	 }
}
public class ComplexClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int x1,y1,x2,y2;
		x1=  s.nextInt();
		y1 = s.nextInt();
		x2 = s.nextInt();
		y2=  s.nextInt();
		
		complex c1 = new complex(x1,y1);
		complex c2 = new complex(x2,y2);
		
		while(true) {
			System.out.println("press \n 0 to exit  | 1 to add | 2 to subtact | 3 to mutiply | 4 to divide ");
			int n;
			n= s.nextInt();
			switch(n) {
			case 0:
				System.out.println("Program Terminated ");
				System.exit(0);
			case 1:
				complex c3 = new complex();
				c3=c3.add(c1, c2);
				c3.display();  
				break;
			case 2:
				complex c4 = new complex();
				c4=c4.sub(c1, c2);
				c4.display();
				break;
			case 3:
				complex c5 = new complex();
				c5=c5.multi(c1, c2);
				c5.display();
				break;
			case 4:
				complex c6 = new complex();
				c6 = c6.divi(c1, c2);
				int denominator =c6.deno(c2);
				System.out.println("ANSWER IS ("+ c6.real + "+ i"+ c6.imag+ ")  /" + denominator );				
				break;
			}
			
		}
		
		
	}

}
