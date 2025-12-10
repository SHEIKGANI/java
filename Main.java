
// class Calculator{

//     int a;

//         // class and object declaration in main class
//          public int add(int n1, int n2){
//                 int r = n1 + n2;
//                 return r;
//          }
//     public static void main(String[] args) {

//         //object and class

//         int num1 = 5;
//         int num2 = 4;

//         Calculator calc = new Calculator() ;
        
//         int result = calc.add(num1,num2);

//         System.out.println(result);
//     }
// }

// class Computer
// {
//     public void playMusic(){
//         System.out.println("Play music to enjoy");
//     }

//     public String getMePen(int cost){
//         if (cost >= 10) 
//         return "pen";
//         else 
//         return "nthng";
//     }

//     public static void main(String[] args) {
//         Computer obj = new Computer();
//         obj.playMusic();
//         String str = obj.getMePen(2);
//         System.out.println(str);
//     }
// }

// method and parameter (in method inside parameter is called a variable)

// public class Main{
// static void myMethod(String fname,int age){
// System.out.println(fname+ " is " +age);
// }
// public static void main(String[] args){
// myMethod("Sheik",12);
// myMethod("Usman",14);
// myMethod("Gani",16);
// 	}
// }

// method with return type
// public class Main{
// static int doublegame(int x){
// return x * 4;
// }

// public static void main(String [] args){
// for (int i = 1;i<=8;i++){
// System.out.println("Double of " + i + " is " +doublegame(i));
// }
// }
// }

class Student{
    int rollno;
    String name;
    int marks;
}

public class Main {

    
    public static void main(String[] args) {
        
    // single array 
    // int arr[] = {4,5,6,7,8};

    // System.out.println(arr.length);
        

    // multi dimensional array

    // int nums [] [] = new int [3][4] ; // jagged array

    // nums[0] = new int [3];
    // nums[1] = new int [4];
    // nums[2] = new int [2];

    // for ( int i = 0; i < 3;i++){
    //     for (int j = 0; j < nums[i].length;j++){
    //         nums [i][j] = (int)(Math.random() * 10);
    //     }
    // }
    //  for ( int i = 0; i < 3;i++){
    //     for (int j = 0; j < 4;j++){
    //         System.out.print(nums[i][j] + " ");
    //     }
    //     System.err.println();
    // }

    // Enchanced for loop
    // for(int n[]:nums)
    // {
    //     for(int m:n){
    //         System.out.print(m +" ");
    //     }
    //     System.out.println();
    // }
    

    Student s1 = new Student();
    s1.rollno=123;
    s1.name="Sheik";
    s1.marks=90;

    Student s2 = new Student();
    s2.rollno=123;
    s2.name="Usman";
    s2.marks=70;

    Student s3 = new Student();
    s3.rollno=123;
    s3.name="Gani";
    s3.marks=80;
 
    Student students[] = new Student[3];
    students[0]=s1;
    students[1]=s2;
    students[2]=s3;

        // normal for loop
        // for (int i = 0; i <students.length;i++){
        //     System.out.println(students[i].name +" : "+students[i].marks);
        // }

        //enhanced for loop
        for (Student stud : students) // iterate the with argument inside it
        {
            System.out.println(stud.name+ " : " +stud.marks);
        }
    }
    
}
