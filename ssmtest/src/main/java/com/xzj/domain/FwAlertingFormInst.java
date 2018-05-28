package com.xzj.domain;

import java.util.List;

public class FwAlertingFormInst extends BaseObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ruleName;// 规则名?

	private Long formInstID;// 表单实例id
	
	private Long alertingID;//预警ID
	
	private String success;//是否全部成功发送
	
	private String ruleDescribe; //规则描述
	
	private String keyValue; //关键值的json字符串
	/**
	 *以下为非数据库字段 
	 */
	private String alertingName;//预警名称
	
	private String formName;//表单名称
	
	private String applicantName;//申请人名称
	
	private List<String> values; //关键值list
	
	private String deptName;//部门名称
	
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getAlertingName() {
		return alertingName;
	}

	public void setAlertingName(String alertingName) {
		this.alertingName = alertingName;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public Long getAlertingID() {
		return alertingID;
	}

	public void setAlertingID(Long alertingID) {
		this.alertingID = alertingID;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public Long getFormInstID() {
		return formInstID;
	}

	public void setFormInstID(Long formInstID) {
		this.formInstID = formInstID;
	}

	public String getRuleDescribe() {
		return ruleDescribe;
	}

	public void setRuleDescribe(String ruleDescribe) {
		this.ruleDescribe = ruleDescribe;
	}
	

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}
	
	
	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "FwAlertingFormInst [ruleName=" + ruleName + ", formInstID=" + formInstID + ", alertingID=" + alertingID
				+ ", success=" + success + ", ruleDescribe=" + ruleDescribe + ", keyValue=" + keyValue
				+ ", alertingName=" + alertingName + ", formName=" + formName + ", applicantName=" + applicantName
				+ ", values=" + values + "]";
	}


	

	
}
