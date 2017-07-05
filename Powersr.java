# Powersr
import java.io.*;
import java.util.*;
public class Powersr
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a day");
String day=br.readLine();
if(day.equalsIgnoreCase("sunday"))
return false;
else if(day.equalsIgnoreCase("monday"))||(day.equalsIgnoreCase("tuesday"))|(day.equalsIgnoreCase("wednesday"))||(day.equalsIgnoreCase("thursaday"))||(day.equalsIgnoreCase("friday"))||(day.equalsIgnoreCase("saturday"))
return true;
else
return true;
}
}
