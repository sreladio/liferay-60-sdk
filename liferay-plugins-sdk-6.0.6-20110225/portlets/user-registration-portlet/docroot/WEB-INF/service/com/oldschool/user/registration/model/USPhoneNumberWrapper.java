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
 * This class is a wrapper for {@link USPhoneNumber}.
 * </p>
 *
 * @author    Sr. Eladio
 * @see       USPhoneNumber
 * @generated
 */
public class USPhoneNumberWrapper implements USPhoneNumber {
	public USPhoneNumberWrapper(USPhoneNumber usPhoneNumber) {
		_usPhoneNumber = usPhoneNumber;
	}

	public java.lang.String getPrimaryKey() {
		return _usPhoneNumber.getPrimaryKey();
	}

	public void setPrimaryKey(java.lang.String pk) {
		_usPhoneNumber.setPrimaryKey(pk);
	}

	public java.lang.String getNumberId() {
		return _usPhoneNumber.getNumberId();
	}

	public void setNumberId(java.lang.String numberId) {
		_usPhoneNumber.setNumberId(numberId);
	}

	public long getMemberId() {
		return _usPhoneNumber.getMemberId();
	}

	public void setMemberId(long memberId) {
		_usPhoneNumber.setMemberId(memberId);
	}

	public com.oldschool.user.registration.model.USPhoneNumber toEscapedModel() {
		return _usPhoneNumber.toEscapedModel();
	}

	public boolean isNew() {
		return _usPhoneNumber.isNew();
	}

	public void setNew(boolean n) {
		_usPhoneNumber.setNew(n);
	}

	public boolean isCachedModel() {
		return _usPhoneNumber.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_usPhoneNumber.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _usPhoneNumber.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_usPhoneNumber.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _usPhoneNumber.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _usPhoneNumber.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_usPhoneNumber.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _usPhoneNumber.clone();
	}

	public int compareTo(
		com.oldschool.user.registration.model.USPhoneNumber usPhoneNumber) {
		return _usPhoneNumber.compareTo(usPhoneNumber);
	}

	public int hashCode() {
		return _usPhoneNumber.hashCode();
	}

	public java.lang.String toString() {
		return _usPhoneNumber.toString();
	}

	public java.lang.String toXmlString() {
		return _usPhoneNumber.toXmlString();
	}

	public USPhoneNumber getWrappedUSPhoneNumber() {
		return _usPhoneNumber;
	}

	private USPhoneNumber _usPhoneNumber;
}