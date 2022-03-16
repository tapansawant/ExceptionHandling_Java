public class Check {
    public static void main(String[] args) {

        try{
//            int x = 7, y = 0, z;
//            z = x/y;
            String name  = null;
            System.out.println(name.length());
            System.out.println("Null value is not accepeted");

        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e);
//            System.out.println("Divide by zeo is not possible");
//        }
        catch (NullPointerException e)
        {
            System.out.println(e);

        }
        catch(Exception e)
        {
            System.out.println(e); //if exception is neither nullpointer nor Null... then it should work and do remember bever define
            //this general exception on the top.
        }
        finally { //finally block always executes
            System.out.println("Harman pvr ltd");
        }
    }
}
