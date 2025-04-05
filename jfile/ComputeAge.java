import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import len.*;

class Calender {
    int day, month, year;
    int cday, cmonth, cyear;
    int Userday;
    int yearDays;
    int currentY;

    Calender() {
        day = month = year = cday = cmonth = cyear = Userday = yearDays = currentY = 0;
    }

    void userDateOfBirth() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\tEnter your date of birth");
        System.out.print("Date:");
        day = Integer.parseInt(br.readLine());
        System.out.print("Month:");
        month = Integer.parseInt(br.readLine());
        System.out.print("Year:");
        year = Integer.parseInt(br.readLine());
        System.out.println("\tEnter today date");
        System.out.print("Date:");
        cday = Integer.parseInt(br.readLine());
        System.out.print("Month:");
        cmonth = Integer.parseInt(br.readLine());
        System.out.print("Year:");
        cyear = Integer.parseInt(br.readLine());
    }

    void userDate() {
        switch (month) {
            case 1:// January
                Userday = 31 - day;
                break;
            case 2: // February
                Userday = 30 - day;
                break;
            case 3: // March
                Userday = 31 - day;
                break;
            case 4: // April
                Userday = 30 - day;
                break;
            case 5: // May
                Userday = 31 - day;
                break;
            case 6: // June
                Userday = 30 - day;
                break;
            case 7: // July
                Userday = 31 - day;
                break;
            case 8: // August
                Userday = 31 - day;
                break;
            case 9: // September
                Userday = 30 - day;
                break;
            case 10: // October
                Userday = 31 - day;
                break;
            case 11: // November
                Userday = 30 - day;
                break;
            case 12: // December
                Userday = 31 - day;
                break;
            default:
                System.out.print("Enter correct month");
        }
        System.out.println("Userday:" + Userday);
    }

    void userLeftDay() {
        yearDays = Userday;

        for (int z = month + 1; z <= 12; z++) {
            switch (z) {
                case 1: // January
                    yearDays = yearDays + 30;
                    break;
                case 2: // February
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                yearDays = yearDays + 29; // 29
                            } else {
                                yearDays = yearDays + 28; // 28
                            }
                        } else {
                            yearDays = yearDays + 29; // 29
                        }
                    } else {
                        yearDays = yearDays + 28; // 28
                    }
                    break;
                case 3: // March
                    yearDays = yearDays + 30;
                    break;
                case 4: // April
                    yearDays = yearDays + 30;
                    break;
                case 5: // May
                    yearDays = yearDays + 30;
                    break;
                case 6: // June
                    yearDays = yearDays + 30;
                    break;
                case 7: // July
                    yearDays = yearDays + 30;
                    break;
                case 8: // August
                    yearDays = yearDays + 30;
                    break;
                case 9: // September
                    yearDays = yearDays + 30;
                    break;
                case 10: // October
                    yearDays = yearDays + 30;
                    break;
                case 11: // November
                    yearDays = yearDays + 30;
                    break;
                case 12: // December
                    yearDays = yearDays + 30;
                    break;
                default:
                    System.out.print("Enter correct month");
            }
        }
        System.out.println("yearDays:" + yearDays);
    }

    void remainingDay() {
        for (int c = year + 1; c <= cyear - 1; c++) {
            yearDays = yearDays + 360;
        }
        System.out.println("yearDays:x" + yearDays);
    }

    int crYearLeftDay() {
        currentY = yearDays;
        for (int m = 1; m <= cmonth - 1; m++) {
            switch (m) {
                case 1: // January
                    currentY = currentY + 30;
                    break;
                case 2: // Febuary
                    currentY = currentY + 30;
                    break;
                case 3: // March
                    currentY = currentY + 30;
                    break;
                case 4: // April
                    currentY = currentY + 30;
                    break;
                case 5: // May
                    currentY = currentY + 30;
                    break;
                case 6: // June
                    currentY = currentY + 30;
                    break;
                case 7: // July
                    currentY = currentY + 30;
                    break;
                case 8: // August
                    currentY = currentY + 30;
                    break;
                case 9: // September
                    currentY = currentY + 30;
                    break;
                case 10: // October
                    currentY = currentY + 30;
                    break;
                case 11: // November
                    currentY = currentY + 30;
                    break;
                case 12: // December
                    currentY = currentY + 30;
                    break;
                default:
                    System.out.print("Enter correct month");
            }
        }
        System.out.println("current:x" + currentY);
        cday = cday - 1;
        return (currentY + cday);
    }
}

class ComputeAge {
    public static void main(String[] args) throws IOException {
        Calender calender = new Calender();
        UserAge userAge = new UserAge();
        ConAge conAge = new ConAge();
        calender.userDateOfBirth();
        calender.userDate();
        calender.userLeftDay();
        calender.remainingDay();
        int remainingDayOfUser = calender.crYearLeftDay();
        System.out.println("\tAge is ");
        conAge.calculateDay(remainingDayOfUser);
        userAge.totaldays();
    }
}