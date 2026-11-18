package JavaPractiseSet.tryAndResources;

public class Main {
    public static void main(String[] args) {
        try(Resource a=new Resource("A");
        Resource b=new Resource("B")) {
            a.use();
            b.use();
        } catch (Exception e){
            System.out.println("Caught "+e.getMessage());
            for(Throwable t:e.getSuppressed()){
                System.out.println("Suppressed: "+t.getMessage());
            }
        }
        finally {
            System.out.println("Finally");
        }
    }
}
