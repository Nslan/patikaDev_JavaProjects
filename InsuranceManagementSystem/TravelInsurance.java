package InsuranceManagementSystem;

import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceType) {
        super("Seyahat sigortasi", new Date(), new Date());
        calculate( insuranceType );
    }

    @Override
    public void calculate(String insuranceType ) {

        double insurancePrice = 699.99;

        if(insuranceType.equals("Individual"))
        {
            setInsurancePrice( insurancePrice );
        }
        if(insuranceType.equals("Enterprise")){
            setInsurancePrice( insurancePrice * 0.9);
        }
    }
}
