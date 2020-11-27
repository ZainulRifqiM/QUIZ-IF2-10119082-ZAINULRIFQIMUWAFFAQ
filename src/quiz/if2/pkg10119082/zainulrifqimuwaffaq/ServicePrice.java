/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119082.zainulrifqimuwaffaq;

/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: QUIZ
 */
public class ServicePrice implements ServiceItem{
    private float priceService,discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }


    @Override
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.println("Choose (1/2/3):");
    }

    @Override
    public float getPrice(int serviceItem) {
        
        switch (serviceItem) {
            case 1:
                priceService = 45;
                break;
            case 2:
                priceService = 55;
                break;
            case 3:
                priceService = 15;
                break;
            default:
                break;
        }
        return priceService;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        boolean status;
        status = "yes".equals(statusMember) || "Yes".equals(statusMember);
        return status;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if (isMember == true) {
            parServicePrice = (float) (0.1 * priceService);
        } else {
            parServicePrice = 0;
        }
        return parServicePrice;
    }
    
    public float getTotalPay(float priceService, float discount) {
        return priceService - discount;
    }
}
