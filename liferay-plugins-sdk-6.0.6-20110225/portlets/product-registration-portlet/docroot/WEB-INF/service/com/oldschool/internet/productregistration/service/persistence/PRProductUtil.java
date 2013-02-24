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

package com.oldschool.internet.productregistration.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.oldschool.internet.productregistration.model.PRProduct;

import java.util.List;

/**
 * The persistence utility for the p r product service. This utility wraps {@link PRProductPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see PRProductPersistence
 * @see PRProductPersistenceImpl
 * @generated
 */
public class PRProductUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(PRProduct prProduct) {
		getPersistence().clearCache(prProduct);
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
	public static List<PRProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PRProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PRProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static PRProduct remove(PRProduct prProduct)
		throws SystemException {
		return getPersistence().remove(prProduct);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static PRProduct update(PRProduct prProduct, boolean merge)
		throws SystemException {
		return getPersistence().update(prProduct, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static PRProduct update(PRProduct prProduct, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(prProduct, merge, serviceContext);
	}

	/**
	* Caches the p r product in the entity cache if it is enabled.
	*
	* @param prProduct the p r product to cache
	*/
	public static void cacheResult(
		com.oldschool.internet.productregistration.model.PRProduct prProduct) {
		getPersistence().cacheResult(prProduct);
	}

	/**
	* Caches the p r products in the entity cache if it is enabled.
	*
	* @param prProducts the p r products to cache
	*/
	public static void cacheResult(
		java.util.List<com.oldschool.internet.productregistration.model.PRProduct> prProducts) {
		getPersistence().cacheResult(prProducts);
	}

	/**
	* Creates a new p r product with the primary key. Does not add the p r product to the database.
	*
	* @param productId the primary key for the new p r product
	* @return the new p r product
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct create(
		long productId) {
		return getPersistence().create(productId);
	}

	/**
	* Removes the p r product with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param productId the primary key of the p r product to remove
	* @return the p r product that was removed
	* @throws com.oldschool.internet.productregistration.NoSuchProductException if a p r product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct remove(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.internet.productregistration.NoSuchProductException {
		return getPersistence().remove(productId);
	}

	public static com.oldschool.internet.productregistration.model.PRProduct updateImpl(
		com.oldschool.internet.productregistration.model.PRProduct prProduct,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(prProduct, merge);
	}

	/**
	* Finds the p r product with the primary key or throws a {@link com.oldschool.internet.productregistration.NoSuchProductException} if it could not be found.
	*
	* @param productId the primary key of the p r product to find
	* @return the p r product
	* @throws com.oldschool.internet.productregistration.NoSuchProductException if a p r product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct findByPrimaryKey(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.internet.productregistration.NoSuchProductException {
		return getPersistence().findByPrimaryKey(productId);
	}

	/**
	* Finds the p r product with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param productId the primary key of the p r product to find
	* @return the p r product, or <code>null</code> if a p r product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct fetchByPrimaryKey(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(productId);
	}

	/**
	* Finds all the p r products where groupId = &#63; and productName = &#63;.
	*
	* @param groupId the group id to search with
	* @param productName the product name to search with
	* @return the matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findByG_PN(
		long groupId, java.lang.String productName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_PN(groupId, productName);
	}

	/**
	* Finds a range of all the p r products where groupId = &#63; and productName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param productName the product name to search with
	* @param start the lower bound of the range of p r products to return
	* @param end the upper bound of the range of p r products to return (not inclusive)
	* @return the range of matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findByG_PN(
		long groupId, java.lang.String productName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_PN(groupId, productName, start, end);
	}

	/**
	* Finds an ordered range of all the p r products where groupId = &#63; and productName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param productName the product name to search with
	* @param start the lower bound of the range of p r products to return
	* @param end the upper bound of the range of p r products to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findByG_PN(
		long groupId, java.lang.String productName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_PN(groupId, productName, start, end,
			orderByComparator);
	}

	/**
	* Finds the first p r product in the ordered set where groupId = &#63; and productName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param productName the product name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching p r product
	* @throws com.oldschool.internet.productregistration.NoSuchProductException if a matching p r product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct findByG_PN_First(
		long groupId, java.lang.String productName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.internet.productregistration.NoSuchProductException {
		return getPersistence()
				   .findByG_PN_First(groupId, productName, orderByComparator);
	}

	/**
	* Finds the last p r product in the ordered set where groupId = &#63; and productName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param productName the product name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching p r product
	* @throws com.oldschool.internet.productregistration.NoSuchProductException if a matching p r product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct findByG_PN_Last(
		long groupId, java.lang.String productName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.internet.productregistration.NoSuchProductException {
		return getPersistence()
				   .findByG_PN_Last(groupId, productName, orderByComparator);
	}

	/**
	* Finds the p r products before and after the current p r product in the ordered set where groupId = &#63; and productName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param productId the primary key of the current p r product
	* @param groupId the group id to search with
	* @param productName the product name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next p r product
	* @throws com.oldschool.internet.productregistration.NoSuchProductException if a p r product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct[] findByG_PN_PrevAndNext(
		long productId, long groupId, java.lang.String productName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.internet.productregistration.NoSuchProductException {
		return getPersistence()
				   .findByG_PN_PrevAndNext(productId, groupId, productName,
			orderByComparator);
	}

	/**
	* Finds all the p r products where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the p r products where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of p r products to return
	* @param end the upper bound of the range of p r products to return (not inclusive)
	* @return the range of matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the p r products where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of p r products to return
	* @param end the upper bound of the range of p r products to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first p r product in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching p r product
	* @throws com.oldschool.internet.productregistration.NoSuchProductException if a matching p r product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.internet.productregistration.NoSuchProductException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last p r product in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching p r product
	* @throws com.oldschool.internet.productregistration.NoSuchProductException if a matching p r product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.internet.productregistration.NoSuchProductException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the p r products before and after the current p r product in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param productId the primary key of the current p r product
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next p r product
	* @throws com.oldschool.internet.productregistration.NoSuchProductException if a p r product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct[] findByGroupId_PrevAndNext(
		long productId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.internet.productregistration.NoSuchProductException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(productId, groupId,
			orderByComparator);
	}

	/**
	* Finds all the p r products where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Finds a range of all the p r products where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of p r products to return
	* @param end the upper bound of the range of p r products to return (not inclusive)
	* @return the range of matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Finds an ordered range of all the p r products where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of p r products to return
	* @param end the upper bound of the range of p r products to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Finds the first p r product in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching p r product
	* @throws com.oldschool.internet.productregistration.NoSuchProductException if a matching p r product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.internet.productregistration.NoSuchProductException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Finds the last p r product in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching p r product
	* @throws com.oldschool.internet.productregistration.NoSuchProductException if a matching p r product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.internet.productregistration.NoSuchProductException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Finds the p r products before and after the current p r product in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param productId the primary key of the current p r product
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next p r product
	* @throws com.oldschool.internet.productregistration.NoSuchProductException if a p r product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.oldschool.internet.productregistration.model.PRProduct[] findByCompanyId_PrevAndNext(
		long productId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.oldschool.internet.productregistration.NoSuchProductException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(productId, companyId,
			orderByComparator);
	}

	/**
	* Finds all the p r products.
	*
	* @return the p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the p r products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of p r products to return
	* @param end the upper bound of the range of p r products to return (not inclusive)
	* @return the range of p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the p r products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of p r products to return
	* @param end the upper bound of the range of p r products to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of p r products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.oldschool.internet.productregistration.model.PRProduct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the p r products where groupId = &#63; and productName = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param productName the product name to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_PN(long groupId, java.lang.String productName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_PN(groupId, productName);
	}

	/**
	* Removes all the p r products where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the p r products where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Removes all the p r products from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the p r products where groupId = &#63; and productName = &#63;.
	*
	* @param groupId the group id to search with
	* @param productName the product name to search with
	* @return the number of matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_PN(long groupId, java.lang.String productName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_PN(groupId, productName);
	}

	/**
	* Counts all the p r products where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the p r products where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching p r products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Counts all the p r products.
	*
	* @return the number of p r products
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PRProductPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PRProductPersistence)PortletBeanLocatorUtil.locate(com.oldschool.internet.productregistration.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					PRProductPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(PRProductPersistence persistence) {
		_persistence = persistence;
	}

	private static PRProductPersistence _persistence;
}