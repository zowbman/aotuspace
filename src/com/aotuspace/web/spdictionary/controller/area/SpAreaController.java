package com.aotuspace.web.spdictionary.controller.area;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aotuspace.web.global.jsonmsg.model.JsonMsg;
import com.aotuspace.web.spdictionary.model.po.area.SpDistrictInfo;
import com.aotuspace.web.spdictionary.service.area.ISpAreaService;

/**
 * ʡ����controller
 * Title:SpAreaController
 * Description:
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-29 ����5:07:03
 *
 */
@Controller
@RequestMapping("/area")
public class SpAreaController {
	
	@Autowired
	ISpAreaService iSpAreaService;
	
	/**
	 * ��ѯ�¼�����
	 * @param higherId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/lowerArea")
	public @ResponseBody JsonMsg lowerArea(Integer higherId) throws Exception{
		if(higherId!=null){
			List<SpDistrictInfo> lowerArea= iSpAreaService.findAreaList(higherId);
			return new JsonMsg(100000, "����ɹ�", null, lowerArea);
		}
		return JsonMsg.successJsonMsg();
	}
}
