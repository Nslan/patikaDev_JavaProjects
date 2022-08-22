package InsuranceManagementSystem;

import java.util.Date;

public class CarInsurance extends Insurance{

    public CarInsurance(String insuranceType) {
        super("Araba sigortasi",new Date(),new Date());
        calculate( getInsuranceName()  );
    }


    @Override
    public void calculate(String insuranceType) {

        double insurancePrice = 1299.99;

        if(insuranceType.equals("Individual"))
        {
            setInsurancePrice( insurancePrice );
        }
        if(insuranceType.equals("Enterprise")){
            setInsurancePrice( insurancePrice * 0.9);
        }

    }
}
