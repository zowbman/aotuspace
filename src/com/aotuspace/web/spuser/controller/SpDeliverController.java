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
 * Description:配送方式控制器
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-29 上午11:55:35
 *
 */

@Controller
@RequestMapping("/deliver")
public class SpDeliverController {
	
	@Autowired
	ISpDeliverService iSpDeliverService;
	
	/**
	 * 添加收货地址
	 * @param spDeliverInfoQueryVo
	 * @param httpSession
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public @ResponseBody JsonMsg add(SpDeliverInfoQueryVo spDeliverInfoQueryVo,HttpSession httpSession)throws Exception{
		SpUsersBinfoCustom spUsersC=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");//获取当前用户
		if(spUsersC!=null){
			spDeliverInfoQueryVo.getSpDeliverC().setSpAtuid(spUsersC.getSpAtuid());//autoid
			spDeliverInfoQueryVo.getSpDeliverC().setSpArea(spDeliverInfoQueryVo.getSpDeliverC().getArea());//设置area
			iSpDeliverService.saveDeliver(spDeliverInfoQueryVo);
			return JsonMsg.successJsonMsg();
		}
		return JsonMsg.errorJsonMsg();
	}
	
	
	
	/**
	 * 设置为常用收货地址
	 * @param spId 地址spid
	 * @param httpSession
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/setDefault/{id}")
	public @ResponseBody JsonMsg setDefault(@PathVariable("id") Integer spId,HttpSession httpSession)throws Exception{
		SpUsersBinfoCustom spUsersC=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");//获取当前用户
		if(spUsersC!=null){
			SpDeliverInfoQueryVo spDeliverInfoQueryVo=new SpDeliverInfoQueryVo();
			spDeliverInfoQueryVo.setDefaultValue(1);//（0：不默认，1：默认）
			spDeliverInfoQueryVo.setAotuId(spUsersC.getSpAtuid());//aotuId
			spDeliverInfoQueryVo.setSpId(spId);//将要设置的spId
			iSpDeliverService.updateSetDefaultDeliver(spDeliverInfoQueryVo);
		}
		return JsonMsg.successJsonMsg();
	}
	
	/**
	 * 修改收货地址
	 * @param spId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/edit/{id}")
	public @ResponseBody JsonMsg edit(@PathVariable("id") Integer spId) throws Exception{
		SpDeliverInfoCustom spDeliverInfoCustom=iSpDeliverService.findDeliverInfoBySpId(spId);
		return new JsonMsg(100000, "请求成功", null, spDeliverInfoCustom);
	}
	
	
	/**
	 * 修改提交收货地址
	 * @param spDeliverInfoQueryVo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editSubmit")
	public @ResponseBody JsonMsg editSubmit(SpDeliverInfoQueryVo spDeliverInfoQueryVo) throws Exception{
		spDeliverInfoQueryVo.getSpDeliverC().setSpArea(spDeliverInfoQueryVo.getSpDeliverC().getArea());//设置area
		iSpDeliverService.updateDeliver(spDeliverInfoQueryVo);
		return JsonMsg.successJsonMsg();
	}
	
	/**
	 * 删除收货地址
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
