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

import com.oldschool.user.registration.model.USMember;

/**
 * The persistence interface for the u s member service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link USMemberUtil} to access the u s member persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sr. Eladio
 * @see USMemberPersistenceImpl
 * @see USMemberUtil
 * @generated
 */
public interface USMemberPersistence extends BasePersistence<USMember> {
	/**
	* Caches the u s member in the entity cache if it is enabled.
	*
	* @param usMember the u s member to cache
	*/
	public void cacheResult(
		com.oldschool.user.registration.model.USMember usMember);

	/**
	* Caches the u s members in the entity cache if it is enabled.
	*
	* @param usMembers the u s members to cache
	*/
	public void cacheResult(
		java.util.List<com.oldschool.user.registration.model.USMember> usMembers);

	/**
	* Creates a new u s member with the primary key. Does not add the u s member to the database.
	*
	* @param memberId the primary key for the new u s member
	* @return the new u s member
	*/
	public com.oldschool.user.registration.model.USMember create(long memberId);

	/**
	* Removes the u s member with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param memberId the primary key of the u s member to remove
	* @return the u s member that was removed
	* @throws com.oldschool.user.registration.NoSuchMemberException if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USMember remove(long memberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

	public com.oldschool.user.registration.model.USMember updateImpl(
		com.oldschool.user.registration.model.USMember usMember, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the u s member with the primary key or throws a {@link com.oldschool.user.registration.NoSuchMemberException} if it could not be found.
	*
	* @param memberId the primary key of the u s member to find
	* @return the u s member
	* @throws com.oldschool.user.registration.NoSuchMemberException if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USMember findByPrimaryKey(
		long memberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

	/**
	* Finds the u s member with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param memberId the primary key of the u s member to find
	* @return the u s member, or <code>null</code> if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USMember fetchByPrimaryKey(
		long memberId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @return the matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.oldschool.user.registration.model.USMember> findByG_PN(
		long groupId, java.lang.String memberLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> findByG_PN(
		long groupId, java.lang.String memberLastName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> findByG_PN(
		long groupId, java.lang.String memberLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.oldschool.user.registration.model.USMember findByG_PN_First(
		long groupId, java.lang.String memberLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

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
	public com.oldschool.user.registration.model.USMember findByG_PN_Last(
		long groupId, java.lang.String memberLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

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
	public com.oldschool.user.registration.model.USMember[] findByG_PN_PrevAndNext(
		long memberId, long groupId, java.lang.String memberLastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

	/**
	* Filters by the user's permissions and finds all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @return the matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.oldschool.user.registration.model.USMember> filterFindByG_PN(
		long groupId, java.lang.String memberLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> filterFindByG_PN(
		long groupId, java.lang.String memberLastName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> filterFindByG_PN(
		long groupId, java.lang.String memberLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the u s members where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.oldschool.user.registration.model.USMember> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.oldschool.user.registration.model.USMember findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

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
	public com.oldschool.user.registration.model.USMember findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

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
	public com.oldschool.user.registration.model.USMember[] findByGroupId_PrevAndNext(
		long memberId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

	/**
	* Filters by the user's permissions and finds all the u s members where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.oldschool.user.registration.model.USMember> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the u s members where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.oldschool.user.registration.model.USMember> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.oldschool.user.registration.model.USMember findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

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
	public com.oldschool.user.registration.model.USMember findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

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
	public com.oldschool.user.registration.model.USMember[] findByCompanyId_PrevAndNext(
		long memberId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

	/**
	* Finds all the u s members.
	*
	* @return the u s members
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.oldschool.user.registration.model.USMember> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.oldschool.user.registration.model.USMember> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the u s members where groupId = &#63; and memberLastName = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_PN(long groupId, java.lang.String memberLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the u s members where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the u s members where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the u s members from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @return the number of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_PN(long groupId, java.lang.String memberLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the u s members where groupId = &#63; and memberLastName = &#63;.
	*
	* @param groupId the group id to search with
	* @param memberLastName the member last name to search with
	* @return the number of matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_PN(long groupId, java.lang.String memberLastName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the u s members where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the u s members where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching u s members that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the u s members where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching u s members
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the u s members.
	*
	* @return the number of u s members
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}