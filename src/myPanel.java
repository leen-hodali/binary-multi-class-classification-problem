
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;





public class myPanel extends javax.swing.JPanel {

    public double x;
    public double y;
    public Shape shape;
    public ArrayList<Shape> shapes;
    public ArrayList<Point> Lines;
     public ArrayList <Color> myColors;
    
    
    public myPanel() {
        initComponents();
        shapes=new ArrayList<Shape>();
                 Lines=new ArrayList <Point>();
        myColors= new ArrayList <Color> ();
         myColors.add(Color.orange);
         myColors.add(Color.blue);
         myColors.add(Color.pink);
         myColors.add(Color.magenta);
    }
    
    
      public void clear() 
    {
        shapes.clear();
        Lines.clear();
        repaint();
    }
    
    public void clearLines(){
    Lines.clear();
    repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


     public void draw(Shape shape) 
    {
        this.shape=new Shape();
        this.shape.setX(shape.getX());
        this.shape.setY(shape.getY());
        this.shape.setType(shape.getType());
        shapes.add(this.shape);
        repaint();
    }

     
     @Override
        public void paintComponent(Graphics g){
            
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(2));
            
            
            for(int i=0;i<shapes.size();i++)
            {
               
            if(shapes.get(i).type.equals("circle"))
                {
                    g2.setColor(Color.pink);
                      g2.drawOval((int)shapes.get(i).x,(int)shapes.get(i).y,30,30);
                }
                
                
            if(shapes.get(i).type.equals("triangle"))
                {
                     g2.setColor(Color.orange);
                    g2.drawLine((int)shapes.get(i).x,(int)shapes.get(i).y,(int)shapes.get(i).x+20,(int)shapes.get(i).y);
                    g2.drawLine((int)shapes.get(i).x,(int)shapes.get(i).y,(int)shapes.get(i).x+20,(int)shapes.get(i).y+20);
                    g2.drawLine((int)shapes.get(i).x+20,(int)shapes.get(i).y+20,(int)shapes.get(i).x+20,(int)shapes.get(i).y);
                }
            
            
                
                
            if(shapes.get(i).type.equals("square"))
                {
                    g2.setColor(Color.blue);
                    g2.drawRect((int)shapes.get(i).x,(int)shapes.get(i).y,20,20);
               }
                
                
            if(shapes.get(i).type.equals("polygon"))
                {
                     g2.setColor(Color.magenta);
                     g2.drawLine((int)shapes.get(i).x,(int)shapes.get(i).y,(int)shapes.get(i).x+16,(int)shapes.get(i).y);
                     g2.drawLine((int)shapes.get(i).x,(int)shapes.get(i).y,(int)shapes.get(i).x,(int)shapes.get(i).y-16);
                     g2.drawLine((int)shapes.get(i).x+16,(int)shapes.get(i).y,(int)shapes.get(i).x+16,(int)shapes.get(i).y-16);
                     g2.drawLine((int)shapes.get(i).x+16,(int)shapes.get(i).y-16,(int)shapes.get(i).x+8,(int)shapes.get(i).y-23);
                     g2.drawLine((int)shapes.get(i).x,(int)shapes.get(i).y-16,(int)shapes.get(i).x+8,(int)shapes.get(i).y-23);
              
                }
            
            
            int C=0;
              for(int j=0;j<Lines.size();j=j+2 )
            {
                
                g2.setColor(Color.black);
                g2.drawLine(Lines.get(j).x,Lines.get(j).y,Lines.get(j+1).x,Lines.get(j+1).y);
                C++;
            }

            }
        }

    void drawMyLine1(int x1, int y1, int x2, int y2) {
       this.shape=new Shape();
        this.shape.x1 = x1 ;
        this.shape.x2 = x2 ;
        this.shape.y1 = y1 ;
        this.shape.y2 = y2 ;
        this.shape.setType("Line1");
        shapes.add(this.shape);
        repaint();
    }
    
    
      void drawMyLine2(int x1, int y1, int x2, int y2) {
       this.shape=new Shape();
        this.shape.x1 = x1 ;
        this.shape.x2 = x2 ;
        this.shape.y1 = y1 ;
        this.shape.y2 = y2 ;
        this.shape.setType("Line2");
        shapes.add(this.shape);
        repaint();
    }
      
       void drawMyLine3(int x1, int y1, int x2, int y2) {
       this.shape=new Shape();
        this.shape.x1 = x1 ;
        this.shape.x2 = x2 ;
        this.shape.y1 = y1 ;
        this.shape.y2 = y2 ;
        this.shape.setType("Line3");
        shapes.add(this.shape);
        repaint();
    }
  public void drawLine(int x1, int y1, int x2, int y2)
        {
            Point p1 = new Point(x1 ,y1);
            Point p2 = new Point(x2 ,y2);
            
            Lines.add(p1);
            Lines.add(p2);
            repaint();
            
        }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
