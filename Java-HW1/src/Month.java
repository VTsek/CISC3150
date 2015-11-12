public class Month {
 
        public static void main(String[] args) {
       
        int m = (int)(Math.random() * 12);
       
        switch(m) {
            case 1:
                System.out.print("Jan");
                break;
            case 2:
                System.out.print("Feb");
                break;
            case 3:
                System.out.print("Mar");
                break;
            case 4:
                System.out.print("Apr");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("Aug");
                break;
            case 9:
                System.out.print("Sept");
                break;
            case 10:
                System.out.print("Oct");
                break;
            case 11:
                System.out.print("Nov");
                break;
            case 12:
                System.out.print("Dec");
                break;
        }
    }
}