package domain;

import java.io.Serializable;

public class Card implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1009;
	private int cid;
	private String state;
	private int tid;
	private int scoring;
	private double cprice;
	private double cquota;
	public Card() {
		super();
	}
	public Card(int cid, String state, int tid, int scoring, double cprice, double cquota) {
		super();
		this.cid = cid;
		this.state = state;
		this.tid = tid;
		this.scoring = scoring;
		this.cprice = cprice;
		this.cquota = cquota;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getScoring() {
		return scoring;
	}
	public void setScoring(int scoring) {
		this.scoring = scoring;
	}
	public double getCprice() {
		return cprice;
	}
	public void setCprice(double cprice) {
		this.cprice = cprice;
	}
	public double getCquota() {
		return cquota;
	}
	public void setCquota(double cquota) {
		this.cquota = cquota;
	}
	
	@Override
		public String toString() {
			return this.cid+","+this.state+","+this.tid+","+this.scoring+","+this.cprice+","+this.cquota;
		}

}
