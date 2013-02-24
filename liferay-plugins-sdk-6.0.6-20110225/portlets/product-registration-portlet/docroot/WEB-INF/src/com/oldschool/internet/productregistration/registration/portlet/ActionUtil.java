package com.oldschool.internet.productregistration.registration.portlet;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.oldschool.internet.productregistration.model.PRProduct;
import com.oldschool.internet.productregistration.model.impl.PRProductImpl;

public class ActionUtil {
	
	public static PRProduct productFromRequest (ActionRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay)
		request.getAttribute(WebKeys.THEME_DISPLAY);
		PRProduct product = new PRProductImpl();
		product.setCompanyId(themeDisplay.getCompanyId());
		product.setGroupId(themeDisplay.getScopeGroupId());
		product.setProductName(ParamUtil.getString(request, "productName"));
		product.setSerialNumber(ParamUtil.getString(request, "productSerial"));
		
		return product;
	}
}
