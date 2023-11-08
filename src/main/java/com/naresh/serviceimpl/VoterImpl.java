package com.naresh.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naresh.dao.IVote;
import com.naresh.entity.Voter;
import com.naresh.service.VoterService;
@Service
@Transactional
public class VoterImpl implements VoterService{

	@Autowired
	private IVote iVote;
	
	@Override
	public void savevoter(Voter voter) {
		// TODO Auto-generated method stub
		 iVote.savevoter(voter);
		
	}

	@Override
	public void UpdateById(Voter voterId) {
		// TODO Auto-generated method stub
		iVote.UpdateById(voterId);
	}

	@Override
	public List<Voter> getdata() {
		// TODO Auto-generated method stub
		return iVote.getdata();
	}

	@Override
	public Voter getvoterbyId(Integer voterId) {
		// TODO Auto-generated method stub
	return iVote.getvoterbyId(voterId);
	}

	@Override
	public void deleteById(Voter voter) {
		// TODO Auto-generated method stub
	 iVote.deleteById(voter);
	
	}


}
