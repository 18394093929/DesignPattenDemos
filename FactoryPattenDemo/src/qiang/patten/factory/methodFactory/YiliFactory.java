package qiang.patten.factory.methodFactory;

import qiang.patten.factory.po.Mulk;
import qiang.patten.factory.po.Yili;

public class YiliFactory implements MethodFactory{

	@Override
	public Mulk getMulk() {
		return new Yili();
	}

}
