import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.*;
import javafx.scene.media.AudioClip;
import java.net.URL;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.text.*;
import java.util.*;

public class Knight{
	Image character;
	Rectangle2D rect;
	int x;
	int y;
	public Knight(Image character){
		this.character = character;
		rect = new Rectangle2D(100 + 3*x, 100 + 3*y, character.getWidth(), character.getHeight());
	}

	public void setCharacter(Image image){
		character = image;
	}

	public Image getCharacter(){
		return character;
	}

	public Rectangle2D getRect(){
		return rect;
	}
}