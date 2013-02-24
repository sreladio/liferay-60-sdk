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

package prueba.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import prueba.model.Member;
import prueba.model.MemberModel;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the Member service. Represents a row in the &quot;Z_Member&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link prueba.model.MemberModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MemberImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a member model instance should use the {@link prueba.model.Member} interface instead.
 * </p>
 *
 * @author Sr. Eladio
 * @see MemberImpl
 * @see prueba.model.Member
 * @see prueba.model.MemberModel
 * @generated
 */
public class MemberModelImpl extends BaseModelImpl<Member>
	implements MemberModel {
	public static final String TABLE_NAME = "Z_Member";
	public static final Object[][] TABLE_COLUMNS = {
			{ "memberId", new Integer(Types.BIGINT) },
			{ "memberFirstName", new Integer(Types.VARCHAR) },
			{ "memberLastName", new Integer(Types.VARCHAR) },
			{ "memberPhoneNumber", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table Z_Member (memberId LONG not null primary key,memberFirstName VARCHAR(75) null,memberLastName VARCHAR(75) null,memberPhoneNumber VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Z_Member";
	public static final String ORDER_BY_JPQL = " ORDER BY member_.memberLastName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Z_Member.memberLastName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.prueba.model.Member"), true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.prueba.model.Member"), true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.prueba.model.Member"));

	public MemberModelImpl() {
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
		if (_memberFirstName == null) {
			return StringPool.BLANK;
		}
		else {
			return _memberFirstName;
		}
	}

	public void setMemberFirstName(String memberFirstName) {
		_memberFirstName = memberFirstName;
	}

	public String getMemberLastName() {
		if (_memberLastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _memberLastName;
		}
	}

	public void setMemberLastName(String memberLastName) {
		_memberLastName = memberLastName;
	}

	public String getMemberPhoneNumber() {
		if (_memberPhoneNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _memberPhoneNumber;
		}
	}

	public void setMemberPhoneNumber(String memberPhoneNumber) {
		_memberPhoneNumber = memberPhoneNumber;
	}

	public Member toEscapedModel() {
		if (isEscapedModel()) {
			return (Member)this;
		}
		else {
			return (Member)Proxy.newProxyInstance(Member.class.getClassLoader(),
				new Class[] { Member.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					Member.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		MemberImpl memberImpl = new MemberImpl();

		memberImpl.setMemberId(getMemberId());

		memberImpl.setMemberFirstName(getMemberFirstName());

		memberImpl.setMemberLastName(getMemberLastName());

		memberImpl.setMemberPhoneNumber(getMemberPhoneNumber());

		return memberImpl;
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

		Member member = null;

		try {
			member = (Member)obj;
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
	private transient ExpandoBridge _expandoBridge;
}