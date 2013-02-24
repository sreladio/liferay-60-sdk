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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Sr. Eladio
 */
public class USPhoneNumberClp extends BaseModelImpl<USPhoneNumber>
	implements USPhoneNumber {
	public USPhoneNumberClp() {
	}

	public String getPrimaryKey() {
		return _numberId;
	}

	public void setPrimaryKey(String pk) {
		setNumberId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return _numberId;
	}

	public String getNumberId() {
		return _numberId;
	}

	public void setNumberId(String numberId) {
		_numberId = numberId;
	}

	public long getMemberId() {
		return _memberId;
	}

	public void setMemberId(long memberId) {
		_memberId = memberId;
	}

	public USPhoneNumber toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (USPhoneNumber)Proxy.newProxyInstance(USPhoneNumber.class.getClassLoader(),
				new Class[] { USPhoneNumber.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		USPhoneNumberClp clone = new USPhoneNumberClp();

		clone.setNumberId(getNumberId());
		clone.setMemberId(getMemberId());

		return clone;
	}

	public int compareTo(USPhoneNumber usPhoneNumber) {
		int value = 0;

		value = getNumberId().compareTo(usPhoneNumber.getNumberId());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		USPhoneNumberClp usPhoneNumber = null;

		try {
			usPhoneNumber = (USPhoneNumberClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String pk = usPhoneNumber.getPrimaryKey();

		if (getPrimaryKey().equals(pk)) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{numberId=");
		sb.append(getNumberId());
		sb.append(", memberId=");
		sb.append(getMemberId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.oldschool.user.registration.model.USPhoneNumber");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>numberId</column-name><column-value><![CDATA[");
		sb.append(getNumberId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>memberId</column-name><column-value><![CDATA[");
		sb.append(getMemberId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _numberId;
	private long _memberId;
}