package com.epam.mjc.io;

import java.io.File;
import java.io.*;

public class FileReader {
 public Profile getDataFromFile(File file){
  try (BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(file))))){
   String l;
   String lines=null;
   while((l=br.readLine())!=null){
    lines+=l+"\n";}
   String [] pairs=lines.split("\n");
   for(int i=0;i<pairs.length;i++){
    pairs[i]=pairs[i].split(": ")[1];}
   String name=pairs[0];
   int age=Integer.parseInt(pairs[1]);
   String email=pairs[2];
   long phone=Long.parseLong(pairs[3]);
   return new Profile(name,age,email,phone);
  }catch (IOException ex){
   ex.printStackTrace();
  }
  return null;
 }
 public static void main(String args []){
  FileReader fileReader=new FileReader();
  File f=new File("Profile.txt");
  fileReader.getDataFromFile(f);
 }
} 
  
