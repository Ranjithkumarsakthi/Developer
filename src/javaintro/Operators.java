package javaintro;

public class Operators {

	public static void main(String[] args) {
		// Arthimetic operators
		
		int sum=10+25;
		System.out.println(sum);
		
		int sub=sum-10;
		System.out.println(sub);
		
		int diff=10/2;
		System.out.println(diff);
		
		int multi=52*63;
		System.out.println(multi);
		
		int modulus=12%2;
		System.out.println(modulus);
		
		int modulus1=20/3;
		System.out.println(modulus1);
		
		//Relation operator
		
		int a=5,b=2;
		boolean isequals= a==b;
		System.out.println(isequals);
		
		int k=3,l=9;
		boolean notequals= k!=l;
		System.out.println(notequals);
		
		int p=8,u=2;
		boolean greater= p>u;
		System.out.println(greater);
		
		int r=3,j=9;
		boolean lesser=r<j;
		System.out.println(lesser);
		
		int g=8, o=9;
		boolean greaterthan = g>=o;
		System.out.println(greaterthan);
		
		int e=9,y=1;
		boolean lesserthan= e<=y;
		System.out.println(lesserthan);
		
		//compound assignment operator
		
		int t=30,w=50;
		t  +=w;//t=t+w
		System.out.println(t);
		
		t -=w;//t=t-w
		System.out.println(t);
		
		t *=w;//t=t*w
		System.out.println(t);
		
		t  /=w;//t=t/w
		System.out.println(t);
		
		t  %=w;//t=t%w
		System.out.println(t);
		
		//unary operators
		
		int count=10;
		System.out.println("intial count"+count);
		System.out.println(count++);
		System.out.println("after inital count"+count);
		System.out.println(++count);
		
		//ternary operators
		
		int age=18;
		String result= (age>=18)? "your eligible for vote":"your not eligible for vote";
		System.out.println(result);
		
		
		
			
			
		
		
		
		
		
		
		
		

	}

}
