package com.yulintu.yulintu_mvc.mvc.spring;

/**
 * Created by qianjiajia on 2016/11/25.
 */
public class PersonAction {

    private PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public void savePerson(){
        this.personService.savePerson();
    }
}
