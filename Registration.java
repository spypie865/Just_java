

import java.awt.*;

public class Registration {

    Registration() {
        Frame f1 = new Frame("Registration");
        Label l1 = new Label("Enter First Name");
        l1.setBounds(20, 40, 150, 20);
        Label l2 = new Label("Enter Last Name");
        l2.setBounds(20, 60, 150, 20);
        Label l3 = new Label("Enter Contact No.");
        l3.setBounds(20, 80, 150, 20);
        Label l4 = new Label("Enter Your Address");
        l4.setBounds(20, 100, 150, 20);
        Label l5 = new Label("Enter Your City");
        l5.setBounds(20, 120, 150, 20);
        Label l6 = new Label("Enter Your State");
        l6.setBounds(20, 140, 150, 20);
        Label l7 = new Label("Enter Your Hobbies");
        l7.setBounds(20, 160, 150, 20);
        Label l8 = new Label("Choose Your Gender");
        l8.setBounds(20, 180, 150, 20);
        CheckboxGroup cg1 = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male", cg1, true);
        c1.setBounds(170, 180, 45, 20);

        Checkbox c2 = new Checkbox("Female", cg1, false);
        c2.setBounds(215, 180, 55, 20);

        Checkbox c3 = new Checkbox("Other", cg1, false);
        c3.setBounds(275, 180, 50, 20);
        Label l9 = new Label("Choose Academic Year");
        l9.setBounds(20, 200, 150, 20);
        Choice ch1 = new Choice();
        ch1.add("First");
        ch1.add("Second");
        ch1.add("Third");
        ch1.setBounds(170, 200, 150, 20);

        Label  l10 = new Label("Select Your Semester");
  l10.setBounds(20,220,150,20);
        Choice ch2 = new Choice();
        ch2.add("1st");
        ch2.add("2nd");
        ch2.add("3rd");
        ch2.add("4th");
        ch2.add("5th");
        ch2.add("6th");
        ch2.setBounds(170, 220, 150, 20);

        TextField tf1 = new TextField();
        tf1.setBounds(170, 40, 150, 20);
        TextField tf2 = new TextField();
        tf2.setBounds(170, 60, 150, 20);
        TextField tf3 = new TextField();
        tf3.setBounds(170, 80, 150, 20);
        TextField tf4 = new TextField();
        tf4.setBounds(170, 100, 150, 20);
        TextField tf5 = new TextField();
        tf5.setBounds(170, 120, 150, 20);
        TextField tf6 = new TextField();
        tf6.setBounds(170, 140, 150, 20);
        TextField tf7 = new TextField();
        tf7.setBounds(170, 160, 150, 20);

        Button b1=new Button("Submit");
        b1.setBounds(160,260,60,20);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.add(l7);
        f1.add(l8);
        f1.add(l9);
        f1.add(l10);
        
        f1.add(tf1);
        f1.add(tf2);
        f1.add(tf3);
        f1.add(tf4);
        f1.add(tf5);
        f1.add(tf6);
        f1.add(tf7);

        f1.add(c1);
        f1.add(c2);
        f1.add(c3);

        f1.add(ch1);
        f1.add(ch2);
        
        f1.add(b1);
        f1.setLayout(null);
        f1.setSize(400, 600);
        f1.setVisible(true);
    }

    public static void main(String ar[]) {
        Registration obj = new Registration();
    }
}
