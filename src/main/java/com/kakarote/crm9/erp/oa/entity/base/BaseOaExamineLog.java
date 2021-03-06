package com.kakarote.crm9.erp.oa.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOaExamineLog<M extends BaseOaExamineLog<M>> extends Model<M> implements IBean {

	public void setLogId(java.lang.Long logId) {
		set("log_id", logId);
	}
	
	public java.lang.Long getLogId() {
		return getLong("log_id");
	}

	public void setRecordId(java.lang.Integer recordId) {
		set("record_id", recordId);
	}
	
	public java.lang.Integer getRecordId() {
		return getInt("record_id");
	}

	public void setExamineStepId(java.lang.Long examineStepId) {
		set("examine_step_id", examineStepId);
	}
	
	public java.lang.Long getExamineStepId() {
		return getLong("examine_step_id");
	}

	public void setExamineStatus(java.lang.Integer examineStatus) {
		set("examine_status", examineStatus);
	}
	
	public java.lang.Integer getExamineStatus() {
		return getInt("examine_status");
	}

	public void setCreateUser(java.lang.Long createUser) {
		set("create_user", createUser);
	}
	
	public java.lang.Long getCreateUser() {
		return getLong("create_user");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setExamineUser(java.lang.Long examineUser) {
		set("examine_user", examineUser);
	}
	
	public java.lang.Long getExamineUser() {
		return getLong("examine_user");
	}

	public void setExamineTime(java.util.Date examineTime) {
		set("examine_time", examineTime);
	}
	
	public java.util.Date getExamineTime() {
		return get("examine_time");
	}

	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}
	
	public java.lang.String getRemarks() {
		return getStr("remarks");
	}

	public void setIsRecheck(java.lang.Integer isRecheck) {
		set("is_recheck", isRecheck);
	}
	
	public java.lang.Integer getIsRecheck() {
		return getInt("is_recheck");
	}

	public void setOrderId(java.lang.Integer orderId) {
		set("order_id", orderId);
	}
	
	public java.lang.Integer getOrderId() {
		return getInt("order_id");
	}

}
