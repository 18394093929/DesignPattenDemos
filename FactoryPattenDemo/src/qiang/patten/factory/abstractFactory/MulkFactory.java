package qiang.patten.factory.abstractFactory;

import qiang.patten.factory.po.Mengniu;
import qiang.patten.factory.po.Mulk;
import qiang.patten.factory.po.Yili;

public class MulkFactory extends AbstractMulkFactory {

	@Override
	public Mulk getMulkMengniu() {
			return new Mengniu();
	}

	@Override
	public Mulk getMulkYili() {
		return new Yili();
	}

}
