package com.naresh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voter {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int voterId;
	
	private String voterParty;
	private String voterArea;
	public Voter() {
		super();
	}
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getVoterParty() {
		return voterParty;
	}
	public void setVoterParty(String voterParty) {
		this.voterParty = voterParty;
	}
	public String getVoterArea() {
		return voterArea;
	}
	public void setVoterArea(String voterArea) {
		this.voterArea = voterArea;
	}
	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", voterParty=" + voterParty + ", voterArea=" + voterArea + "]";
	}
	
}
