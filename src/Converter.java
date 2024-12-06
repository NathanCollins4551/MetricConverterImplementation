/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nerdm
 */
public class Converter {
    public static double convertLength(double num, LengthUnit from, LengthUnit to){
        //it doesn't make sense to convert directly because that would have way to many direct conversion, we will convert to a base unit, feet , then convert from feet.
        double base = 0;
        switch(from){
            case INCHES -> base = num/12;
            case FEET -> base = num;
            case YARDS -> base = num*3;
            case MILES -> base = num*5280;
            case MM -> base = num*0.00328084;
            case CM -> base = num*0.0328084;
            case M -> base = num*3.28084;
            case KM -> base = num*3280.84;
        }
        switch(to){
            case INCHES -> {
                return base*12;
            }
            case FEET -> {
                return base;
            }
            case YARDS -> {
                return base/3;
            }
            case MILES -> {
                return base/5280;
            }
            case MM -> {
                return base*304.8;
            }
            case CM -> {
                return base*30.48;
            }
            case M -> {
                return base*0.3048;
            }
            case KM -> {
                return base*0.0003048;
            }
        }
        return 0.0;
    }


    public static double convertWeight(double num, WeightUnit from, WeightUnit to){
        // base unit = pounds , convert to pounds, then from pounds.
        double base = 0;
        switch(from){
            case POUNDS -> base = num;
            case OUNCES -> base = num/16;
            case MG -> base = num/453600;
            case G -> base = num/453.6;
            case KG -> base = num*2.205;
        }
        switch(to){
            case POUNDS -> {
                return base;
            }
            case OUNCES -> {
                return base*16;
            }
            case MG -> {
                return base*453600;
            }
            case G -> {
                return base*453.6;
            }
            case KG -> {
                return base/2.205;
            }
        }
        return 0.0;
    }

    public static double convertVolume(double num, VolumeUnit from, VolumeUnit to){
        // base unit = Liters , convert to L, then from L.
        double base = 0;
        switch(from){
            case FLUID_OUNCES -> base = num/33.814;
            case PINTS -> base = num/2.113;
            case QUARTS -> base = num/1.057;
            case GALLONS -> base = num*3.785;
            case ML -> base = num/1000;
            case L -> base = num;
        }
        switch(to){
            case FLUID_OUNCES -> {
                return base*33.814;
            }
            case PINTS -> {
                return base*2.113;
            }
            case QUARTS -> {
                return base*1.057;
            }
            case GALLONS -> {
                return base/3.785;
            }
            case ML -> {
                return base*1000;
            }
            case L -> {
                return base;
            }
        }
        return 0.0;
    }

    public static double convertTime(double num, TimeUnit from, TimeUnit to){
        // base unit = hours , convert to hours, then from hours.
        double base = 0;
        switch(from){
            case SECONDS -> base = num/3600;
            case MINUTES -> base = num/60;
            case HOURS -> base = num;
            case DAYS -> base = num*24;
            case WEEKS -> base = num*168;
            case MONTHS -> base = num*730;
            case YEARS -> base = num*8760;
        }
        switch(to){
            case SECONDS -> {
                return base*3600;
            }
            case MINUTES -> {
                return base*60;
            }
            case HOURS -> {
                return base;
            }
            case DAYS -> {
                return base/24;
            }
            case WEEKS -> {
                return base/168;
            }
            case MONTHS -> {
                return base/730;
            }
            case YEARS -> {
                return base/8760;
            }
        }
        return 0.0;
    }

    public enum LengthUnit{
        INCHES, FEET, YARDS, MILES,
        MM, CM, M, KM
    }
    public enum WeightUnit{
        POUNDS, OUNCES,
        MG, G, KG
    }
    public enum VolumeUnit{
        FLUID_OUNCES, PINTS, QUARTS, GALLONS,
        ML, L
    }
    public enum TimeUnit{
        SECONDS, MINUTES, HOURS, DAYS, WEEKS, MONTHS, YEARS
    }
}
