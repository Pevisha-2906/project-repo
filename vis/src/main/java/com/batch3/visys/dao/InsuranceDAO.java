package com.batch3.visys.dao;

import java.util.List;

import com.batch3.visys.model.InsuranceModel;

/**
 * Represents the DAO for Insurance related use cases
 * */
public interface InsuranceDAO {
	
	boolean save(InsuranceModel insurance);
	
	List<InsuranceModel> list();
	
	boolean delete(int id);
	
	InsuranceModel get(int id);
	
	InsuranceModel getInsuranceBasedOnUserId(int userId);
}
