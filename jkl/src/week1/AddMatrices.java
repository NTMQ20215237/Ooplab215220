package week1;
public class AddMatrices {
public static void main(String args[]) {
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int b[][]= {{1,8,1},{1,2,0},{0,3,0}};
	int c[][]= new int [3][3];
	for (int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+"  ");
		}
		System.out.println("");
	}
}
}
