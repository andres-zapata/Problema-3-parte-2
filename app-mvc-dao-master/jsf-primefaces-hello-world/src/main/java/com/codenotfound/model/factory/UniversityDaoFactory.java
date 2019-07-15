package com.codenotfound.model.factory;

import com.codenotfound.model.dao.StudentDao;

public abstract class UniversityDaoFactory extends DAOFactory{

    public abstract StudentDao getStudentDao();
    
}
