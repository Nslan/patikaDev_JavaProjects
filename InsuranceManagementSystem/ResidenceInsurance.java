package InsuranceManagementSystem;

import java.util.Date;

public class ResidenceInsurance extends Insurance{

    public ResidenceInsurance(String insuranceType) {
        super("Konut sigortasi", new Date(), new Date());
        calculate( insuranceType );
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
