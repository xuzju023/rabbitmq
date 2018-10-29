package com.xzj.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 实体基类
 * 
 * @author caohuan
 * 
 */
public class BaseObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Long id;

	/**
	 * 创建人名�?
	 */
	protected String createdName;

	/**
	 * 更新人名�?
	 */
	protected String updatedName;

	/**
	 * 创建�?
	 */
	protected Long createdBy;

	/**
	 * 创建日期
	 */
	protected Timestamp creationDate;

	/**
	 * 修改�?
	 */
	protected Long updatedBy;

	/**
	 * 修改日期
	 */
	protected Timestamp updationDate;

	/**
	 * 是否可用
	 */
	protected String enabledFlag = "Y";

	private Long appUserId;
	

	public Long getAppUserId() {
		return appUserId;
	}

	public void setAppUserId(Long appUserId) {
		this.appUserId = appUserId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdationDate() {
		return updationDate;
	}

	public void setUpdationDate(Timestamp updationDate) {
		this.updationDate = updationDate;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

	public String getCreatedName() {
		return createdName;
	}

	public void setCreatedName(String createdName) {
		this.createdName = createdName;
	}

	public String getUpdatedName() {
		return updatedName;
	}

	public void setUpdatedName(String updatedName) {
		this.updatedName = updatedName;
	}

}
