package eg.edu.alexu.csd.oop.calculator.cs12;

import eg.edu.alexu.csd.oop.calculator.cs12.calculator.Calculator;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mycalc implements Calculator {
    String operator;
    ArrayList<String> func=new ArrayList<String>();
    ArrayList <String>last_result=new ArrayList<String>();
    String numbers[]=new String[2];
    int jcounter=0;
    int jcounts=0;
    int z=0;
    @Override
    public void input(String s) {
        s = s.replaceAll("\\s+", "");
        String num =  "^((?:[-]?)(?:\\d+\\.{1}\\d+|\\d+))([/*+-×÷%]{1})((?:[-]?)(?:\\d+\\.{1}\\d+|\\d+))$";
        Pattern pattern = Pattern.compile(num);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            numbers[0]=matcher.group(1);
            operator=matcher.group(2);
            numbers[1]=matcher.group(3);
//            numbers = s.split("[+*/×÷%-]");
//            String op = String.valueOf(s.charAt(s.length() - 1));
//            int index = numbers[0].length();
//            operator = String.valueOf(s.charAt(index));
            func.add(s);
            z++;
            jcounter = func.size();
            System.out.println(operator);
            System.out.println("yes");
        } else {
            operator = "invalid";
            return;
        }
    }

    @Override
    public String getResult() {
        double number=0;
        switch (operator.charAt(0)){
            case '+': number=Double.parseDouble(numbers[0])+Double.parseDouble(numbers[1]);
                last_result.add(Double.toString(number));
                break;
            case '-': number=Double.parseDouble(numbers[0])-Double.parseDouble(numbers[1]);
                last_result.add(Double.toString(number));
                break;
            case '×':
            case '*':
                number=Double.parseDouble(numbers[0])*Double.parseDouble(numbers[1]);
                last_result.add(Double.toString(number));
                break;
            case '÷':
            case '/':
                if(Double.parseDouble(numbers[1])==0.0){return "Cannot divide by zero";}
                else{
                    number=Double.parseDouble(numbers[0])/Double.parseDouble(numbers[1]);
                    last_result.add(Double.toString(number));
                }
                break;
            case '%': if(Double.parseDouble(numbers[1])==0.0){ return "Cannot divide by zero";}
            else{
                number=Double.parseDouble(numbers[0])%Double.parseDouble(numbers[1]);
                last_result.add(Double.toString(number));
            }
                break;
            default: return "Not Valid";

        }

        return Double.toString(number);
    }
    int css=0;
    @Override
    public String current() {
        return func.get(func.size()-1);
    }
    boolean previous=false;
    @Override
    public String prev() {
        previous=true;
        if (func.isEmpty() || jcounter<=0){
            jcounter=-1;
            return null;
        }else if(jcounter>=func.size()-5){
            jcounter--;
            String prevProcces=func.get(jcounter);
            css=jcounter+1;
            return prevProcces;
        }else{
            css=0;
            jcounter=-1;
            return null;
        }
    }
    @Override
    public String next() {
        String nextProcces;
        if ((jcounter)>func.size()-1|| css>=func.size() ){
            return null;
        }else{
            if(previous==true){
                jcounter=jcounter+1;
                nextProcces=func.get((jcounter));
                previous=false;
            }else{
                nextProcces=func.get((jcounter));
            }
            jcounter++;
            return  nextProcces;
        }
    }
    int zx;
    @Override
    public void save()  {
        try {
            File clcs=new File("clc.txt");
            clcs.createNewFile();
            BufferedWriter in = new BufferedWriter(new FileWriter(clcs));
            if (func.isEmpty()){
                return;
            }else{
                in.write(""+(func.size()) +"\n");
                if(z>=6){
                    z=5;
                }
                    for (int i = func.size() - 1; (i >= func.size() - z || i == 5); i--) {
                        in.write(func.get(i));
                        in.write("\n");
                        in.write(last_result.get(i));
                        in.write("\n");
                    }
                    zx=z*2;

            }
            in.close();
        }
        catch (Exception e){

        }
    }

    @Override
    public void load() {
        try {

            //System.out.println(func);
            File clcs=new File("clc.txt");
            clcs.createNewFile();
            BufferedReader en = new BufferedReader(new FileReader(clcs));
            int j=Integer.parseInt(en.readLine());
            jcounter=0;
            func.clear();
            last_result.clear();
            String s=en.readLine();
            int i=0;
            while (s!=null){
                //func.set(i,en.readLine());
                if(i%2==0)
                    func.add(s);
                else {
                    last_result.add(s);
                }
                System.out.println(s);
                i++;
                s=en.readLine();
            }
            System.out.println(func);
            System.out.println(last_result);
            en.close();
        }
        catch (Exception e){

        }

    }

}
