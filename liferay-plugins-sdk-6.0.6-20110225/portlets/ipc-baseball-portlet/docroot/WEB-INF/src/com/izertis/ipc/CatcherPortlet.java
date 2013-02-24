package com.izertis.ipc;

import java.io.IOException;
import java.net.URL;

import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessEvent;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;
 
public class CatcherPortlet extends GenericPortlet {

	protected String viewJSP;
	private static Log _log = LogFactory.getLog(CatcherPortlet.class);
	private static Logger logger = Logger.getLogger(CatcherPortlet.class);
	
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
		// Se recoge el evento (String) generado
		// por BatterPortlet
		Event event = eventRequest.getEvent();
		String batter = (String)event.getValue();
		
		// Se envía a la vista del catcher el tipo
		// de bateo
		eventResponse.setRenderParameter("catcher", batter);

		// Salida por consola del tipo de bateo
		URL url = Loader.getResource("log4j.properties");
		PropertyConfigurator.configure(url);
		logger.debug("Recogedor: " + batter);
	}
}
