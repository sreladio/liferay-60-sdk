package com.izertis.ipc;

import java.io.IOException; 
import java.net.URL;

import javax.portlet.*;
import javax.xml.namespace.QName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;

public class BatterPortlet extends GenericPortlet {

	protected String viewJSP;
	private static Log _log = LogFactory.getLog(BatterPortlet.class);
	private static Logger logger = Logger.getLogger(BatterPortlet.class);
	
	public void init() {
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
	
	@ProcessEvent(qname = "{http://liferay.com/events}ipc.pitch")
	public void battBall(EventRequest eventRequest, EventResponse eventResponse) {
		// Se recoge el evento lanzado desde 
		// PitcherPortlet
		Event event = eventRequest.getEvent();
		Pitch pitch = (Pitch)event.getValue();
		
		// Se genera un bateo en función de la 
		// dificultad del lanzamiento de la bola
		String batterType;
		switch(pitch.getPitchDifficulty()) {
		case 1:
			batterType="Swing";
			break;
		case 2:
			batterType="Strike";
			break;
		default:
			batterType="Se da con el bate en la cara";
			break;
		}
		
		// Se manda a la vista del bateador el 
		// tipo de pitch recivido
		eventResponse.setRenderParameter("pitch", pitch.getPitchType());
		
		// Se lanza el evento (String) que recogerá 
		// CatcherPortlet y PublicoPortlet con el 
		// tipo de bateo
		QName qName = new QName("http://liferay.com/events", "ipc.batter");
		eventResponse.setEvent(qName, batterType);
		
		// Salida por consola del tipo de bateo
		URL url = Loader.getResource("log4j.properties");
		PropertyConfigurator.configure(url);
		logger.debug("Bateador: " + batterType);
	}
}
