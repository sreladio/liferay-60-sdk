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

package com.oldschool.user.registration.service;

/**
 * <p>
 * This class is a wrapper for {@link USPhoneNumberLocalService}.
 * </p>
 *
 * @author    Sr. Eladio
 * @see       USPhoneNumberLocalService
 * @generated
 */
public class USPhoneNumberLocalServiceWrapper
	implements USPhoneNumberLocalService {
	public USPhoneNumberLocalServiceWrapper(
		USPhoneNumberLocalService usPhoneNumberLocalService) {
		_usPhoneNumberLocalService = usPhoneNumberLocalService;
	}

	/**
	* Adds the u s phone number to the database. Also notifies the appropriate model listeners.
	*
	* @param usPhoneNumber the u s phone number to add
	* @return the u s phone number that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USPhoneNumber addUSPhoneNumber(
		com.oldschool.user.registration.model.USPhoneNumber usPhoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usPhoneNumberLocalService.addUSPhoneNumber(usPhoneNumber);
	}

	/**
	* Creates a new u s phone number with the primary key. Does not add the u s phone number to the database.
	*
	* @param numberId the primary key for the new u s phone number
	* @return the new u s phone number
	*/
	public com.oldschool.user.registration.model.USPhoneNumber createUSPhoneNumber(
		java.lang.String numberId) {
		return _usPhoneNumberLocalService.createUSPhoneNumber(numberId);
	}

	/**
	* Deletes the u s phone number with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param numberId the primary key of the u s phone number to delete
	* @throws PortalException if a u s phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteUSPhoneNumber(java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_usPhoneNumberLocalService.deleteUSPhoneNumber(numberId);
	}

	/**
	* Deletes the u s phone number from the database. Also notifies the appropriate model listeners.
	*
	* @param usPhoneNumber the u s phone number to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteUSPhoneNumber(
		com.oldschool.user.registration.model.USPhoneNumber usPhoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		_usPhoneNumberLocalService.deleteUSPhoneNumber(usPhoneNumber);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usPhoneNumberLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _usPhoneNumberLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usPhoneNumberLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usPhoneNumberLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the u s phone number with the primary key.
	*
	* @param numberId the primary key of the u s phone number to get
	* @return the u s phone number
	* @throws PortalException if a u s phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USPhoneNumber getUSPhoneNumber(
		java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usPhoneNumberLocalService.getUSPhoneNumber(numberId);
	}

	/**
	* Gets a range of all the u s phone numbers.
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
	public java.util.List<com.oldschool.user.registration.model.USPhoneNumber> getUSPhoneNumbers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usPhoneNumberLocalService.getUSPhoneNumbers(start, end);
	}

	/**
	* Gets the number of u s phone numbers.
	*
	* @return the number of u s phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public int getUSPhoneNumbersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usPhoneNumberLocalService.getUSPhoneNumbersCount();
	}

	/**
	* Updates the u s phone number in the database. Also notifies the appropriate model listeners.
	*
	* @param usPhoneNumber the u s phone number to update
	* @return the u s phone number that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USPhoneNumber updateUSPhoneNumber(
		com.oldschool.user.registration.model.USPhoneNumber usPhoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usPhoneNumberLocalService.updateUSPhoneNumber(usPhoneNumber);
	}

	/**
	* Updates the u s phone number in the database. Also notifies the appropriate model listeners.
	*
	* @param usPhoneNumber the u s phone number to update
	* @param merge whether to merge the u s phone number with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the u s phone number that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USPhoneNumber updateUSPhoneNumber(
		com.oldschool.user.registration.model.USPhoneNumber usPhoneNumber,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usPhoneNumberLocalService.updateUSPhoneNumber(usPhoneNumber,
			merge);
	}

	public USPhoneNumberLocalService getWrappedUSPhoneNumberLocalService() {
		return _usPhoneNumberLocalService;
	}

	private USPhoneNumberLocalService _usPhoneNumberLocalService;
}