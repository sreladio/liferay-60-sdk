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

package prueba.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import prueba.model.PhoneNumber;

/**
 * The persistence interface for the phone number service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link PhoneNumberUtil} to access the phone number persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sr. Eladio
 * @see PhoneNumberPersistenceImpl
 * @see PhoneNumberUtil
 * @generated
 */
public interface PhoneNumberPersistence extends BasePersistence<PhoneNumber> {
	/**
	* Caches the phone number in the entity cache if it is enabled.
	*
	* @param phoneNumber the phone number to cache
	*/
	public void cacheResult(prueba.model.PhoneNumber phoneNumber);

	/**
	* Caches the phone numbers in the entity cache if it is enabled.
	*
	* @param phoneNumbers the phone numbers to cache
	*/
	public void cacheResult(
		java.util.List<prueba.model.PhoneNumber> phoneNumbers);

	/**
	* Creates a new phone number with the primary key. Does not add the phone number to the database.
	*
	* @param numberId the primary key for the new phone number
	* @return the new phone number
	*/
	public prueba.model.PhoneNumber create(java.lang.String numberId);

	/**
	* Removes the phone number with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param numberId the primary key of the phone number to remove
	* @return the phone number that was removed
	* @throws prueba.NoSuchPhoneNumberException if a phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public prueba.model.PhoneNumber remove(java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			prueba.NoSuchPhoneNumberException;

	public prueba.model.PhoneNumber updateImpl(
		prueba.model.PhoneNumber phoneNumber, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the phone number with the primary key or throws a {@link prueba.NoSuchPhoneNumberException} if it could not be found.
	*
	* @param numberId the primary key of the phone number to find
	* @return the phone number
	* @throws prueba.NoSuchPhoneNumberException if a phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public prueba.model.PhoneNumber findByPrimaryKey(java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			prueba.NoSuchPhoneNumberException;

	/**
	* Finds the phone number with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param numberId the primary key of the phone number to find
	* @return the phone number, or <code>null</code> if a phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public prueba.model.PhoneNumber fetchByPrimaryKey(java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the phone numbers.
	*
	* @return the phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<prueba.model.PhoneNumber> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the phone numbers.
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
	public java.util.List<prueba.model.PhoneNumber> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the phone numbers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of phone numbers to return
	* @param end the upper bound of the range of phone numbers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<prueba.model.PhoneNumber> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the phone numbers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the phone numbers.
	*
	* @return the number of phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets all the members associated with the phone number.
	*
	* @param pk the primary key of the phone number to get the associated members for
	* @return the members associated with the phone number
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<prueba.model.Member> getMembers(java.lang.String pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the members associated with the phone number.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the phone number to get the associated members for
	* @param start the lower bound of the range of phone numbers to return
	* @param end the upper bound of the range of phone numbers to return (not inclusive)
	* @return the range of members associated with the phone number
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<prueba.model.Member> getMembers(java.lang.String pk,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets an ordered range of all the members associated with the phone number.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the phone number to get the associated members for
	* @param start the lower bound of the range of phone numbers to return
	* @param end the upper bound of the range of phone numbers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of members associated with the phone number
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<prueba.model.Member> getMembers(java.lang.String pk,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of members associated with the phone number.
	*
	* @param pk the primary key of the phone number to get the number of associated members for
	* @return the number of members associated with the phone number
	* @throws SystemException if a system exception occurred
	*/
	public int getMembersSize(java.lang.String pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Determines if the member is associated with the phone number.
	*
	* @param pk the primary key of the phone number
	* @param memberPK the primary key of the member
	* @return <code>true</code> if the member is associated with the phone number; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsMember(java.lang.String pk, long memberPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Determines if the phone number has any members associated with it.
	*
	* @param pk the primary key of the phone number to check for associations with members
	* @return <code>true</code> if the phone number has any members associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsMembers(java.lang.String pk)
		throws com.liferay.portal.kernel.exception.SystemException;
}