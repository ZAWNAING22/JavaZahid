
public class Main {
    public static void main(String[] args) {
        BachelorStudent bsc= new BachelorStudent(3,50.6f,70f);
        MasterStudent msc= new MasterStudent(4,30.5f,80.4f,30);
        PhDStudent phd=  new PhDStudent(5,50f,60.3f,34,23,100);

        Student[] students= {bsc,msc,phd};
        for( Student std: students)
        {
            if(std instanceof PhDStudent)
            {
                System.out.println(" phd total score=");
            } else if (std instanceof MasterStudent ) {
                System.out.println(" Master total score:");

            } else if (std instanceof BachelorStudent) {
                System.out.println(" bachelorStudent total score:");

            }
            System.out.println(std.computeTotalScore());
        }

    }
}