public class calc {

private int x ;

    public void setX(int x) {
        this.x = x;
    }

    public void factorial (){
        int y =1 ;
        for ( int i=1 ;i<=x ; i++){
            y*=i;
        }
        System.out.println(y);


}


}
