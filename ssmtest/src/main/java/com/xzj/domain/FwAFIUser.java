package com.xzj.domain;

public class FwAFIUser extends BaseObject {

	private static final long serialVersionUID = 1L;

	private Long afiID;// alerting_form_inst.id

	private Long userID;// 用户id

	private String ways;// 发送方式

	private String flag;// 是否成功发送

	public FwAFIUser() {
	}

	public FwAFIUser(Long afiID, Long userID, String ways, String flag) {
		super();
		this.afiID = afiID;
		this.userID = userID;
		this.ways = ways;
		this.flag = flag;
	}

	public Long getAfiID() {
		return afiID;
	}

	public void setAfiID(Long afiID) {
		this.afiID = afiID;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getWays() {
		return ways;
	}

	public void setWays(String ways) {
		this.ways = ways;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "FwAFIUser [afiID=" + afiID + ", userID=" + userID + ", ways=" + ways + ", flag=" + flag + "]";
	}
	
}
