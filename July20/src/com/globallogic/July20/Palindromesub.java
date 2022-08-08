package com.globallogic.July20;
import java.util.Scanner;

public class Palindromesub {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		str+=" ";
		String s="";
		for(String val:str.split(" ")) {
			StringBuffer br=new StringBuffer(val);
			br.reverse();
			if(val.length()==1) {
				System.out.print(val+" ");
			}
			else if(val.equals(br.toString()))
			{
				int l=val.length();
				while(l>0) {
					s+="*";			
					l--;
				}
				br.replace(0,val.length(),s);
				System.out.print(br.toString()+" ");
				s="";
			}
			else
			{
				System.out.print(val+" ");
			}
			
		}
	}

}
