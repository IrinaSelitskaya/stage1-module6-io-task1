package com.epam.mjc.io;

import java.io.File;
import java.io.*;
import java.util.Scanner;

public class FileReader {
 public Profile getDataFromFile(File file) throws IOException{
  Scanner s=null;
  try{
   s=new Scanner(file);
   s.useDelimiter("\n?\\w+: ");
   String name1=s.next();
   int age1=s.nextInt();
   String email1=s.next();
   long phone1=s.nextLong();   
   Profile p=new Profile(name1,age1,email1,phone1);
   return p;    
  }finally{
   if(s!=null){
    s.close();}
  }
 } 
 public static void main(String[] args) throws IOException{
  FileReader fileReader=new FileReader();
  File f=new File("Profile.txt");
  fileReader.getDataFromFile(f);
 }
}
