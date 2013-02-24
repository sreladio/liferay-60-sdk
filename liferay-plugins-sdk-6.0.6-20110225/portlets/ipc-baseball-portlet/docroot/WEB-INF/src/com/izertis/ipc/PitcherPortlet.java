package com.izertis.ipc;

import java.io.IOException;
import java.net.URL;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.xml.namespace.QName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;
 
public class PitcherPortlet extends GenericPortlet {

	public Pitch pitch;
	protected String viewJSP;
	private static Log _log = LogFactory.getLog(PitcherPortlet.class);
	private static Logger logger = Logger.getLogger(PitcherPortlet.class);
	
	public void init() throws PortletException {
		viewJSP = getInitParameter("view-jsp");
		pitch = Pitch.getPitchInstance();
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
	
	@ProcessAction(name = "pitchBall")
	public void pitchBall(ActionRequest actionRequest, ActionResponse actionResponse) {
		// Se genera el lanzamiento (pitch)
		pitch.generatePitch();
		
		// Se lanza el evento que recogerá BatterPortlet
		QName qName = new QName("http://liferay.com/events", "ipc.pitch");
		actionResponse.setEvent(qName, pitch);
		
		// Salida por consola del tipo de lanzamiento
		URL url = Loader.getResource("log4j.properties");
		PropertyConfigurator.configure(url);
		logger.debug("Lanzador: " + pitch.getPitchType());
	}
}
