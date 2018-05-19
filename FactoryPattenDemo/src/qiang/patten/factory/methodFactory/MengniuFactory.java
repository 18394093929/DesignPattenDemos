package qiang.patten.factory.methodFactory;

import qiang.patten.factory.po.Mengniu;
import qiang.patten.factory.po.Mulk;
import qiang.patten.factory.po.Yili;

public class MengniuFactory implements MethodFactory{

	@Override
	public Mulk getMulk() {
		return new Mengniu();
	}

}
