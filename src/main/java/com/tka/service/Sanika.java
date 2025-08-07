package com.tka.service;

public class Sanika {
	public static void main(String[] args) {
		int num =7;
		boolean isPrime=true;
		if(num<=1) {
			isPrime=false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+ "is Prime");
		}else {
			System.out.println(num+"is NOT Prime");
		}
	}
}
