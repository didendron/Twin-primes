package com.mycompany;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigInteger firstNumber;
        BigInteger secondNumber;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a lower odd number from range:");
        BigInteger lowerNumber=in.nextBigInteger();
        System.out.println("Enter a greater number from range:");
        BigInteger greaterNumber=in.nextBigInteger();


        for(BigInteger i=lowerNumber;i.compareTo(greaterNumber)<=0;i=i.add(BigInteger.valueOf(2))){
            if((isPrime(i))&&(isPrime(i.add(BigInteger.valueOf(2))))){
                firstNumber=i;
                secondNumber=i.add(BigInteger.valueOf(2));
                System.out.println(firstNumber+","+secondNumber);
            }
        }
    }
    public static boolean isPrime(BigInteger number){
        if (number.equals(BigInteger.valueOf(2))) return true;
        if (number.equals(BigInteger.valueOf(3))) return true;
        if ((number.mod(BigInteger.valueOf(2))).equals(BigInteger.valueOf(0))) {
            return false;
        }
        else {
            BigInteger lessFactor=new BigInteger("3");
            boolean condition=true;
            int counter=-1;
            while(condition){
                BigInteger greaterFactor=number.divide(lessFactor);
                while ((greaterFactor.mod(BigInteger.valueOf(2))).equals(BigInteger.valueOf(0))
                        ||((greaterFactor.mod(BigInteger.valueOf(3))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(3))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(5))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(5))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(7))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(7))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(11))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(11))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(13))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(13))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(17))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(17))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(19))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(19))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(23))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(23))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(29))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(29))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(31))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(31))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(37))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(37))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(41))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(41))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(43))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(43))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(47))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(47))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(53))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(53))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(59))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(59))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(61))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(61))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(67))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(67))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(71))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(71))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(73))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(73))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(79))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(79))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(83))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(83))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(89))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(89))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(97))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(97))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(101))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(101))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(103))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(103))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(107))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(107))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(109))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(109))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(113))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(113))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(127))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(127))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(131))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(131))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(137))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(137))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(139))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(139))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(149))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(149))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(151))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(151))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(157))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(157))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(163))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(163))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(167))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(167))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(173))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(151))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(179))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(179))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(181))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(181))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(191))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(191))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(193))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(193))>0))
                        ||((greaterFactor.mod(BigInteger.valueOf(197))).equals(BigInteger.valueOf(0))&&(lessFactor.compareTo(BigInteger.valueOf(197))>0))

                ){  counter++;
                    if(lessFactor.equals(BigInteger.valueOf(5)))counter=0;
                    if(counter==0){
                        lessFactor=lessFactor.add(BigInteger.valueOf(2));
                        greaterFactor=number.divide(lessFactor);
                    }
                    else{
                        lessFactor=lessFactor.add(BigInteger.valueOf(4));
                        greaterFactor=number.divide(lessFactor);
                        counter=-1;
                    }

                }


                if (greaterFactor.multiply(lessFactor).equals(number)){
                    return false;
                }
                counter++;
                if(lessFactor.equals(BigInteger.valueOf(5)))counter=0;
                if(counter==0){
                    lessFactor=lessFactor.add(BigInteger.valueOf(2));
                }
                else{
                    lessFactor=lessFactor.add(BigInteger.valueOf(4));
                    counter=-1;
                }


                while((lessFactor.mod(BigInteger.valueOf(3))).equals(BigInteger.valueOf(0))
                        ||(!(lessFactor.equals(BigInteger.valueOf(5)))&&(lessFactor.mod(BigInteger.valueOf(5))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(7)))&&(lessFactor.mod(BigInteger.valueOf(7))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(11)))&&(lessFactor.mod(BigInteger.valueOf(11))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(13)))&&(lessFactor.mod(BigInteger.valueOf(13))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(17)))&&(lessFactor.mod(BigInteger.valueOf(17))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(19)))&&(lessFactor.mod(BigInteger.valueOf(19))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(23)))&&(lessFactor.mod(BigInteger.valueOf(23))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(29)))&&(lessFactor.mod(BigInteger.valueOf(29))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(31)))&&(lessFactor.mod(BigInteger.valueOf(31))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(37)))&&(lessFactor.mod(BigInteger.valueOf(37))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(41)))&&(lessFactor.mod(BigInteger.valueOf(41))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(43)))&&(lessFactor.mod(BigInteger.valueOf(43))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(47)))&&(lessFactor.mod(BigInteger.valueOf(47))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(53)))&&(lessFactor.mod(BigInteger.valueOf(53))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(59)))&&(lessFactor.mod(BigInteger.valueOf(59))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(61)))&&(lessFactor.mod(BigInteger.valueOf(61))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(67)))&&(lessFactor.mod(BigInteger.valueOf(67))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(71)))&&(lessFactor.mod(BigInteger.valueOf(71))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(73)))&&(lessFactor.mod(BigInteger.valueOf(73))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(79)))&&(lessFactor.mod(BigInteger.valueOf(79))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(83)))&&(lessFactor.mod(BigInteger.valueOf(83))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(89)))&&(lessFactor.mod(BigInteger.valueOf(89))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(97)))&&(lessFactor.mod(BigInteger.valueOf(97))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(101)))&&(lessFactor.mod(BigInteger.valueOf(101))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(103)))&&(lessFactor.mod(BigInteger.valueOf(103))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(107)))&&(lessFactor.mod(BigInteger.valueOf(107))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(109)))&&(lessFactor.mod(BigInteger.valueOf(109))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(113)))&&(lessFactor.mod(BigInteger.valueOf(113))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(127)))&&(lessFactor.mod(BigInteger.valueOf(127))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(131)))&&(lessFactor.mod(BigInteger.valueOf(131))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(137)))&&(lessFactor.mod(BigInteger.valueOf(137))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(139)))&&(lessFactor.mod(BigInteger.valueOf(139))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(149)))&&(lessFactor.mod(BigInteger.valueOf(149))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(151)))&&(lessFactor.mod(BigInteger.valueOf(151))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(157)))&&(lessFactor.mod(BigInteger.valueOf(157))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(163)))&&(lessFactor.mod(BigInteger.valueOf(163))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(167)))&&(lessFactor.mod(BigInteger.valueOf(167))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(173)))&&(lessFactor.mod(BigInteger.valueOf(173))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(179)))&&(lessFactor.mod(BigInteger.valueOf(179))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(181)))&&(lessFactor.mod(BigInteger.valueOf(181))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(191)))&&(lessFactor.mod(BigInteger.valueOf(191))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(193)))&&(lessFactor.mod(BigInteger.valueOf(193))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(197)))&&(lessFactor.mod(BigInteger.valueOf(197))).equals(BigInteger.valueOf(0)))
                        ||(!(lessFactor.equals(BigInteger.valueOf(199)))&&(lessFactor.mod(BigInteger.valueOf(199))).equals(BigInteger.valueOf(0)))


                ){
                    counter++;
                    if(lessFactor.equals(BigInteger.valueOf(5)))counter=0;
                    if(counter==0){
                        lessFactor=lessFactor.add(BigInteger.valueOf(2));
                    }
                    else{
                        lessFactor=lessFactor.add(BigInteger.valueOf(4));
                        counter=-1;
                    }


                }




                if (greaterFactor.compareTo(lessFactor)<0) condition=false;
            }
            return true;
        }

    }

}
