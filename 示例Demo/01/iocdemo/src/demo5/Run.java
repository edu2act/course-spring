package demo5;

public class Run {
	public static void main(String[] args) {
		ReportService reportService = (ReportService) Container.getInstance().getComponent("reportService");
		reportService.generateReport();
	}
}
