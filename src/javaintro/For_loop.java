package javaintro;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiple table 6
		int number=6;
		System.out.println("mutliplication of number:"+number);
		for(int i=1;i<=10;i++) {
			int result=number*i;
			System.out.println(number +" * "+ i +" = "+result);
			
		}
		///even number
		for(int i=1;i<=10;i++) {
			if(i%2 !=0) {
				continue;
			}
				
			System.out.println("even numbers="+i);
			
			
			///Task
			for(int j=1;j<=10;j++)
			{
				System.out.println(j);
			}
			
			
		}

}
	}



