package com.library.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice {
    public static void main(String[] args) {

        int a = 3 ;
        String phrase = "abc de fghij" ;


        
        reshape(a,phrase);

    }

    public static void reshape(int number , String  phrase)
    {
        String[] a = phrase.split(" ");
        System.out.println(Arrays.toString(a));
        List<String>eachChar =  new ArrayList<>();




        for(String each : a)
        {
            eachChar.addAll(Arrays.asList(each.split("")));
        }
        System.out.println(eachChar);


        for (int i = 0 ; i< eachChar.size(); i+=number)
         {
            if(number == 2) {
                if (i + 1 < eachChar.size())
                    System.out.println(eachChar.get(i) + eachChar.get(i + 1));
                else
                    System.out.println(eachChar.get(i));
            }

            if (number == 3)
            {
                if (i + 1 < eachChar.size())
                    System.out.println(eachChar.get(i) + eachChar.get(i + 1) + eachChar.get(i+2));
                else
                    System.out.println(eachChar.get(i));
            }
            }


        }


    }
    

