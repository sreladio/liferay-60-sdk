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
 * This class is a wrapper for {@link USMemberLocalService}.
 * </p>
 *
 * @author    Sr. Eladio
 * @see       USMemberLocalService
 * @generated
 */
public class USMemberLocalServiceWrapper implements USMemberLocalService {
	public USMemberLocalServiceWrapper(
		USMemberLocalService usMemberLocalService) {
		_usMemberLocalService = usMemberLocalService;
	}

	/**
	* Adds the u s member to the database. Also notifies the appropriate model listeners.
	*
	* @param usMember the u s member to add
	* @return the u s member that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USMember addUSMember(
		com.oldschool.user.registration.model.USMember usMember)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usMemberLocalService.addUSMember(usMember);
	}

	/**
	* Creates a new u s member with the primary key. Does not add the u s member to the database.
	*
	* @param memberId the primary key for the new u s member
	* @return the new u s member
	*/
	public com.oldschool.user.registration.model.USMember createUSMember(
		long memberId) {
		return _usMemberLocalService.createUSMember(memberId);
	}

	/**
	* Deletes the u s member with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param memberId the primary key of the u s member to delete
	* @throws PortalException if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteUSMember(long memberId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_usMemberLocalService.deleteUSMember(memberId);
	}

	/**
	* Deletes the u s member from the database. Also notifies the appropriate model listeners.
	*
	* @param usMember the u s member to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteUSMember(
		com.oldschool.user.registration.model.USMember usMember)
		throws com.liferay.portal.kernel.exception.SystemException {
		_usMemberLocalService.deleteUSMember(usMember);
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
		return _usMemberLocalService.dynamicQuery(dynamicQuery);
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
		return _usMemberLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _usMemberLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _usMemberLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the u s member with the primary key.
	*
	* @param memberId the primary key of the u s member to get
	* @return the u s member
	* @throws PortalException if a u s member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USMember getUSMember(
		long memberId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usMemberLocalService.getUSMember(memberId);
	}

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
	public java.util.List<com.oldschool.user.registration.model.USMember> getUSMembers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usMemberLocalService.getUSMembers(start, end);
	}

	/**
	* Gets the number of u s members.
	*
	* @return the number of u s members
	* @throws SystemException if a system exception occurred
	*/
	public int getUSMembersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usMemberLocalService.getUSMembersCount();
	}

	/**
	* Updates the u s member in the database. Also notifies the appropriate model listeners.
	*
	* @param usMember the u s member to update
	* @return the u s member that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.oldschool.user.registration.model.USMember updateUSMember(
		com.oldschool.user.registration.model.USMember usMember)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usMemberLocalService.updateUSMember(usMember);
	}

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
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usMemberLocalService.updateUSMember(usMember, merge);
	}

	public com.oldschool.user.registration.model.USMember addMember(
		com.oldschool.user.registration.model.USMember newMember, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usMemberLocalService.addMember(newMember, userId);
	}

	public java.util.List<com.oldschool.user.registration.model.USMember> getAllMembers(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usMemberLocalService.getAllMembers(groupId);
	}

	public void deleteMemberById(long productId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.user.registration.NoSuchMemberException {
		_usMemberLocalService.deleteMemberById(productId);
	}

	public void deleteMemberByUSMember(
		com.oldschool.user.registration.model.USMember member)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_usMemberLocalService.deleteMemberByUSMember(member);
	}

	public USMemberLocalService getWrappedUSMemberLocalService() {
		return _usMemberLocalService;
	}

	private USMemberLocalService _usMemberLocalService;
}