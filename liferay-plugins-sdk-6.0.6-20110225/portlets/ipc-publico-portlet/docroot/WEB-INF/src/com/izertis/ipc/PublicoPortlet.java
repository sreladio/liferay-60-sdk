package com.izertis.ipc;

import java.io.IOException;
import java.net.URL;

import javax.portlet.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;
 
public class PublicoPortlet extends GenericPortlet {

	protected String viewJSP;
	private static Log _log = LogFactory.getLog(PublicoPortlet.class);
	private static Logger logger = Logger.getLogger(PublicoPortlet.class);
	
	public void init() throws PortletException {
		viewJSP = getInitParameter("view-jsp");
	}
	
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) 
			throws PortletException, IOException {
		
		include(viewJSP, renderRequest, renderResponse);
	}
	
	public void include(String path, RenderRequest renderRequest, RenderResponse renderResponse) 
			throws PortletException, IOException {
		
		PortletRequestDispatcher prd = getPortletContext().getRequestDispatcher(path);
		if(prd != null) {
			prd.include(renderRequest, renderResponse);
		}
		else {
			_log.error(path + "is not a valid include");
		}
	}
	
	@ProcessEvent(qname = "{http://liferay.com/events}ipc.batter")
	public void catchBall(EventRequest eventRequest, EventResponse eventResponse) {
		// Se recoge el evento (String) generado por
		// BatterPortlet
		Event event = eventRequest.getEvent();
		String batter = (String)event.getValue();
		
		// En caso de no golpear la bola,
		// el público le abucheará
		String publico;
		if(batter.compareTo("Swing") == 0) {
			publico = "YOU ARE AMAZING";
		}
		else {
			publico = "FUUUUUUUUUUUUUU";
		}
		
		// Se manda a la vista del público la
		// respuesta geneerada
		eventResponse.setRenderParameter("publico", publico);
		
		// Salida por pantalla de la respuesta del público
		URL url = Loader.getResource("log4j.properties");
		PropertyConfigurator.configure(url);
		logger.debug(publico);
	}
}
