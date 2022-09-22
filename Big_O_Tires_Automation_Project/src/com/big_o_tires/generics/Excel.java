package com.big_o_tires.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
//Path 
String path="D:\\selenium\\Book1.xlsx";        //.means relative xpath or use (.\\data\\Book1.xlsx)
FileInputStream fis=new FileInputStream(path); //java method//still path not selected, to select we have to use aphace selenium method workbookfactory
Workbook wb = WorkbookFactory.create(fis);
//Get Sheet
//Sheet sheet = wb.getSheet("Emp Data");         //String v=wb.getSheet("Emp data").getRow(7).getCell(4).toString();
//Get Row
//Row row = sheet.getRow(10);
//Get cell
//Cell cell = row.getCell(4);
//ToString(print)
//String v = cell.toString();
//System.out.println(v);


//in each row how many cells are there
/*int Totalrows = wb.getSheet("Emp Data").getLastRowNum();
System.out.println("total rows:::"+Totalrows);

for(int i=0;i<Totalrows;i++)
{
	short lastCellNum = wb.getSheet("Emp Data").getRow(i).getLastCellNum();
	System.out.println(lastCellNum);*/
	
for(int i=0;i<=5;i++)
{
	for(int j=0;j<=4;j++)
	{
		String v = wb.getSheet("Emp Data").getRow(i).getCell(j).toString();
		System.out.print(v+"      ");
	}
	System.out.println();
}
}
}
