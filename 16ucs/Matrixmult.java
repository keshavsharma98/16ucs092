public class Matrixmult {

	public static void main(String[] args) {
		
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		int i,j,k;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=i+j+1;
			}
		}
		/*for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();*/
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=i+j+2;
			}
		}
		/*for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();*/
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]=0;
				for(k=0;k<2;k++)
				{
					c[i][j]= c[i][j] + (a[i][k]*b[k][j]);
				}
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}