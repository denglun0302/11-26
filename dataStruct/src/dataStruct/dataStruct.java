
class myArrayList{
	private int[] array;
	private int size;
	public myArrayList()
	{
		int[]  array=new int[] {1,2,3,4,5};
		
		int size=array.length;
	}
	public  void insert(int index,int e)
	{
		for(int i=size;i>index+1;i--)
		{
			array[i]=array[i-1];
		}
		array[index]=e;
		size++;
		to(array);
	}
	
	public  void to(int[] a)
	{
		for(int i;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}





























//package dataStruct;
//
//public class dataStruct {
//	public static void main(String[] args)
//	{
//		int[] a={1,2,3,4,5};
//		int n=binarySearch(a,5);
//		System.out.println(n);
//	}
//  public static int binarySearch(int[] a,int b)  //¶ş·Ö²éÕÒ
//  {
//	     int start=0;
//	     int end=a.length-1;
//	     
//	     while(start<=end)
//	     {
//	    	 
//	    	 int n=(start+end)/2;
//	    	 if(b>a[n])
//	    	 {
//	    		start=n+1; 
//	    	 }
//	    	 if(b<a[n])
//	    	 {
//	    		 end=n-1;
//	    	 }
//	
//	    	 if(b==a[n])
//	    	 {
//	    		 return n;
//	    	 }
//	    		 
//	    	 
//	     }
//	     
//	     return -1;
//}
//}
