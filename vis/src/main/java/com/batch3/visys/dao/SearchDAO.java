package com.batch3.visys.dao;

import com.batch3.visys.model.SearchModel;
import com.batch3.visys.model.UserModel;

/**
 * Represents the DAO for search related use cases
 * */
public interface SearchDAO {
	
	UserModel searchResult(SearchModel search);
}
