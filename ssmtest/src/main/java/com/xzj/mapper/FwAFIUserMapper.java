package com.xzj.mapper;

import java.util.List;

import com.xzj.domain.FwAFIUser;

public interface FwAFIUserMapper {
	void insert(FwAFIUser afiUser);

	List<FwAFIUser> queryByafiId(long afiID);// 根据alerting_form_inst.id查询出FwAFIUser

	FwAFIUser getbyUserAndAFI(long userID, long afiID);// 根据userid和alerting_form_inst.id查询出FwAFIUser
}
