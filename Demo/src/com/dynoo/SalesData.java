package com.dynoo;

public class SalesData {

	private int data[]={-1,0,15,24};
	public void displayDetails(){
		
		System.out.println("TEST SALES DISPLAY DATA");
		
		for(int i:data){
			System.out.println("value :"+data[i]);
		}
	}
}
