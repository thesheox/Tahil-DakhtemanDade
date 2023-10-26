import java.lang.Math;
public class tahlil{
     
       static int tedad=10;
    public static int five_log_x(int vorodi){
        return (int)(5*(Math.log(vorodi) / Math.log(2)))*1000;

    }

    public static int seven_x_log_x(int vorodi){
        return (int)((7*vorodi*(Math.log(vorodi) / Math.log(2)))*1000);

    }

    public static double pow_2_x(int vorodi){
        return (int)(Math.pow(2, vorodi))*1000;

    }

    public static int pow_x_2(int vorodi){
        return (int)(Math.pow(vorodi, 2))*1000;

    }

    public static int ten_pow_x_2(int vorodi){
       return (int)((10*Math.pow(vorodi, 2))*1000);
    }
    public static void test_five_log_x(){
          long time=0;
        for(int t=0;t<tedad;t++)
        {
        int y=0;
        long startTime=System.nanoTime();
        for(int x=2;x<five_log_x(t);x++)
        {
            y++;
        }
        long endTime=System.nanoTime();
        long this_time=endTime-startTime;
        time+=this_time;

    }
    long miangin=time/tedad;
     System.out.println(miangin);
    }

    public static void test_seven_x_log_x(){
          long time=0;
        for(int t=0;t<tedad;t++)
        {
        int y=0;
        long startTime=System.nanoTime();
        for(int x=2;x<seven_x_log_x(t);x++)
        {
            y++;
        }
        long endTime=System.nanoTime();
       
        long this_time=endTime-startTime;
        time+=this_time;

        }
    long miangin=time/tedad;
     System.out.println(miangin);
    }

    public static void test_pow_2_x(){
          long time=0;
        for(int t=0;t<tedad;t++)
        {
        int y=0;
        long startTime=System.nanoTime();
        for(int x=3;x<pow_2_x(t);x++)
        {
            y++;
        }
        long endTime=System.nanoTime();
        //System.out.println(endTime-startTime);
        long this_time=endTime-startTime;
        time+=this_time;

    }
    long miangin=time/tedad;
     System.out.println(miangin);
    }

    public static void test_pow_x_2(){
          long time=0;
        for(int t=0;t<tedad;t++)
        {
        int y=0;
        long startTime=System.nanoTime();
        for(int x=2;x<pow_x_2(t);x++)
        {
            y++;
        }
        long endTime=System.nanoTime();
        long this_time=endTime-startTime;
        time+=this_time;

    }
    long miangin=time/tedad;
     System.out.println(miangin);
    }

    public static void test_ten_pow_x_2(){
          long time=0;
        for(int t=0;t<tedad;t++)
        {
        int y=0;
        long startTime=System.nanoTime();
        for(int x=2;x<ten_pow_x_2(t);x++)
        {
            y++;
        }
        long endTime=System.nanoTime();
        
        long this_time=endTime-startTime;
        time+=this_time;

        }
    long miangin=time/tedad;
     System.out.println(miangin);
    }
    public static void main(String [] args){
        test_five_log_x();
         test_seven_x_log_x();
         test_pow_2_x();
        test_pow_x_2();
        test_ten_pow_x_2();
         
        
      

}


}
