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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Sr. Eladio
 */
public class PhoneNumberClp extends BaseModelImpl<PhoneNumber>
	implements PhoneNumber {
	public PhoneNumberClp() {
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

	public PhoneNumber toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (PhoneNumber)Proxy.newProxyInstance(PhoneNumber.class.getClassLoader(),
				new Class[] { PhoneNumber.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		PhoneNumberClp clone = new PhoneNumberClp();

		clone.setNumberId(getNumberId());

		return clone;
	}

	public int compareTo(PhoneNumber phoneNumber) {
		int value = 0;

		value = getNumberId().compareTo(phoneNumber.getNumberId());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PhoneNumberClp phoneNumber = null;

		try {
			phoneNumber = (PhoneNumberClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String pk = phoneNumber.getPrimaryKey();

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
		StringBundler sb = new StringBundler(3);

		sb.append("{numberId=");
		sb.append(getNumberId());

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append("prueba.model.PhoneNumber");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>numberId</column-name><column-value><![CDATA[");
		sb.append(getNumberId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _numberId;
}