package com.lc.ibps.plugin;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.lc.ibps.api.base.context.CurrentContext;
import com.lc.ibps.api.base.model.User;
import com.lc.ibps.base.core.engine.script.IScript;

@Component("ps")
public class PluginScript implements IScript {

	@Resource
	private CurrentContext currentContext;
	
	public String getAccount() {
		User sysUser = currentContext.getCurrentUser();
		if (sysUser == null) {
			return "";
		}
		return sysUser.getAccount();
	}
	
}
