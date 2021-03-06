/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.oldschool.user.registration.model;

/**
 * <p>
 * This class is a wrapper for {@link USMember}.
 * </p>
 *
 * @author    Sr. Eladio
 * @see       USMember
 * @generated
 */
public class USMemberWrapper implements USMember {
	public USMemberWrapper(USMember usMember) {
		_usMember = usMember;
	}

	public long getPrimaryKey() {
		return _usMember.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_usMember.setPrimaryKey(pk);
	}

	public long getMemberId() {
		return _usMember.getMemberId();
	}

	public void setMemberId(long memberId) {
		_usMember.setMemberId(memberId);
	}

	public java.lang.String getMemberFirstName() {
		return _usMember.getMemberFirstName();
	}

	public void setMemberFirstName(java.lang.String memberFirstName) {
		_usMember.setMemberFirstName(memberFirstName);
	}

	public java.lang.String getMemberLastName() {
		return _usMember.getMemberLastName();
	}

	public void setMemberLastName(java.lang.String memberLastName) {
		_usMember.setMemberLastName(memberLastName);
	}

	public java.lang.String getMemberPhoneNumber() {
		return _usMember.getMemberPhoneNumber();
	}

	public void setMemberPhoneNumber(java.lang.String memberPhoneNumber) {
		_usMember.setMemberPhoneNumber(memberPhoneNumber);
	}

	public java.lang.String getMemberEmail() {
		return _usMember.getMemberEmail();
	}

	public void setMemberEmail(java.lang.String memberEmail) {
		_usMember.setMemberEmail(memberEmail);
	}

	public java.util.Date getMemberBirthDate() {
		return _usMember.getMemberBirthDate();
	}

	public void setMemberBirthDate(java.util.Date memberBirthDate) {
		_usMember.setMemberBirthDate(memberBirthDate);
	}

	public long getCompanyId() {
		return _usMember.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_usMember.setCompanyId(companyId);
	}

	public long getGroupId() {
		return _usMember.getGroupId();
	}

	public void setGroupId(long groupId) {
		_usMember.setGroupId(groupId);
	}

	public com.oldschool.user.registration.model.USMember toEscapedModel() {
		return _usMember.toEscapedModel();
	}

	public boolean isNew() {
		return _usMember.isNew();
	}

	public void setNew(boolean n) {
		_usMember.setNew(n);
	}

	public boolean isCachedModel() {
		return _usMember.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_usMember.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _usMember.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_usMember.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _usMember.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _usMember.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_usMember.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _usMember.clone();
	}

	public int compareTo(
		com.oldschool.user.registration.model.USMember usMember) {
		return _usMember.compareTo(usMember);
	}

	public int hashCode() {
		return _usMember.hashCode();
	}

	public java.lang.String toString() {
		return _usMember.toString();
	}

	public java.lang.String toXmlString() {
		return _usMember.toXmlString();
	}

	public USMember getWrappedUSMember() {
		return _usMember;
	}

	private USMember _usMember;
}