package com.naresh.service;

import java.util.List;

import com.naresh.entity.Voter;

public interface VoterService {

	public abstract void savevoter(Voter voter);
	
	public abstract void UpdateById(Voter voterId);
	
	public abstract List<Voter> getdata();
	
	public abstract Voter getvoterbyId(Integer voterId);
	
	public abstract void deleteById(Voter voter);

}
