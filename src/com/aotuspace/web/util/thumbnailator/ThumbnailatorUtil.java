package com.aotuspace.web.util.thumbnailator;

import java.io.File;

import net.coobird.thumbnailator.Thumbnails;

/**
 * 缩略图制作工具
 * Title:ThumbnailatorUtil
 * Description:
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-25 下午5:42:09
 *
 */
public class ThumbnailatorUtil {
	
	/**
	 * 单规格制作缩略图
	 * @param spec 规格
	 * @param rootPath 根目录
	 * @param originalPath 原图地址
	 * @param imgPro 图片属性
	 * @throws Exception
	 */
	public static ImgSpec createThumbnailImg(ImgSpec spec,String rootPath,String originalPath,String imgPro) throws Exception{
		if(spec!=null){
			//判断原图是否存在
			File file=new File(rootPath+originalPath);
			if(!file.exists())//不存在就返回null
				return null;
			String thumbnailPath=originalPath+"_"+spec.getImgWidth()+"x"+spec.getImgHeight()+"."+imgPro;
			file=new File(rootPath+thumbnailPath);
			if(!file.exists()){//不存在，创建
				Thumbnails
				.of(new File(rootPath+originalPath))//原图
				.size(spec.getImgWidth(), spec.getImgHeight())
				.outputFormat(imgPro)
				.toFile(rootPath+thumbnailPath);//输出
				file=new File(rootPath+thumbnailPath);
				spec.setImgPath(thumbnailPath);//缩略图
				spec.setImgSize(file.length()/1024);//大小
				spec.setPostfix("."+imgPro);//后缀
			}else{
				return null;
			}
		}
		return spec;
	}
}
