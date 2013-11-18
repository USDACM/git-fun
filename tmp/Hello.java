import java.util.*;
class Hello{

    public static void main(String[] args){
        System.out.printf("Hello ACM club!\n");
        
        /*Change1*/
        printPlan();
        System.exit(0);
    }

    /*Change1*/
    static void printPlan(){
        System.out.printf("\t1. Greetings\n");
        System.out.printf("\t2. Competition Thoughts\n");
        System.out.printf("\t3. Coffee Pot\n");
        System.out.printf("\t4. Movie Night\n");
        System.out.printf("\t5. uhub\n");
        System.out.printf("\t6. Git tutorial\n");
    };
}
