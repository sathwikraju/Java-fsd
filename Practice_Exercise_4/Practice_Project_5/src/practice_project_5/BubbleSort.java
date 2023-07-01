package practice_project_5;

public class BubbleSort
{
	
	public static void main(String args[])
	{int temp;
		int arr[] = {30, 50, 25, 15, 40, 35};
		for(int i=0;i<arr.length-1;i++){
		    for(int j=0;j<arr.length-1-i;j++){
		      if(arr[j]>arr[j+1]){
		          temp=arr[j];
		          arr[j]=arr[j+1];
		          arr[j+1]=temp;
		      }  
		    }
		}
		
		//sorted Arrays
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}