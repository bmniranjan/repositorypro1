package adsel;

public class mergearray {

	public static void main(String[] args) {
		int[]arr1= {20,22,23};
		int[]arr2= {30,32,33,34};
		int size=arr1.length+arr2.length;
		int[]res=new int[size];
		int pos=0;
		for(int a:arr1)
		{
			res[pos]=a;
			pos++;
		}
		for(int b:arr2)
		{
			res[pos]=b;
			pos++;
		}
		for(int c: res)
		{
			System.out.print(c+" ");
		}
	}

}
