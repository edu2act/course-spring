package demo5;

public class ReportService {

	private ReportGenerator pdfGenerator;
	
	public void setPdfGenerator(ReportGenerator pdfGenerator) {
		this.pdfGenerator = pdfGenerator;
	}

	public void generateReport(){
		System.out.println("收集、汇总数据！");
		System.out.println("生成柱状图等图标！");
		pdfGenerator.generate();
	}

}
