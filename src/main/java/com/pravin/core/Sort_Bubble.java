package com.pravin.core;

public class Sort_Bubble {
	public static void main(String[] args) {
		int array[]={1334,235,23,523,52,3532,5325};
		int temp=0;
		for(int i=0;i<array.length;i++){
			for(int j=1;j<array.length-1;j++){
				if(array[j-1]>array[j]){
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		
		for(int k:array){
			System.out.println(k);
		}
	}
}