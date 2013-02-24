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

import prueba.model.Member;

import java.util.List;

/**
 * The persistence utility for the member service. This utility wraps {@link MemberPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see MemberPersistence
 * @see MemberPersistenceImpl
 * @generated
 */
public class MemberUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Member member) {
		getPersistence().clearCache(member);
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
	public static List<Member> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Member> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Member> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static Member remove(Member member) throws SystemException {
		return getPersistence().remove(member);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Member update(Member member, boolean merge)
		throws SystemException {
		return getPersistence().update(member, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Member update(Member member, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(member, merge, serviceContext);
	}

	/**
	* Caches the member in the entity cache if it is enabled.
	*
	* @param member the member to cache
	*/
	public static void cacheResult(prueba.model.Member member) {
		getPersistence().cacheResult(member);
	}

	/**
	* Caches the members in the entity cache if it is enabled.
	*
	* @param members the members to cache
	*/
	public static void cacheResult(java.util.List<prueba.model.Member> members) {
		getPersistence().cacheResult(members);
	}

	/**
	* Creates a new member with the primary key. Does not add the member to the database.
	*
	* @param memberId the primary key for the new member
	* @return the new member
	*/
	public static prueba.model.Member create(long memberId) {
		return getPersistence().create(memberId);
	}

	/**
	* Removes the member with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param memberId the primary key of the member to remove
	* @return the member that was removed
	* @throws prueba.NoSuchMemberException if a member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static prueba.model.Member remove(long memberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			prueba.NoSuchMemberException {
		return getPersistence().remove(memberId);
	}

	public static prueba.model.Member updateImpl(prueba.model.Member member,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(member, merge);
	}

	/**
	* Finds the member with the primary key or throws a {@link prueba.NoSuchMemberException} if it could not be found.
	*
	* @param memberId the primary key of the member to find
	* @return the member
	* @throws prueba.NoSuchMemberException if a member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static prueba.model.Member findByPrimaryKey(long memberId)
		throws com.liferay.portal.kernel.exception.SystemException,
			prueba.NoSuchMemberException {
		return getPersistence().findByPrimaryKey(memberId);
	}

	/**
	* Finds the member with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param memberId the primary key of the member to find
	* @return the member, or <code>null</code> if a member with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static prueba.model.Member fetchByPrimaryKey(long memberId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(memberId);
	}

	/**
	* Finds all the members.
	*
	* @return the members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<prueba.model.Member> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the members.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of members to return
	* @param end the upper bound of the range of members to return (not inclusive)
	* @return the range of members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<prueba.model.Member> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the members.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of members to return
	* @param end the upper bound of the range of members to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of members
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<prueba.model.Member> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the members from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the members.
	*
	* @return the number of members
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MemberPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MemberPersistence)PortletBeanLocatorUtil.locate(prueba.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					MemberPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(MemberPersistence persistence) {
		_persistence = persistence;
	}

	private static MemberPersistence _persistence;
}