package com.naresh.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.naresh.dao.IVote;
import com.naresh.entity.Voter;
@Repository
public class VoterDaoImpl implements IVote{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void savevoter(Voter voter) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(voter);
	}

	@Override
	public void UpdateById(Voter voterId) {
		// TODO Auto-generated method stub
		 hibernateTemplate.update(voterId);
	}

	@Override
	public List<Voter> getdata() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Voter.class);
	}

	@Override
	public Voter getvoterbyId(Integer voterId) {
		// TODO Auto-generated method stub
		return (Voter) hibernateTemplate.get(Voter.class, voterId);
		
	}

	@Override
	public void deleteById(Voter voter) {
		// TODO Auto-generated method stub
	 hibernateTemplate.delete(voter);
		
	}

}
