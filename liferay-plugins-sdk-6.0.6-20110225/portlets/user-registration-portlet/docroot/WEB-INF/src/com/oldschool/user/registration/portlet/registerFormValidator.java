package com.oldschool.user.registration.portlet;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.liferay.portal.kernel.util.Validator;

import com.oldschool.user.registration.model.USMember;

/**
 * 
 * Liferay incluye una utilidad para la validaci�n de formularios
 * 
 * Est� implementada en la clase com.liferay.kernel.util.Validator
 * 
 * Para cada portlet se crea una clase a parte que contendr� toda la 
 * l�gica de la validaci�n, para todos los objetos que vallan a
 * persistir en la base de datos 
 *
 * Este es un ejemplo sencillo que s�lo comprueba que los campos
 * del formulario no est�n vac�os, pero el Validator() incluye
 * funciones como: isPhoneNumber() o isEmailAddress() 
 */
public class registerFormValidator {

	/**
	 * 
	 * @param errors Es el objeto SessionErrors, a el cual accederemos 
	 * 			 	 desde el formulario a trav�s de tags liferay-ui
	 */
	public static boolean validateRegister(USMember member, List<String> errors) {
		boolean valid = true;
		
		// Todos lo campos requeridos excepto el tel�fono
	
		valid = checkForValidFirstName(member, errors);
	
		valid = checkForValidLastName(member, errors);
		
		valid = checkForValidEmailAddress(member, errors);
		
		valid = checkForValidPhoneNumber(member, errors);
		
		return valid;
	}
	
	private static boolean checkForValidFirstName(USMember member, List<String> errors) {
		if (Validator.isNull(member.getMemberFirstName())) {
			errors.add("first-name-required");
			return false;
		}
		return true;
	}
	
	private static boolean checkForValidLastName(USMember member, List<String> errors) {
		if (Validator.isNull(member.getMemberLastName())) {
			errors.add("last-name-required");
			return false;
		}
		return true;
	}
	
	private static boolean checkForValidEmailAddress(USMember member, List<String> errors) {
		String emailAddress = member.getMemberEmail();
		
		if (Validator.isNull(emailAddress)) {
			errors.add("eMail-required");
			return false;
		}
		
		//else if(!Validator.isEmailAddress(emailAddress)) {
		//	errors.add("eMail-must-be-valid");
		//	return false;
		//}
		
		return true;
	}
	
	private static boolean checkForValidPhoneNumber(USMember member, List<String> errors) {
		String input = member.getMemberPhoneNumber();
		
		if ( Validator.isNotNull(input) ) {
			Pattern p = Pattern.compile("\\d{9}");
		    Matcher m = p.matcher(input);
		    if (m.find() && input.length() < 10) {
		    	return true;
		    }
		    errors.add("phone-number-must-contain-nine-digits");
		    return false;
		}

		return true;
	}
}
