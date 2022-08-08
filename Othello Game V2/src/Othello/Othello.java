
package Othello;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Othello extends javax.swing.JFrame {
    static int h=0;
    int a[][] = new int [8][8];
    {
        for (int i=0 ; i<8 ; i++)
            for (int j=0 ; j<8 ; j++)
            {
                if ((i == 3 && j == 3) || (i == 4 && j == 4)) {
                    a[i][j] = 2;
                } else if ((i == 3 && j == 4) || (i == 4 && j == 3)) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }
                
    }
         JButton Button (int x, int y){
         JButton b[][] = {{but1,but2,but3,but4,but5,but6,but7,but8},{but9,but10,but11,but12,but13,but14,but15,but16},{but17,but18,but19,but20,but21,but22,but23,but24},{but25,but26,but27,but28,but29,but30,but31,but32},{but33,but34,but35,but36,but37,but38,but39,but40},{but41,but42,but43,but44,but45,but46,but47,but48},{but49,but50,but51,but52,but53,but54,but55,but56},{but57,but58,but59,but60,but61,but62,but63,but64}};
        return b[x][y];
    }
     int ap=1;
    void sp (){
        if (ap==1){
            ap=2;
            BlackOrGreen.setText("Green");
            BlackOrGreen.setForeground(Color.GREEN);
        }
        else if (ap==2){
            ap=1;
            BlackOrGreen.setText("Black");
            BlackOrGreen.setForeground(Color.BLACK);
        }
    }
        int A(JButton but, int x, int y) {
        if (ap == 1) {
            if (y<=5 && a[x][y + 1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x][y + w] != 1) {
                    if (a[x][y + w] == 0) {
                        d++;
                    }
                    if (d != 0) {
                        return 0;
                    }
                    w++;
                    if ((w+y) == 8)
                        return 0;
                }   
                    for (int k = 0; k <= w; k++) {
                        a[x][y + k] = 1;
                    }
                    return 1;
            }
        }
        if (ap==2){
            if (y<=5 && a[x][y + 1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x][y + w] != 2) {
                    if (a[x][y + w] == 0) {
                        d++;
                    }
                    if (d != 0) {
                        return 0;
                    }
                    w++;
                    if ( (w+y) == 8 )
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x][y + k] = 2;
                    }
                    return 1;
            }
        }
        return 0;
    }
        int B(JButton but, int x, int y){
            if (ap==1){
                if (y>=2 && a[x][y - 1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x][y - w] != 1) {
                    if (a[x][y - w] == 0) {
                        d++;
                    }
                    if ( d != 0) {
                        return 0;
                    }
                    w++;
                    if ( (y-w) == -1 )
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x][y - k] = 1;
                    }
                    return 1;
            }
            }
            if (ap==2){
            if (y>=2 && a[x][y - 1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x][y - w] != 2) {
                    if (a[x][y - w] == 0) {
                        d++;
                    }
                    if (d != 0) {
                        return 0;
                    }
                    w++;
                    if ( y - w == -1)
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x][y - k] = 2;
                    }
                    return 1;
            }
        }
            return 0;
        }
        
        int C (JButton but, int x, int y) {
        if (ap == 1) {
            if (x<=5 && a[x+1][y] == 2) {
                int w = 1;
                int d = 0;
                while (a[x+w][y] != 1) {
                    if (a[x+w][y] == 0) {
                        d++;
                    }
                    if ( d != 0) {
                        return 0;
                    }
                    w++;
                    if ( (x+w) == 8 )
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x+k][y] = 1;
                    }
                    return 1;
            }
        }
        if (ap==2){
            if (x<=5 && a[x+1][y] == 1) {
                int w = 1;
                int d = 0;
                while (a[x + w][y] != 2) {
                    if (a[x + w][y] == 0) {
                        d++;
                    }
                    if ( d != 0) {
                        return 0;
                    }
                    w++;
                    if ( (w+x)==8 )
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x + k][y] = 2;
                    }
                    return 1;
            }
        }
return 0;
    }
        int D(JButton but, int x, int y){
            if (ap==1){
                if (x>=2 && a[x - 1][y] == 2) {
                int w = 1;
                int d = 0;
                while (a[x - w][y] != 1) {
                    if (a[x - w][y] == 0) {
                        d++;
                    }
                    if (d != 0) {
                        return 0;
                    }
                    w++;
                    if ((x - w) == -1)
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x - k][y] = 1;
                    }
                    return 1;
            }
            }
            if (ap==2){
            if (x>=2&&x<=7&&y<=7&& a[x - 1][y] == 1) {
                int w = 1;
                int d = 0;
                while (a[x - w][y] != 2) {
                    if (a[x - w][y] == 0) {
                        d++;
                    }
                    if ( d != 0) {
                        return 0;
                    }
                    w++;
                    if ((x-w) == -1)
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x - k][y] = 2;
                    }
                    return 1;
            }
        }
            return 0;
        }
        int E (JButton but, int x, int y) {
        if (ap == 1) {
            if (x>=2&&y<=5&& a[x-1][y+1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x-w][y+w] != 1) {
                    if (a[x-w][y+w] == 0) {
                        d++;
                    }
                    if ( d != 0 ) {
                        return 0;
                    }
                    w++;
                    if(((x-w) == -1 ) || ((y+w) == 8))
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x-k][y+k] = 1;
                    }
                    return 1;
            }
        }
        if (ap==2){
            if (x>=2&&y<=5&& a[x-1][y+1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x - w][y + w] != 2) {
                    if (a[x - w][y + w] == 0) {
                        d++;
                    }
                    if ( d != 0) {
                        return 0;
                    }
                    w++;
                    if (((x-w)==-1)||((y+w)==8))
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x - k][y + k] = 2;
                    }
                    return 1;
            }
        }
        return 0;
    }
        int F (JButton but, int x, int y) {
        if (ap == 1) {
            if (x<=5&&y>=2&& a[x+1][y-1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x+w][y-w] != 1) {
                    if (a[x+w][y-w] == 0) {
                        d++;
                    }
                    if ( d != 0 ) {
                        return 0;
                    }
                    w++;
                    if(((x+w)==8)||((y-w)==-1))
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x+k][y-k] = 1;
                    }
                    return 1;
            }
        }
        if (ap==2){
            if (x<=5&&y>=2&& a[x+1][y-1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x + w][y - w] != 2) {
                    if (a[x + w][y - w] == 0) {
                        d++;
                    }
                    if ( d!= 0) {
                        return 0;
                    }
                    w++;
                    if (((x+w)==8)||((y-w)==-1))
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x + k][y - k] = 2;
                    }
                    return 1;
            }
        }
        return 0;
    }
        int G (JButton but, int x, int y){
            if (ap==1){
                if (x<=5&&y<=5&& a[x + 1][y + 1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x + w][y + w] != 1) {
                    if (a[x + w][y + w] == 0) {
                        d++;
                    }
                    if ( d!=0 ) {
                        return 0;
                    }
                    w++;
                    if (((x+w)==8)||((y+w)==8))
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x + k][y + k] = 1;
                    }
                    return 1;
            }
            }
            if (ap==2){
            if (x<=5&&y<=5&& a[x + 1][y + 1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x + w][y + w] != 2) {
                    if (a[x + w][y + w] == 0) {
                        d++;
                    }
                    if (d != 0) {
                        return 0;
                    }
                    w++;
                    if ( ((x+w)==8)||((y+w)==8))
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x + k][y + k] = 2;
                    }
                    return 1;
            }
        }
            return 0;
        }
        int H (JButton but, int x, int y){
            if (ap==1){
                if (x>=2&&y>=2&&a[x - 1][y - 1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x - w][y - w] != 1) {
                    if (a[x - w][y - w] == 0) {
                        d++;
                    }
                    if (d!=0) {
                        return 0;
                    }
                    w++;
                    if (((x-w)==-1)||((y-w)==-1))
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x - k][y - k] = 1;
                    }
                    return 1;
            }
            }
            if (ap==2){
            if (x>=2&&y>=2&& a[x - 1][y - 1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x - w][y - w] != 2) {
                    if (a[x - w][y - w] == 0) {
                        d++;
                    }
                    if (d!=0) {
                        return 0;
                    }
                    w++;
                    if( ((x-w)==-1)||((y-w)==-1) )
                        return 0;
                }
                    for (int k = 0; k <= w; k++) {
                        a[x - k][y - k] = 2;
                    }
                    return 1;
            }
        }
            return 0;
        }
         
        void number() {
        int c = 0;
        int d = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (a[i][j] == 1) {
                    c++;
                }
                if (a[i][j] == 2) {
                    d++;
                }
                if (a[i][j]==0){
                    Button(i, j).setBackground(Color.lightGray);
                }
            }
        }
        NumberOfBlack.setText(String.valueOf(c));
        NumberOfGreen.setText(String.valueOf(d));
    }
            void color(JButton but, int x, int y) {
        {
            if (a[x][y] == 1) {
                but.setBackground(Color.BLACK);
            }
            if (a[x][y] == 2) {
                but.setBackground(Color.GREEN);
            }
        }
    }
            void check(){
                int w=0;
                int x=0;
                int y=0;
                for (int i=0 ; i<8 ; i++)
                    {
                    for (int j=0 ; j<8 ; j++)       
                        if (a[i][j] != 0)
                        {
                            w++;
                        }
                    }
                if (w==64){
                    for (int i=0 ; i<8 ;i++)
                    {
                        for (int j=0 ; j<8 ; j++)
                            if (a[i][j] == 1){
                                x++;
                            }
                            else if (a[i][j] == 2){
                                y++;
                            }
                }
                    if (x>y){
                        JOptionPane.showMessageDialog(null, "Palayer  \" Black \"  is  Winner " , "Well Done!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (y==x){
                        JOptionPane.showMessageDialog(null, "No Winner" , "Well Done!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (y>x){
                        JOptionPane.showMessageDialog(null, "Palayer  \" Green \"  is  Winner " , "Well Done!", JOptionPane.INFORMATION_MESSAGE);
                    }
            }
            }
    void add (JButton but,int x,int y){
        if (a[x][y]==0){
        int a=0;
        if(A(but,x,y)==1){
            a++;
        }
        if(B(but,x,y)==1){
            a++;
        }
        if(C(but,x,y)==1){
            a++;
        }
        if(D(but,x,y)==1){
            a++;
        }
        if(E(but,x,y)==1){
        a++;
    }
        if(F(but,x,y)==1){
        a++;
    }
        if(G(but,x,y)==1){
        a++;
    }
        if(H(but,x,y)==1){
        a++;
    }
        if (a!=0){
            sp();
        }
        number();
        for(int i=0 ; i<8 ; i++)
            for(int j=0 ; j<8 ;j++){
                color(Button(i,j),i,j);
            }
        }
        check();
    } 
    
    //az in ja vase in ke koja mitone bazikon button ro click kone tabe minevisam
    
         int A1( int x, int y) {
        if (ap == 1) {
            if (y<=5 && a[x][y + 1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x][y + w] != 1) {
                    if (a[x][y + w] == 0) {
                        d++;
                    }
                    if (d != 0) {
                        return 0;
                    }
                    w++;
                    if ((w+y) == 8)
                        return 0;
                }   
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
        }
        if (ap==2){
            if (y<=5 && a[x][y + 1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x][y + w] != 2) {
                    if (a[x][y + w] == 0) {
                        d++;
                    }
                    if (d != 0) {
                        return 0;
                    }
                    w++;
                    if ( (w+y) == 8 )
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
        }
        return 0;
    }
        int B1(int x, int y){
            if (ap==1){
                if (y>=2 && a[x][y - 1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x][y - w] != 1) {
                    if (a[x][y - w] == 0) {
                        d++;
                    }
                    if ( d != 0) {
                        return 0;
                    }
                    w++;
                    if ( (y-w) == -1 )
                        return 0;
                }
                        Button(x, y).setBackground(Color.yellow);
                        h++;
                    return 1;
            }
            }
            if (ap==2){
            if (y>=2 && a[x][y - 1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x][y - w] != 2) {
                    if (a[x][y - w] == 0) {
                        d++;
                    }
                    if (d != 0) {
                        return 0;
                    }
                    w++;
                    if ( y - w == -1)
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
        }
            return 0;
        }
        
        int C1 (int x, int y) {
        if (ap == 1) {
            if (x<=5 && a[x+1][y] == 2) {
                int w = 1;
                int d = 0;
                while (a[x+w][y] != 1) {
                    if (a[x+w][y] == 0) {
                        d++;
                    }
                    if ( d != 0) {
                        return 0;
                    }
                    w++;
                    if ( (x+w) == 8 )
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
        }
        if (ap==2){
            if (x<=5 && a[x+1][y] == 1) {
                int w = 1;
                int d = 0;
                while (a[x + w][y] != 2) {
                    if (a[x + w][y] == 0) {
                        d++;
                    }
                    if ( d != 0) {
                        return 0;
                    }
                    w++;
                    if ( (w+x)==8 )
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
        }
return 0;
    }
        int D1(int x, int y){
            if (ap==1){
                if (x>=2 && a[x - 1][y] == 2) {
                int w = 1;
                int d = 0;
                while (a[x - w][y] != 1) {
                    if (a[x - w][y] == 0) {
                        d++;
                    }
                    if (d != 0) {
                        return 0;
                    }
                    w++;
                    if ((x - w) == -1)
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
            }
            if (ap==2){
            if (x>=2&&x<=7&&y<=7&& a[x - 1][y] == 1) {
                int w = 1;
                int d = 0;
                while (a[x - w][y] != 2) {
                    if (a[x - w][y] == 0) {
                        d++;
                    }
                    if ( d != 0) {
                        return 0;
                    }
                    w++;
                    if ((x-w) == -1)
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
        }
            return 0;
        }
        int E1 (int x, int y) {
        if (ap == 1) {
            if (x>=2&&y<=5&& a[x-1][y+1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x-w][y+w] != 1) {
                    if (a[x-w][y+w] == 0) {
                        d++;
                    }
                    if ( d != 0 ) {
                        return 0;
                    }
                    w++;
                    if(((x-w) == -1 ) || ((y+w) == 8))
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
        }
        if (ap==2){
            if (x>=2&&y<=5&& a[x-1][y+1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x - w][y + w] != 2) {
                    if (a[x - w][y + w] == 0) {
                        d++;
                    }
                    if ( d != 0) {
                        return 0;
                    }
                    w++;
                    if (((x-w)==-1)||((y+w)==8))
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
        }
        return 0;
    }
        int F1 (int x, int y) {
        if (ap == 1) {
            if (x<=5&&y>=2&& a[x+1][y-1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x+w][y-w] != 1) {
                    if (a[x+w][y-w] == 0) {
                        d++;
                    }
                    if ( d != 0 ) {
                        return 0;
                    }
                    w++;
                    if(((x+w)==8)||((y-w)==-1))
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
        }
        if (ap==2){
            if (x<=5&&y>=2&& a[x+1][y-1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x + w][y - w] != 2) {
                    if (a[x + w][y - w] == 0) {
                        d++;
                    }
                    if ( d!= 0) {
                        return 0;
                    }
                    w++;
                    if (((x+w)==8)||((y-w)==-1))
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            
            }
        }
        return 0;
    }
        int G1 (int x, int y){
            if (ap==1){
                if (x<=5&&y<=5&& a[x + 1][y + 1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x + w][y + w] != 1) {
                    if (a[x + w][y + w] == 0) {
                        d++;
                    }
                    if ( d!=0 ) {
                        return 0;
                    }
                    w++;
                    if (((x+w)==8)||((y+w)==8))
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
            }
            if (ap==2){
            if (x<=5&&y<=5&& a[x + 1][y + 1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x + w][y + w] != 2) {
                    if (a[x + w][y + w] == 0) {
                        d++;
                    }
                    if (d != 0) {
                        return 0;
                    }
                    w++;
                    if ( ((x+w)==8)||((y+w)==8))
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
        }
            return 0;
        }
        int H1 (int x, int y){
            if (ap==1){
                if (x>=2&&y>=2&&a[x - 1][y - 1] == 2) {
                int w = 1;
                int d = 0;
                while (a[x - w][y - w] != 1) {
                    if (a[x - w][y - w] == 0) {
                        d++;
                    }
                    if (d!=0) {
                        return 0;
                    }
                    w++;
                    if (((x-w)==-1)||((y-w)==-1))
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
            }
            if (ap==2){
            if (x>=2&&y>=2&& a[x - 1][y - 1] == 1) {
                int w = 1;
                int d = 0;
                while (a[x - w][y - w] != 2) {
                    if (a[x - w][y - w] == 0) {
                        d++;
                    }
                    if (d!=0) {
                        return 0;
                    }
                    w++;
                    if( ((x-w)==-1)||((y-w)==-1) )
                        return 0;
                }
                    Button(x, y).setBackground(Color.yellow);
                    h++;
                    return 1;
            }
        }
            return 0;
        }
                      

    public Othello() {
        
        initComponents();
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        but10 = new javax.swing.JButton();
        but11 = new javax.swing.JButton();
        but12 = new javax.swing.JButton();
        but13 = new javax.swing.JButton();
        but14 = new javax.swing.JButton();
        but15 = new javax.swing.JButton();
        but16 = new javax.swing.JButton();
        but17 = new javax.swing.JButton();
        but18 = new javax.swing.JButton();
        but19 = new javax.swing.JButton();
        but20 = new javax.swing.JButton();
        but21 = new javax.swing.JButton();
        but22 = new javax.swing.JButton();
        but23 = new javax.swing.JButton();
        but24 = new javax.swing.JButton();
        but25 = new javax.swing.JButton();
        but26 = new javax.swing.JButton();
        but27 = new javax.swing.JButton();
        but28 = new javax.swing.JButton();
        but29 = new javax.swing.JButton();
        but30 = new javax.swing.JButton();
        but31 = new javax.swing.JButton();
        but32 = new javax.swing.JButton();
        but33 = new javax.swing.JButton();
        but34 = new javax.swing.JButton();
        but35 = new javax.swing.JButton();
        but36 = new javax.swing.JButton();
        but37 = new javax.swing.JButton();
        but38 = new javax.swing.JButton();
        but39 = new javax.swing.JButton();
        but40 = new javax.swing.JButton();
        but41 = new javax.swing.JButton();
        but42 = new javax.swing.JButton();
        but43 = new javax.swing.JButton();
        but44 = new javax.swing.JButton();
        but45 = new javax.swing.JButton();
        but46 = new javax.swing.JButton();
        but47 = new javax.swing.JButton();
        but48 = new javax.swing.JButton();
        but49 = new javax.swing.JButton();
        but50 = new javax.swing.JButton();
        but51 = new javax.swing.JButton();
        but52 = new javax.swing.JButton();
        but53 = new javax.swing.JButton();
        but54 = new javax.swing.JButton();
        but55 = new javax.swing.JButton();
        but56 = new javax.swing.JButton();
        but57 = new javax.swing.JButton();
        but58 = new javax.swing.JButton();
        but59 = new javax.swing.JButton();
        but60 = new javax.swing.JButton();
        but61 = new javax.swing.JButton();
        but62 = new javax.swing.JButton();
        but63 = new javax.swing.JButton();
        but64 = new javax.swing.JButton();
        Turn = new javax.swing.JLabel();
        BlackOrGreen = new javax.swing.JLabel();
        BlackNumber = new javax.swing.JLabel();
        NumberOfBlack = new javax.swing.JLabel();
        GreenNumber = new javax.swing.JLabel();
        NumberOfGreen = new javax.swing.JLabel();
        CH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Othello", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(725, 600));

        but1.setBackground(java.awt.Color.lightGray);
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        but2.setBackground(java.awt.Color.lightGray);
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        but3.setBackground(java.awt.Color.lightGray);
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });

        but4.setBackground(java.awt.Color.lightGray);
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });

        but5.setBackground(java.awt.Color.lightGray);
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });

        but6.setBackground(java.awt.Color.lightGray);
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });

        but7.setBackground(java.awt.Color.lightGray);
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });

        but8.setBackground(java.awt.Color.lightGray);
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });

        but9.setBackground(java.awt.Color.lightGray);
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });

        but10.setBackground(java.awt.Color.lightGray);
        but10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but10ActionPerformed(evt);
            }
        });

        but11.setBackground(java.awt.Color.lightGray);
        but11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but11ActionPerformed(evt);
            }
        });

        but12.setBackground(java.awt.Color.lightGray);
        but12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but12ActionPerformed(evt);
            }
        });

        but13.setBackground(java.awt.Color.lightGray);
        but13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but13ActionPerformed(evt);
            }
        });

        but14.setBackground(java.awt.Color.lightGray);
        but14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but14ActionPerformed(evt);
            }
        });

        but15.setBackground(java.awt.Color.lightGray);
        but15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but15ActionPerformed(evt);
            }
        });

        but16.setBackground(java.awt.Color.lightGray);
        but16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but16ActionPerformed(evt);
            }
        });

        but17.setBackground(java.awt.Color.lightGray);
        but17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but17ActionPerformed(evt);
            }
        });

        but18.setBackground(java.awt.Color.lightGray);
        but18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but18ActionPerformed(evt);
            }
        });

        but19.setBackground(java.awt.Color.lightGray);
        but19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but19ActionPerformed(evt);
            }
        });

        but20.setBackground(java.awt.Color.lightGray);
        but20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but20ActionPerformed(evt);
            }
        });

        but21.setBackground(java.awt.Color.lightGray);
        but21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but21ActionPerformed(evt);
            }
        });

        but22.setBackground(java.awt.Color.lightGray);
        but22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but22ActionPerformed(evt);
            }
        });

        but23.setBackground(java.awt.Color.lightGray);
        but23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but23ActionPerformed(evt);
            }
        });

        but24.setBackground(java.awt.Color.lightGray);
        but24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but24ActionPerformed(evt);
            }
        });

        but25.setBackground(java.awt.Color.lightGray);
        but25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but25ActionPerformed(evt);
            }
        });

        but26.setBackground(java.awt.Color.lightGray);
        but26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but26ActionPerformed(evt);
            }
        });

        but27.setBackground(java.awt.Color.lightGray);
        but27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but27ActionPerformed(evt);
            }
        });

        but28.setBackground(java.awt.Color.green);
        but28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but28ActionPerformed(evt);
            }
        });

        but29.setBackground(java.awt.Color.black);
        but29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but29ActionPerformed(evt);
            }
        });

        but30.setBackground(java.awt.Color.lightGray);
        but30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but30ActionPerformed(evt);
            }
        });

        but31.setBackground(java.awt.Color.lightGray);
        but31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but31ActionPerformed(evt);
            }
        });

        but32.setBackground(java.awt.Color.lightGray);
        but32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but32ActionPerformed(evt);
            }
        });

        but33.setBackground(java.awt.Color.lightGray);
        but33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but33ActionPerformed(evt);
            }
        });

        but34.setBackground(java.awt.Color.lightGray);
        but34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but34ActionPerformed(evt);
            }
        });

        but35.setBackground(java.awt.Color.lightGray);
        but35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but35ActionPerformed(evt);
            }
        });

        but36.setBackground(java.awt.Color.black);
        but36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but36ActionPerformed(evt);
            }
        });

        but37.setBackground(java.awt.Color.green);
        but37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but37ActionPerformed(evt);
            }
        });

        but38.setBackground(java.awt.Color.lightGray);
        but38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but38ActionPerformed(evt);
            }
        });

        but39.setBackground(java.awt.Color.lightGray);
        but39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but39ActionPerformed(evt);
            }
        });

        but40.setBackground(java.awt.Color.lightGray);
        but40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but40ActionPerformed(evt);
            }
        });

        but41.setBackground(java.awt.Color.lightGray);
        but41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but41ActionPerformed(evt);
            }
        });

        but42.setBackground(java.awt.Color.lightGray);
        but42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but42ActionPerformed(evt);
            }
        });

        but43.setBackground(java.awt.Color.lightGray);
        but43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but43ActionPerformed(evt);
            }
        });

        but44.setBackground(java.awt.Color.lightGray);
        but44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but44ActionPerformed(evt);
            }
        });

        but45.setBackground(java.awt.Color.lightGray);
        but45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but45ActionPerformed(evt);
            }
        });

        but46.setBackground(java.awt.Color.lightGray);
        but46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but46ActionPerformed(evt);
            }
        });

        but47.setBackground(java.awt.Color.lightGray);
        but47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but47ActionPerformed(evt);
            }
        });

        but48.setBackground(java.awt.Color.lightGray);
        but48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but48ActionPerformed(evt);
            }
        });

        but49.setBackground(java.awt.Color.lightGray);
        but49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but49ActionPerformed(evt);
            }
        });

        but50.setBackground(java.awt.Color.lightGray);
        but50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but50ActionPerformed(evt);
            }
        });

        but51.setBackground(java.awt.Color.lightGray);
        but51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but51ActionPerformed(evt);
            }
        });

        but52.setBackground(java.awt.Color.lightGray);
        but52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but52ActionPerformed(evt);
            }
        });

        but53.setBackground(java.awt.Color.lightGray);
        but53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but53ActionPerformed(evt);
            }
        });

        but54.setBackground(java.awt.Color.lightGray);
        but54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but54ActionPerformed(evt);
            }
        });

        but55.setBackground(java.awt.Color.lightGray);
        but55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but55ActionPerformed(evt);
            }
        });

        but56.setBackground(java.awt.Color.lightGray);
        but56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but56ActionPerformed(evt);
            }
        });

        but57.setBackground(java.awt.Color.lightGray);
        but57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but57ActionPerformed(evt);
            }
        });

        but58.setBackground(java.awt.Color.lightGray);
        but58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but58ActionPerformed(evt);
            }
        });

        but59.setBackground(java.awt.Color.lightGray);
        but59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but59ActionPerformed(evt);
            }
        });

        but60.setBackground(java.awt.Color.lightGray);
        but60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but60ActionPerformed(evt);
            }
        });

        but61.setBackground(java.awt.Color.lightGray);
        but61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but61ActionPerformed(evt);
            }
        });

        but62.setBackground(java.awt.Color.lightGray);
        but62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but62ActionPerformed(evt);
            }
        });

        but63.setBackground(java.awt.Color.lightGray);
        but63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but63ActionPerformed(evt);
            }
        });

        but64.setBackground(java.awt.Color.lightGray);
        but64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but64ActionPerformed(evt);
            }
        });

        Turn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Turn.setForeground(new java.awt.Color(255, 255, 255));
        Turn.setText("Turn :");

        BlackOrGreen.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BlackOrGreen.setText("Black");

        BlackNumber.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BlackNumber.setText("Black :");

        NumberOfBlack.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NumberOfBlack.setText("2");

        GreenNumber.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        GreenNumber.setForeground(java.awt.Color.green);
        GreenNumber.setText("Green :");

        NumberOfGreen.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NumberOfGreen.setForeground(java.awt.Color.green);
        NumberOfGreen.setText("2");

        CH.setBackground(java.awt.Color.yellow);
        CH.setForeground(new java.awt.Color(0, 102, 102));
        CH.setText("Change Turn / Help");
        CH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("De.Coder();");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("JR.Y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(but57, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(but49, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(but41, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(but33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(but25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(but17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Turn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BlackOrGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BlackNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NumberOfBlack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GreenNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(NumberOfGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CH)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Turn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(but1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BlackOrGreen, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(but9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(but17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but24, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(but25, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(but26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(but32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(CH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(but33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BlackNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(but41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NumberOfBlack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GreenNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(but49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NumberOfGreen, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(but57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        add(but1,0,0);
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        add(but2,0,1);
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
        add(but3,0,2);
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
        add(but4,0,3);
    }//GEN-LAST:event_but4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
        add(but5,0,4);
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed
        add(but6,0,5);
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed
        add(but7,0,6);
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
        add(but8,0,7);
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
        add(but9,1,0);
    }//GEN-LAST:event_but9ActionPerformed

    private void but10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but10ActionPerformed
        add(but10,1,1);
    }//GEN-LAST:event_but10ActionPerformed

    private void but11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but11ActionPerformed
        add(but11,1,2);
    }//GEN-LAST:event_but11ActionPerformed

    private void but12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but12ActionPerformed
        add(but12,1,3);
    }//GEN-LAST:event_but12ActionPerformed

    private void but13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but13ActionPerformed
        add(but13,1,4);
    }//GEN-LAST:event_but13ActionPerformed

    private void but14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but14ActionPerformed
        add(but14,1,5);
    }//GEN-LAST:event_but14ActionPerformed

    private void but15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but15ActionPerformed
        add(but15,1,6);
    }//GEN-LAST:event_but15ActionPerformed

    private void but16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but16ActionPerformed
        add(but16,1,7);
    }//GEN-LAST:event_but16ActionPerformed

    private void but17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but17ActionPerformed
        add(but17,2,0);
    }//GEN-LAST:event_but17ActionPerformed

    private void but18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but18ActionPerformed
        add(but18,2,1);
    }//GEN-LAST:event_but18ActionPerformed

    private void but19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but19ActionPerformed
        add(but19,2,2);
    }//GEN-LAST:event_but19ActionPerformed

    private void but20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but20ActionPerformed
        add(but20,2,3);
    }//GEN-LAST:event_but20ActionPerformed

    private void but21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but21ActionPerformed
        add(but21,2,4);
    }//GEN-LAST:event_but21ActionPerformed

    private void but22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but22ActionPerformed
        add(but22,2,5);
    }//GEN-LAST:event_but22ActionPerformed

    private void but23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but23ActionPerformed
        add(but23,2,6);
    }//GEN-LAST:event_but23ActionPerformed

    private void but24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but24ActionPerformed
        add(but24,2,7);
    }//GEN-LAST:event_but24ActionPerformed

    private void but25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but25ActionPerformed
        add(but25,3,0);
    }//GEN-LAST:event_but25ActionPerformed

    private void but26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but26ActionPerformed
        add(but26,3,1);
    }//GEN-LAST:event_but26ActionPerformed

    private void but27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but27ActionPerformed
        add(but27,3,2);   
    }//GEN-LAST:event_but27ActionPerformed

    private void but28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but28ActionPerformed
        add(but28,3,3);
    }//GEN-LAST:event_but28ActionPerformed

    private void but29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but29ActionPerformed
        add(but29,3,4);
    }//GEN-LAST:event_but29ActionPerformed

    private void but30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but30ActionPerformed
        add(but30,3,5);
    }//GEN-LAST:event_but30ActionPerformed

    private void but31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but31ActionPerformed
        add(but31,3,6);
    }//GEN-LAST:event_but31ActionPerformed

    private void but32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but32ActionPerformed
        add(but32,3,7);
    }//GEN-LAST:event_but32ActionPerformed

    private void but33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but33ActionPerformed
        add(but33,4,0);
    }//GEN-LAST:event_but33ActionPerformed

    private void but34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but34ActionPerformed
        add(but34,4,1);
    }//GEN-LAST:event_but34ActionPerformed

    private void but35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but35ActionPerformed
        add(but35,4,2);
    }//GEN-LAST:event_but35ActionPerformed

    private void but36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but36ActionPerformed
        add(but36,4,3);
    }//GEN-LAST:event_but36ActionPerformed

    private void but37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but37ActionPerformed
        add(but36,4,4);
    }//GEN-LAST:event_but37ActionPerformed

    private void but38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but38ActionPerformed
        add(but38,4,5);
    }//GEN-LAST:event_but38ActionPerformed

    private void but39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but39ActionPerformed
        add(but39,4,6);
    }//GEN-LAST:event_but39ActionPerformed

    private void but40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but40ActionPerformed
        add(but34,4,7);
    }//GEN-LAST:event_but40ActionPerformed

    private void but41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but41ActionPerformed
        add(but41,5,0);
    }//GEN-LAST:event_but41ActionPerformed

    private void but42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but42ActionPerformed
        add(but42,5,1);
    }//GEN-LAST:event_but42ActionPerformed

    private void but43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but43ActionPerformed
        add(but43,5,2);
    }//GEN-LAST:event_but43ActionPerformed

    private void but44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but44ActionPerformed
        add(but44,5,3);
    }//GEN-LAST:event_but44ActionPerformed

    private void but45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but45ActionPerformed
        add(but45,5,4);
    }//GEN-LAST:event_but45ActionPerformed

    private void but46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but46ActionPerformed
        add(but46,5,5);
    }//GEN-LAST:event_but46ActionPerformed

    private void but47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but47ActionPerformed
        add(but47,5,6);
    }//GEN-LAST:event_but47ActionPerformed

    private void but48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but48ActionPerformed
        add(but48,5,7);
    }//GEN-LAST:event_but48ActionPerformed

    private void but49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but49ActionPerformed
        add(but49,6,0);
    }//GEN-LAST:event_but49ActionPerformed

    private void but50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but50ActionPerformed
        add(but50,6,1);
    }//GEN-LAST:event_but50ActionPerformed

    private void but51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but51ActionPerformed
        add(but51,6,2);
    }//GEN-LAST:event_but51ActionPerformed

    private void but52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but52ActionPerformed
        add(but52,6,3);
    }//GEN-LAST:event_but52ActionPerformed

    private void but53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but53ActionPerformed
        add(but53,6,4);
    }//GEN-LAST:event_but53ActionPerformed

    private void but54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but54ActionPerformed
        add(but54,6,5);
    }//GEN-LAST:event_but54ActionPerformed

    private void but55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but55ActionPerformed
        add(but55,6,6);
    }//GEN-LAST:event_but55ActionPerformed

    private void but56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but56ActionPerformed
        add(but56,6,7);
    }//GEN-LAST:event_but56ActionPerformed

    private void but57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but57ActionPerformed
        add(but57,7,0);
    }//GEN-LAST:event_but57ActionPerformed

    private void but58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but58ActionPerformed
        add(but58,7,1);
    }//GEN-LAST:event_but58ActionPerformed

    private void but59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but59ActionPerformed
        add(but59,7,2);
    }//GEN-LAST:event_but59ActionPerformed

    private void but60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but60ActionPerformed
        add(but60,7,3);
    }//GEN-LAST:event_but60ActionPerformed

    private void but61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but61ActionPerformed
        add(but61,7,4);
    }//GEN-LAST:event_but61ActionPerformed

    private void but62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but62ActionPerformed
        add(but62,7,5);
    }//GEN-LAST:event_but62ActionPerformed

    private void but63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but63ActionPerformed
        add(but63,7,6);
    }//GEN-LAST:event_but63ActionPerformed

    private void but64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but64ActionPerformed
        add(but64,7,7);
    }//GEN-LAST:event_but64ActionPerformed

    private void CHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHActionPerformed

        for (int i=0 ; i<8 ;i++){
            for(int j=0 ; j<8 ; j++){
                if (a[i][j]==0){
                A1(i, j);
                B1(i,j);
                C1(i,j);
                D1(i,j);
                E1(i,j);
                F1(i,j);
                G1(i,j);
                H1(i,j);
                }
        }
        }
        if ( h == 0){
            if (ap==1){
                 JOptionPane.showMessageDialog(null, "Palayer  \" Black \"  Can't  Play " , "Change Turn", JOptionPane.INFORMATION_MESSAGE);
            }
            if (ap == 2){
                JOptionPane.showMessageDialog(null, "Palayer  \" Green \"  Can't  Play " , "Change Turn", JOptionPane.INFORMATION_MESSAGE);
            }
            sp();
        }
        h=0;
    }//GEN-LAST:event_CHActionPerformed


    public static void main(String args[]) {
       
        
        
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Othello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Othello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Othello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Othello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Othello().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BlackNumber;
    private javax.swing.JLabel BlackOrGreen;
    private javax.swing.JButton CH;
    private javax.swing.JLabel GreenNumber;
    private javax.swing.JLabel NumberOfBlack;
    private javax.swing.JLabel NumberOfGreen;
    private javax.swing.JLabel Turn;
    private javax.swing.JButton but1;
    private javax.swing.JButton but10;
    private javax.swing.JButton but11;
    private javax.swing.JButton but12;
    private javax.swing.JButton but13;
    private javax.swing.JButton but14;
    private javax.swing.JButton but15;
    private javax.swing.JButton but16;
    private javax.swing.JButton but17;
    private javax.swing.JButton but18;
    private javax.swing.JButton but19;
    private javax.swing.JButton but2;
    private javax.swing.JButton but20;
    private javax.swing.JButton but21;
    private javax.swing.JButton but22;
    private javax.swing.JButton but23;
    private javax.swing.JButton but24;
    private javax.swing.JButton but25;
    private javax.swing.JButton but26;
    private javax.swing.JButton but27;
    private javax.swing.JButton but28;
    private javax.swing.JButton but29;
    private javax.swing.JButton but3;
    private javax.swing.JButton but30;
    private javax.swing.JButton but31;
    private javax.swing.JButton but32;
    private javax.swing.JButton but33;
    private javax.swing.JButton but34;
    private javax.swing.JButton but35;
    private javax.swing.JButton but36;
    private javax.swing.JButton but37;
    private javax.swing.JButton but38;
    private javax.swing.JButton but39;
    private javax.swing.JButton but4;
    private javax.swing.JButton but40;
    private javax.swing.JButton but41;
    private javax.swing.JButton but42;
    private javax.swing.JButton but43;
    private javax.swing.JButton but44;
    private javax.swing.JButton but45;
    private javax.swing.JButton but46;
    private javax.swing.JButton but47;
    private javax.swing.JButton but48;
    private javax.swing.JButton but49;
    private javax.swing.JButton but5;
    private javax.swing.JButton but50;
    private javax.swing.JButton but51;
    private javax.swing.JButton but52;
    private javax.swing.JButton but53;
    private javax.swing.JButton but54;
    private javax.swing.JButton but55;
    private javax.swing.JButton but56;
    private javax.swing.JButton but57;
    private javax.swing.JButton but58;
    private javax.swing.JButton but59;
    private javax.swing.JButton but6;
    private javax.swing.JButton but60;
    private javax.swing.JButton but61;
    private javax.swing.JButton but62;
    private javax.swing.JButton but63;
    private javax.swing.JButton but64;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
