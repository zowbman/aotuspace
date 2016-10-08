package com.aotuspace.web.spuser.model.po.deliver.custom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.aotuspace.web.spdictionary.model.po.area.SpDistrictInfo;
import com.aotuspace.web.spdictionary.service.area.ISpAreaService;
import com.aotuspace.web.spuser.model.po.deliver.SpDeliverInfo;
import com.aotuspace.web.util.CustomUtil;

/**
 * 
 * Title:SpDeliverInfoCustom
 * Description:�ջ���ַ��չ��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-29 ����6:30:43
 *
 */

public class SpDeliverInfoCustom extends SpDeliverInfo {

	//@Autowired
	//ISpAreaService iSpAreaService;
	//��ȡspring�����Ӧ�ó���������,����洢spring����ĸ���bean����
	//ʹע����Ҫ����ͨ��ҲҪ��spring���й��������޷��õ�bean
	WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
	ISpAreaService iSpAreaService=(ISpAreaService) webApplicationContext.getBean("iSpAreaService");
	
	//ʡ
	private SpDistrictInfo province;
	//��
	private SpDistrictInfo city;
	//��
	private SpDistrictInfo district;
	//�ֵ�
	private SpDistrictInfo town;
	
	/**
	 * ��ȡ����ID,(ʡ-��-��-��)1-2-3-4���Լ�������
	 * @return
	 */
	public String getArea(){
		List<Integer> area=new ArrayList<Integer>();
		if(this.province!=null&&this.province.getSpId()!=null){
			area.add(this.province.getSpId());
		}
		if(this.city!=null&&this.province.getSpId()!=null){
			area.add(this.city.getSpId());
		}
		if(this.district!=null&&this.district.getSpId()!=null){
			area.add(this.district.getSpId());
		}
		if(this.town!=null&&this.town.getSpId()!=null){
			area.add(this.town.getSpId());
		}
		return CustomUtil.listIToString(area, "-");
	}
	
	/**
	 * ��ȡʡ����Ϣ
	 * @return
	 * @throws Exception
	 */
	public SpDistrictInfo getProvinceName() throws Exception{
		List<Integer> spAreaList=CustomUtil.stringToListI(this.spArea, "-");
		if(spAreaList!=null&&spAreaList.size()>=1){
			return iSpAreaService.findAreaBySpId(spAreaList.get(0));
		}
		return null;
		
	}
	
	/**
	 * ��ȡ������Ϣ
	 * @return
	 * @throws Exception
	 */
	public SpDistrictInfo getCityName() throws Exception{
		List<Integer> spAreaList=CustomUtil.stringToListI(this.spArea, "-");
		if(spAreaList!=null&&spAreaList.size()>=2){
			return iSpAreaService.findAreaBySpId(spAreaList.get(1));
		}
		return null;
	}
	
	/**
	 * ��ȡ����Ϣ
	 * @return
	 * @throws Exception
	 */
	public SpDistrictInfo getDistrictName() throws Exception{
		List<Integer> spAreaList=CustomUtil.stringToListI(this.spArea, "-");
		if(spAreaList!=null&&spAreaList.size()>=3){
			return iSpAreaService.findAreaBySpId(spAreaList.get(2));
		}
		return null;
	}
	
	/**
	 * ��ȡ����Ϣ
	 * @return
	 * @throws Exception
	 */
	public SpDistrictInfo getTownName() throws Exception{
		List<Integer> spAreaList=CustomUtil.stringToListI(this.spArea, "-");
		if(spAreaList!=null&&spAreaList.size()>=4){
			return iSpAreaService.findAreaBySpId(spAreaList.get(3));
		}
		return null;
	}
	
	public SpDistrictInfo getProvince() {
		return province;
	}
	public void setProvince(SpDistrictInfo province) {
		this.province = province;
	}
	public SpDistrictInfo getCity() {
		return city;
	}
	public void setCity(SpDistrictInfo city) {
		this.city = city;
	}
	public SpDistrictInfo getDistrict() {
		return district;
	}
	public void setDistrict(SpDistrictInfo district) {
		this.district = district;
	}
	public SpDistrictInfo getTown() {
		return town;
	}
	public void setTown(SpDistrictInfo town) {
		this.town = town;
	}
	
	
}
