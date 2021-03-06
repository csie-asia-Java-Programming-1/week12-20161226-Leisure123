﻿package ex;
/*
 * Topic: 輸入一整數 N 及 N 個整數，請依照十進位中各位數字和由小到大排序輸出。如果各位數字和相等則比較數值由小到大排列。
 		例如: 9122 的各位數字和為 9+1+2+2=14、3128 的各位數字和為 3+1+2+8=14 而 5112 的各位數字和為 5+1+1+2=9。
		所以輸入 9122 3128 5112 需輸出 5112 3128 9122 ，這是因為 5112(9) < 3128(14) < 9122(14)，
		其中又因為 3128 與 9122 兩者的各位數字和都是 14，所以將 數值小的 3128 放前面。
 * Date: 2016/12/26
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int data[] = new int [n];
		for(int i = 0 ; i < n ; i++){
			data[i] = scn.nextInt();
		}
		int a = 0;
		for(int i = 0 ; i < n-1 ; i++){
			for(int j = 0 ; j < n-1 ; j++){
				if((fun(data[j]) > fun(data[j+1]))){
					a = data[j];
					data[j] = data[j+1];
					data[j+1] = a;
				}
			}
		}
		for(int i = 0 ; i < n-1 ; i++){
			for(int j = 0 ; j < n-1 ; j++){
				if((data[j] > data[j+1]) && (fun(data[j]) > fun(data[j+1]))){
					a = data[j];
					data[j] = data[j+1];
					data[j+1] = a;
				}
			}
		}
		for(int i = 0 ; i < n ; i++){
			System.out.print(data[i] +"\t");
		}
	}


	public static int fun(int n){
		int sum = 0;
		while(n > 0){
			sum = sum + (n % 10);
			n = n / 10;
		}
		return sum;
	}
}