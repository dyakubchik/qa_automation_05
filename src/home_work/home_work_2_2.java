package home_work;

public class home_work_2_2 {

    public static void main(String[] args) {

        int dayRent = 40;
        int daysVacation = 27;

        if(daysVacation > 3){
            System.out.println("Days vacation total: " + daysVacation);
        }

        if (daysVacation > 3 && daysVacation < 7) {
            System.out.println("Rent car price total: " + ((daysVacation * dayRent) - 20));
        } else if (daysVacation > 7) {
            System.out.println("Rent car price total: " + ((daysVacation * dayRent) - 50));
        }
    }
}
