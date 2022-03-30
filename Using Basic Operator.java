package co.prachi;

public class program1 {
public static void main(String[] args) {
	
	//arithmetic
	int n1,n2,result;
	n1=10;
	n2=20;
	result=n1+n2;
	System.out.println("result is "+result);
	
	result=n1-n2;
	System.out.println("result is "+result);
	
	result=n1*n2;
	System.out.println("result is "+result);
	
	result=n1/n2;
	System.out.println("result is "+result);
	
	result=n1%n2;
	System.out.println("result is "+result);
	
	//short circuit
	n1+=10;
	System.out.println("n1 is "+n1);
	
	//ternary
	n1=10;
	System.out.println(n1>5?"greater than":"leass than5");
	
	n2=n1>5?100:1000;
	System.out.println("n1<n2 "+(n1<n2));
}
}
