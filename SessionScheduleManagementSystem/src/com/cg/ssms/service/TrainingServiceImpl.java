package com.cg.ssms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ssms.dao.TrainingDAO;
import com.cg.ssms.dto.Client;

@Service ("trainingservice")
@Transactional
public class TrainingServiceImpl implements TrainingService{
	@Autowired
	TrainingDAO trainingdao;

	@Override
	public List<Client> getAllDetails() {
		// TODO Auto-generated method stub
		return trainingdao.getAllDetails();
	}

}
