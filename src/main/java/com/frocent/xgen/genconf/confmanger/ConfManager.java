package com.frocent.xgen.genconf.confmanger;

import java.util.HashMap;
import java.util.Map;

import com.frocent.xgen.genconf.vo.GenConfModel;
import com.frocent.xgen.genconf.vo.ModuleConfModel;

/**
 * 读取并且缓存配置数据
 * @author Administrator
 *
 */
public class ConfManager {

	private static ConfManager manager = null;
	
	private GenConfModel genConfModel = new GenConfModel();
	
	private Map<String,ModuleConfModel> mapModuleConf = new HashMap<String,ModuleConfModel>();
	
	private ConfManager(){
		readConf();
	}
	
	public static ConfManager getInstance(){
		if(manager==null){
			manager = new ConfManager();
		}
		return manager;
	}
	
	private void readConf(){
		//真正的获取配置数据，获取到的配置数据设置到属性上，缓存下来
	}

	/**
	 * @return the genConfModel
	 */
	public GenConfModel getGenConfModel() {
		return genConfModel;
	}

	/**
	 * @return the mapModuleConf
	 */
	public Map<String, ModuleConfModel> getMapModuleConf() {
		return mapModuleConf;
	}
	
}
