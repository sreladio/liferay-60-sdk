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

import com.liferay.portal.service.persistence.BasePersistence;

import com.oldschool.user.registration.model.USPhoneNumber;

/**
 * The persistence interface for the u s phone number service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link USPhoneNumberUtil} to access the u s phone number persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sr. Eladio
 * @see USPhoneNumberPersistenceImpl
 * @see USPhoneNumberUtil
 * @generated
 */
public interface USPhoneNumberPersistence extends BasePersistence<USPhoneNumber> {
	/**
	* Caches the u s phone number in the entity cache if it is enabled.
	*
	* @param usPhoneNumber the u s phone number to cache
	*/
	public void cacheResult(
		com.oldschool.user.registration.model.USPhoneNumber usPhoneNumber);

	/**
	* Caches the u s phone numbers in the entity cache if it is enabled.
	*
	* @param usPhoneNumbers the u s phone numbers to cache
	*/
	public void cacheResult(
		java.util.List<com.oldschool.user.registration.model.USPhoneNumber> usPhoneNumbers);

	/**
	* Creates a new u s phone number with the primary key. Does not add the u s phone number to the database.
	*
	* @param numberId the primary key for the new u s phone number
	* @return the new u s phone number
	*/
	public com.oldschool.user.registration.model.USPhoneNumber create(
		java.lang.String numberId);

	/**
	* Removes the u s phone number with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param numberId the primary key of the u s phone number to remove
	* @return the u s phone number that was removed
	* @throws com.oldschool.user.registration.NoSuchPhoneNumberException if a u s phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USPhoneNumber remove(
		java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchPhoneNumberException;

	public com.oldschool.user.registration.model.USPhoneNumber updateImpl(
		com.oldschool.user.registration.model.USPhoneNumber usPhoneNumber,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the u s phone number with the primary key or throws a {@link com.oldschool.user.registration.NoSuchPhoneNumberException} if it could not be found.
	*
	* @param numberId the primary key of the u s phone number to find
	* @return the u s phone number
	* @throws com.oldschool.user.registration.NoSuchPhoneNumberException if a u s phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USPhoneNumber findByPrimaryKey(
		java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchPhoneNumberException;

	/**
	* Finds the u s phone number with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param numberId the primary key of the u s phone number to find
	* @return the u s phone number, or <code>null</code> if a u s phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USPhoneNumber fetchByPrimaryKey(
		java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the u s phone numbers.
	*
	* @return the u s phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.oldschool.user.registration.model.USPhoneNumber> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USPhoneNumber> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USPhoneNumber> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the u s phone numbers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the u s phone numbers.
	*
	* @return the number of u s phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}