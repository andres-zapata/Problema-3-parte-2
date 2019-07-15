package com.codenotfound.model.factory;




public abstract class DAOFactory {
    public static final int UNIVERSITY_REPOSITORY = 1;

    public static DAOFactory getDAOFactory(int tipo) {
        switch (tipo) {
	        case UNIVERSITY_REPOSITORY:
	            return new UniversityDaoFactoryImpl();            
	        default:
	            return null;
        }
    }




}
