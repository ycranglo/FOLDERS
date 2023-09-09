public class App {
    public static void main(String[] args) throws Exception {
       
       
        public int N;
        public Double harmonic;
        
        public Harmonic(int N){
            this.N=N;
          
        
        }
        
        public void harmonicSum() {
            while( this.N > 0){
                // harmonic is the storage value for answer
                //1+1/1+1/2+1/3+1/4
                harmonic+=1.0/ this.N;
                this.N--;
        
            }
           DecimalFormat RoundFormat= new DecimalFormat("0.00");
           String rounded=RoundFormat.format(harmonic);
            System.out.println(rounded);
        }
        
        
    }
}
