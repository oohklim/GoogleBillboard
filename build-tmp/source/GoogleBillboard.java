import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435729003342952605956307381323286279434907633382988075319525101901157383418793070215408914993488416750924476146066808226480016847741185374234544243710753907774499269551702761838606261331384583000752044933826560297606737113200709328709127443747047230696977209310141692836819025515108657463772111252389784425056953696770785449969967946864454905987931636889230098793127736178215424999229576351482208269895193668033182528869398496465105820939239829488793320362509443117301238197068416140397019837679320683282376464804295311802328782509819455815301756717361332069811250996181881593041690351598888519345807273866738589422879228499892086805825749279610484198444363463244968487560233624827041978623209002160990235304369941849146314093431738143640546253152096183690888707";  
public int xValue = 1;
public void setup()  
{
  for(int i = 2; i < e.length() - 10; i++)
  {
  	String digits = e.substring(i, i + 10);
   	double dNum = Double.parseDouble(digits);
   	if(isPrime(dNum))
   	{
   		System.out.println("First 10-digit prime in e: " + digits);
   		break;
   	}
  }
  for(int i = 2; i < e.length() - 10; i++)
  {
    String digits = e.substring(i, i + 10);
    double dNum = Double.parseDouble(digits);
    if(addsto49(digits) && xValue < 6)
    {
      System.out.println("f(" + xValue + "): " + digits);
      xValue++;
    }
	}
}
public boolean isPrime(double dNum) 
{   
   if(dNum < 2)
   {
     return false;
   }
   for(int i = 2; i <= Math.sqrt(dNum); i++)
   {
     if(dNum % i == 0)
     {
       return false;
     }
   }
   return true;
}
public boolean addsto49(String digits)
{
  double total = 0;
  for(int i = 0; i < digits.length(); i++)
  {
    String sTemp = digits.substring(i, i + 1);
    double dTemp = Double.parseDouble(sTemp);
    total += dTemp;
  }
  return(total == 49);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
