boolean isPressed;
boolean started = false;
float permx, permy;
int white, black, red, blue, green, yellow;
float speed = 0;
float gravity = 0.1;
Floor floor1 = new Floor(0, 730, 70);
void setup() {
  white = 255;
  black = 0;
  red = (#FF0000);
  blue = (#0000FF);
  green = (#008000);
  yellow = (#FFFF00);
  background(white);
  permx = width/2;
  permy = height/2;
  size(900, 800);
  player = new Player(width / 2, height / 2, 0.1); // Initialize the player
  
}
void draw() {
  background(white);
  stroke(0);

  textAlign(CENTER);
  if (started) {
    player.update();
    player.checkEdges();
    player.interact();
    player.display();
    floor1.display();
  } else {
    text("PRESS 'RETURN' TO BEGIN", 100, 50);
    fill(black);
  }
}


void keyPressed() {
  if (keyCode == ENTER) {
    started = true;
  }
}
