package com.tom.webapp.persist.dao;

import com.tom.webapp.model.Person;
import java.util.List;

public interface PersonMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * tbl_person
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * tbl_person
     *
     * @mbggenerated
     */
    int insert(Person record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * tbl_person
     *
     * @mbggenerated
     */
    int insertSelective(Person record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * tbl_person
     *
     * @mbggenerated
     */
    Person selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * tbl_person
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Person record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * tbl_person
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Person record);

    List<Person> selectAll();
}