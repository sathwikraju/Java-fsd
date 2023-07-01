package practice_project_4;

public class SelectionSort
{
	public static void main(String args[])
	{
		int temp;
		int arr[] = {30, 50, 25, 15, 40, 35};
		for(int i=0;i<arr.length-1;i++){
		    for(int j=i+1;j<arr.length;j++){
		      if(arr[i]>arr[j]){
		          temp=arr[i];
		          arr[i]=arr[j];
		          arr[j]=temp;
		      }  
		    }
		}
		
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}