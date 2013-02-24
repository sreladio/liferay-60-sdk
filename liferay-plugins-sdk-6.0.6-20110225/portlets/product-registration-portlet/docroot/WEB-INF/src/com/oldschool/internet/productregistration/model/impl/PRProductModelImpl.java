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

package com.oldschool.internet.productregistration.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.oldschool.internet.productregistration.model.PRProduct;
import com.oldschool.internet.productregistration.model.PRProductModel;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the PRProduct service. Represents a row in the &quot;PR_PRProduct&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.oldschool.internet.productregistration.model.PRProductModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PRProductImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a p r product model instance should use the {@link com.oldschool.internet.productregistration.model.PRProduct} interface instead.
 * </p>
 *
 * @author Sr. Eladio
 * @see PRProductImpl
 * @see com.oldschool.internet.productregistration.model.PRProduct
 * @see com.oldschool.internet.productregistration.model.PRProductModel
 * @generated
 */
public class PRProductModelImpl extends BaseModelImpl<PRProduct>
	implements PRProductModel {
	public static final String TABLE_NAME = "PR_PRProduct";
	public static final Object[][] TABLE_COLUMNS = {
			{ "productId", new Integer(Types.BIGINT) },
			{ "productName", new Integer(Types.VARCHAR) },
			{ "serialNumber", new Integer(Types.VARCHAR) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "groupId", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table PR_PRProduct (productId LONG not null primary key,productName VARCHAR(75) null,serialNumber VARCHAR(75) null,companyId LONG,groupId LONG)";
	public static final String TABLE_SQL_DROP = "drop table PR_PRProduct";
	public static final String ORDER_BY_JPQL = " ORDER BY prProduct.productName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY PR_PRProduct.productName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.oldschool.internet.productregistration.model.PRProduct"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.oldschool.internet.productregistration.model.PRProduct"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.oldschool.internet.productregistration.model.PRProduct"));

	public PRProductModelImpl() {
	}

	public long getPrimaryKey() {
		return _productId;
	}

	public void setPrimaryKey(long pk) {
		setProductId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_productId);
	}

	public long getProductId() {
		return _productId;
	}

	public void setProductId(long productId) {
		_productId = productId;
	}

	public String getProductName() {
		if (_productName == null) {
			return StringPool.BLANK;
		}
		else {
			return _productName;
		}
	}

	public void setProductName(String productName) {
		_productName = productName;
	}

	public String getSerialNumber() {
		if (_serialNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _serialNumber;
		}
	}

	public void setSerialNumber(String serialNumber) {
		_serialNumber = serialNumber;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public PRProduct toEscapedModel() {
		if (isEscapedModel()) {
			return (PRProduct)this;
		}
		else {
			return (PRProduct)Proxy.newProxyInstance(PRProduct.class.getClassLoader(),
				new Class[] { PRProduct.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					PRProduct.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		PRProductImpl prProductImpl = new PRProductImpl();

		prProductImpl.setProductId(getProductId());

		prProductImpl.setProductName(getProductName());

		prProductImpl.setSerialNumber(getSerialNumber());

		prProductImpl.setCompanyId(getCompanyId());

		prProductImpl.setGroupId(getGroupId());

		return prProductImpl;
	}

	public int compareTo(PRProduct prProduct) {
		int value = 0;

		value = getProductName().compareTo(prProduct.getProductName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PRProduct prProduct = null;

		try {
			prProduct = (PRProduct)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = prProduct.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{productId=");
		sb.append(getProductId());
		sb.append(", productName=");
		sb.append(getProductName());
		sb.append(", serialNumber=");
		sb.append(getSerialNumber());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.oldschool.internet.productregistration.model.PRProduct");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>productId</column-name><column-value><![CDATA[");
		sb.append(getProductId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productName</column-name><column-value><![CDATA[");
		sb.append(getProductName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serialNumber</column-name><column-value><![CDATA[");
		sb.append(getSerialNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _productId;
	private String _productName;
	private String _serialNumber;
	private long _companyId;
	private long _groupId;
	private transient ExpandoBridge _expandoBridge;
}