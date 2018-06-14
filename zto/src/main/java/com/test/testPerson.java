package com.test;

import com.dao.PersonDaoImpl;
import com.entity.ZtoRequestData;
import com.utils.DateConversion;

/**
 * Created by Vincent on 2018-06-13.
 */
public class testPerson {

    public static void main(String[] args){

        ZtoRequestData ztoRequestData = new ZtoRequestData();
        ztoRequestData.setSortPortCode("011");
        ztoRequestData.setPackageCode("3333");
        ztoRequestData.setBindingTime(DateConversion.getDateTimeDaysAgo(1));
        ztoRequestData.setEmployeeCode("232");
        ztoRequestData.setEmployeeName("测试");
        ztoRequestData.setSiteName("中通");
        ztoRequestData.setUploadTime(DateConversion.getDateTimeDaysAgo(2));
        ztoRequestData.setLineCode("01");
        ztoRequestData.setPdaCode("02");

        PersonDaoImpl personDao = new PersonDaoImpl();
        personDao.save(ztoRequestData);

    }
}
