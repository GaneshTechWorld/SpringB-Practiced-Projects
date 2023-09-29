package in.ganesh.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Book")
public class Book 
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="BOOK_ID")
  private Integer bookID;
  @Column(name="BOOK_NAME")
  private String bookName;
  @Column(name="BOOK_Price")
  private Double bookPrice;
}
