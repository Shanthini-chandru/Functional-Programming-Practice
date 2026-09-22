import java.util.function.Supplier;

/*
*
* 4. Random OTP Generator
    * Create a Supplier<Integer>
    * that generates a random 6-digit OTP
    * return it
*
* */

public class SupplierPractice {
    String otpGenerator(){
        Supplier<String> otp = () -> String.valueOf((int) (Math.random() * 900000) + 100000);
        return otp.get();
    }

    static void main(String[] args) {
        SupplierPractice si = new SupplierPractice();
        System.out.println("New OTP Generated: "+si.otpGenerator());
        System.out.println("New OTP Generated: "+si.otpGenerator());
        System.out.println("New OTP Generated: "+si.otpGenerator());
        System.out.println("New OTP Generated: "+si.otpGenerator());

    }

}
