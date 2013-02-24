package com.oldschool.internet.productregistration.registration.portlet;

import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import com.oldschool.internet.productregistration.model.PRProduct;
import com.oldschool.internet.productregistration.service.PRProductLocalServiceUtil;

public class ProductAdminPortlet extends MVCPortlet {

	public void addProduct(ActionRequest request, ActionResponse response) throws Exception {
		ThemeDisplay themeDisplay =	(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		
		// ActionUtil: clase de utilidad que creamos para que obtenga
		// el PRProduct al que hace referencia el usuario en el form
		
		PRProduct product = ActionUtil.productFromRequest(request);
		ArrayList<String> errors = new ArrayList();
		
		// ProdRegValidator: esta clase contiene el código para validar  
		// las entradas introducidas por el usuario en el formulario

		if (ProdRegValidator.validateProduct(product, errors)) {
			
			// Almacenamos el PRProduct en la BB.DD llamando a la capa de servício
			
			// Todos los servícios están disponibles a través de los 
			// métodos estáticos de la clase *LocalServiceUtil.

			PRProductLocalServiceUtil.addProduct(product, themeDisplay.getUserId());
			SessionMessages.add(request, "product-saved-successfully");
		} else {
			SessionErrors.add(request, "fields-required");
		}
	}
}
