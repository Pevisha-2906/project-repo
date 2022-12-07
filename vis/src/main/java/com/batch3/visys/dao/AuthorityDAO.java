package com.batch3.visys.dao;

import java.util.List;

import com.batch3.visys.model.Authorities;

/**
 * Represents the DAO for the Authorities related use case
 * */
public interface AuthorityDAO {
	
	List<Authorities> list();
}
