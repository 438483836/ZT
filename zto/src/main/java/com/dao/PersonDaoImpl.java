package com.dao;

import com.entity.ZtoRequestData;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Vincent on 2018-06-13.
 */
@Repository
public class PersonDaoImpl implements PersonDao{

    @Autowired
    private SessionFactory sessionFactory;


    public ZtoRequestData save(ZtoRequestData ztoRequestData) {
        return (ZtoRequestData)sessionFactory.getCurrentSession().save(ztoRequestData);
    }
}
