package practice_project_2;

import java.util.Scanner;

public class BinarySearch
{
	public static void main(String[] args) {
        int arr[]={20, 30, 40, 50, 60, 70, 80, 90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value for Search : ");
        int num= sc.nextInt();
        int mid=0,start=0;
        int end=arr.length;
        boolean flag=false;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==num){
                flag=true;
                break;
            }
            else if(arr[mid]<num)
            start=mid+1;
            else
            end=mid-1;
        }
        if(flag==true)
        System.out.println("Value found at "+mid);
        else
        System.out.println("Value not found");
        
}
}