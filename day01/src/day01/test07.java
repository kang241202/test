package day01;

import java.util.Scanner;

public class test07 {
     public static void main(String[] args) {
    	 //최초 30분 동안은 무료
    	 //31분부터는 10분당 500원을 부과(31분 주차하면 1500원)
    	 //일 최대요금은 10,000원
    	 //사용자에게 들어온시간,나간시간을 4자리 정수로 각각 입력
    	 //주차시간과 주차요금을 구하여 출력
    	 //입력
    	 Scanner sc= new Scanner(System.in);
    	 System.out.print("속도: ");
         int speed=sc.nextInt();
    	 
         int limit=100;
         boolean free = speed <=speed * 10/100 || speed <= 109;
         int over= 110;
    	 int pay1=40000;
    	 int pay2=(speed-over)/10*10000+pay1;
    	 
    	 System.out.println("자동차의 속도가"+speed+"km로 확인됩니다.");
    	 
    	 if(free) {
    	 System.out.println("정상주행");
    	 }
    	 else if(pay2>=100000) {
    		 System.out.println("범칙금: "+"100000원 입니다. ");
    	 }
    	 else {
    		 System.out.println("범칙금: "+pay2+"원 입니다.");
    	 }

              }   	 
     }