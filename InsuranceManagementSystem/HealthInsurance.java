package InsuranceManagementSystem;

import java.util.Date;

public class HealthInsurance extends Insurance {

    public HealthInsurance(String insuranceType) {
        super("Saglik sigortasi", new Date(), new Date());
        calculate( insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {

        double insurancePrice = 999.99;

        if(insuranceType.equals("Individual"))
        {
            setInsurancePrice( insurancePrice );
        }
        if(insuranceType.equals("Enterprise")){
            setInsurancePrice( insurancePrice * 0.9);
        }

    }


}
