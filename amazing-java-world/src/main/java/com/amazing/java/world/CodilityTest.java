package com.amazing.java.world;

public class CodilityTest {

	public static void main(String[] args) {
		CodilityTest codilityTest = new CodilityTest();
		int b = codilityTest.solution(10, 100, 30);		
		System.out.println("Total Distance need to cover is "+b);
		Test Test = new Test();
		System.out.println(Math.floor(2.9));
	}
	
	
	public int solution(int x , int y ,int d) {
		return (int)Math.ceil((y - x) / (double)d);
	}

}
