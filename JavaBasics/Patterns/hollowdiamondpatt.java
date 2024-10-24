



public class hollowdiamondpatt {
    // public static void main(String[] args) {
    //     int value = 7;
    //     int space = -1 ;
    //     int star1 = value/2+1;
    //     for (int i = 1; i <= value; i++) {
    //         // for (int j = 1; j <= space; j++) {
    //         //     System.out.print("  ");
    //         // }
    //         for (int k = 1; k <= value; k++) {
    //             if(i==1  || i==7){
    //                 System.out.print("* ");
    //             }else
    //             if (k<=star1) {
    //                 System.out.print("* ");
                    
    //                 // star1 = star1+1;
    //             }
    //             else if (k<=space+star1) {
    //                 System.out.print("  ");
    //                 // space++;
                
    //             }
    //             else{
    //                 System.out.print("* ");
                    
    //             }
    //         }
    //         if (i<=value/2) {
    //             star1 = star1-1;
    //             space +=2;
                
    //         }else{
    //             space -=2;
    //             star1 = star1+1;

    //         }

    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        int value = 7;
        int spaces = value/2+1 ;
        int spacee = value/2+1 ;
        
        int star1 = value/2+1;
        for (int i = 1; i <= value; i++) {
            // for (int j = 1; j <= space; j++) {
            //     System.out.print("  ");
            // }
            for (int k = 1; k <= value; k++) {
                
                if (k>spaces && k<spacee) {
                    System.out.print("  ");
                    
                    // star1 = star1+1;
                }
                else{
                    System.out.print("* ");
                    
                }
            }
            if (i<=value/2) {
                // star1 = star1-1;
                spaces -=1;
                
                spacee +=1;
            }else{
                spaces +=1;
                
                spacee -=1;
                // star1 = star1+1;

            }

            System.out.println();
        }
    }
}
