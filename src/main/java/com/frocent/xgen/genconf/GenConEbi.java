package com.frocent.xgen.genconf;

import java.util.Map;

import com.frocent.xgen.genconf.vo.GenConfModel;
import com.frocent.xgen.genconf.vo.ModuleConfModel;

public interface GenConEbi {

	/**
	 * ��ȡ��������ģ��
	 * @return
	 */
	public GenConfModel getGenConf();
	
	/**
	 * ��ȡ��Ҫ���ɵ�����ģ�������
	 * @return key ģ���id value ��Ӧ��ģ�����������
	 */
	public Map<String,ModuleConfModel> getMapModelConf();
	
}
