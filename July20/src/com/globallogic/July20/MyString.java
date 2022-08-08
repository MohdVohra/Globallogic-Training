package com.globallogic.July20;
import java.lang.String;
import java.util.Scanner;

public class MyString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		str=str+" ";
		char ch;
		String st="";
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch!='.'&&ch!=','&&ch!=' '&&ch!='	'&&ch!='/') {
				st=st+ch;
				//System.out.println(br.reverse());
			}
			else
			{
				StringBuilder br=new StringBuilder();
				br.append(st);
				br.reverse();
				System.out.print(br.toString());
				//System.out.print(st);
				System.out.print(ch);
				st="";
			}
				
		}
	}

}
