package com.oldschool.user.registration.portlet;

import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import com.oldschool.user.registration.model.USMember;
import com.oldschool.user.registration.service.USMemberLocalServiceUtil;

public class UserRegistrationPortlet extends MVCPortlet {

	public void addMember(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException {
		
		ThemeDisplay themeDisplay =	(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		
		// ActionUtil: clase de utilidad que creamos para que nos
		// genere el USMember. Le pasamos la 'request' y ella ya 
		// pilla los datos del formulario para generar el objeto
		
		USMember member = ActionUtil.memberFromRequest(request);
		ArrayList<String> errors = new ArrayList<String>();
		
		// ProdRegValidator: esta clase contiene el c�digo para validar  
		// las entradas introducidas por el usuario en el formulario

		if (registerFormValidator.validateRegister(member, errors)) {
			
			// Almacenamos el USMember en la BB.DD llamando a la capa de serv�cio
			
			// Todos los serv�cios est�n disponibles a trav�s de los 
			// m�todos est�ticos de la clase *LocalServiceUtil.

			USMemberLocalServiceUtil.addMember(member, themeDisplay.getUserId());
			SessionMessages.add(request, "member-add-successfully");
		} else {
			for(String key : errors) {
				SessionErrors.add(request, key);
			}
		}
	}
}
