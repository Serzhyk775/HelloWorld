package Raduga;

public class Rainbow {
    private static String Red= "красный" ;
    private static String Blue= "синий";
    public String getColorName(String number)
    {
        switch (number){
            case "0":
                return Red;


            case "1":
                return Blue;

            default:
                return("непонятно");
        }

    }
}
