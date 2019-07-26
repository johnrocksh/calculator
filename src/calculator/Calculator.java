/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Calculator {
    
  //AriphmeticExpretionParsing  
 public ArrayList<String> operandArrayList=new ArrayList();
 public ArrayList<String> numberArrayList= new ArrayList();
 boolean operandPhlag=false;//если идет 2 операнда подряд один из них указатель отрицательного числа то ставим в true;
 
 
 double AriphmeticExpretionParsing(String ariphmeticString){
 double result=0.00d;
 
 
 
 return result;
 }

 double toCalculate(char operator,double operandX,double operandY){
 
 switch(operator){
 
     case '+':
        return sum(operandX,operandY);
      
     case '-':
         return difference(operandX,operandY);
     
     case '*':
         return multiplication(operandX,operandY);
        
     case '/':
         return division(operandX,operandY);
 }
 
 return 0.0;
 }
 
 
  public double  sum(double x,double y){
        return x+y;
    }
  
  public double difference(double x,double y){
  return x-y;
  }
  
  public double multiplication(double x, double y){
  return x*y;
  }
  
  public double division(double x,double y){
  if(y!=0){
  return x/y;
  }
  else{
      JOptionPane.showMessageDialog(null, "Деление на 0 невозможно!");
      return -1;
  
 }}
  
  
  
}
