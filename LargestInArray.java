package training;

public class LargestInArray {
	public static int getLargest(int[]a,int total){
		int temp;
		for(int i=0;i<total;i++)
	 {
			for(int j=0;j<total;j++)
			{
				if (a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-1];
	}
	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		int a[]= {10,20,70,80,33,26};
	int b[]= {50,60,33,55,66,69,33,44};
	System.out.println("Largest: "+ getLargest(a,6));
	System.out.println("Largest: "+ getLargest(b,8));

	}

}

















