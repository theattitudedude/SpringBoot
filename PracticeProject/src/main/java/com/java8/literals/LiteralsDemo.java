package com.java8.literals;

public class LiteralsDemo {

	public static void main(String[] args) {
		int integerWithUnderscore = 1_00_000;
		int binaryLiteral = 0B01110;
		int octalLiteral = 025;
		int hexaLieral = 0x0010;
		float floatLiteral = 23.699876f;
		double doubleLiteral = 23.69987;
		char letterN = '\u004E';
		
		System.out.println(binaryLiteral);
		System.out.println("octalliteral: "+octalLiteral);
		System.out.println("hexaLieral:" +hexaLieral);
		System.out.println("floatLiteral: " +floatLiteral);
		System.out.println("doubleLiteral: "+doubleLiteral);
		System.out.println("letterN: " +letterN);
	}

}
