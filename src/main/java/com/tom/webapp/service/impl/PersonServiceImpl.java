package com.tom.webapp.service.impl;

import com.tom.webapp.model.Person;
import com.tom.webapp.persist.dao.PersonMapper;
import com.tom.webapp.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper dao;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Person record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(Person record) {
        return dao.insertSelective(record);
    }

    @Override
    public Person selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Person record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Person record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public List<Person> selectAll() {
        return dao.selectAll();
    }
}
