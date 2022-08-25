//This is a program of transpose of a matrix {{1,2},{4,5},{8,9}} and multiplication of all members of a matrix.
public class Matrix {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		
		int matrix[][]=  {{1,2},{4,5},{8,9}};   //initialization and declaration
		int trans[][]=new int[2][3];   
		//Transpose the matrix 
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<3;j++)
			{
				trans[i][j]=matrix[j][i];    //matrix value transpose and transfer into trans matrix
			}
		}
		System.out.println("The transpose matrix is: ");
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(trans[i][j]+" ");  //print the transpose matrix
			}
			System.out.println();
		}
          
		//Multiplication of all members of a matrix
		int mult=1;
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<2;j++)
			{
			 mult=mult*matrix[i][j];    //Multiply  all the matrix member using loops 
			}
			
		}
		System.out.println("Multiplication of all matrix: "+mult);
	//print the multiplication value.	
	}

}
