package com.aotuspace.web.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.util.Streams;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * Title:CustomUploadUtil
 * Description:自定义上传工具类
 * Company:autospace
 * @author    zwb
 * @date      2015年12月5日 上午12:26:21
 *
 */
public class CustomUploadUtil {
	
	/**
	 * 存储文件方法（单文件）
	 * @param multipartFile 文件
	 * @param path 存储文件的物理地址
	 * @return 图片名称
	 * @throws Exception
	 */
	public static List<String> upload(MultipartFile multipartFile,String path) throws Exception{
		List<String> newFileNames=new ArrayList<String>();
		//原始名称
		String originalFilename = multipartFile.getOriginalFilename();
		//上传图片
		if (multipartFile != null && originalFilename != null
				&& originalFilename.length() > 0) {
			//新的图片名称
			String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
			//新图片
			File newFile = new File(path + newFileName);
			//将内存中的数据写入磁盘
			multipartFile.transferTo(newFile);
			
			newFileNames.add(newFileName);
			//返回图片名称
			return newFileNames;
		}
		return null;
	}
	
	/**
	 * 存储文件方法（多文件）
	 * @param multipartFile 文件
	 * @param path 存储文件的物理地址
	 * @return 图片名称
	 * @throws Exception
	 */
	public static List<String> upload(List<MultipartFile> multipartFiles,String path) throws Exception{
		List<String> newFileNames=new ArrayList<String>();
		for (MultipartFile multipartFile : multipartFiles) {
			//原始名称
			String originalFilename = multipartFile.getOriginalFilename();
			//上传图片
			if (multipartFile != null && originalFilename != null
					&& originalFilename.length() > 0) {
				//新的图片名称
				String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
				//新图片
				File newFile = new File(path + newFileName);
				//将内存中的数据写入磁盘
				multipartFile.transferTo(newFile);
				//返回图片名称
				newFileNames.add(newFileName);
			}
		}
		if(newFileNames.size()>0){
			return newFileNames;
		}
		return null;
	}
	
	/**
	 * 上传头像
	 * @param fileItemStream
	 * @param path
	 * @throws Exception
	 */
	public static String uploadAvatar(FileItemStream fileItemStream,String path,String originalImgName,String spec)throws Exception{
		File destFile = new File(path);
		if (!destFile.exists() && !destFile.isDirectory()) {
			destFile.mkdirs();
		}
		String imgName="";
		InputStream is=new BufferedInputStream(fileItemStream.openStream());
		
		if(originalImgName==null&&spec==null){
			imgName=UUID.randomUUID().toString();
		}else{
			imgName=originalImgName+"_"+spec;
		}
		OutputStream os= new BufferedOutputStream(new FileOutputStream(path+"/"+imgName+".jpg"));
		Streams.copy(is, os, true);
		is.close();
		os.flush();
		os.close();
		return imgName+".jpg";
	}
}
