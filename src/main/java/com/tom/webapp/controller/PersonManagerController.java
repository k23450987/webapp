package com.tom.webapp.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tom.webapp.model.Person;
import com.tom.webapp.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller 类
 * Created by T on 2017/7/14.
 */
@Controller
public class PersonManagerController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/personList")
    @ResponseBody
    public PageInfo<Person> getPersonList() {
        // for (int i = 0; i < 10 ; i++) {
        // 	Person person = new Person("王"+ i ,"male", 18 + i ,"13245678911","usa");
        // 	personService.insert(person);
        // }
        // mybatis 分頁插件
        PageHelper.startPage(1, 10);
        List<Person> personList = personService.selectAll();
        // 使用 PageInfo 封装
        return new PageInfo<>(personList);
    }
}
