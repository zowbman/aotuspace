package com.aotuspace.web.util.sort.complarator;

import java.util.Comparator;

import com.aotuspace.web.util.sort.ISortObject;

/**
 * 
 * Title:SpProductBpropertiesComparator
 * Description:�Ƚ���
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-11-20 ����5:00:46
 *
 */
public class ObjectComparator implements Comparator {
	
	ISortObject iSortObject;

	public ObjectComparator(ISortObject iSortObject) {
		this.iSortObject = iSortObject;
	}
	public int compare(Object o1, Object o2) {
		return iSortObject.compare(o1,o2);
		
	}
}
