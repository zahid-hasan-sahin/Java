
package OopAbout;

public class PolymorphismTriangle extends PolymorphesmShap{
    double base;
    double height;
    PolymorphismTriangle(double base ,double height ){
        this.base = base;
        this.height = height;
        
    }
    @Override
    double Shap(){
        return 0.5 * base * height;
        
        
    }
    
}
