﻿package ex;
/*
 * Topic: 給定一字串，請將此字串中，每個字元的 ASCII 編碼數值進行加總，輸出其編碼數 值總和。
 * 舉例來說，若輸入之字串為 “abcdefghij” 共 10 個字元，
 * 其 ASCII 編碼依序為 “97 98 99 100 101 102 103 104 105 106” ，
 * 則編碼總和輸出為 1015 。
 * Date: 2016/12/26
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n值:");
		int n = scn.nextInt();
		String s = scn.nextLine();
		int sum = 0;
		for(int i = 0 ; i < n ; i++){
			System.out.print("請輸入字串:");
			String str = scn.nextLine();
			for(int j = 0 ; j < str.length() ; j++){
				char c = str.charAt(j);
				int a = (int)c;
				sum = sum + a;
			}
			System.out.println(sum);
			sum = 0;
		}

	}

}
