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

import com.oldschool.user.registration.model.USMember;

import java.util.List;

/**
 * The persistence utility for the u s member service. This utility wraps {@link USMemberPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see USMemberPersistence
 * @see USMemberPersistenceImpl
 * @generated
 */
public class USMemberUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(USMember usMember) {
		getPersistence().clearCache(usMember);
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
	public static List<USMember> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<USMember> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<USMember> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static USMember remove(USMember usMember) throws SystemException {
		return getPersistence().remove(usMember);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static USMember update(USMember usMember, boolean merge)
		throws SystemException {
		return getPersistence().update(usMember, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static USMember update(USMember usMember, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(usMember, merge, serviceContext);
	}

	/**
	* Caches the u s member in the entity cache if it is enabled.
	*
	* @param usMember the u s member to cache
	*/
	public static void cacheResult(
		com.oldschool.user.registration.model.USMember usMember) {
		getPersistence().cacheResult(usMember);
	}

	/**
	* Caches the u s members in the entity cache if it is enabled.
	*
	* @param usMembers the u s members to cache
	*/
	public static void cacheResult(
		java.util.List<com.oldschool.user.registration.model.USMember> usMembers) {
		getPersistence().cacheResult(usMembers);
	}

	/**
	* Creates a new u s member with the primary key. Does not add the u s member to the database.
	*
	* @param memberId the primary key for the new u s member
	* @return the new u s member
	*/
	public static com.oldschool.user.registration.model.USMember create(
		long memberId) {
		return getPersistence().create(memberId);
	}

	/**
	* Removes the u s member with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param memberId the primary key of the u s member to remove
	* @return the u s member that was removed
	* @throws com.oldschool.user.registration.NoSuchMemberException if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember remove(
		long memberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		return getPersistence().remove(memberId);
	}

	public static com.oldschool.user.registration.model.USMember updateImpl(
		com.oldschool.user.registration.model.USMember usMember, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(usMember, merge);
	}

	/**
	* Finds the u s member with the primary key or throws a {@link com.oldschool.user.registration.NoSuchMemberException} if it could not be found.
	*
	* @param memberId the primary key of the u s member to find
	* @return the u s member
	* @throws com.oldschool.user.registration.NoSuchMemberException if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember findByPrimaryKey(
		long memberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		return getPersistence().findByPrimaryKey(memberId);
	}

	/**
	* Finds the u s member with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param memberId the primary key of the u s member to find
	* @return the u s member, or <code>null</code> if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember fetchByPrimaryKey(
		long memberId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(memberId);
	}

	/**
	* Finds all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @return the matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findByG_PN(
		long groupId, java.lang.String memberLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_PN(groupId, memberLastName);
	}

	/**
	* Finds a range of all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @return the range of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findByG_PN(
		long groupId, java.lang.String memberLastName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_PN(groupId, memberLastName, start, end);
	}

	/**
	* Finds an ordered range of all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findByG_PN(
		long groupId, java.lang.String memberLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_PN(groupId, memberLastName, start, end,
			orderByComparator);
	}

	/**
	* Finds the first u s member in the ordered set where groupId = &#63; and memberLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching u s member
	* @throws com.oldschool.user.registration.NoSuchMemberException if a matching u s member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember findByG_PN_First(
		long groupId, java.lang.String memberLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		return getPersistence()
				   .findByG_PN_First(groupId, memberLastName, orderByComparator);
	}

	/**
	* Finds the last u s member in the ordered set where groupId = &#63; and memberLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching u s member
	* @throws com.oldschool.user.registration.NoSuchMemberException if a matching u s member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember findByG_PN_Last(
		long groupId, java.lang.String memberLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		return getPersistence()
				   .findByG_PN_Last(groupId, memberLastName, orderByComparator);
	}

	/**
	* Finds the u s members before and after the current u s member in the ordered set where groupId = &#63; and memberLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param memberId the primary key of the current u s member
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next u s member
	* @throws com.oldschool.user.registration.NoSuchMemberException if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember[] findByG_PN_PrevAndNext(
		long memberId, long groupId, java.lang.String memberLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		return getPersistence()
				   .findByG_PN_PrevAndNext(memberId, groupId, memberLastName,
			orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @return the matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> filterFindByG_PN(
		long groupId, java.lang.String memberLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_PN(groupId, memberLastName);
	}

	/**
	* Filters by the user's permissions and finds a range of all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @return the range of matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> filterFindByG_PN(
		long groupId, java.lang.String memberLastName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_PN(groupId, memberLastName, start, end);
	}

	/**
	* Filters by the user's permissions and finds an ordered range of all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> filterFindByG_PN(
		long groupId, java.lang.String memberLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_PN(groupId, memberLastName, start, end,
			orderByComparator);
	}

	/**
	* Finds all the u s members where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the u s members where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @return the range of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the u s members where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first u s member in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching u s member
	* @throws com.oldschool.user.registration.NoSuchMemberException if a matching u s member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last u s member in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching u s member
	* @throws com.oldschool.user.registration.NoSuchMemberException if a matching u s member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the u s members before and after the current u s member in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param memberId the primary key of the current u s member
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next u s member
	* @throws com.oldschool.user.registration.NoSuchMemberException if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember[] findByGroupId_PrevAndNext(
		long memberId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(memberId, groupId,
			orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the u s members where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	* Filters by the user's permissions and finds a range of all the u s members where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @return the range of matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	* Filters by the user's permissions and finds an ordered range of all the u s members where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds all the u s members where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Finds a range of all the u s members where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @return the range of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Finds an ordered range of all the u s members where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Finds the first u s member in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching u s member
	* @throws com.oldschool.user.registration.NoSuchMemberException if a matching u s member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Finds the last u s member in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching u s member
	* @throws com.oldschool.user.registration.NoSuchMemberException if a matching u s member could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Finds the u s members before and after the current u s member in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param memberId the primary key of the current u s member
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next u s member
	* @throws com.oldschool.user.registration.NoSuchMemberException if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.user.registration.model.USMember[] findByCompanyId_PrevAndNext(
		long memberId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(memberId, companyId,
			orderByComparator);
	}

	/**
	* Finds all the u s members.
	*
	* @return the u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the u s members.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @return the range of u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the u s members.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of u s members to return
	* @param end the upper bound of the range of u s members to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of u s members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.user.registration.model.USMember> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the u s members where groupId = &#63; and memberLastName = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_PN(long groupId,
		java.lang.String memberLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_PN(groupId, memberLastName);
	}

	/**
	* Removes all the u s members where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the u s members where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Removes all the u s members from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @return the number of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_PN(long groupId, java.lang.String memberLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_PN(groupId, memberLastName);
	}

	/**
	* Filters by the user's permissions and counts all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @return the number of matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_PN(long groupId,
		java.lang.String memberLastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_PN(groupId, memberLastName);
	}

	/**
	* Counts all the u s members where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Filters by the user's permissions and counts all the u s members where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	* Counts all the u s members where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Counts all the u s members.
	*
	* @return the number of u s members
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static USMemberPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (USMemberPersistence)PortletBeanLocatorUtil.locate(com.oldschool.user.registration.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					USMemberPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(USMemberPersistence persistence) {
		_persistence = persistence;
	}

	private static USMemberPersistence _persistence;
}