import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Would you like to add a new project?\nEnter y/n: ");
        Scanner input0 = new Scanner(System.in);
        String add_proj = input0.next();

        if (add_proj.equals("y")) {

            project_add();
        }
else if (add_proj.equals("n")) {
System.out.println("Goodbye");
        }
    }
//======================================================================================================================
    private static void project_add() {
        String proj_name;
        String proj_num;
        String build_type;
        String address;
        String ERF;
        double fee;
        double paid;
        String deadline;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter project name: ");
        proj_name = input1.next();
        System.out.println(proj_name);//control

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter project number: ");
        proj_num = input2.next();
        System.out.println(proj_num);//control

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter type of building: ");
        build_type = input3.next();
        System.out.println(build_type);//control

        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter address: ");
        address = input4.next();
        System.out.println(address);//control

        Scanner input5 = new Scanner(System.in);
        System.out.println("Enter ERF number: ");
        ERF = input5.next();
        System.out.println(ERF);//control

        Scanner input6 = new Scanner(System.in);
        System.out.println("Enter total fee: ");
        fee = input6.nextDouble();
        System.out.println("R" + fee);//control

        Scanner input7 = new Scanner(System.in);
        System.out.println("Enter total paid to date: ");
        paid = input7.nextDouble();
        System.out.println("R" + paid);//control

        Scanner input8 = new Scanner(System.in);
        System.out.println("Enter project deadline: ");
        deadline = input8.next();
        System.out.println(deadline);//control

        System.out.println("project name:" + proj_name);//control
        System.out.println("project number: " + proj_num);//control
        System.out.println("building type: " + build_type);//control
        System.out.println("physical address: " + address);//control
        System.out.println("ERF number: " + ERF);//control
        System.out.println("total fee R" + fee);//control
        System.out.println("amount of fee paid to date R" + paid);//control
        System.out.println("project deadline" + deadline);//control
//===================================================================================================================
        // FOR: customer.java
        //string creation and printing section-------------------------------------------------------------------------
        customer customerA = new customer("mama", "0217062549", "mama@gmail.com", "8, 2nd road,grassy park");

        //printing in readable format section--------------------------------------------------------------------------
        System.out.println("customer:-----------------------------------------------------------------------------\n");
        System.out.println(customerA + "\n");

//===================================================================================================================
        // FOR: architect.java
        //string creation and printing section-------------------------------------------------------------------------
        customer architectA = new customer("ma", "0217053649", "ma@gmail.com", "5, 2nd road,grassy park");

        //printing in readable format section--------------------------------------------------------------------------
        System.out.println("architect:-----------------------------------------------------------------------------\n");
        System.out.println(architectA + "\n");

//===================================================================================================================
        // FOR: contractor.java
        //string creation and printing section-------------------------------------------------------------------------
        customer contractorA = new customer("ouma", "0217052549", "ouma@gmail.com", "58, 2nd road,grassy park");

        //printing in readable format section--------------------------------------------------------------------------
        System.out.println("contractor:-----------------------------------------------------------------------------\n");
        System.out.println(contractorA + "\n");
//====================================================================================================================

        System.out.println("would you like to update fee paid to date?\ny/n: ");
        Scanner input9 = new Scanner(System.in);
        String quest_update_fee = input9.next();

        if (quest_update_fee.equals("y")) {
            paid = fee_update();
        }

        System.out.println("project name:" + proj_name);//control
        System.out.println("project number: " + proj_num);//control
        System.out.println("building type: " + build_type);//control
        System.out.println("physical address: " + address);//control
        System.out.println("ERF number: " + ERF);//control
        System.out.println("total fee R" + fee);//control
        System.out.println("amount of fee paid to date R" + paid);//control
        System.out.println("project deadline" + deadline);//control

        System.out.println("would you like to change the contractors contact details?\ny/n: ");
        Scanner input11 = new Scanner(System.in);
        String quest_update_details = input11.next();

        if (quest_update_details.equals("y")) {
            detail_update();

        }
    }

    private static double fee_update() {
        double paid;
        System.out.println("Enter total paid to date:");
        Scanner input10 = new Scanner(System.in);
        paid = input10.nextDouble();
        return paid;
    }

    private static void detail_update() {
        System.out.println("Enter new telephone number: ");
        Scanner input12 = new Scanner(System.in);
        String tele_num = input12.next();
    }
}
