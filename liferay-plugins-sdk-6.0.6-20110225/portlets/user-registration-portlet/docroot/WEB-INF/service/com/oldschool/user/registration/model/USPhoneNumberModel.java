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

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the USPhoneNumber service. Represents a row in the &quot;US_USPhoneNumber&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.oldschool.user.registration.model.impl.USPhoneNumberModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.oldschool.user.registration.model.impl.USPhoneNumberImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a u s phone number model instance should use the {@link USPhoneNumber} interface instead.
 * </p>
 *
 * @author Sr. Eladio
 * @see USPhoneNumber
 * @see com.oldschool.user.registration.model.impl.USPhoneNumberImpl
 * @see com.oldschool.user.registration.model.impl.USPhoneNumberModelImpl
 * @generated
 */
public interface USPhoneNumberModel extends BaseModel<USPhoneNumber> {
	/**
	 * Gets the primary key of this u s phone number.
	 *
	 * @return the primary key of this u s phone number
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this u s phone number
	 *
	 * @param pk the primary key of this u s phone number
	 */
	public void setPrimaryKey(String pk);

	/**
	 * Gets the number id of this u s phone number.
	 *
	 * @return the number id of this u s phone number
	 */
	@AutoEscape
	public String getNumberId();

	/**
	 * Sets the number id of this u s phone number.
	 *
	 * @param numberId the number id of this u s phone number
	 */
	public void setNumberId(String numberId);

	/**
	 * Gets the member id of this u s phone number.
	 *
	 * @return the member id of this u s phone number
	 */
	public long getMemberId();

	/**
	 * Sets the member id of this u s phone number.
	 *
	 * @param memberId the member id of this u s phone number
	 */
	public void setMemberId(long memberId);

	/**
	 * Gets a copy of this u s phone number as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public USPhoneNumber toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(USPhoneNumber usPhoneNumber);

	public int hashCode();

	public String toString();

	public String toXmlString();
}