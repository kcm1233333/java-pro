package com.example.demo;

//import javax.management.Query;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@EnableJpaAuditing
public class UserManagementServiceCobaApplication {
	
	public static int getBigArea(int [][]matr,int row, int col) {
		if (row<0||col<0||row>4||col>5) {
			return 0;
		}
		if (matr[row][col]==0) {
			return 0;
		}
		//matr[row][col]=0;
    	int mad=1;
    	for (int r=0;r<4;r++) {
    		for(int c=0;c<5;c++) {
                   mad+=getBigArea(matr, row, col);	
    		}
    		
    	}
    	return mad;
    }	
    public static int patrol=0;
    public static int maxRegion=0;
    //public static boolean [][] visited=new boolean[4][5];
	public static void main(String[] args) {
		
        	//Dilihat dan diperdalam lebih lagi
		SpringApplication.run(UserManagementServiceCobaApplication.class, args);
		
//		int a=2;
//		int b=3;
//		int c=5;
//		int [] dra= {a,b,c};
//		//int  out;
//		//Tanpa Iterasi
//		System.out.print("["+dra[0]+","+dra[1]+","+dra[2]+"]");
//		//int sumo =0;
//		int[][]arr ={{0,1,1,0,1},{1,0,1,0,1},{0,1,0,1,0},{0,0,0,1,0}};
//		System.out.println("Grafik untuk hitung");
//		//arr[i][j]="P";
//  	    //System.out.print("P");
//  	    //melabeli '#' dengan P
//	       for(int i=0;i<4; i++){
//	        for (int j=0;j<5;j++){//OCR 
//	          System.out.print(arr[i][j]); 
//	         
//	   	          	         if (arr[i][j]==1) { 
////	          	           	  
//	   	          	        	 int size=getBigArea(arr,i,j);
//	   	                         maxRegion=Math.max(size, maxRegion);          	        	 
//	   	          	        	 
//	          	         }
//	        }
//	        System.out.println();
//	       }
//	 //      System.out.println(patrol+" "+maxRegion);//[2,2,1]
	       
	    
	}

}
