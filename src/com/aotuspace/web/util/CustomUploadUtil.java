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
 * Description:�Զ����ϴ�������
 * Company:autospace
 * @author    zwb
 * @date      2015��12��5�� ����12:26:21
 *
 */
public class CustomUploadUtil {
	
	/**
	 * �洢�ļ����������ļ���
	 * @param multipartFile �ļ�
	 * @param path �洢�ļ��������ַ
	 * @return ͼƬ����
	 * @throws Exception
	 */
	public static List<String> upload(MultipartFile multipartFile,String path) throws Exception{
		List<String> newFileNames=new ArrayList<String>();
		//ԭʼ����
		String originalFilename = multipartFile.getOriginalFilename();
		//�ϴ�ͼƬ
		if (multipartFile != null && originalFilename != null
				&& originalFilename.length() > 0) {
			//�µ�ͼƬ����
			String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
			//��ͼƬ
			File newFile = new File(path + newFileName);
			//���ڴ��е�����д�����
			multipartFile.transferTo(newFile);
			
			newFileNames.add(newFileName);
			//����ͼƬ����
			return newFileNames;
		}
		return null;
	}
	
	/**
	 * �洢�ļ����������ļ���
	 * @param multipartFile �ļ�
	 * @param path �洢�ļ��������ַ
	 * @return ͼƬ����
	 * @throws Exception
	 */
	public static List<String> upload(List<MultipartFile> multipartFiles,String path) throws Exception{
		List<String> newFileNames=new ArrayList<String>();
		for (MultipartFile multipartFile : multipartFiles) {
			//ԭʼ����
			String originalFilename = multipartFile.getOriginalFilename();
			//�ϴ�ͼƬ
			if (multipartFile != null && originalFilename != null
					&& originalFilename.length() > 0) {
				//�µ�ͼƬ����
				String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
				//��ͼƬ
				File newFile = new File(path + newFileName);
				//���ڴ��е�����д�����
				multipartFile.transferTo(newFile);
				//����ͼƬ����
				newFileNames.add(newFileName);
			}
		}
		if(newFileNames.size()>0){
			return newFileNames;
		}
		return null;
	}
	
	/**
	 * �ϴ�ͷ��
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
