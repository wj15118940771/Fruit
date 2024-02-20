package com.wj.wjnew.fruit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Title: Discount
 * @Description:
 * @Author: Administrator
 * @Date: 2024/2/20 16:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Discount {
    private double base = 1 ;//折扣基数
    private Date beginTime = null;//限时
    private Date endTime = null;//限时

    public  double timeCalendarDiscount() {//限时折扣判断
        //设置当前时间
        Calendar date = Calendar.getInstance();
        date.setTime(new Date());
        if(beginTime==null&&endTime==null){
            return base;
        }
        if(beginTime!=null&&endTime==null){
            Calendar begin = Calendar.getInstance();
            begin.setTime(beginTime);
            if(date.after(begin)){
                return base;
            }
            else return 1;
        }

        if(beginTime==null&&endTime!=null){
            Calendar end = Calendar.getInstance();
            end.setTime(endTime);
            if(date.before(endTime)){
                return base;
            }
            else return 1;
        }

        if(beginTime!=null&&endTime!=null){
            Calendar begin = Calendar.getInstance();
            begin.setTime(beginTime);
            Calendar end = Calendar.getInstance();
            end.setTime(endTime);
            if(date.after(beginTime)&&date.before(endTime)){
                return base;
            }
            else return 1;
        }

        return base;
    }
}
