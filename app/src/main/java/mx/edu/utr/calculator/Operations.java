package mx.edu.utr.calculator;

public class Operations {

    public static float C;
    public static long dec = 0;
    public static String operator;

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*This method makes an addition with two float variables
    and returns a float result in another variable*/
    public static float add(float a, float b) {
        C = a + b;
        return C;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*This method makes a substraction  with two float variables
    and returns a float result in another variable*/
    public static float subs(float a, float b) {
        C = a - b;
        return C;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*This method makes a multiplication  with two float variables
    and returns a float result in another variable*/
    public static float mult(float a, float b) {
        C = a * b;
        return C;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*This method makes a division  with two float variables
    and returns a float result in another variable*/
    public static float div(float a, float b) {
        C = a / b;
        return C;
    }
}