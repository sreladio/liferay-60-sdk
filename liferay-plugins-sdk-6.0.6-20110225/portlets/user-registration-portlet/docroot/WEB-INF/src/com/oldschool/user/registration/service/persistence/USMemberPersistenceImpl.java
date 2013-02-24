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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.oldschool.user.registration.NoSuchMemberException;
import com.oldschool.user.registration.model.USMember;
import com.oldschool.user.registration.model.impl.USMemberImpl;
import com.oldschool.user.registration.model.impl.USMemberModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the u s member service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link USMemberUtil} to access the u s member persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sr. Eladio
 * @see USMemberPersistence
 * @see USMemberUtil
 * @generated
 */
public class USMemberPersistenceImpl extends BasePersistenceImpl<USMember>
	implements USMemberPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = USMemberImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_G_PN = new FinderPath(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_PN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_PN = new FinderPath(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_PN",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_COMPANYID = new FinderPath(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByCompanyId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the u s member in the entity cache if it is enabled.
	 *
	 * @param usMember the u s member to cache
	 */
	public void cacheResult(USMember usMember) {
		EntityCacheUtil.putResult(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberImpl.class, usMember.getPrimaryKey(), usMember);
	}

	/**
	 * Caches the u s members in the entity cache if it is enabled.
	 *
	 * @param usMembers the u s members to cache
	 */
	public void cacheResult(List<USMember> usMembers) {
		for (USMember usMember : usMembers) {
			if (EntityCacheUtil.getResult(
						USMemberModelImpl.ENTITY_CACHE_ENABLED,
						USMemberImpl.class, usMember.getPrimaryKey(), this) == null) {
				cacheResult(usMember);
			}
		}
	}

	/**
	 * Clears the cache for all u s members.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(USMemberImpl.class.getName());
		EntityCacheUtil.clearCache(USMemberImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the u s member.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(USMember usMember) {
		EntityCacheUtil.removeResult(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberImpl.class, usMember.getPrimaryKey());
	}

	/**
	 * Creates a new u s member with the primary key. Does not add the u s member to the database.
	 *
	 * @param memberId the primary key for the new u s member
	 * @return the new u s member
	 */
	public USMember create(long memberId) {
		USMember usMember = new USMemberImpl();

		usMember.setNew(true);
		usMember.setPrimaryKey(memberId);

		return usMember;
	}

	/**
	 * Removes the u s member with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the u s member to remove
	 * @return the u s member that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a u s member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public USMember remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the u s member with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param memberId the primary key of the u s member to remove
	 * @return the u s member that was removed
	 * @throws com.oldschool.user.registration.NoSuchMemberException if a u s member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public USMember remove(long memberId)
		throws NoSuchMemberException, SystemException {
		Session session = null;

		try {
			session = openSession();

			USMember usMember = (USMember)session.get(USMemberImpl.class,
					new Long(memberId));

			if (usMember == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + memberId);
				}

				throw new NoSuchMemberException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					memberId);
			}

			return remove(usMember);
		}
		catch (NoSuchMemberException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected USMember removeImpl(USMember usMember) throws SystemException {
		usMember = toUnwrappedModel(usMember);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, usMember);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberImpl.class, usMember.getPrimaryKey());

		return usMember;
	}

	public USMember updateImpl(
		com.oldschool.user.registration.model.USMember usMember, boolean merge)
		throws SystemException {
		usMember = toUnwrappedModel(usMember);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, usMember, merge);

			usMember.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(USMemberModelImpl.ENTITY_CACHE_ENABLED,
			USMemberImpl.class, usMember.getPrimaryKey(), usMember);

		return usMember;
	}

	protected USMember toUnwrappedModel(USMember usMember) {
		if (usMember instanceof USMemberImpl) {
			return usMember;
		}

		USMemberImpl usMemberImpl = new USMemberImpl();

		usMemberImpl.setNew(usMember.isNew());
		usMemberImpl.setPrimaryKey(usMember.getPrimaryKey());

		usMemberImpl.setMemberId(usMember.getMemberId());
		usMemberImpl.setMemberFirstName(usMember.getMemberFirstName());
		usMemberImpl.setMemberLastName(usMember.getMemberLastName());
		usMemberImpl.setMemberPhoneNumber(usMember.getMemberPhoneNumber());
		usMemberImpl.setMemberEmail(usMember.getMemberEmail());
		usMemberImpl.setMemberBirthDate(usMember.getMemberBirthDate());
		usMemberImpl.setCompanyId(usMember.getCompanyId());
		usMemberImpl.setGroupId(usMember.getGroupId());

		return usMemberImpl;
	}

	/**
	 * Finds the u s member with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the u s member to find
	 * @return the u s member
	 * @throws com.liferay.portal.NoSuchModelException if a u s member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public USMember findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the u s member with the primary key or throws a {@link com.oldschool.user.registration.NoSuchMemberException} if it could not be found.
	 *
	 * @param memberId the primary key of the u s member to find
	 * @return the u s member
	 * @throws com.oldschool.user.registration.NoSuchMemberException if a u s member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public USMember findByPrimaryKey(long memberId)
		throws NoSuchMemberException, SystemException {
		USMember usMember = fetchByPrimaryKey(memberId);

		if (usMember == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + memberId);
			}

			throw new NoSuchMemberException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				memberId);
		}

		return usMember;
	}

	/**
	 * Finds the u s member with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the u s member to find
	 * @return the u s member, or <code>null</code> if a u s member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public USMember fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the u s member with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param memberId the primary key of the u s member to find
	 * @return the u s member, or <code>null</code> if a u s member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public USMember fetchByPrimaryKey(long memberId) throws SystemException {
		USMember usMember = (USMember)EntityCacheUtil.getResult(USMemberModelImpl.ENTITY_CACHE_ENABLED,
				USMemberImpl.class, memberId, this);

		if (usMember == null) {
			Session session = null;

			try {
				session = openSession();

				usMember = (USMember)session.get(USMemberImpl.class,
						new Long(memberId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (usMember != null) {
					cacheResult(usMember);
				}

				closeSession(session);
			}
		}

		return usMember;
	}

	/**
	 * Finds all the u s members where groupId = &#63; and memberLastName = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param memberLastName the member last name to search with
	 * @return the matching u s members
	 * @throws SystemException if a system exception occurred
	 */
	public List<USMember> findByG_PN(long groupId, String memberLastName)
		throws SystemException {
		return findByG_PN(groupId, memberLastName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	public List<USMember> findByG_PN(long groupId, String memberLastName,
		int start, int end) throws SystemException {
		return findByG_PN(groupId, memberLastName, start, end, null);
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
	public List<USMember> findByG_PN(long groupId, String memberLastName,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, memberLastName,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<USMember> list = (List<USMember>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_PN,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_USMEMBER_WHERE);

			query.append(_FINDER_COLUMN_G_PN_GROUPID_2);

			if (memberLastName == null) {
				query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_1);
			}
			else {
				if (memberLastName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(USMemberModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (memberLastName != null) {
					qPos.add(memberLastName);
				}

				list = (List<USMember>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_PN,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_PN,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public USMember findByG_PN_First(long groupId, String memberLastName,
		OrderByComparator orderByComparator)
		throws NoSuchMemberException, SystemException {
		List<USMember> list = findByG_PN(groupId, memberLastName, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", memberLastName=");
			msg.append(memberLastName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMemberException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public USMember findByG_PN_Last(long groupId, String memberLastName,
		OrderByComparator orderByComparator)
		throws NoSuchMemberException, SystemException {
		int count = countByG_PN(groupId, memberLastName);

		List<USMember> list = findByG_PN(groupId, memberLastName, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", memberLastName=");
			msg.append(memberLastName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMemberException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public USMember[] findByG_PN_PrevAndNext(long memberId, long groupId,
		String memberLastName, OrderByComparator orderByComparator)
		throws NoSuchMemberException, SystemException {
		USMember usMember = findByPrimaryKey(memberId);

		Session session = null;

		try {
			session = openSession();

			USMember[] array = new USMemberImpl[3];

			array[0] = getByG_PN_PrevAndNext(session, usMember, groupId,
					memberLastName, orderByComparator, true);

			array[1] = usMember;

			array[2] = getByG_PN_PrevAndNext(session, usMember, groupId,
					memberLastName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected USMember getByG_PN_PrevAndNext(Session session,
		USMember usMember, long groupId, String memberLastName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USMEMBER_WHERE);

		query.append(_FINDER_COLUMN_G_PN_GROUPID_2);

		if (memberLastName == null) {
			query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_1);
		}
		else {
			if (memberLastName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(USMemberModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (memberLastName != null) {
			qPos.add(memberLastName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(usMember);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<USMember> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the u s members where groupId = &#63; and memberLastName = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param memberLastName the member last name to search with
	 * @return the matching u s members that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<USMember> filterFindByG_PN(long groupId, String memberLastName)
		throws SystemException {
		return filterFindByG_PN(groupId, memberLastName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	public List<USMember> filterFindByG_PN(long groupId, String memberLastName,
		int start, int end) throws SystemException {
		return filterFindByG_PN(groupId, memberLastName, start, end, null);
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
	public List<USMember> filterFindByG_PN(long groupId, String memberLastName,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByG_PN(groupId, memberLastName, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USMEMBER_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USMEMBER_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_G_PN_GROUPID_2);

		if (memberLastName == null) {
			query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_1);
		}
		else {
			if (memberLastName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_2);
			}
		}

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USMEMBER_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator);
			}
		}

		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(USMemberModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(USMemberModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				USMember.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, USMemberImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, USMemberImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (memberLastName != null) {
				qPos.add(memberLastName);
			}

			return (List<USMember>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the u s members where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching u s members
	 * @throws SystemException if a system exception occurred
	 */
	public List<USMember> findByGroupId(long groupId) throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<USMember> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
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
	public List<USMember> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<USMember> list = (List<USMember>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_USMEMBER_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(USMemberModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<USMember>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public USMember findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchMemberException, SystemException {
		List<USMember> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMemberException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public USMember findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchMemberException, SystemException {
		int count = countByGroupId(groupId);

		List<USMember> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMemberException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public USMember[] findByGroupId_PrevAndNext(long memberId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchMemberException, SystemException {
		USMember usMember = findByPrimaryKey(memberId);

		Session session = null;

		try {
			session = openSession();

			USMember[] array = new USMemberImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, usMember, groupId,
					orderByComparator, true);

			array[1] = usMember;

			array[2] = getByGroupId_PrevAndNext(session, usMember, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected USMember getByGroupId_PrevAndNext(Session session,
		USMember usMember, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USMEMBER_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(USMemberModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(usMember);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<USMember> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the u s members where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching u s members that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<USMember> filterFindByGroupId(long groupId)
		throws SystemException {
		return filterFindByGroupId(groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	public List<USMember> filterFindByGroupId(long groupId, int start, int end)
		throws SystemException {
		return filterFindByGroupId(groupId, start, end, null);
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
	public List<USMember> filterFindByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByGroupId(groupId, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(3 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USMEMBER_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_USMEMBER_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_USMEMBER_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator);
			}
		}

		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(USMemberModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(USMemberModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				USMember.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, USMemberImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, USMemberImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			return (List<USMember>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the u s members where companyId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @return the matching u s members
	 * @throws SystemException if a system exception occurred
	 */
	public List<USMember> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	public List<USMember> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
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
	public List<USMember> findByCompanyId(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<USMember> list = (List<USMember>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_COMPANYID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_USMEMBER_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(USMemberModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				list = (List<USMember>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_COMPANYID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_COMPANYID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public USMember findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchMemberException, SystemException {
		List<USMember> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMemberException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public USMember findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchMemberException, SystemException {
		int count = countByCompanyId(companyId);

		List<USMember> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchMemberException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public USMember[] findByCompanyId_PrevAndNext(long memberId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchMemberException, SystemException {
		USMember usMember = findByPrimaryKey(memberId);

		Session session = null;

		try {
			session = openSession();

			USMember[] array = new USMemberImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, usMember, companyId,
					orderByComparator, true);

			array[1] = usMember;

			array[2] = getByCompanyId_PrevAndNext(session, usMember, companyId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected USMember getByCompanyId_PrevAndNext(Session session,
		USMember usMember, long companyId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USMEMBER_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(USMemberModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(usMember);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<USMember> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the u s members.
	 *
	 * @return the u s members
	 * @throws SystemException if a system exception occurred
	 */
	public List<USMember> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<USMember> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<USMember> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<USMember> list = (List<USMember>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USMEMBER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USMEMBER.concat(USMemberModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<USMember>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<USMember>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_ALL,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_ALL, finderArgs,
						list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the u s members where groupId = &#63; and memberLastName = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param memberLastName the member last name to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_PN(long groupId, String memberLastName)
		throws SystemException {
		for (USMember usMember : findByG_PN(groupId, memberLastName)) {
			remove(usMember);
		}
	}

	/**
	 * Removes all the u s members where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (USMember usMember : findByGroupId(groupId)) {
			remove(usMember);
		}
	}

	/**
	 * Removes all the u s members where companyId = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCompanyId(long companyId) throws SystemException {
		for (USMember usMember : findByCompanyId(companyId)) {
			remove(usMember);
		}
	}

	/**
	 * Removes all the u s members from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (USMember usMember : findAll()) {
			remove(usMember);
		}
	}

	/**
	 * Counts all the u s members where groupId = &#63; and memberLastName = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param memberLastName the member last name to search with
	 * @return the number of matching u s members
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_PN(long groupId, String memberLastName)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, memberLastName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_PN,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USMEMBER_WHERE);

			query.append(_FINDER_COLUMN_G_PN_GROUPID_2);

			if (memberLastName == null) {
				query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_1);
			}
			else {
				if (memberLastName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (memberLastName != null) {
					qPos.add(memberLastName);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_PN,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the u s members where groupId = &#63; and memberLastName = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param memberLastName the member last name to search with
	 * @return the number of matching u s members that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByG_PN(long groupId, String memberLastName)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByG_PN(groupId, memberLastName);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_USMEMBER_WHERE);

		query.append(_FINDER_COLUMN_G_PN_GROUPID_2);

		if (memberLastName == null) {
			query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_1);
		}
		else {
			if (memberLastName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_PN_MEMBERLASTNAME_2);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				USMember.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			if (memberLastName != null) {
				qPos.add(memberLastName);
			}

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Counts all the u s members where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching u s members
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USMEMBER_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Filters by the user's permissions and counts all the u s members where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching u s members that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByGroupId(long groupId) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByGroupId(groupId);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_USMEMBER_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				USMember.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Counts all the u s members where companyId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @return the number of matching u s members
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCompanyId(long companyId) throws SystemException {
		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMPANYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_USMEMBER_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMPANYID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the u s members.
	 *
	 * @return the number of u s members
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Object[] finderArgs = new Object[0];

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USMEMBER);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the u s member persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.oldschool.user.registration.model.USMember")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<USMember>> listenersList = new ArrayList<ModelListener<USMember>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<USMember>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(USMemberImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = USMemberPersistence.class)
	protected USMemberPersistence usMemberPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_USMEMBER = "SELECT usMember FROM USMember usMember";
	private static final String _SQL_SELECT_USMEMBER_WHERE = "SELECT usMember FROM USMember usMember WHERE ";
	private static final String _SQL_COUNT_USMEMBER = "SELECT COUNT(usMember) FROM USMember usMember";
	private static final String _SQL_COUNT_USMEMBER_WHERE = "SELECT COUNT(usMember) FROM USMember usMember WHERE ";
	private static final String _FINDER_COLUMN_G_PN_GROUPID_2 = "usMember.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_PN_MEMBERLASTNAME_1 = "usMember.memberLastName IS NULL";
	private static final String _FINDER_COLUMN_G_PN_MEMBERLASTNAME_2 = "usMember.memberLastName = ?";
	private static final String _FINDER_COLUMN_G_PN_MEMBERLASTNAME_3 = "(usMember.memberLastName IS NULL OR usMember.memberLastName = ?)";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "usMember.groupId = ?";
	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "usMember.companyId = ?";
	private static final String _FILTER_SQL_SELECT_USMEMBER_WHERE = "SELECT DISTINCT {usMember.*} FROM US_USMember usMember WHERE ";
	private static final String _FILTER_SQL_SELECT_USMEMBER_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {US_USMember.*} FROM (SELECT DISTINCT usMember.memberId FROM US_USMember usMember WHERE ";
	private static final String _FILTER_SQL_SELECT_USMEMBER_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN US_USMember ON TEMP_TABLE.memberId = US_USMember.memberId";
	private static final String _FILTER_SQL_COUNT_USMEMBER_WHERE = "SELECT COUNT(DISTINCT usMember.memberId) AS COUNT_VALUE FROM US_USMember usMember WHERE ";
	private static final String _FILTER_COLUMN_PK = "usMember.memberId";
	private static final String _FILTER_COLUMN_USERID = null;
	private static final String _FILTER_ENTITY_ALIAS = "usMember";
	private static final String _FILTER_ENTITY_TABLE = "US_USMember";
	private static final String _ORDER_BY_ENTITY_ALIAS = "usMember.";
	private static final String _ORDER_BY_ENTITY_TABLE = "US_USMember.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No USMember exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No USMember exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(USMemberPersistenceImpl.class);
}