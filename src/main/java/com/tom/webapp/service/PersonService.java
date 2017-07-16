package com.tom.webapp.service;

import com.tom.webapp.model.Person;
import java.util.List;

/**
 * Created by T on 2017/7/15.
 */
public interface PersonService {

	int deleteByPrimaryKey(Integer id);

	int insert(Person record);

	int insertSelective(Person record);

	Person selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Person record);

	int updateByPrimaryKey(Person record);

	List<Person> selectAll();

}
