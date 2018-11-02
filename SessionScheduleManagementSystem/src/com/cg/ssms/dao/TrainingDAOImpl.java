package com.cg.ssms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;





import org.springframework.stereotype.Repository;

import com.cg.ssms.dto.Client;
@Repository ("trainingdao")

public class TrainingDAOImpl implements TrainingDAO{
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Client> getAllDetails() {
		// TODO Auto-generated method stub
		Query queryGet=em.createQuery("FROM Client");
		List<Client> myList=queryGet.getResultList();
		return myList;
	}

}
