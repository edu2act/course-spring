package demo4;

import java.util.HashMap;
import java.util.Map;

public class Container {

	private static Container instance;
	private Map<String, Object> components;

	private Container() {
		components = new HashMap<String, Object>();
		instance = this;
		
		ReportGenerator reportGenerator = new PdfReportGenerator();
		components.put("reportGenerator", reportGenerator);

		ReportService reportService = new ReportService();
		components.put("reportService", reportService);
	}
	
	public static Container getInstance(){
		if(instance == null)
			instance = new Container();
		return instance;
	}

	public Object getComponent(String key) {
		return components.get(key);
	}
}
