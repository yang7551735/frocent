package com.frocent.xgen.genconf.confmanger;

import java.util.HashMap;
import java.util.Map;

import com.frocent.xgen.genconf.vo.GenConfModel;
import com.frocent.xgen.genconf.vo.ModuleConfModel;

/**
 * ��ȡ���һ�����������
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
		//�����Ļ�ȡ�������ݣ���ȡ���������������õ������ϣ���������
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
