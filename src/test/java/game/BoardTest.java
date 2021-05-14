/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import java.io.IOException;
import java.lang.reflect.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author nipun
 */
public class BoardTest {
    
    public BoardTest() {
    }

    /**
     * Test of getArrayChessBoard method, of class Board.
     */
    @org.junit.Test
    public void testChessMain() {
        Main main = new Main();
        try{
            main.newGame();
        }catch(Exception e){
            System.out.println("New game test exception.");
        }
    }
    
    @org.junit.Test
    public void testChessBoardNewFrameFunction(){
        try{
            Class targetClass = Class.forName("game");
            Board board = (Board) targetClass.newInstance();
            Method method = targetClass.getDeclaredMethod("newFrame", Integer.class,Integer.class);
            method.setAccessible(true);
        }catch(Exception e){
            System.out.println("Exception in test frame");
        }
    }
    
    @org.junit.Test
    public void testChessBoardTimerFunction(){
        try{
            Class targetClass = Class.forName("game");
            Board board = (Board) targetClass.newInstance();
            Method method = targetClass.getDeclaredMethod("timer", null);
            method.setAccessible(true);
        }catch(Exception e){
            System.out.println("Exception in test timer");
        }    
    }
    
    @org.junit.Test
    public void testChessBoardListenerMovesFunction(){
        try{
            Class<?> targetClass = Class.forName("game.Board$BoardListener");
            Constructor<?> constructor = targetClass.getDeclaredConstructor(Board.class);
            Method method = targetClass.getDeclaredMethod("noOfMoves", null);
            constructor.setAccessible(true);
        }catch(Exception e){
            System.out.println("Exception in test moves");
        }
    }
}
