package com.yulintu.yulintu_mvc.mvc.spring;

/**
 * Created by qianjiajia on 2016/11/25.
 */
public class PersonServiceImp1 implements PersonService {

    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    /**
     * 给属性personDao依赖注入的时候调用set方法
     * @param personDao
     */
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void savePerson() {
        this.personDao.savePerson();
    }
}
