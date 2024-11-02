package core.composite;

import java.util.ArrayList;

public class Composite extends Component{

    private ArrayList<Component> components;
    
    public Composite(int data) {
        super(data);
        this.components = new ArrayList<>();
    }
    
   public void addComponent(Component component){
       this.components.add(component);
   }
   
   public Component getComponent(int index){
       return this.components.get(index);
   }
    
}
