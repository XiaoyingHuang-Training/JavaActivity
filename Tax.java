public class Tax {

    public static void main (String[] args){
        double salary=Double.parseDouble(args[0]);
        double totalTax=0;
        if (salary>=15000 && salary<20000) {
            totalTax=(salary-15000)*0.1;
        }else if (salary>=20000 && salary<30000) {
            totalTax=(20000-15000)*0.1+(salary-20000)*0.15;
        }else if(salary>=30000 && salary<45000){
            totalTax=(20000-15000)*0.1+(30000-20000)*0.15+(45000-salary)*0.2;
        }else if(salary>=45000){
            totalTax=(20000-15000)*0.1+(30000-20000)*0.15+(45000-30000)*0.2+(salary-45000)*0.25;
        }

        if (totalTax == 0) {
            System.out.println("Total tax payable is \u00A3 0.0.");
        } else {
            System.out.printf("Total tax payable is \u00A3"+ totalTax+".");
        }
    }
}