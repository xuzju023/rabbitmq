package com.xzj.mapper;

import java.util.List;
import java.util.Map;

import com.xzj.domain.FwAlertingFormInst;

public interface FwAlertingFormInstMapper {

	FwAlertingFormInst querybyRuleNameAndInsid(String ruleName, Long formInstId);

	void saveRuleName(FwAlertingFormInst afi);

	List<FwAlertingFormInst> queryAlertingFormInst(Map<String, Object> params);

	int countAlertingFormInst(Map<String, Object> params);
}
