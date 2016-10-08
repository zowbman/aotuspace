package com.aotuspace.web.util.thumbnailator;

/**
 * ����ͼ
 * Title:ThumbnailImgSpec
 * Description:
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-10 ����11:35:27
 *
 */
public class ImgSpec {

	private Integer imgId;//ͼƬid

	private String imgPath;//ͼƬ·��

	private Integer imgWidth;//ͼƬ��

	private Integer imgHeight;//ͼƬ��

	private Long imgSize;
	
	public ImgSpec(){}
	
	public ImgSpec(Integer imgWidth,Integer imgHeight){
		this.imgWidth=imgWidth;
		this.imgHeight=imgHeight;
	}

	private String postfix;//��׺

	public Integer getImgId() {
		return imgId;
	}

	public void setImgId(Integer imgId) {
		this.imgId = imgId;
	}

	public String getPostfix() {
		return postfix;
	}

	public void setPostfix(String postfix) {
		this.postfix = postfix;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Long getImgSize() {
		return imgSize;
	}

	public void setImgSize(Long imgSize) {
		this.imgSize = imgSize;
	}

	public Integer getImgWidth() {
		return imgWidth;
	}

	public void setImgWidth(Integer imgWidth) {
		this.imgWidth = imgWidth;
	}

	public Integer getImgHeight() {
		return imgHeight;
	}

	public void setImgHeight(Integer imgHeight) {
		this.imgHeight = imgHeight;
	}
}
