import java.util.Date;

/*
 * FOLLOWING CODE IS ABOUT OBJECT CONTROL
 */
// public class week4_3 {
//     public static void main(String[] args) {
//         railwayBooking r = new railwayBooking();
//         QIF q = r.login("MEENA", "Sheela");

//         if (q!=null){
//             int status = q.getStatus(0, null);
//             System.out.println("Train Status:"+status);
//         }else{
//             System.out.println("Invalid Login");
//         }

//     }
// }

// interface QIF {
//     public abstract int getStatus(int trainNo , Date d);
// }

// class railwayBooking {
//     public QIF login(String u , String p){
//         QueryObject qObj;
//         if (validLogin(u,p)){
//             qObj= new QueryObject();
//             return qObj;
//         }else{
//             return null;
//         }
//     }
//     public boolean validLogin(String u,String p){
//         return true;
//     }

//     private class QueryObject implements QIF{
//         public int getStatus(int trainNo, Date d ){
//             return 56;
//         }
//         public int method2(){
//             return 1 ;
//         }
//     }
// }

/*
 BELOW SECTION IS ABOUT THE OBJECT CONTROL
 */
public class week4_3 {
    public static void main(String[] args){
        bookyourshow bms = new bookyourshow();
        bookable b =bms.getbooking("admin", "pass");
        b.book();

    }
}

interface bookable{
    void book();
}

class bookyourshow{
    public void find(){
        System.out.println("Check what are the movie running");
    }
    private boolean authenticate(String usr,String pwd ){
        if (usr.equals("admin") && pwd.equals("pass"))
            return true;
        else
            return false;
    }
    public booking getbooking(String usr,String pwd ){
        if (authenticate(usr,pwd))
            return new booking();
        else 
            return null;
    } 

    private class booking implements bookable{
        public void book(){
            System.out.println("TICKET BOOOKED.....!!!!");
        }
    }
}