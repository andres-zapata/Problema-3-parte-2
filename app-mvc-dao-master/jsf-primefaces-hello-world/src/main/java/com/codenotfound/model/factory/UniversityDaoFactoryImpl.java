package com.codenotfound.model.factory;

import com.codenotfound.model.dao.StudentDao;
import com.codenotfound.model.dao.StudentDaoImpl;

public class UniversityDaoFactoryImpl extends UniversityDaoFactory {
    //public static final String DATASOURCE = "jdbc/ruda_masindivDS";

    @Override
    public StudentDao getStudentDao(){
    	return new StudentDaoImpl();
    }


}
