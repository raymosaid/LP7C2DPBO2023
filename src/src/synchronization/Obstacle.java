/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ray Mosaid
 */

/*
Saya Mohammad Ray Mosaid 2004942 mengerjakan soal Latihan Praktikum 7 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/

public class Obstacle extends GameObject{
    // Default constructor.
    public Obstacle()
    {
        super(0, 0, "Obstacle");
        super.setHeight(30);
        super.setWidth(30);
    }
    
    // Constructor with obstacle position.
    public Obstacle(int x, int y)
    {
        super(x, y, "Obstacle");
        super.setHeight(30);
        super.setWidth(30);
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set obstacle shape.
        object.setColor(Color.decode("#87CEEB"));
        object.fillRect(x, y, 30, 30);
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
        
        // Initialize obstacle bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 50));
        y = Game.clamp(y, 0, (Game.height - 70));
    }
}
