package demo1;

public class ReportService {
	
	PdfReportGenerator pdfGenerator=new PdfReportGenerator();
	
	public void generateReport(){
		System.out.println("收集、汇总数据！");
		System.out.println("生成柱状图等图标！");
		pdfGenerator.generate();
	}

}
