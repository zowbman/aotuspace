package com.aotuspace.web.spuser.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aotuspace.web.global.jsonmsg.model.JsonMsg;
import com.aotuspace.web.spuser.model.po.deliver.custom.SpDeliverInfoCustom;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;
import com.aotuspace.web.spuser.model.vo.deliver.SpDeliverInfoQueryVo;
import com.aotuspace.web.spuser.service.ISpDeliverService;

/**
 * 
 * Title:SpDeliverController
 * Description:���ͷ�ʽ������
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-29 ����11:55:35
 *
 */

@Controller
@RequestMapping("/deliver")
public class SpDeliverController {
	
	@Autowired
	ISpDeliverService iSpDeliverService;
	
	/**
	 * ����ջ���ַ
	 * @param spDeliverInfoQueryVo
	 * @param httpSession
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public @ResponseBody JsonMsg add(SpDeliverInfoQueryVo spDeliverInfoQueryVo,HttpSession httpSession)throws Exception{
		SpUsersBinfoCustom spUsersC=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");//��ȡ��ǰ�û�
		if(spUsersC!=null){
			spDeliverInfoQueryVo.getSpDeliverC().setSpAtuid(spUsersC.getSpAtuid());//autoid
			spDeliverInfoQueryVo.getSpDeliverC().setSpArea(spDeliverInfoQueryVo.getSpDeliverC().getArea());//����area
			iSpDeliverService.saveDeliver(spDeliverInfoQueryVo);
			return JsonMsg.successJsonMsg();
		}
		return JsonMsg.errorJsonMsg();
	}
	
	
	
	/**
	 * ����Ϊ�����ջ���ַ
	 * @param spId ��ַspid
	 * @param httpSession
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/setDefault/{id}")
	public @ResponseBody JsonMsg setDefault(@PathVariable("id") Integer spId,HttpSession httpSession)throws Exception{
		SpUsersBinfoCustom spUsersC=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");//��ȡ��ǰ�û�
		if(spUsersC!=null){
			SpDeliverInfoQueryVo spDeliverInfoQueryVo=new SpDeliverInfoQueryVo();
			spDeliverInfoQueryVo.setDefaultValue(1);//��0����Ĭ�ϣ�1��Ĭ�ϣ�
			spDeliverInfoQueryVo.setAotuId(spUsersC.getSpAtuid());//aotuId
			spDeliverInfoQueryVo.setSpId(spId);//��Ҫ���õ�spId
			iSpDeliverService.updateSetDefaultDeliver(spDeliverInfoQueryVo);
		}
		return JsonMsg.successJsonMsg();
	}
	
	/**
	 * �޸��ջ���ַ
	 * @param spId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/edit/{id}")
	public @ResponseBody JsonMsg edit(@PathVariable("id") Integer spId) throws Exception{
		SpDeliverInfoCustom spDeliverInfoCustom=iSpDeliverService.findDeliverInfoBySpId(spId);
		return new JsonMsg(100000, "����ɹ�", null, spDeliverInfoCustom);
	}
	
	
	/**
	 * �޸��ύ�ջ���ַ
	 * @param spDeliverInfoQueryVo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editSubmit")
	public @ResponseBody JsonMsg editSubmit(SpDeliverInfoQueryVo spDeliverInfoQueryVo) throws Exception{
		spDeliverInfoQueryVo.getSpDeliverC().setSpArea(spDeliverInfoQueryVo.getSpDeliverC().getArea());//����area
		iSpDeliverService.updateDeliver(spDeliverInfoQueryVo);
		return JsonMsg.successJsonMsg();
	}
	
	/**
	 * ɾ���ջ���ַ
	 * @param spId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete/{id}")
	public @ResponseBody JsonMsg delete(@PathVariable("id") Integer spId)throws Exception{
		iSpDeliverService.deleteDeliver(spId);
		return JsonMsg.successJsonMsg();
	}
}
