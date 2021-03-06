package Hangry;
class Singleton{
	//1、将构造方法私有化，不允许外界访问
	private Singleton(){
		
	}
	//2、创建类的唯一实例，static变为类的静态成员，及类变量。
	private static Singleton instance = new Singleton();
	//3、提供一个用于外部获取实例的方法，注：static作用是将该方法变为类方法。
	public static Singleton getInstance(){
		return instance;
	}
}
