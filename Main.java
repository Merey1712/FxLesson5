
//COPY PAST1
//import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> phones = new ArrayList<String>();
//        phones.add("Iphone");
//        phones.add("Samsung");
//        phones.add("LG");
//        phones.add("Nokia");
//        System.out.println(phones);
//    }
//}


//COPY PAST2
//import java.util.ArrayList;

//public class Main{
//    public static void main(String[] args){
//        ArrayList<String> phones = new ArrayList<String>();
//          phones.add("Iphone");
//          phones.add("Samsung");
//          phones.add("LG");
//          phones.add("Nokia");
//       for (int i =0; i < phones.size(); i++){
//           System.out.println(phones.get(i));
//       }
//    }
//}


//COPY PAST3
//import java.util.ArrayList;

//public class Main{
//    public static void main(String[] args) {
//        ArrayList<String> phones = new ArrayList<String>();
//        phones.add("Iphone");
//        phones.add("Samsung");
//        phones.add("LG");
//        phones.add("Nokia");
//        for (String i : phones) {
//            System.out.println(i);
//        }
//    }
//        }


//COPY PAST4
//import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(25);
//        for (int i : myNumbers) {
//            System.out.println(i);
//        }
//    }
//}


//COPY PAST5
//import java.util.ArrayList;
//import java.util.Collections;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> phones = new ArrayList<String>();
//        phones.add("Iphone");
//        phones.add("Samsung");
//        phones.add("LG");
//        phones.add("Nokia");
//        Collections.sort(phones);
//        for (String i :phones)
//        System.out.println(i);
//    }
//}


//COPY PAST6
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(33);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);
//
//        Collections.sort(myNumbers);
//       for (int i : myNumbers) {
//        System.out.println(i);
//    }
//}}


//COPY PAST7
//import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> phones =  new ArrayList<String>();
//        phones.add("Iphone");
//        phones.add("Samsung");
//        phones.add("LG");
//        phones.add("Nokia");
//        phones.out.println(phones);
//
//        String phone = phones.get(0);
//        System.out.println("get method:" +phones);
//
//        phones.set(0, "Redmi");
//        System.out.println("set method:" +phones);
//
//        phones.remove(0);
//        System.out.println("remove method:" +phones);
//
//        phones.clear();
//        System.out.println("clear method:" +phones);
//
//        int s = phones.size();
//        System.out.println("list size:" +s);
//
//    }
//}



//PROBLEM1
//import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> jewellery = new ArrayList<String>();
//        jewellery.add("Ring");
//        jewellery.add("Necklace");
//        jewellery.add("Earring");
//        jewellery.add("Bracelet");
//        System.out.println( jewellery );
//    }
//}


//PROBLEM2
//import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> lessons = new ArrayList<String>();
//        lessons.add("IT");
//        lessons.add("PE");
//        lessons.add("English");
//        lessons.add("Math");
//        lessons.add("Russian");
//        System.out.println(lessons);
//
//        lessons.add(1, "Turkish");
//        lessons.add(3, "History");
//
//        System.out.println(lessons);
//        }
//    }

//PROBLEM3
//import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> lessons = new ArrayList<String>();
//        lessons.add("IT");
//        lessons.add("PE");
//        lessons.add("English");
//        lessons.add("Math");
//        lessons.add("Russian");
//        System.out.println(lessons);
//
//       String element = lessons.get(0);
//       System.out.println("Second element: "+element);
//        element = lessons.get(2);
//
//
//        System.out.println("First element: "+element);
//    }
//}



//PROBLEM4
//import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> lessons = new ArrayList<String>();
//        lessons.add("IT");
//        lessons.add("PE");
//        lessons.add("Turkish");
//        lessons.add("Math");
//        lessons.add("Kazakh");
//        System.out.println(lessons);
//
//
//        lessons.set(3, "Biology");
//
//        System.out.println(lessons);
//    }
//}



//PROBLEM5
//import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> lessons = new ArrayList<String>();
//        lessons.add("IT");
//        lessons.add("PE");
//        lessons.add("Turkish");
//        lessons.add("Russian");
//        lessons.add("Math");
//        System.out.println(lessons);
//
//
//        lessons.remove(3);
//
//        System.out.println("removing result:\n"+lessons);
//    }
//    }


//PROBLEM6
//import java.util.ArrayList;

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> lessons = new ArrayList<String>();
//        lessons.add("History");
//        lessons.add("PE");
//        lessons.add("Biology");
//        lessons.add("English");
//        lessons.add("Math");
//
//        if (lessons.contains("IT")) {
//            System.out.println("Element yes");
//        } else {
//            System.out.println("Element no");
//        }
//    }
//}


//PROBLEM7

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//            List<String> new year = new ArrayList<String>();
//            new year.add("3");
//            new year.add("1");
//            new year.add("1");
//            new year.add("2");
//            System.out.println("new year: " + new year);
//            List<String> Year = new ArrayList<String>();
//        Year.add("2");
//        Year.add("0");
//        Year.add("2");
//        Year.add("3");
//            System.out.println("Year: " + Year);
//
//            Collections.copy(new year, Year);
//            System.out.println("Copy new year to year\nCopied:");
//            System.out.println("new year: " + new year);
//            System.out.println("Year: " + Year);
//        }
//    }


//PROBLEM8

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//
//        List<String> lessons = new ArrayList<String>();
//        lessons.add("IT");
//        lessons.add("English");
//        lessons.add("Turkish");
//        lessons.add("Biology");
//        lessons.add("PE");
//        System.out.println("before shuffling:\n" + lessons);
//        Collections.shuffle(lessons);
//        System.out.println("after shuffling:\n" + lessons);
//    }
//}


//PROBLEM9
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//
//        List<String> lessons = new ArrayList<String>();
//        lessons.add("IT");
//        lessons.add("PE");
//        lessons.add("English");
//        lessons.add("Russian");
//        lessons.add("Math");
//        System.out.println("before reversing :\n" + lessons);
//        Collections.reverse(lessons);
//        System.out.println("after reversing :\n" + lessons);
//    }
//}



