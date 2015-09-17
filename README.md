 单例模式
 应用场合：有些对象只需要一个类，例如：皇帝、老婆
 作用：保证整个应用程序中某个实例有且只有一个
 类型：饿汉模式、懒汉模式


饿汉模式实现： 
 1、将类的构造方法私有化 
 	private Singleton(){}
 2、创建类的唯一实例，使用private static 修饰
 	private static Singleton instance = new Singleton()
 3、提供一个用于获取实例的方法，使用public static 修饰
 此时，创建了一个唯一的实例，永远只创建一次。
 	
懒汉模式实现： 
 1、将类的构造方法私有化 
 	private Singleton(){}
 2、声明类的唯一实例，使用private static 修饰
 	private static Singleton instance;
 3、提供一个用于获取实例的方法，(此处会加一个判断，如果实例为空，则创建实例，如果不为空，直接返回实例)使用public static 修饰
 此时，创建了一个唯一的实例，永远只创建一次。
 


 区别： 饿汉模式加载类时比较慢（需要创建实例），但运行时获取对象速度快，线程安全。
 		懒汉模式加载类时比较快，但运行获取对象时速度慢，线程不安全。
