package com.java.practice;

public class Ex6_2 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		tvArr[0].channel = 1;
		tvArr[1].channel = 2;
		tvArr[2].channel = 3;
		
		for(int i=0; i<tvArr.length; i++) {
			System.out.println(tvArr[i].channel);
		}
	}

}
