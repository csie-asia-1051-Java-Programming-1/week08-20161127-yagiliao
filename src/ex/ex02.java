package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021039 廖野吉
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入數字");
		int val=scn.nextInt();
		System.out.println("請輸入這是幾進位");
		double way=scn.nextInt();
		System.out.println("請輸入要轉換為幾進位");
		int last=scn.nextInt();
		System.out.println(fun(val,way,last));
	}
	public static String fun(int val,double way,int last){
		double a,sum=0;
		String b="";
		b=Integer.toString(val);
		double c=b.length()-1;
		for(int i=0;i<b.length();i++){
			sum=sum+(b.charAt(i)-48)*(Math.pow(way,c));
			c--;
		}
		b="";
		int tal=(int)sum;
		while(tal>0){
			b=Integer.toString(tal%last)+b;
			tal=tal/last;
		}
		return b;
	}
}
