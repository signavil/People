abstract class Employee{
    public abstract double earnings();
}
class YearWorker extends Employee{
    public double earnings(){
        return 12000;
    }
}
class MonthWorker extends Employee{
    public double earnings(){
        return 12*2300;
    }
}
class WeekWorker extends Employee{
    public double earnings(){
        return 52*780;
    }
}
class HourWorker extends Employee{
    public double earnings() {
        return 15*98;
    }
}
class Company{
    Employee[]employee;
    double salaries=0;
    Company(Employee[]employee){
        this.employee=employee;
    }
    public double salariesPay(){
        salaries=0;
        for(int i=0;i<employee.length;i++){
            salaries=salaries+employee[i].earnings();
        }
        return salaries;
    }
}

