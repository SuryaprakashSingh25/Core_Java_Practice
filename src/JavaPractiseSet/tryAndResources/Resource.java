package JavaPractiseSet.tryAndResources;

import java.util.Objects;

public class Resource implements AutoCloseable{
    private final String name;

    public Resource(String name){
        this.name=name;
        System.out.println("Opening: "+name);
    }

    public void use(){
        if(Objects.equals(name, "B")){
            throw new RuntimeException("use failed");
        }
        System.out.println("Using: "+name);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing: "+name);
        throw new RuntimeException("close failed "+name);
    }

}
