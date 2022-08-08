
package com.globallogic.July25;
import java.util.stream.Stream;

interface Check{
	void check(int a);
}
interface Sum
{
	public int sum(int m);
}
interface greater{
	void num(int b,int c);
}
interface Print{
	void print();
}
interface Upper {
	void upper(String str);
}
public class MyLambda {
    public static void main(String[] args) {
    	Print hello=()->{System.out.println("Hello World");};
    	hello.print();
    	Check n=(a)->
    	{
    		if(a%2==0)
    		{
    			System.out.println("Number " +a + "is Even");
    		}
    		else
    		{
    			System.out.println("Number" + a + "is odd");
    		}
    	};
    	Sum s=(m)->{
    		m=m*(m+1)/2;
    		return m;
    	};
    	System.out.println(s.sum(100));
    	n.check(5);
    	n.check(8);
    	greater g=(b,c)-> {
    		System.out.println("Greater value: "+Integer.max(b, c));
    		System.out.println("Smaller value: "+Integer.min(b,c));
    	};
    	g.num(20,50);
    	g.num(45,76);
    	Upper up=(str)->{
    	System.out.println(str.toUpperCase());
    	};
    	up.upper("helloworld");
    }
}