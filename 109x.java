Class Hillstations{
    void location(){
        System.out.println("location is:");
    }
    void famousfor(){
        System.out.println("Famous for:");
    }
}
class Manali extends Hillstations {
    void location(){
        System.out.println("Manali is in Himachal Pradesh");
    }
    void famousfor(){
        System.out.println("It is Famous for Hadima Temple and adventure");
    }
}
class Mussoorie extends Hillstations{
    void location(){
        System.out.println("Mussoorie is in Uttarakhand");
    }
    void famousfor(){
        System.out.println("It is Famous for skiing");
    }
}
class Main{
    public static void main(String args[]){
        Hillstations A = new Hillstations();
        Hillstations M = new Manali();

        Hillstations Mu = new Mussoorie();

        Hillstations G = new Gulmarg();
        
        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        Mu.location();
        Mu.famousfor();
    }
}
