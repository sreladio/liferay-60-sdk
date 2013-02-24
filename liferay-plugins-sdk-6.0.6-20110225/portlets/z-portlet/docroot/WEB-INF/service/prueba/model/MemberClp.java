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
public class MemberClp extends BaseModelImpl<Member> implements Member {
	public MemberClp() {
	}

	public long getPrimaryKey() {
		return _memberId;
	}

	public void setPrimaryKey(long pk) {
		setMemberId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_memberId);
	}

	public long getMemberId() {
		return _memberId;
	}

	public void setMemberId(long memberId) {
		_memberId = memberId;
	}

	public String getMemberFirstName() {
		return _memberFirstName;
	}

	public void setMemberFirstName(String memberFirstName) {
		_memberFirstName = memberFirstName;
	}

	public String getMemberLastName() {
		return _memberLastName;
	}

	public void setMemberLastName(String memberLastName) {
		_memberLastName = memberLastName;
	}

	public String getMemberPhoneNumber() {
		return _memberPhoneNumber;
	}

	public void setMemberPhoneNumber(String memberPhoneNumber) {
		_memberPhoneNumber = memberPhoneNumber;
	}

	public Member toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (Member)Proxy.newProxyInstance(Member.class.getClassLoader(),
				new Class[] { Member.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		MemberClp clone = new MemberClp();

		clone.setMemberId(getMemberId());
		clone.setMemberFirstName(getMemberFirstName());
		clone.setMemberLastName(getMemberLastName());
		clone.setMemberPhoneNumber(getMemberPhoneNumber());

		return clone;
	}

	public int compareTo(Member member) {
		int value = 0;

		value = getMemberLastName().compareTo(member.getMemberLastName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		MemberClp member = null;

		try {
			member = (MemberClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = member.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{memberId=");
		sb.append(getMemberId());
		sb.append(", memberFirstName=");
		sb.append(getMemberFirstName());
		sb.append(", memberLastName=");
		sb.append(getMemberLastName());
		sb.append(", memberPhoneNumber=");
		sb.append(getMemberPhoneNumber());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("prueba.model.Member");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>memberId</column-name><column-value><![CDATA[");
		sb.append(getMemberId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>memberFirstName</column-name><column-value><![CDATA[");
		sb.append(getMemberFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>memberLastName</column-name><column-value><![CDATA[");
		sb.append(getMemberLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>memberPhoneNumber</column-name><column-value><![CDATA[");
		sb.append(getMemberPhoneNumber());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _memberId;
	private String _memberFirstName;
	private String _memberLastName;
	private String _memberPhoneNumber;
}