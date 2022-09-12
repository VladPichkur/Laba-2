public class MyDate {
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay2() {
        return day2;
    }

    public void setDay2(int day2) {
        this.day2 = day2;
    }

    public String getMonth2() {
        return month2;
    }

    public void setMonth2(String month2) {
        this.month2 = month2;
    }

    private int day;
    private String month;
    private int day2;
    private String month2;


    public MyDate(int d, String m, int d2, String m2){  //конструктор, який приймає день та місяць
        this.day = d;
        this.month = m;
        this.day2 = d2;
        this.month2 = m2;

    }
    public boolean DayChecker(){return getDay() < 32 && getDay()>0 && getDay2()<32 && getDay2()>0;} //метод для перевірки правильності введення дня

    public String toString(){

        return String.format("%s %s - %s %s", day, month, day2,month2);

    }

    public int Q(){

        switch (month2){
            case "січня": return 1;
            case "лютого": return 2;
            case "березеня": return 3;
            case "квітня": return 4;
            case "травня": return 5;
            case "червня": return 6;
            case "липня": return 7;
            case "серпня": return 8;
            case "вересня": return 9;
            case "жовтня": return 10;
            case "листопада": return 11;
            case "грудня": return 12;

        }
    return 0;
    }

}
