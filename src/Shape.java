/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Shape {
    
    double x;
    double y;
    double x1 , x2 ,y1 , y2 ;
    String type;
    
    
    public Shape()
    {
        type=new String();
    }
    
    public void setX(double x)
    {
        this.x=x;
    }
    
    public void setY(double y)
    {
        this.y=y;
    }
    
    public void setType(String type)
    {
        this.type=type;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public String getType()
    {
        return type;
    }
    
}
