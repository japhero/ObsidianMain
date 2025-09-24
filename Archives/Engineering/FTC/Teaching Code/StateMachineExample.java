

interface MyState {
    void doSomething();
    
}


class State1 implements MyState {
    
    private int myEncapsulatedVariables;
    
    @Override
    public void doSomething() {
        // Implementation Goes here 
        
    }
    
}


class State2 implements MyState {
    
    int myEncapsulatedVariables;
    
    @Override
    public void doSomething() {
        // Implementation Goes here 
        
    }
    
}


public class MyController {
    
    private MyState state = new MyState();
    
    public static void main(String[] args) {
        
        state.doSomething();
         
    }
    
    
    
}
