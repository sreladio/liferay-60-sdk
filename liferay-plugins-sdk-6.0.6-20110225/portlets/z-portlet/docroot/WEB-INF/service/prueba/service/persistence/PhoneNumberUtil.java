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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import prueba.model.PhoneNumber;

import java.util.List;

/**
 * The persistence utility for the phone number service. This utility wraps {@link PhoneNumberPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see PhoneNumberPersistence
 * @see PhoneNumberPersistenceImpl
 * @generated
 */
public class PhoneNumberUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(PhoneNumber phoneNumber) {
		getPersistence().clearCache(phoneNumber);
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
	public static List<PhoneNumber> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PhoneNumber> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PhoneNumber> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static PhoneNumber remove(PhoneNumber phoneNumber)
		throws SystemException {
		return getPersistence().remove(phoneNumber);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static PhoneNumber update(PhoneNumber phoneNumber, boolean merge)
		throws SystemException {
		return getPersistence().update(phoneNumber, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static PhoneNumber update(PhoneNumber phoneNumber, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(phoneNumber, merge, serviceContext);
	}

	/**
	* Caches the phone number in the entity cache if it is enabled.
	*
	* @param phoneNumber the phone number to cache
	*/
	public static void cacheResult(prueba.model.PhoneNumber phoneNumber) {
		getPersistence().cacheResult(phoneNumber);
	}

	/**
	* Caches the phone numbers in the entity cache if it is enabled.
	*
	* @param phoneNumbers the phone numbers to cache
	*/
	public static void cacheResult(
		java.util.List<prueba.model.PhoneNumber> phoneNumbers) {
		getPersistence().cacheResult(phoneNumbers);
	}

	/**
	* Creates a new phone number with the primary key. Does not add the phone number to the database.
	*
	* @param numberId the primary key for the new phone number
	* @return the new phone number
	*/
	public static prueba.model.PhoneNumber create(java.lang.String numberId) {
		return getPersistence().create(numberId);
	}

	/**
	* Removes the phone number with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param numberId the primary key of the phone number to remove
	* @return the phone number that was removed
	* @throws prueba.NoSuchPhoneNumberException if a phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static prueba.model.PhoneNumber remove(java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			prueba.NoSuchPhoneNumberException {
		return getPersistence().remove(numberId);
	}

	public static prueba.model.PhoneNumber updateImpl(
		prueba.model.PhoneNumber phoneNumber, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(phoneNumber, merge);
	}

	/**
	* Finds the phone number with the primary key or throws a {@link prueba.NoSuchPhoneNumberException} if it could not be found.
	*
	* @param numberId the primary key of the phone number to find
	* @return the phone number
	* @throws prueba.NoSuchPhoneNumberException if a phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static prueba.model.PhoneNumber findByPrimaryKey(
		java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			prueba.NoSuchPhoneNumberException {
		return getPersistence().findByPrimaryKey(numberId);
	}

	/**
	* Finds the phone number with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param numberId the primary key of the phone number to find
	* @return the phone number, or <code>null</code> if a phone number with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static prueba.model.PhoneNumber fetchByPrimaryKey(
		java.lang.String numberId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(numberId);
	}

	/**
	* Finds all the phone numbers.
	*
	* @return the phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<prueba.model.PhoneNumber> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<prueba.model.PhoneNumber> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<prueba.model.PhoneNumber> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the phone numbers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the phone numbers.
	*
	* @return the number of phone numbers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Gets all the members associated with the phone number.
	*
	* @param pk the primary key of the phone number to get the associated members for
	* @return the members associated with the phone number
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<prueba.model.Member> getMembers(
		java.lang.String pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getMembers(pk);
	}

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
	public static java.util.List<prueba.model.Member> getMembers(
		java.lang.String pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getMembers(pk, start, end);
	}

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
	public static java.util.List<prueba.model.Member> getMembers(
		java.lang.String pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getMembers(pk, start, end, orderByComparator);
	}

	/**
	* Gets the number of members associated with the phone number.
	*
	* @param pk the primary key of the phone number to get the number of associated members for
	* @return the number of members associated with the phone number
	* @throws SystemException if a system exception occurred
	*/
	public static int getMembersSize(java.lang.String pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getMembersSize(pk);
	}

	/**
	* Determines if the member is associated with the phone number.
	*
	* @param pk the primary key of the phone number
	* @param memberPK the primary key of the member
	* @return <code>true</code> if the member is associated with the phone number; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsMember(java.lang.String pk, long memberPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsMember(pk, memberPK);
	}

	/**
	* Determines if the phone number has any members associated with it.
	*
	* @param pk the primary key of the phone number to check for associations with members
	* @return <code>true</code> if the phone number has any members associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsMembers(java.lang.String pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsMembers(pk);
	}

	public static PhoneNumberPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PhoneNumberPersistence)PortletBeanLocatorUtil.locate(prueba.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					PhoneNumberPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(PhoneNumberPersistence persistence) {
		_persistence = persistence;
	}

	private static PhoneNumberPersistence _persistence;
}