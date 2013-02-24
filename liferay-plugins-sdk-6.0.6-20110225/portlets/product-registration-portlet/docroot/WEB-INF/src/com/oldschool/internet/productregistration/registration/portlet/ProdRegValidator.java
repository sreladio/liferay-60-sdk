package com.oldschool.internet.productregistration.registration.portlet;

import java.util.List;

import com.liferay.portal.kernel.util.Validator;
import com.oldschool.internet.productregistration.model.PRProduct;

/**
 * 
 * Liferay incluye una utilidad para la validación de formularios
 * 
 * Está implementada en la clase com.liferay.kernel.util.Validator
 * 
 * Para cada portlet se crea una clase a parte que contendrá toda la 
 * lógica de la validación, para todos los objetos que vallan a
 * persistir en la base de datos 
 *
 * Este es un ejemplo sencillo que sólo comprueba que los campos
 * del formulario no estén vacíos, pero el Validator() incluye
 * funciones como: isPhoneNumber() o isEmailAddress() 
 */
public class ProdRegValidator {

	/**
	 * 
	 * @param product
	 * @param errors Es el objeto SessionErrors, a el cual accederemos 
	 * 				  desde el formulario a través de tags liferay-ui
	 * @return
	 */
	public static boolean validateProduct(PRProduct product, List errors) {
		boolean valid = true;
		if (Validator.isNull(product.getProductName())) {
			errors.add("product-name-required");
			valid = false;
		}
		if (Validator.isNull(product.getSerialNumber())) {
			errors.add("serial-number-prefix-required");
			valid = false;
		}
		if (Validator.isNull(product.getCompanyId())) {
			errors.add("missing-company-id");
			valid = false;
		}
		if (Validator.isNull(product.getGroupId())) {
			errors.add("missing-group-id");
			valid = false;
		}
		return valid;
		}
}
