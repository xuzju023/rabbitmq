package com.xzj.domain;

/**
 * 
 * @author caohuan
 *
 */
public class WfRoleUser extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long roleId;//角色ID
	private Long userId;//用户ID
	private Long deptId;//部门ID
	
	private FwUser user;//人员信息
	
	public FwUser getUser() {
		return user;
	}
	public void setUser(FwUser user) {
		this.user = user;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	
}
