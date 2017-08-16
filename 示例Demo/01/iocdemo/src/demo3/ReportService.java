package demo3;

public class ReportService {
	
	ReportGenerator pdfGenerator = (ReportGenerator)Container.getInstance().getComponent("reportGenerator");

	public void generateReport(){
		System.out.println("收集、汇总数据！");
		System.out.println("生成柱状图等图标！");
		pdfGenerator.generate();
	}

}
