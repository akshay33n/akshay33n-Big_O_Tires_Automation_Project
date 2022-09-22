package com.big_o_tires.generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 
{
	public static int getRowCount(String path,String sheet)
		{
	int rc=0;
	try
	{
		FileInputStream fis=new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		       rc=wb.getSheet(sheet).getLastRowNum();
	}
	catch(Exception e)
	{
			System.out.println("we are not found file");
		}
	return rc;
	}
//.......................................................................................................................
public static  String getcell(String path,String sheet,int r,int c)
{
String rc="";
try
{
FileInputStream fis=new FileInputStream(path);

Workbook wb = WorkbookFactory.create(fis);

       rc=wb.getSheet(sheet).getRow(r).getCell(c).toString();
}
catch(Exception e)
{
	System.out.println("we are not founf file");
}
return rc;
}
//........................................................................................................................
public static int getrow(String path,String sheet,int r)
{
int rc=0;
try
{
FileInputStream fis=new FileInputStream(path);

Workbook wb = WorkbookFactory.create(fis);

        Row row = wb.getSheet(sheet).getRow(r);
}
catch(Exception e)
{
	System.out.println("we are not founf file");
}
return rc;
}}