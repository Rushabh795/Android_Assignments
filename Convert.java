/*  Student ID           :- A00240755
    Student Name         :- Rushabh Shah
    Program & Assignment :- MAPD / Variables and Logic
    Program Defination   :- This program allows a user to convert between different forms of measurement such as Km to mi ,
                            cm to inches,Kg to lb ,lg to oz and Celsius to Fahrenheit & Kelvin ,Fahrenheit to Celsius & Kelvin
                            and Litre to Cups. 
    Program Description  :- Made a personal assistant named "Life Saver" which allows to take user name first and then 
                            show options to user that which conversion ones want to perform. If user enter wrong input then it will 
                            show proper error message,All possible conditions are checked in If..else Statementand switch cases.Once user gets 
                            output it will ask for convert more or not , it depends on user choice.
                            To view proper errors message and program highly recommeded to view in full screen.
                            Perform Actions
                            1. Exception handling
                            2. Use of Switch Case
                            3. Use of if..else statement
                            4. Showing proper error to user
                            5. Method calling
                            6. Convertion 
                            7. Uses of Scanner
                            8. Uses of comments for better understanding*/

import java.util.Scanner;

// Main Class

public class Convert {
    public static void main(String[] args) {
        // This method is called for showing welcome messages
        showMessage("welcome", "");
    }

    // This Method is used for showing message.
    static void showMessage(String strData, String strName) {
    
        switch (strData) {
            case "welcome":
                System.out.println("Hey I am your personal assistant" + " LIFE SAVER" + ". May I please have your name ?");
                // this mehod is used to take user details
                getPersonalInfo();
                break;

            case "convert":
           
        
                System.out.println('\n' + "=========================================");
                System.out.println("Hey " + strName + " I am here to do some fancy conversion");
                System.out.println('\n' + "What do you want me to do..?");
                System.out.println("1. Kilometre to Miles." + '\n' +
                        "2. Miles to Kilometre." + '\n' +
                        "3. Centimetre to Inch." + '\n' +
                        "4. Inch to Centimetre." + '\n' +
                        "5. Kilogram to Pound." + '\n' +
                        "6. Pound to Kilogram." + '\n' +
                        "7. Gram to Ounce." + '\n' +
                        "8. Ounce to Gram." + '\n' +
                        "9. Celsius to Fahrenheit." + '\n' +
                        "10.Celsius to Kelvin." + '\n' +
                        "11.Fahrenheit to Celsius." + '\n' +
                        "12.Kelvin to Celsius." + '\n' +
                        "13.Litre to Cups." + '\n' +
                        "14.Cups to Litre.");
                // this method is used for taking choice from user
                getConversionInput();
                break;
            case "cancel":
                System.out.println('\n' + "*****************************************");
                System.out.println("Thankyou..! I am always there if you wants to convert more.");
                System.out.println( "*****************************************");
                break;
            case "exit":
                System.out.println('\n' + "*****************************************");
                System.out.println("Oops..!! Wrong Input , I am going to shutdown restart me for your help. ");
                System.out.println("*****************************************");
                break;
            default:
            System.out.println('\n' + "*****************************************");
            System.out.println("Oops..!! Something is going wrong,Let's try again ");
            System.out.println("*****************************************");
            //calling converting method program
            showMessage("convert", "");
           
        }
    }

    // this method is used for taking name from user
    static void getPersonalInfo() {
        Scanner getPersinNameScanner = new Scanner(System.in);
        String strName = getPersinNameScanner.nextLine();
        //calling convert options method
        showMessage("convert", strName);

    }

    // this method is used for taking value from user
    static void getConversionInput() {
        try {
            System.out.println('\n' + "=========================================");
            System.out.println("Please Enter option you want to convert");
            Scanner getConversionInput = new Scanner(System.in);
            int intUserInput = getConversionInput.nextInt();
            // check wether input is correct or not
            if (intUserInput >= 15 || intUserInput == 0) {
                System.out.println('\n' + "*****************************************");
                System.out.println("WARNING..!! Wrong Input ,Please choose between 1 to 14. ");
                System.out.println("*****************************************");
                showMessage("convert", "");
            } else {
                // calling main convertion method
                getperfomConverion(intUserInput);
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println('\n' + "*****************************************");
            System.out.println("WARNING..!! Wrong Input ,Please enter only numbers ");
            System.out.println("*****************************************");
            showMessage("convert", "");
        }

    }

    // this method will perform conversion
    static void getperfomConverion(int intUserInput) {
        System.out.println('\n' + "=========================================");
        System.out.println("Please Enter the value you want to convert");
        Scanner getUserValue = new Scanner(System.in);
        double conversion = getUserValue.nextDouble();
        double convertedValue = 0;
        try {
            switch (intUserInput) {
                case 1:
                    // convert from Kilometre to Miles
                    convertedValue = (conversion * 0.62137119);
                    System.out.println("" + conversion + " Kilometre is equal to " + convertedValue + " Miles");
                    //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;

                case 2:
                    // convert from Miles to Kilometre
                    convertedValue = (conversion * 1.61);
                    System.out.println("" + conversion + " Miles is equal to " + convertedValue + " Kilometre.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 3:
                    // convert from Centimetre to Inch
                    convertedValue = (conversion * 0.39);
                    System.out.println("" + conversion + " Centimetre is equal to " + convertedValue + " Inch.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 4:
                    // convert from Inch to Centimetre
                    convertedValue = (conversion * 2.54);
                    System.out.println("" + conversion + " Inch is equal to " + convertedValue + " Centimetre.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 5:
                    // convert from Kilogram to Pound
                    convertedValue = (conversion * 2.2);
                    System.out.println("" + conversion + " Kilogram is equal to " + convertedValue + " Pound.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 6:
                    // convert from Pound to Kilogram
                    convertedValue = (conversion * 0.45);
                    System.out.println("" + conversion + " Pound is equal to " + convertedValue + " Kilogram.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 7:
                    // convert from Gram to Ounce
                    convertedValue = (conversion * 0.04);
                    System.out.println("" + conversion + " Gram  is equal to " + convertedValue + " Ounce.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 8:
                    // convert from Ounce to Gram
                    convertedValue = (conversion * 28.35);
                    System.out.println("" + conversion + " Ounce is equal to " + convertedValue + " Gram.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 9:
                    // convert from Celsius to Fahrenheit
                    convertedValue = ((conversion * 9 / 5) + 32);
                    System.out.println("" + conversion + " Celsius is equal to " + convertedValue + " Fahrenheit.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 10:
                    // convert from Celsius to Kelvin
                    convertedValue = (conversion + 273.15);
                    System.out.println("" + conversion + " Celsius is equal to " + convertedValue + " Kelvin.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 11:
                    // convert from Fahrenheit to Celsius
                    convertedValue = ((conversion - 32) * 5 / 9);
                    System.out.println("" + conversion + " Fahrenheit is equal to " + convertedValue + " Celsius.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 12:
                    // convert from Kelvin to Celsius
                    convertedValue = ((conversion - 32) * 5 / 9 + 273.15);
                    System.out.println("" + conversion + " Kelvin is equal to " + convertedValue + " Celsius.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 13:
                    // convert from Litre to Cups
                    convertedValue = (conversion * 4.17);
                    System.out.println("" + conversion + " Litre is equal to " + convertedValue + " Cups.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;
                case 14:
                    // convert from Cups to Litre
                    convertedValue = (conversion * 0.24);
                    System.out.println("" + conversion + " Cups is equal to " + convertedValue + " Litre.");
                     //method is used for asking that ones want to convert more or not ?
                    getConvertAgain();
                    break;

                    default:
                    System.out.println('\n' + "=========================================");
                    System.out.println("Oops..!! Something is going wrong,Let's try again ");
                    showMessage("convert", "");
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println('\n' + "*****************************************");
            System.out.println("Oops..!! Something is going wrong,Let's try again ");
            System.out.println("*****************************************");
            showMessage("convert", "");
        }

    }

    // this method will ask to user For converting again or not
    static void getConvertAgain() {
        System.out.println('\n' + "=========================================");
        System.out.println("Do you want to convert more ? (Y/N)");
        Scanner getAns = new Scanner(System.in);
        String strAns = getAns.nextLine();

        if (strAns.equalsIgnoreCase("y") || strAns.equalsIgnoreCase("yes")) {
            //convert more will perform
            showMessage("convert", "");
        } else if (strAns.equalsIgnoreCase("n") || strAns.equalsIgnoreCase("no")) {
            //Thankyou and exit will perform
            showMessage("cancel", "");
        } else {
            //program exit will perform
            showMessage("exit", "");
        }
    }
}
