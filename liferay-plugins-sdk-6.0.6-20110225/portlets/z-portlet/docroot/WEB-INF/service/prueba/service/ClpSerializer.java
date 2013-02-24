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

package prueba.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import prueba.model.MemberClp;
import prueba.model.PhoneNumberClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "z-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(MemberClp.class.getName())) {
			MemberClp oldCplModel = (MemberClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("prueba.model.impl.MemberImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setMemberId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getMemberId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setMemberFirstName",
							new Class[] { String.class });

					String value1 = oldCplModel.getMemberFirstName();

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setMemberLastName",
							new Class[] { String.class });

					String value2 = oldCplModel.getMemberLastName();

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setMemberPhoneNumber",
							new Class[] { String.class });

					String value3 = oldCplModel.getMemberPhoneNumber();

					method3.invoke(newModel, value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(PhoneNumberClp.class.getName())) {
			PhoneNumberClp oldCplModel = (PhoneNumberClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("prueba.model.impl.PhoneNumberImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setNumberId",
							new Class[] { String.class });

					String value0 = oldCplModel.getNumberId();

					method0.invoke(newModel, value0);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals("prueba.model.impl.MemberImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					MemberClp newModel = new MemberClp();

					Method method0 = oldModelClass.getMethod("getMemberId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setMemberId(value0);

					Method method1 = oldModelClass.getMethod(
							"getMemberFirstName");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setMemberFirstName(value1);

					Method method2 = oldModelClass.getMethod(
							"getMemberLastName");

					String value2 = (String)method2.invoke(oldModel,
							(Object[])null);

					newModel.setMemberLastName(value2);

					Method method3 = oldModelClass.getMethod(
							"getMemberPhoneNumber");

					String value3 = (String)method3.invoke(oldModel,
							(Object[])null);

					newModel.setMemberPhoneNumber(value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals("prueba.model.impl.PhoneNumberImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					PhoneNumberClp newModel = new PhoneNumberClp();

					Method method0 = oldModelClass.getMethod("getNumberId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setNumberId(value0);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static ClassLoader _classLoader;
}