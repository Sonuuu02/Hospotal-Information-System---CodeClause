import java.util.Calendar;
import java.util.Scanner;

class Staff {
    String sid, sname, designation, gender;
    int salary;

    void newStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id: ");
        sid = scanner.nextLine();

        System.out.println("Name: ");
        sname = scanner.nextLine();

        System.out.println("Designation: ");
        designation = scanner.nextLine();

        System.out.println("Gender: ");
        gender = scanner.nextLine();

        System.out.println("Salary: ");
        salary = scanner.nextInt();
    }

    void staffInformation() {
        System.out.println(sid + "\t" + sname + "\t" + gender + "\t" + salary);
    }
}

class Doctor {
    String did, dname, specialist, appoint, dQuatilification;
    int dCabin;

    void newDoctor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Id: ");
        did = scanner.nextLine();

        System.out.println("Name: ");
        dname = scanner.nextLine();

        System.out.println("Specialization: ");
        specialist = scanner.nextLine();

        System.out.println("Work Time: ");
        appoint = scanner.nextLine();

        System.out.println("Qualification: ");
        dQuatilification = scanner.nextLine();

        System.out.println("Cabin Number: ");
        dCabin = scanner.nextInt();
    }

    void doctorInfo() {
        System.out.println(did + "\t" + dname + "\t" + specialist + "\t" + appoint + "\t" + dQuatilification + "\t" + dCabin);
    }
}

class Patient {
    String pid, pname, disease, gender, admitStatus;
    int age;

    void newPatient() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Id: ");
        pid = scanner.nextLine();

        System.out.println("Name: ");
        pname = scanner.nextLine();

        System.out.println("Disease: ");
        disease = scanner.nextLine();

        System.out.println("Gender: ");
        gender = scanner.nextLine();

        System.out.println("Admit Status: ");
        admitStatus = scanner.nextLine();

        System.out.println("Age: ");
        age = scanner.nextInt();
    }

    void patientInfo() {
        System.out.println(pid + "\t" + pname + "\t" + disease + "\t" + gender + "\t" + admitStatus + "\t" + age);
    }
}

class Medical {
    String medicalName, medicineCompany, expiryDate;
    int medicalCost, count;

    void newMedical() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Medical Name: ");
        medicalName = scanner.nextLine();

        System.out.println("Medicine Company: ");
        medicineCompany = scanner.nextLine();

        System.out.println("Expiry Date: ");
        expiryDate = scanner.nextLine();

        System.out.println("Medicine Cost: ");
        medicalCost = scanner.nextInt();

        System.out.println("Number of Units: ");
        count = scanner.nextInt();
    }

    void findMedical() {
        System.out.println(medicalName + "\t" + medicineCompany + "\t" + expiryDate + "\t" + medicalCost + "\t" + count);
    }
}


class Lab {
    String facility;
    int labCost;

    void newFacility() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Facility: ");
        facility = scanner.nextLine();

        System.out.println("Cost: ");
        labCost = scanner.nextInt();
    }

    void facilityList() {
        System.out.println(facility + "\t" + labCost);
    }
}

class Facility {
    String facilityName;

    void addFacility() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Facility: ");
        facilityName = scanner.nextLine();
    }

    void showFacility() {
        System.out.println(facilityName);
    }
}

public class Hospital {
    public static void main(String[] args) {
        String months[] = {"January", "February", "March", "April",

                "May", "June", "July", "August",

                "September", "October", "November", "December"};

        Calendar calendar = Calendar.getInstance();
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n-----------------------------------------------------------------------");
        System.out.println("|   *** WELCOME TO HOSPITAL INFORMATION SYSTEM PROJECT BY SHOYAB ***  |");
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        Doctor[] d = new Doctor[25];
        Patient[] p = new Patient[100];
        Lab[] l = new Lab[20];
        Facility[] f = new Facility[20];
        Medical[] m = new Medical[100];
        Staff[] s = new Staff[100];

        int i;
        for (i = 0; i < 25; i++) {
            d[i] = new Doctor();
        }
        for (i = 0; i < 100; i++) {
            p[i] = new Patient();
        }
        for (i = 0; i < 20; i++) {
            l[i] = new Lab();
        }
        for (i = 0; i < 20; i++) {
            f[i] = new Facility();
        }
        for (i = 0; i < 100; i++) {
            m[i] = new Medical();
        }
        for (i = 0; i < 100; i++) {
            s[i] = new Staff();
        }

        //Doctors list
        d[0].did = "11";
        d[0].dname = "Dr. Kanchan";
        d[0].specialist = "Ortho";
        d[0].appoint = "10am-12pm";
        d[0].dQuatilification = "MBBS, MS";
        d[0].dCabin = 1;

        d[1].did = "12";
        d[1].dname = "Dr. Nisar Ahmed";
        d[1].specialist = "Urology";
        d[1].appoint = "7pm-10pm";
        d[1].dQuatilification = "MBBS, MD, BS";
        d[1].dCabin = 3;

        d[2].did = "13";
        d[2].dname = "Dr.Sara";
        d[2].specialist = "Physician";
        d[2].appoint = "10-3AM";
        d[2].dQuatilification = "MBBS,MD";
        d[2].dCabin = 2;

        d[3].did = "33";
        d[3].dname = "Dr.Rayan";
        d[3].specialist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].dQuatilification = "MBBS,MS";
        d[3].dCabin = 40;

        d[4].did = "17";
        d[4].dname = "Dr.Sehresh";
        d[4].specialist = "Surgeon";
        d[4].appoint = "8-2AM";
        d[4].dQuatilification = "BDM";
        d[4].dCabin = 8;

        d[5].did = "21";
        d[5].dname = "Dr.Beenish";
        d[5].specialist = "ENT";
        d[5].appoint = "5-11AM";
        d[5].dQuatilification = "MBBS,MD";
        d[5].dCabin = 17;

        //Patients List
        p[0].pid = "12";
        p[0].pname = "Paras";
        p[0].disease = "Cancer";
        p[0].gender = "Male";
        p[0].admitStatus = "y";
        p[0].age = 30;

        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].disease = "Cold";
        p[1].gender = "Male";
        p[1].admitStatus = "y";
        p[1].age = 23;

        p[2].pid = "14";
        p[2].pname = "Ali";
        p[2].disease = "Maleriya";
        p[2].gender = "Male";
        p[2].admitStatus = "y";
        p[2].age = 45;

        p[3].pid = "15";
        p[3].pname = "Roshan";
        p[3].disease = "Diabetes";
        p[3].gender = "Male";
        p[3].admitStatus = "y";
        p[3].age = 25;

        //Medicose names
        m[0].medicalName = "Ciprofloxacin";
        m[0].medicineCompany = "Bayer";
        m[0].expiryDate = "9-5-16";
        m[0].medicalCost = 55;
        m[0].count = 8;

        m[1].medicalName = "COLOFAC";
        m[1].medicineCompany = " Abbot";
        m[1].expiryDate = "4-4-15";
        m[1].medicalCost = 500;
        m[1].count = 5;

        m[2].medicalName = "Panadol";
        m[2].medicineCompany = " GSK PLC";
        m[2].expiryDate = "12-7-17";
        m[2].medicalCost = 50;
        m[2].count = 56;

        m[3].medicalName = "Movax";
        m[3].medicineCompany = "       SAMI pvt";
        m[3].expiryDate = "12-4-12";
        m[3].medicalCost = 1100;
        m[3].count = 100;

        //Labs
        l[0].facility = "X-ray     ";
        l[0].labCost = 800;

        l[1].facility = "CT Scan   ";
        l[1].labCost = 12000;

        l[2].facility = "OR Scan   ";
        l[2].labCost = 5000;

        l[3].facility = "Blood Bank";
        l[3].labCost = 100;

        //Facility List
        f[0].facilityName = "Ambulance";
        f[1].facilityName = "Admit Facility ";
        f[2].facilityName = "Canteen";
        f[3].facilityName = "Emergency";

        //Staff's list
        s[0].sid = "22";
        s[0].sname = "Prakash";
        s[0].designation = "Worker";
        s[0].gender = "Male";
        s[0].salary = 5000;

        s[1].sid = "23";
        s[1].sname = "Komal";
        s[1].designation = "Nurse";
        s[1].gender = "Female";
        s[1].salary = 2000;

        s[2].sid = "24";
        s[2].sname = "Raju";
        s[2].designation = "Worker";
        s[2].gender = "Male";
        s[2].salary = 500;

        s[3].sid = "25";
        s[3].sname = "Rani";
        s[3].designation = "Nurse";
        s[3].gender = "Female";
        s[3].salary = 20000;

        Scanner scanner = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1) {
            System.out.println("\n                    *** MAIN MENU ***");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("\n1. Doctors \n2. Patients  \n3. Medicines  \n4. Laboratories  \n5. Facilities  \n6. Staff ");
            System.out.println("-----------------------------------------------------------------");

            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      ** DOCTOR SECTION **");
                    System.out.println("--------------------------------------------------------------------------------");

                    s1 = 1;

                    while (s1 == 1) {
                        System.out.println("\n1.Add New Entry\n2.Existing Doctors List");
                        c1 = scanner.nextInt();
                        switch (c1) {
                            case 1: {
                                d[count1].newDoctor();
                                count1++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("ID \t Name\t Specialist \t Timing \t Qualification \t Cabin No.");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count1; j++) {
                                    d[j].doctorInfo();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = scanner.nextInt();
                    }
                    break;
                }
                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     ** PATIENT SECTION **");
                    System.out.println("--------------------------------------------------------------------------------");

                    s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1.Add New Entry \n2.Existing Patients List");
                        c1 = scanner.nextInt();
                        switch (c1) {
                            case 1: {
                                p[count2].newPatient();
                                count2++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count2; j++) {
                                    p[j].patientInfo();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = scanner.nextInt();
                    }
                    break;
                }
                case 3: {
                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     ** MEDICINE SECTION **");
                    System.out.println("--------------------------------------------------------------------------------");

                    while (s3 == 1) {
                        System.out.println("1.Add New Entry\n2. Existing Medicines List");
                        c1 = scanner.nextInt();
                        switch (c1) {
                            case 1: {
                                m[count3].newMedical();
                                count3++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Name \t Company \t Expiry Date \t Cost");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count3; j++) {
                                    m[j].findMedical();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = scanner.nextInt();
                    }
                    break;
                }
                case 4: {
                    s4 = 1;

                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                    ** LABORATORY SECTION **");
                    System.out.println("--------------------------------------------------------------------------------");

                    while (s4 == 1) {
                        System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                        c1 = scanner.nextInt();

                        switch (c1) {
                            case 1: {
                                l[count4].newFacility();
                                count4++;
                                break;
                            }

                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Fecilities\t\t Cost");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count4; j++) {
                                    l[j].facilityList();
                                }
                                break;
                            }
                        }

                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = scanner.nextInt();
                    }
                    break;
                }

                case 5: {
                    s5 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("          ** HOSPITAL FACILITY SECTION **");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s5 == 1) {
                        System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                        c1 = scanner.nextInt();

                        switch (c1) {
                            case 1: {
                                f[count5].addFacility();
                                count5++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Hospital  Facility are:");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count5; j++) {
                                    f[j].showFacility();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = scanner.nextInt();
                    }
                    break;
                }

                case 6: {
                    s6 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       ** STAFF SECTION **");
                    System.out.println("--------------------------------------------------------------------------------");

                    while (s6 == 1) {
                        String a = "nurse", b = "worker", c = "security";
                        System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                        c1 = scanner.nextInt();
                        switch (c1) {
                            case 1: {
                                s[count6].newStaff();
                                count6++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count6; j++) {
                                    if (a.equals(s[j].designation)) s[j].staffInformation();
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count6; j++) {
                                    if (b.equals(s[j].designation)) s[j].staffInformation();
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count6; j++) {
                                    if (c.equals(s[j].designation)) s[j].staffInformation();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = scanner.nextInt();
                    }
                    break;
                }
                default: {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = scanner.nextInt();

        }
    }
}
