package exe4;

public class Reta {
    
    private double angular;
    private double linear;

    public Reta(){

    }

    public Reta(double angular, double linear) {

        this.angular = angular;
        this.linear = linear;
    }

    public Reta(Reta outra){

        this.linear = outra.getLinear();
        this.angular = outra.getAngular();
    }

    public double getAngular() {

        return angular;
    }

    public void setAngular(double angular) {

        this.angular = angular;
    }

    public double getLinear() {

        return linear;
    }

    public void setLinear(double linear) {
        
        this.linear = linear;
    }
}
