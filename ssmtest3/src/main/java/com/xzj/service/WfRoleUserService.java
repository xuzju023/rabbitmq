package com.xzj.service;

import java.util.List;

import com.xzj.domain.WfRoleUser;
import com.xzj.page.PageSet;

/**
 * 流程角色用户service
 * @author caohuan
 *
 */
public interface WfRoleUserService {
	
	public List<WfRoleUser> getWfRoleUserByRoleId(int roleId);
}
