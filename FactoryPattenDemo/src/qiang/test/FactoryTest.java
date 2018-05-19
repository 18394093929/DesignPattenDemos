package qiang.test;

import qiang.patten.factory.abstractFactory.AbstractMulkFactory;
import qiang.patten.factory.abstractFactory.MulkFactory;
import qiang.patten.factory.methodFactory.MengniuFactory;
import qiang.patten.factory.methodFactory.MethodFactory;
import qiang.patten.factory.methodFactory.YiliFactory;
import qiang.patten.factory.simpleFactory.SimpleMulkFactory;

public class FactoryTest {

	public static void main(String[] args) {
		
		//简单工厂模式------普通的工厂类   
		//1.对用户要求高：用户需要制定所需产品种类。
		//2.耦合度高：公共的逻辑和私有的逻辑都在一个类中实现。
		SimpleMulkFactory factory=new SimpleMulkFactory();
		System.out.println(factory.getMulk("蒙牛").getName());
		System.out.println(factory.getMulk("伊利").getName());
//		System.out.println(factory.getMulk("三鹿").getName());
		
		//方法工厂模式------实现工厂接口的工厂类
		//1.降低了对用户的要求：用户只需选择所需实现类。
		//2.通过接口的不同实现类降低了耦合度，但是无法将公共的逻辑抽象出来。
		MethodFactory factory1=new MengniuFactory();
		MethodFactory factory2=new YiliFactory();
		System.out.println(factory1.getMulk().getName());
		System.out.println(factory2.getMulk().getName());
		
		//抽象工厂模式------继承自抽象工厂类的工厂
		//1.最大程度的方便了用户：用户只需选择所需产品。
		//2.通过抽象工厂类的不同子类降低了耦合度，并且可以将公共的逻辑抽象到抽象工厂类中。
		AbstractMulkFactory factory3=new MulkFactory();
		System.out.println(factory3.getMulkMengniu().getName());
		System.out.println(factory3.getMulkYili().getName());
		
	}
}
