package qiang.patten.factory.simpleFactory;

import qiang.patten.factory.po.Mengniu;
import qiang.patten.factory.po.Mulk;
import qiang.patten.factory.po.Telunsu;
import qiang.patten.factory.po.Yili;

public class SimpleMulkFactory {
	
	public Mulk getMulk(String name){
		if("蒙牛".equals(name)){
			return new Mengniu();
		}else if("伊利".equals(name)){
			return new Yili();
		}else if("特仑苏".equals(name)){
			return new Telunsu();
		}else{
			return null;
		}
	}

}
