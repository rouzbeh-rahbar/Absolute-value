package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter number : ");
	double m=sc.nextDouble();


	if(m<0){
		System.out.print(-m);
	}
	else{
		System.out.print(m);
	}


    }
}
