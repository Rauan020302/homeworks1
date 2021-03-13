package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class TicTacToe extends JComponent {
    public static final int FIELD_EMPTY = 0;
    public static final int FIELD_X = 10;
    public static final int FIELD_O = 200;
    int [][] field;
    boolean isXturn;

    public TicTacToe() {
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        field = new int[3][3];
        initGame();
    }
    public void initGame(){
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 3; ++j){
                field[i][j] = FIELD_EMPTY;
            }
        }
        isXturn = true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.clearRect(0,0,getWidth(),getHeight());
        drawGrid(g);
        drawXO(g);
    }

    @Override
    protected void processMouseEvent(MouseEvent e) {
        super.processMouseEvent(e);
        if (e.getButton() == MouseEvent.BUTTON1){
            int x = e.getX();
            int y = e.getY();
            int i = (int) ((float)x / getWidth()*3);
            int j = (int) ((float)y / getHeight()*3);
            if (field[i][j] == FIELD_EMPTY){
                field[i][j] = isXturn?FIELD_EMPTY:FIELD_O;
                isXturn =! isXturn;
                repaint();
                int res = checkState();
                if (res!=0){
                    if (res == FIELD_O*3){
                        JOptionPane.showMessageDialog(this,"Нолики выиграли!","Победа",JOptionPane.INFORMATION_MESSAGE);
                    }else if (res == FIELD_X *3 ){
                        JOptionPane.showMessageDialog(this,"Крестики выиграли!","Победа",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this,"Ничья!","Ничья",JOptionPane.INFORMATION_MESSAGE);
                    }
                    initGame();
                    repaint();
                }
            }
        }
    }

    void drawGrid(Graphics g){
        int w = getWidth();
        int h = getHeight();
        int dw = w / 3;
        int dh = h / 3;
        g.setColor(Color.BLUE);
        for (int i = 1; i < 3; i++){
            g.drawLine(0,dh * i,w,dh * i);
            g.drawLine(dw * i,0,dw * i, h);
        }
    }
    void drawX(int i,int j,Graphics g){
        g.setColor(Color.BLACK);
        int dw = getWidth() / 3;
        int dh = getHeight() / 3;
        int x = i * dw;
        int y = j * dh;
        g.drawLine(x,y,x+dw,y+dh);
        g.drawLine(x,y+dh,x+dw,y);
    }
    void drawO(int i,int j,Graphics g){
        g.setColor(Color.BLACK);
        int dw = getWidth() / 3;
        int dh = getHeight() / 3;
        int x = i * dw;
        int y = j * dh;
        g.drawOval(x+5*dw/100,y,dw*9/10,dh);
    }
    void drawXO(Graphics g){
        for (int i = 0;i < 3;++i){
            for (int j = 0; j < 3; ++j){
                if (field[i][j] == FIELD_X){
                    drawX(i,j,g);
                }else if (field[i][j] == FIELD_O){
                    drawO(i,j,g);
                }
            }
        }
    }
    int checkState(){
        int diag = 0;
        int diag2 = 0;
        for (int i = 0; i < 3; i++){
            diag += field[i][i];
            diag2 += field[i][2-i];
        }
        if (diag == FIELD_O*3 || diag == FIELD_X*3){
            return diag;
        }
        if (diag2 == FIELD_O*3 || diag2 == FIELD_X*3){
            return diag2;
        }
        int checkI,checkJ;
        boolean hasEmpty = false;
        for (int i = 0;i < 3; i++){
            checkI = 0;
            checkJ = 0;
            for (int j = 0; j < 3; j++){
                if (field[i][j] == 0){
                    hasEmpty =true;
                }
                checkI += field[i][j];
                checkJ += field[j][i];
            }
            if (checkI == FIELD_O*3 || checkI == FIELD_X*3){
                return checkI;
            }
            if (checkJ == FIELD_O*3 || checkJ == FIELD_X*3){
                return checkJ;
            }
        }
        if (hasEmpty)
            return 0;
        else return -1;
    }

}
