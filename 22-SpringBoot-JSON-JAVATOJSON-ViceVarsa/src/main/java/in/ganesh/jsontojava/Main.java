package in.ganesh.jsontojava;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ganesh.entity.Book;

public class Main 
{
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException 
	{
       File jsonF = new File("Book.json");
       ObjectMapper mpr = new ObjectMapper();
       Book bk =   mpr.readValue(jsonF, Book.class);
       System.out.println(bk);
	}
}
