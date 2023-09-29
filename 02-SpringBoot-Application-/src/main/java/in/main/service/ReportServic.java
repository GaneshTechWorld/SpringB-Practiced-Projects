package in.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.main.dao.ReportDao;
import in.main.dao.ReportDaoImpl;

@Service
public class ReportServic
{
	private ReportDao obj;
	
//  @Autowired   //use byTyped mode 
//	@Qualifier("priority")
//	public void setObj(ReportDao obj) 
//	{
//		System.out.println("setObj method is called...");
//		this.obj = obj;
//	}
	public ReportServic() 
	{
		System.out.println("Zero Param COnstructor Is Called...");
	}
	
    @Autowired
	public ReportServic(ReportDao obj)
	{
    	System.out.println("Param COnstructor Is Called...");
		this.obj = obj;
	}
	public void generateReport()
	{
	   System.out.println(obj.findData());
	   System.out.println("Generating Report....");
	}
	
}
