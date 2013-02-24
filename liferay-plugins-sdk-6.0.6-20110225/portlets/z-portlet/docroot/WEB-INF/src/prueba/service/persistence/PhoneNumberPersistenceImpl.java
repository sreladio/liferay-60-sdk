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
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQuery;
import com.liferay.portal.kernel.dao.jdbc.MappingSqlQueryFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.RowMapper;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import prueba.NoSuchPhoneNumberException;

import prueba.model.PhoneNumber;

import prueba.model.impl.PhoneNumberImpl;
import prueba.model.impl.PhoneNumberModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the phone number service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link PhoneNumberUtil} to access the phone number persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sr. Eladio
 * @see PhoneNumberPersistence
 * @see PhoneNumberUtil
 * @generated
 */
public class PhoneNumberPersistenceImpl extends BasePersistenceImpl<PhoneNumber>
	implements PhoneNumberPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = PhoneNumberImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(PhoneNumberModelImpl.ENTITY_CACHE_ENABLED,
			PhoneNumberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PhoneNumberModelImpl.ENTITY_CACHE_ENABLED,
			PhoneNumberModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the phone number in the entity cache if it is enabled.
	 *
	 * @param phoneNumber the phone number to cache
	 */
	public void cacheResult(PhoneNumber phoneNumber) {
		EntityCacheUtil.putResult(PhoneNumberModelImpl.ENTITY_CACHE_ENABLED,
			PhoneNumberImpl.class, phoneNumber.getPrimaryKey(), phoneNumber);
	}

	/**
	 * Caches the phone numbers in the entity cache if it is enabled.
	 *
	 * @param phoneNumbers the phone numbers to cache
	 */
	public void cacheResult(List<PhoneNumber> phoneNumbers) {
		for (PhoneNumber phoneNumber : phoneNumbers) {
			if (EntityCacheUtil.getResult(
						PhoneNumberModelImpl.ENTITY_CACHE_ENABLED,
						PhoneNumberImpl.class, phoneNumber.getPrimaryKey(), this) == null) {
				cacheResult(phoneNumber);
			}
		}
	}

	/**
	 * Clears the cache for all phone numbers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(PhoneNumberImpl.class.getName());
		EntityCacheUtil.clearCache(PhoneNumberImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the phone number.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(PhoneNumber phoneNumber) {
		EntityCacheUtil.removeResult(PhoneNumberModelImpl.ENTITY_CACHE_ENABLED,
			PhoneNumberImpl.class, phoneNumber.getPrimaryKey());
	}

	/**
	 * Creates a new phone number with the primary key. Does not add the phone number to the database.
	 *
	 * @param numberId the primary key for the new phone number
	 * @return the new phone number
	 */
	public PhoneNumber create(String numberId) {
		PhoneNumber phoneNumber = new PhoneNumberImpl();

		phoneNumber.setNew(true);
		phoneNumber.setPrimaryKey(numberId);

		return phoneNumber;
	}

	/**
	 * Removes the phone number with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the phone number to remove
	 * @return the phone number that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a phone number with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PhoneNumber remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the phone number with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param numberId the primary key of the phone number to remove
	 * @return the phone number that was removed
	 * @throws prueba.NoSuchPhoneNumberException if a phone number with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PhoneNumber remove(String numberId)
		throws NoSuchPhoneNumberException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PhoneNumber phoneNumber = (PhoneNumber)session.get(PhoneNumberImpl.class,
					numberId);

			if (phoneNumber == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + numberId);
				}

				throw new NoSuchPhoneNumberException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					numberId);
			}

			return remove(phoneNumber);
		}
		catch (NoSuchPhoneNumberException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PhoneNumber removeImpl(PhoneNumber phoneNumber)
		throws SystemException {
		phoneNumber = toUnwrappedModel(phoneNumber);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, phoneNumber);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(PhoneNumberModelImpl.ENTITY_CACHE_ENABLED,
			PhoneNumberImpl.class, phoneNumber.getPrimaryKey());

		return phoneNumber;
	}

	public PhoneNumber updateImpl(prueba.model.PhoneNumber phoneNumber,
		boolean merge) throws SystemException {
		phoneNumber = toUnwrappedModel(phoneNumber);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, phoneNumber, merge);

			phoneNumber.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(PhoneNumberModelImpl.ENTITY_CACHE_ENABLED,
			PhoneNumberImpl.class, phoneNumber.getPrimaryKey(), phoneNumber);

		return phoneNumber;
	}

	protected PhoneNumber toUnwrappedModel(PhoneNumber phoneNumber) {
		if (phoneNumber instanceof PhoneNumberImpl) {
			return phoneNumber;
		}

		PhoneNumberImpl phoneNumberImpl = new PhoneNumberImpl();

		phoneNumberImpl.setNew(phoneNumber.isNew());
		phoneNumberImpl.setPrimaryKey(phoneNumber.getPrimaryKey());

		phoneNumberImpl.setNumberId(phoneNumber.getNumberId());

		return phoneNumberImpl;
	}

	/**
	 * Finds the phone number with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the phone number to find
	 * @return the phone number
	 * @throws com.liferay.portal.NoSuchModelException if a phone number with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PhoneNumber findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the phone number with the primary key or throws a {@link prueba.NoSuchPhoneNumberException} if it could not be found.
	 *
	 * @param numberId the primary key of the phone number to find
	 * @return the phone number
	 * @throws prueba.NoSuchPhoneNumberException if a phone number with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PhoneNumber findByPrimaryKey(String numberId)
		throws NoSuchPhoneNumberException, SystemException {
		PhoneNumber phoneNumber = fetchByPrimaryKey(numberId);

		if (phoneNumber == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + numberId);
			}

			throw new NoSuchPhoneNumberException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				numberId);
		}

		return phoneNumber;
	}

	/**
	 * Finds the phone number with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the phone number to find
	 * @return the phone number, or <code>null</code> if a phone number with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PhoneNumber fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the phone number with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param numberId the primary key of the phone number to find
	 * @return the phone number, or <code>null</code> if a phone number with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public PhoneNumber fetchByPrimaryKey(String numberId)
		throws SystemException {
		PhoneNumber phoneNumber = (PhoneNumber)EntityCacheUtil.getResult(PhoneNumberModelImpl.ENTITY_CACHE_ENABLED,
				PhoneNumberImpl.class, numberId, this);

		if (phoneNumber == null) {
			Session session = null;

			try {
				session = openSession();

				phoneNumber = (PhoneNumber)session.get(PhoneNumberImpl.class,
						numberId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (phoneNumber != null) {
					cacheResult(phoneNumber);
				}

				closeSession(session);
			}
		}

		return phoneNumber;
	}

	/**
	 * Finds all the phone numbers.
	 *
	 * @return the phone numbers
	 * @throws SystemException if a system exception occurred
	 */
	public List<PhoneNumber> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<PhoneNumber> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<PhoneNumber> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<PhoneNumber> list = (List<PhoneNumber>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PHONENUMBER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PHONENUMBER.concat(PhoneNumberModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<PhoneNumber>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<PhoneNumber>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the phone numbers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (PhoneNumber phoneNumber : findAll()) {
			remove(phoneNumber);
		}
	}

	/**
	 * Counts all the phone numbers.
	 *
	 * @return the number of phone numbers
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

				Query q = session.createQuery(_SQL_COUNT_PHONENUMBER);

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
	 * Gets all the members associated with the phone number.
	 *
	 * @param pk the primary key of the phone number to get the associated members for
	 * @return the members associated with the phone number
	 * @throws SystemException if a system exception occurred
	 */
	public List<prueba.model.Member> getMembers(String pk)
		throws SystemException {
		return getMembers(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
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
	public List<prueba.model.Member> getMembers(String pk, int start, int end)
		throws SystemException {
		return getMembers(pk, start, end, null);
	}

	public static final FinderPath FINDER_PATH_GET_MEMBERS = new FinderPath(prueba.model.impl.MemberModelImpl.ENTITY_CACHE_ENABLED,
			prueba.model.impl.MemberModelImpl.FINDER_CACHE_ENABLED,
			prueba.service.persistence.MemberPersistenceImpl.FINDER_CLASS_NAME_LIST,
			"getMembers",
			new String[] {
				String.class.getName(), "java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});

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
	public List<prueba.model.Member> getMembers(String pk, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				pk, String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<prueba.model.Member> list = (List<prueba.model.Member>)FinderCacheUtil.getResult(FINDER_PATH_GET_MEMBERS,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				String sql = null;

				if (orderByComparator != null) {
					sql = _SQL_GETMEMBERS.concat(ORDER_BY_CLAUSE)
										 .concat(orderByComparator.getOrderBy());
				}
				else {
					sql = _SQL_GETMEMBERS.concat(prueba.model.impl.MemberModelImpl.ORDER_BY_SQL);
				}

				SQLQuery q = session.createSQLQuery(sql);

				q.addEntity("Z_Member", prueba.model.impl.MemberImpl.class);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				list = (List<prueba.model.Member>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_GET_MEMBERS,
						finderArgs);
				}
				else {
					memberPersistence.cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_GET_MEMBERS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	public static final FinderPath FINDER_PATH_GET_MEMBERS_SIZE = new FinderPath(prueba.model.impl.MemberModelImpl.ENTITY_CACHE_ENABLED,
			prueba.model.impl.MemberModelImpl.FINDER_CACHE_ENABLED,
			prueba.service.persistence.MemberPersistenceImpl.FINDER_CLASS_NAME_LIST,
			"getMembersSize", new String[] { String.class.getName() });

	/**
	 * Gets the number of members associated with the phone number.
	 *
	 * @param pk the primary key of the phone number to get the number of associated members for
	 * @return the number of members associated with the phone number
	 * @throws SystemException if a system exception occurred
	 */
	public int getMembersSize(String pk) throws SystemException {
		Object[] finderArgs = new Object[] { pk };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_GET_MEMBERS_SIZE,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				SQLQuery q = session.createSQLQuery(_SQL_GETMEMBERSSIZE);

				q.addScalar(COUNT_COLUMN_NAME,
					com.liferay.portal.kernel.dao.orm.Type.LONG);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pk);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_GET_MEMBERS_SIZE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public static final FinderPath FINDER_PATH_CONTAINS_MEMBER = new FinderPath(prueba.model.impl.MemberModelImpl.ENTITY_CACHE_ENABLED,
			prueba.model.impl.MemberModelImpl.FINDER_CACHE_ENABLED,
			prueba.service.persistence.MemberPersistenceImpl.FINDER_CLASS_NAME_LIST,
			"containsMember",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Determines if the member is associated with the phone number.
	 *
	 * @param pk the primary key of the phone number
	 * @param memberPK the primary key of the member
	 * @return <code>true</code> if the member is associated with the phone number; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsMember(String pk, long memberPK)
		throws SystemException {
		Object[] finderArgs = new Object[] { pk, memberPK };

		Boolean value = (Boolean)FinderCacheUtil.getResult(FINDER_PATH_CONTAINS_MEMBER,
				finderArgs, this);

		if (value == null) {
			try {
				value = Boolean.valueOf(containsMember.contains(pk, memberPK));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (value == null) {
					value = Boolean.FALSE;
				}

				FinderCacheUtil.putResult(FINDER_PATH_CONTAINS_MEMBER,
					finderArgs, value);
			}
		}

		return value.booleanValue();
	}

	/**
	 * Determines if the phone number has any members associated with it.
	 *
	 * @param pk the primary key of the phone number to check for associations with members
	 * @return <code>true</code> if the phone number has any members associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	public boolean containsMembers(String pk) throws SystemException {
		if (getMembersSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Initializes the phone number persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.prueba.model.PhoneNumber")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PhoneNumber>> listenersList = new ArrayList<ModelListener<PhoneNumber>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PhoneNumber>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		containsMember = new ContainsMember(this);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(PhoneNumberImpl.class.getName());
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
	protected ContainsMember containsMember;

	protected class ContainsMember {
		protected ContainsMember(PhoneNumberPersistenceImpl persistenceImpl) {
			super();

			_mappingSqlQuery = MappingSqlQueryFactoryUtil.getMappingSqlQuery(getDataSource(),
					_SQL_CONTAINSMEMBER,
					new int[] { java.sql.Types.VARCHAR, java.sql.Types.BIGINT },
					RowMapper.COUNT);
		}

		protected boolean contains(String numberId, long memberId) {
			List<Integer> results = _mappingSqlQuery.execute(new Object[] {
						numberId, new Long(memberId)
					});

			if (results.size() > 0) {
				Integer count = results.get(0);

				if (count.intValue() > 0) {
					return true;
				}
			}

			return false;
		}

		private MappingSqlQuery<Integer> _mappingSqlQuery;
	}

	private static final String _SQL_SELECT_PHONENUMBER = "SELECT phoneNumber FROM PhoneNumber phoneNumber";
	private static final String _SQL_COUNT_PHONENUMBER = "SELECT COUNT(phoneNumber) FROM PhoneNumber phoneNumber";
	private static final String _SQL_GETMEMBERS = "SELECT {Z_Member.*} FROM Z_Member INNER JOIN Z_PhoneNumber ON (Z_PhoneNumber.numberId = Z_Member.numberId) WHERE (Z_PhoneNumber.numberId = ?)";
	private static final String _SQL_GETMEMBERSSIZE = "SELECT COUNT(*) AS COUNT_VALUE FROM Z_Member WHERE numberId = ?";
	private static final String _SQL_CONTAINSMEMBER = "SELECT COUNT(*) AS COUNT_VALUE FROM Z_Member WHERE numberId = ? AND memberId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "phoneNumber.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PhoneNumber exists with the primary key ";
	private static Log _log = LogFactoryUtil.getLog(PhoneNumberPersistenceImpl.class);
}