package Hangry;
import Hangry.Singleton;

public class Hangry{
	public static void main(String [] args){
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2){
			System.out.println("s1 与 s2是同一个实例");
		}else{
			System.out.println("s1 与 s2不是同一个实例");
		}
	}
}
