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

package com.oldschool.user.registration.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.oldschool.user.registration.model.USPhoneNumber;

import java.util.List;

/**
 * The persistence utility for the u s phone number service. This utility wraps {@link USPhoneNumberPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sr. Eladio
 * @see USPhoneNumberPersistence
 * @see USPhoneNumberPersistenceImpl
 * @generated
 */
public class USPhoneNumberUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(USPhoneNumber usPhoneNumber) {
		getPersistence().clearCache(usPhoneNumber);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<USPhoneNumber> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<USPhoneNumber> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<USPhoneNumber> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static USPhoneNumber remove(USPhoneNumber usPhoneNumber)
		throws SystemException {
		return getPersistence().remove(usPhoneNumber);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static USPhoneNumber update(USPhoneNumber usPhoneNumber,
		boolean merge) throws SystemException {
		return getPersistence().update(usPhoneNumber, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static USPhoneNumber update(USPhoneNumber usPhoneNumber,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(usPhoneNumber, merge, serviceContext);
	}

	/**
	* Caches the u s phone number in the entity cache if it is enabled.
	*
	* @param usPhoneNumber the u s phone number to cache
	*/
	public static void cacheResult(
		com.oldschool.user.registration.model.USPhoneNumber usPhoneNumber) {
		getPersistence().cacheResult(usPhoneNumber);
	}

	/**
	* Caches the u s phone numbers in the entity cache if it is enabled.
	*
	* @param usPhoneNumbers the u s phone numbers to cache
	*/
	public static void cacheResult(
		java.util.List<com.oldschool.user.registration.model.USPhoneNumber> usPhoneNumbers) {
		getPersistence().cacheResult(usPhoneNumbers);
	}

	/**
	* Creates a new u s phone number with the primary key. Does not add the u s phone number to the database.
	*
	* @param numberId the primary key for the new u s phone number
	* @return the new u s phone number
	*/
	public static com.oldschool.user.registration.model.USPhoneNumber create(
		java.lang.String numberId) {
		return getPersistence().create(numberId);
	}

	/**
	* Removes the u s phone number with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param numberId the primary key of the u s phone number to remove
	* @return the u s phone number that was removed
	* @throws com.oldschool.user.registration.NoSuchPhoneNumberException if a u s phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USPhoneNumber remove(
		java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchPhoneNumberException {
		return getPersistence().remove(numberId);
	}

	public static com.oldschool.user.registration.model.USPhoneNumber updateImpl(
		com.oldschool.user.registration.model.USPhoneNumber usPhoneNumber,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(usPhoneNumber, merge);
	}

	/**
	* Finds the u s phone number with the primary key or throws a {@link com.oldschool.user.registration.NoSuchPhoneNumberException} if it could not be found.
	*
	* @param numberId the primary key of the u s phone number to find
	* @return the u s phone number
	* @throws com.oldschool.user.registration.NoSuchPhoneNumberException if a u s phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USPhoneNumber findByPrimaryKey(
		java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchPhoneNumberException {
		return getPersistence().findByPrimaryKey(numberId);
	}

	/**
	* Finds the u s phone number with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param numberId the primary key of the u s phone number to find
	* @return the u s phone number, or <code>null</code> if a u s phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USPhoneNumber fetchByPrimaryKey(
		java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(numberId);
	}

	/**
	* Finds all the u s phone numbers.
	*
	* @return the u s phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USPhoneNumber> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the u s phone numbers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of u s phone numbers to return
	* @param end the upper bound of the range of u s phone numbers to return (not inclusive)
	* @return the range of u s phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USPhoneNumber> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the u s phone numbers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of u s phone numbers to return
	* @param end the upper bound of the range of u s phone numbers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of u s phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USPhoneNumber> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the u s phone numbers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the u s phone numbers.
	*
	* @return the number of u s phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static USPhoneNumberPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (USPhoneNumberPersistence)PortletBeanLocatorUtil.locate(com.oldschool.user.registration.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					USPhoneNumberPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(USPhoneNumberPersistence persistence) {
		_persistence = persistence;
	}

	private static USPhoneNumberPersistence _persistence;
}