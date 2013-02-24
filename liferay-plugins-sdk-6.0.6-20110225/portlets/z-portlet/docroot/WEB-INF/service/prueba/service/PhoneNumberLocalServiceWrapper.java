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

/**
 * <p>
 * This class is a wrapper for {@link PhoneNumberLocalService}.
 * </p>
 *
 * @author    Sr. Eladio
 * @see       PhoneNumberLocalService
 * @generated
 */
public class PhoneNumberLocalServiceWrapper implements PhoneNumberLocalService {
	public PhoneNumberLocalServiceWrapper(
		PhoneNumberLocalService phoneNumberLocalService) {
		_phoneNumberLocalService = phoneNumberLocalService;
	}

	/**
	* Adds the phone number to the database. Also notifies the appropriate model listeners.
	*
	* @param phoneNumber the phone number to add
	* @return the phone number that was added
	* @throws SystemException if a system exception occurred
	*/
	public prueba.model.PhoneNumber addPhoneNumber(
		prueba.model.PhoneNumber phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phoneNumberLocalService.addPhoneNumber(phoneNumber);
	}

	/**
	* Creates a new phone number with the primary key. Does not add the phone number to the database.
	*
	* @param numberId the primary key for the new phone number
	* @return the new phone number
	*/
	public prueba.model.PhoneNumber createPhoneNumber(java.lang.String numberId) {
		return _phoneNumberLocalService.createPhoneNumber(numberId);
	}

	/**
	* Deletes the phone number with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param numberId the primary key of the phone number to delete
	* @throws PortalException if a phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deletePhoneNumber(java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_phoneNumberLocalService.deletePhoneNumber(numberId);
	}

	/**
	* Deletes the phone number from the database. Also notifies the appropriate model listeners.
	*
	* @param phoneNumber the phone number to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deletePhoneNumber(prueba.model.PhoneNumber phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		_phoneNumberLocalService.deletePhoneNumber(phoneNumber);
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
		return _phoneNumberLocalService.dynamicQuery(dynamicQuery);
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
		return _phoneNumberLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _phoneNumberLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _phoneNumberLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the phone number with the primary key.
	*
	* @param numberId the primary key of the phone number to get
	* @return the phone number
	* @throws PortalException if a phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public prueba.model.PhoneNumber getPhoneNumber(java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phoneNumberLocalService.getPhoneNumber(numberId);
	}

	/**
	* Gets a range of all the phone numbers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of phone numbers to return
	* @param end the upper bound of the range of phone numbers to return (not inclusive)
	* @return the range of phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<prueba.model.PhoneNumber> getPhoneNumbers(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _phoneNumberLocalService.getPhoneNumbers(start, end);
	}

	/**
	* Gets the number of phone numbers.
	*
	* @return the number of phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public int getPhoneNumbersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phoneNumberLocalService.getPhoneNumbersCount();
	}

	/**
	* Updates the phone number in the database. Also notifies the appropriate model listeners.
	*
	* @param phoneNumber the phone number to update
	* @return the phone number that was updated
	* @throws SystemException if a system exception occurred
	*/
	public prueba.model.PhoneNumber updatePhoneNumber(
		prueba.model.PhoneNumber phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phoneNumberLocalService.updatePhoneNumber(phoneNumber);
	}

	/**
	* Updates the phone number in the database. Also notifies the appropriate model listeners.
	*
	* @param phoneNumber the phone number to update
	* @param merge whether to merge the phone number with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the phone number that was updated
	* @throws SystemException if a system exception occurred
	*/
	public prueba.model.PhoneNumber updatePhoneNumber(
		prueba.model.PhoneNumber phoneNumber, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phoneNumberLocalService.updatePhoneNumber(phoneNumber, merge);
	}

	public PhoneNumberLocalService getWrappedPhoneNumberLocalService() {
		return _phoneNumberLocalService;
	}

	private PhoneNumberLocalService _phoneNumberLocalService;
}