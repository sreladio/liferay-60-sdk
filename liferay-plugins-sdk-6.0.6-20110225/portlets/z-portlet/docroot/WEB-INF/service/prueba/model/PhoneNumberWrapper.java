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

package prueba.model;

/**
 * <p>
 * This class is a wrapper for {@link PhoneNumber}.
 * </p>
 *
 * @author    Sr. Eladio
 * @see       PhoneNumber
 * @generated
 */
public class PhoneNumberWrapper implements PhoneNumber {
	public PhoneNumberWrapper(PhoneNumber phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	public java.lang.String getPrimaryKey() {
		return _phoneNumber.getPrimaryKey();
	}

	public void setPrimaryKey(java.lang.String pk) {
		_phoneNumber.setPrimaryKey(pk);
	}

	public java.lang.String getNumberId() {
		return _phoneNumber.getNumberId();
	}

	public void setNumberId(java.lang.String numberId) {
		_phoneNumber.setNumberId(numberId);
	}

	public PhoneNumber toEscapedModel() {
		return _phoneNumber.toEscapedModel();
	}

	public boolean isNew() {
		return _phoneNumber.isNew();
	}

	public void setNew(boolean n) {
		_phoneNumber.setNew(n);
	}

	public boolean isCachedModel() {
		return _phoneNumber.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_phoneNumber.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _phoneNumber.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_phoneNumber.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _phoneNumber.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _phoneNumber.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_phoneNumber.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _phoneNumber.clone();
	}

	public int compareTo(PhoneNumber phoneNumber) {
		return _phoneNumber.compareTo(phoneNumber);
	}

	public int hashCode() {
		return _phoneNumber.hashCode();
	}

	public java.lang.String toString() {
		return _phoneNumber.toString();
	}

	public java.lang.String toXmlString() {
		return _phoneNumber.toXmlString();
	}

	public PhoneNumber getWrappedPhoneNumber() {
		return _phoneNumber;
	}

	private PhoneNumber _phoneNumber;
}