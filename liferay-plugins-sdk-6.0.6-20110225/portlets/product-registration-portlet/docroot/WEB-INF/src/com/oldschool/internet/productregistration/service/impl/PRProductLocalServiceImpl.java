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

package com.oldschool.internet.productregistration.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.oldschool.internet.productregistration.model.PRProduct;
import com.oldschool.internet.productregistration.service.base.PRProductLocalServiceBaseImpl;

/**
 * The implementation of the p r product local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.oldschool.internet.productregistration.service.PRProductLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.oldschool.internet.productregistration.service.PRProductLocalServiceUtil} to access the p r product local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sr. Eladio
 * @see com.oldschool.internet.productregistration.service.base.PRProductLocalServiceBaseImpl
 * @see com.oldschool.internet.productregistration.service.PRProductLocalServiceUtil
 */
public class PRProductLocalServiceImpl extends PRProductLocalServiceBaseImpl {
	
	// ProductLocalServiceBaseImpl ---- implements ---- > ProductLocalService
	
	public PRProduct addProduct(PRProduct newProduct, long userId)
		throws SystemException, PortalException {
	
		// 1 - Creamos un objeto PRProduct vacío:
		//			PRProduct es la interface heredada de PRProductModel
		//			PRProductImpl es la implementacin de dicha interface que hereda de PRProductModelImpl
		//			prProductPersistence es una instancia de la capa DAO inyectada por Spring
		//			create() es generado por el ServiceBuilder y nos devolverá la instancia
		//			counterLocalService es una utilidad de Liferay para crear la clave primaria
		
		PRProduct product = prProductPersistence.create(counterLocalService.increment(PRProduct.class.getName()));
		
		// 2- Los Resources son utilizados en Liferay para gestionar los 
		//	  permisos sobre los objetos que se van a almacenar (permisos CRUD)
		
		resourceLocalService.addResources(newProduct.getCompanyId(), 
										  newProduct.getGroupId(), 
										  userId,
										  PRProduct.class.getName(),
										  product.getPrimaryKey(), false, true, true);
		
		// 3 - Una vez tenemos nuestro objeto, le metemos los valores
		//	   que serán almacenados en la base de datos
		
		product.setProductName(newProduct.getProductName());
		product.setSerialNumber(newProduct.getSerialNumber());
	    product.setCompanyId(newProduct.getCompanyId());
		product.setGroupId(newProduct.getGroupId());
		
		// 4 - Retornamos el método que acabamos de crear a la capa
		//	   que llamó en primer lugar a este método
		return prProductPersistence.update(product, false);
	}
	
}