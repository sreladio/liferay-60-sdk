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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import prueba.NoSuchMemberException;

import prueba.model.Member;

import prueba.model.impl.MemberImpl;
import prueba.model.impl.MemberModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the member service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link MemberUtil} to access the member persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sr. Eladio
 * @see MemberPersistence
 * @see MemberUtil
 * @generated
 */
public class MemberPersistenceImpl extends BasePersistenceImpl<Member>
	implements MemberPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = MemberImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(MemberModelImpl.ENTITY_CACHE_ENABLED,
			MemberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MemberModelImpl.ENTITY_CACHE_ENABLED,
			MemberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the member in the entity cache if it is enabled.
	 *
	 * @param member the member to cache
	 */
	public void cacheResult(Member member) {
		EntityCacheUtil.putResult(MemberModelImpl.ENTITY_CACHE_ENABLED,
			MemberImpl.class, member.getPrimaryKey(), member);
	}

	/**
	 * Caches the members in the entity cache if it is enabled.
	 *
	 * @param members the members to cache
	 */
	public void cacheResult(List<Member> members) {
		for (Member member : members) {
			if (EntityCacheUtil.getResult(
						MemberModelImpl.ENTITY_CACHE_ENABLED, MemberImpl.class,
						member.getPrimaryKey(), this) == null) {
				cacheResult(member);
			}
		}
	}

	/**
	 * Clears the cache for all members.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(MemberImpl.class.getName());
		EntityCacheUtil.clearCache(MemberImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the member.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(Member member) {
		EntityCacheUtil.removeResult(MemberModelImpl.ENTITY_CACHE_ENABLED,
			MemberImpl.class, member.getPrimaryKey());
	}

	/**
	 * Creates a new member with the primary key. Does not add the member to the database.
	 *
	 * @param memberId the primary key for the new member
	 * @return the new member
	 */
	public Member create(long memberId) {
		Member member = new MemberImpl();

		member.setNew(true);
		member.setPrimaryKey(memberId);

		return member;
	}

	/**
	 * Removes the member with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the member to remove
	 * @return the member that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Member remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the member with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param memberId the primary key of the member to remove
	 * @return the member that was removed
	 * @throws prueba.NoSuchMemberException if a member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Member remove(long memberId)
		throws NoSuchMemberException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Member member = (Member)session.get(MemberImpl.class,
					new Long(memberId));

			if (member == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + memberId);
				}

				throw new NoSuchMemberException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					memberId);
			}

			return remove(member);
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

	protected Member removeImpl(Member member) throws SystemException {
		member = toUnwrappedModel(member);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, member);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(MemberModelImpl.ENTITY_CACHE_ENABLED,
			MemberImpl.class, member.getPrimaryKey());

		return member;
	}

	public Member updateImpl(prueba.model.Member member, boolean merge)
		throws SystemException {
		member = toUnwrappedModel(member);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, member, merge);

			member.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(MemberModelImpl.ENTITY_CACHE_ENABLED,
			MemberImpl.class, member.getPrimaryKey(), member);

		return member;
	}

	protected Member toUnwrappedModel(Member member) {
		if (member instanceof MemberImpl) {
			return member;
		}

		MemberImpl memberImpl = new MemberImpl();

		memberImpl.setNew(member.isNew());
		memberImpl.setPrimaryKey(member.getPrimaryKey());

		memberImpl.setMemberId(member.getMemberId());
		memberImpl.setMemberFirstName(member.getMemberFirstName());
		memberImpl.setMemberLastName(member.getMemberLastName());
		memberImpl.setMemberPhoneNumber(member.getMemberPhoneNumber());

		return memberImpl;
	}

	/**
	 * Finds the member with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the member to find
	 * @return the member
	 * @throws com.liferay.portal.NoSuchModelException if a member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Member findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the member with the primary key or throws a {@link prueba.NoSuchMemberException} if it could not be found.
	 *
	 * @param memberId the primary key of the member to find
	 * @return the member
	 * @throws prueba.NoSuchMemberException if a member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Member findByPrimaryKey(long memberId)
		throws NoSuchMemberException, SystemException {
		Member member = fetchByPrimaryKey(memberId);

		if (member == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + memberId);
			}

			throw new NoSuchMemberException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				memberId);
		}

		return member;
	}

	/**
	 * Finds the member with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the member to find
	 * @return the member, or <code>null</code> if a member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Member fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the member with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param memberId the primary key of the member to find
	 * @return the member, or <code>null</code> if a member with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Member fetchByPrimaryKey(long memberId) throws SystemException {
		Member member = (Member)EntityCacheUtil.getResult(MemberModelImpl.ENTITY_CACHE_ENABLED,
				MemberImpl.class, memberId, this);

		if (member == null) {
			Session session = null;

			try {
				session = openSession();

				member = (Member)session.get(MemberImpl.class,
						new Long(memberId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (member != null) {
					cacheResult(member);
				}

				closeSession(session);
			}
		}

		return member;
	}

	/**
	 * Finds all the members.
	 *
	 * @return the members
	 * @throws SystemException if a system exception occurred
	 */
	public List<Member> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Member> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<Member> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Member> list = (List<Member>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MEMBER_);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MEMBER_.concat(MemberModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Member>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Member>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the members from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Member member : findAll()) {
			remove(member);
		}
	}

	/**
	 * Counts all the members.
	 *
	 * @return the number of members
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

				Query q = session.createQuery(_SQL_COUNT_MEMBER_);

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
	 * Initializes the member persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.prueba.model.Member")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Member>> listenersList = new ArrayList<ModelListener<Member>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Member>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MemberImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = MemberPersistence.class)
	protected MemberPersistence memberPersistence;
	@BeanReference(type = PhoneNumberPersistence.class)
	protected PhoneNumberPersistence phoneNumberPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_MEMBER_ = "SELECT member_ FROM Member member_";
	private static final String _SQL_COUNT_MEMBER_ = "SELECT COUNT(member_) FROM Member member_";
	private static final String _ORDER_BY_ENTITY_ALIAS = "member_.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Member exists with the primary key ";
	private static Log _log = LogFactoryUtil.getLog(MemberPersistenceImpl.class);
}