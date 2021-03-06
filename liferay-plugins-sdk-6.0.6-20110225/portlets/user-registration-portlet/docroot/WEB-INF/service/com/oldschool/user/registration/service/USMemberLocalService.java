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

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the u s member local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link USMemberLocalServiceUtil} to access the u s member local service. Add custom service methods to {@link com.oldschool.user.registration.service.impl.USMemberLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sr. Eladio
 * @see USMemberLocalServiceUtil
 * @see com.oldschool.user.registration.service.base.USMemberLocalServiceBaseImpl
 * @see com.oldschool.user.registration.service.impl.USMemberLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface USMemberLocalService {
	/**
	* Adds the u s member to the database. Also notifies the appropriate model listeners.
	*
	* @param usMember the u s member to add
	* @return the u s member that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USMember addUSMember(
		com.oldschool.user.registration.model.USMember usMember)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new u s member with the primary key. Does not add the u s member to the database.
	*
	* @param memberId the primary key for the new u s member
	* @return the new u s member
	*/
	public com.oldschool.user.registration.model.USMember createUSMember(
		long memberId);

	/**
	* Deletes the u s member with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param memberId the primary key of the u s member to delete
	* @throws PortalException if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteUSMember(long memberId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the u s member from the database. Also notifies the appropriate model listeners.
	*
	* @param usMember the u s member to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteUSMember(
		com.oldschool.user.registration.model.USMember usMember)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the u s member with the primary key.
	*
	* @param memberId the primary key of the u s member to get
	* @return the u s member
	* @throws PortalException if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.oldschool.user.registration.model.USMember getUSMember(
		long memberId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the u s members.
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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.oldschool.user.registration.model.USMember> getUSMembers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of u s members.
	*
	* @return the number of u s members
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getUSMembersCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the u s member in the database. Also notifies the appropriate model listeners.
	*
	* @param usMember the u s member to update
	* @return the u s member that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USMember updateUSMember(
		com.oldschool.user.registration.model.USMember usMember)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the u s member in the database. Also notifies the appropriate model listeners.
	*
	* @param usMember the u s member to update
	* @param merge whether to merge the u s member with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the u s member that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USMember updateUSMember(
		com.oldschool.user.registration.model.USMember usMember, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.oldschool.user.registration.model.USMember addMember(
		com.oldschool.user.registration.model.USMember newMember, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.oldschool.user.registration.model.USMember> getAllMembers(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void deleteMemberById(long productId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException;

	public void deleteMemberByUSMember(
		com.oldschool.user.registration.model.USMember member)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}