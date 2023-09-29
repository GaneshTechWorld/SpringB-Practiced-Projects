package in.ganesh.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;





@Data
@AllArgsConstructor
@Document  //Maps Entity class objects to JSON formatted Document
public class Book
{
    @Id
    private String id;
    
    @NonNull
    private Integer bookId;
    
    @NonNull
    private String bookAuthor;
    
    @NonNull
    private Double bookCost;
}
