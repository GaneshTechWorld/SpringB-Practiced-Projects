package in.main.dao;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImpl2  implements ReportDao
{
	public ReportDaoImpl2()
	{
		System.out.println("REportDaoImpl2 Constructor is here");
	}
	
	
	public String findData()
	{
		return "ReportDaoImpl2 class is here and report is genrated";
	}
}
