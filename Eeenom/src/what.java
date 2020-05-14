
public class what {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<5; i++) { //i=0, i=1 ...
			  for(int j=0; j<i+1; j++) { //j=1 ,j=2 ...
			   System.out.print("*"); //*
			  }
			 System.out.println();
			 }
			 
			 System.out.println("-----------");
			 
			 for(int i=0; i<5; i++) { //i=0, i=1, i=2 ...
			  for(int j=0; j<5-i ; j++) { //j=5,j=4,j=3 ...
			   System.out.print("*");
			  }
			  System.out.println();
			 }
			 System.out.println("-----------");
	


	}

}
