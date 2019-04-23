package until;

import java.util.Scanner;

public class UserInput {
	public String getString(String msg){
		while(true){
			Scanner sc=new Scanner(System.in);
			try {
				System.out.println(msg);
				return sc.next();
			} catch (Exception e) {
				System.out.println("请输入整数：");
			}
		}
	}	
	public int getInt(String msg){
		while(true){
			Scanner sc=new Scanner(System.in);
			try {
				System.out.println(msg);
				return sc.nextInt();
			} catch (Exception e) {
				System.out.println("亲输入字符串");
			}
		}
	}	
	public double getDouble(String msg){
		while(true){
			Scanner sc=new Scanner(System.in);
			try {
				System.out.println(msg);
				return sc.nextDouble();
			} catch (Exception e) {
				System.out.println("请输入浮点数");
			}
		}
	}	
}
