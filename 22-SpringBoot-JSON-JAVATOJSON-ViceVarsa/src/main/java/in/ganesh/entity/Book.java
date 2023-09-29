package in.ganesh.entity;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Book
{
  private String id;
  private String name;
  private Integer pages;
  private Author info;
}
