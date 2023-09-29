package in.main.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class ReportDaoImpl  implements ReportDao
{
	public ReportDaoImpl()
	{
		System.out.println("REportDaoImpl Constructor is here");
	}
	
	
	
	public String findData()
	{
		return "ReportDaoImpl class is here and report is genrated";
	}
}
