public class Survey {
   public static void main(String []args){
       System .out .println("Question:How would you  ?") ;
       responses() ;
       results() ;

   }


    public static void responses(){
        System .out .println("responses:" +
                "Very satisfication \n"+
                "satisfication  \n"   +
                "nutral") ;}

    public static void results() {
        System .out .println("results:"+
                "Very satisfication =50% \n"+
                "satisfication =40%  \n" +
                "Nutral =30%");}



}
