package com.bigniu.util.date;

import java.util.Date;

public class Use_date {
	public static int ispunch_card(Date old_date,Date new_date){
		if(DateUtil_2.getYear(old_date)==DateUtil_2.getYear(new_date)&&DateUtil_2.getMonth(old_date)==DateUtil_2.getMonth(new_date))
				if(DateUtil_2.getDayOfMonth(new_date)-DateUtil_2.getDayOfMonth(old_date)==1)
				{
					return 1;//明天
				}else if(DateUtil_2.getDayOfMonth(new_date)-DateUtil_2.getDayOfMonth(old_date)==0){
					return 2;//今天
				}else if(DateUtil_2.getDayOfMonth(new_date)-DateUtil_2.getDayOfMonth(old_date)==-1){
					return 3;//昨天
				}
		return 0;
	}
}
