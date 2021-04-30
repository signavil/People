//
public class CompanySalary {
    public static void main(String args[]){
        Employee[]employee=new Employee[29];
        for(int i=0;i< employee.length;i++){
            if(i%4==0)
                employee[i]=new HourWorker();
            else if(i%4==1)
                employee[i]=new WeekWorker();
            else if(i%4==2)
                employee[i]=new MonthWorker();
            else if(i%4==3)
                employee[i]=new YearWorker();
        }
        Company company=new Company(employee);
        System.out.println("公司薪水总额:"+company.salariesPay()+"元");
    }
}
