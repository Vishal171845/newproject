public class College {
    abstract void setAcademicFee();
}
class CSE_Dept extends Collge{
    void setAcademicFee(){
        System.out.println("100000");
    }
}
class ME-Dept extends College{

    void setAcademicFee(){
        System.out.println("75000");
        }
        }
class CollgeOffice {
    public static void main(String[] args) {
        College ob_cse=new CSE_Dept();
        Collge ob_me=new ME_Dept();
        System.out.println("CSE Dept Fee Structure");
        ob_cse.setAcademicFee();
        System.out.println("Me dept Fee Structure");
        ob_me.setAcademicFee();
    }
}
