package com.frocent.xgen.genconf;

import java.util.Map;

import com.frocent.xgen.genconf.confmanger.ConfManager;
import com.frocent.xgen.genconf.vo.GenConfModel;
import com.frocent.xgen.genconf.vo.ModuleConfModel;

public class GenConEbo implements GenConEbi{

	private static GenConEbo genConEbo = new GenConEbo();
	
	private GenConEbo(){
		
	}
	
	public GenConEbi getInstance(){
		return genConEbo;
	}
	
	public GenConfModel getGenConf() {
		return ConfManager.getInstance().getGenConfModel();
	}

	public Map<String, ModuleConfModel> getMapModelConf() {
		return ConfManager.getInstance().getMapModuleConf();
	}

}
