package in.ganesh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Booked 
{
	private String bStatus;
	private String moneyRecived;
	private String  custAddress;
	private String purchesId;

}
