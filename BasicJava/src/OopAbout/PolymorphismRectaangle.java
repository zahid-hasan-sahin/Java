
package OopAbout;

public class PolymorphismRectaangle extends PolymorphesmShap{
    double height ;
    double width;
    PolymorphismRectaangle(double height,double width){
        this.height = height;
        this.width = width;
    }
    @Override
    double Shap(){
        return height * width;
    }
    
}
