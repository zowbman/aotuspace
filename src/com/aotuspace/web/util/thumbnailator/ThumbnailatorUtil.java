package com.aotuspace.web.util.thumbnailator;

import java.io.File;

import net.coobird.thumbnailator.Thumbnails;

/**
 * ����ͼ��������
 * Title:ThumbnailatorUtil
 * Description:
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-25 ����5:42:09
 *
 */
public class ThumbnailatorUtil {
	
	/**
	 * �������������ͼ
	 * @param spec ���
	 * @param rootPath ��Ŀ¼
	 * @param originalPath ԭͼ��ַ
	 * @param imgPro ͼƬ����
	 * @throws Exception
	 */
	public static ImgSpec createThumbnailImg(ImgSpec spec,String rootPath,String originalPath,String imgPro) throws Exception{
		if(spec!=null){
			//�ж�ԭͼ�Ƿ����
			File file=new File(rootPath+originalPath);
			if(!file.exists())//�����ھͷ���null
				return null;
			String thumbnailPath=originalPath+"_"+spec.getImgWidth()+"x"+spec.getImgHeight()+"."+imgPro;
			file=new File(rootPath+thumbnailPath);
			if(!file.exists()){//�����ڣ�����
				Thumbnails
				.of(new File(rootPath+originalPath))//ԭͼ
				.size(spec.getImgWidth(), spec.getImgHeight())
				.outputFormat(imgPro)
				.toFile(rootPath+thumbnailPath);//���
				file=new File(rootPath+thumbnailPath);
				spec.setImgPath(thumbnailPath);//����ͼ
				spec.setImgSize(file.length()/1024);//��С
				spec.setPostfix("."+imgPro);//��׺
			}else{
				return null;
			}
		}
		return spec;
	}
}
