package lang.print.gaps.task5;

public class TimeConvertor {
    public static void main(String[] args) {
        TimeConvertor t = new TimeConvertor();
        t.convert((float) 60.116);
    }
    
    public void convert(float minutes) {
        System.out.println((float)(minutes * 60));
    }
}
