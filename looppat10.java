public class looppat10 {
    public static void main(String[] args) {
    int n = 5;
    
for(int i=n-1;i>=1;i--){
    for(int j=1;j<=i;j++){

    System.out.print("*");
    }
    for(int j=1;j<=n-i;j++){
        System.out.print("1");
    }
    System.out.println(" ");

}
}
    
}// not completed yet
