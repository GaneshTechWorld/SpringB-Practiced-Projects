package in.ganesh.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="PLAYERINFO")
public class PlayerInfo
{
	@Id
	@Column(name="PLAYER_ID")
	private Integer playerId;
	
	@Column(name="PLAYER_NAME")
	private String palyer_name;
	
	@Column(name="PLAYER_sellery")
	private Integer palyer_sellery;
	
	
	@Column(name="PLAYER_AGE")
	private Integer palyer_age;
	
	
	public void setPalyer_age(Integer palyer_age) 
	{
		this.palyer_age = palyer_age;
	}

	@Column
	private String location;

	public Integer getPlayerId() 
	{
		return playerId;
	}

	public void setPlayerId(Integer playerId) 
	{
		this.playerId = playerId;
	}

	public String getPalyer_name() 
	{
		return palyer_name;
	}

	public void setPalyer_name(String palyer_name)
	{
		this.palyer_name = palyer_name;
	}

	public Integer getPalyer_sellery()
	{
		return palyer_sellery;
	}

	public void setPalyer_sellery(Integer palyer_sellery) 
	{
		this.palyer_sellery = palyer_sellery;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}
	
	
	
}
