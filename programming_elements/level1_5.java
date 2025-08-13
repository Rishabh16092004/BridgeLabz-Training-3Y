public class level1_5 {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int pens_each_students = pens/students;
        int remaining_pens = pens%students;
        System.out.println("The Pen Per Student is "+pens_each_students +" and the remaining pen not distributed is "+ remaining_pens);
    }
}
