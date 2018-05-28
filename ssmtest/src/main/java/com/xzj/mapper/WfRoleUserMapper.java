package com.xzj.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.xzj.domain.WfRoleUser;

/**
 * 用户角色DAO
 * @author caohuan
 *
 */
public interface WfRoleUserMapper {
	
	public List<WfRoleUser> getWfRoleUserByRoleId(int roleId);

}
