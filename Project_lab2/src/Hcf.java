//The program is to the HCF of 2 numbers, the numbers are 60,36[using euclid formula]
public class Hcf {

	public static void main(String... args) {
		// TODO Auto-generated method stub
    int num1=60,num2=36;
    int hcf=0;    //declaration of values
    for(int i=1;i<=num1 || i<=num2;i++)
    {
    	if(num1%i==0 && num2%i==0 )
    	{
    		//check that it is divided by any natural number
    		hcf=i;
    	}
    }
    //print the HCF value
       System.out.println("The HCF of 60 and 36 is: " +hcf);
     
	}
}

