package person;

public class Test {
	public static void main(String[]args){
		Person taro =new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-0000-0000";
		taro.address="東京";

		System.out.println(taro.name);
		System.out.println(taro.age+"歳");
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println("\r\n");


		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="080-0000-0000";
		jiro.address="埼玉";

		System.out.println(jiro.name);
		System.out.println(jiro.age+"歳");
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println("\r\n");

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="0909-0000-0000";
		hanako.address="千葉";

		System.out.println(hanako.name);
		System.out.println(hanako.age+"歳");
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println("\r\n");

		Robot aibo=new Robot();
		aibo.name="aibo";

		aibo.talk();
		aibo.walk();
		aibo.run();
		System.out.println("\r\n");

		Robot asimo=new Robot();
		asimo.name="asimo";

		asimo.talk();
		asimo.walk();
		asimo.run();
		System.out.println("\r\n");

		Robot pepper=new Robot();
		pepper.name="pepper";

		pepper.talk();
		pepper.walk();
		pepper.run();

	}


}
