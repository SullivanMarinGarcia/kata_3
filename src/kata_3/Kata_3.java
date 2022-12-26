package kata_3;

public class Kata_3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("yahoo.es");
        histogram.increment("yahoo.es");
        histogram.increment("yahoo.es");
        histogram.increment("yahoo.es");
        
        
        new HistogramDisplay(histogram).execute();
    }
    
}
