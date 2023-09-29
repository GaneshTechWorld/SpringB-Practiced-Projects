package in.ganesh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book
{ 
 private String bookName;
 private Integer bookPrice;
 private String autName;
 private Integer totalPages;
}
