package com.frocent.xgen.genconf;

import java.util.Map;

import com.frocent.xgen.genconf.vo.GenConfModel;
import com.frocent.xgen.genconf.vo.ModuleConfModel;

public interface GenConEbi {

	/**
	 * 获取配置数据模型
	 * @return
	 */
	public GenConfModel getGenConf();
	
	/**
	 * 获取需要生成的所有模块的配置
	 * @return key 模块的id value 相应的模块的配置数据
	 */
	public Map<String,ModuleConfModel> getMapModelConf();
	
}
